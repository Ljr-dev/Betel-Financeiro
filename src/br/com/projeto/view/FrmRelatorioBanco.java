/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.view;

import br.com.projeto.jdbc.ConnectionFactory;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JAVA
 */
public class FrmRelatorioBanco extends javax.swing.JFrame {

    /**
     * Creates new form FrmRelatorio
     */
    public FrmRelatorioBanco() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtdatainicio = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        txtdatafim = new javax.swing.JFormattedTextField();
        btnRelatorio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Informe o Período");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Data Inicial:");

        try {
            txtdatainicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtdatainicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdatainicioActionPerformed(evt);
            }
        });
        txtdatainicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdatainicioKeyPressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Data Final:");

        try {
            txtdatafim.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtdatafim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdatafimActionPerformed(evt);
            }
        });
        txtdatafim.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdatafimKeyPressed(evt);
            }
        });

        btnRelatorio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRelatorio.setText("Gerar Relatório");
        btnRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtdatafim, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtdatainicio, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdatainicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtdatafim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtdatainicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdatainicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdatainicioActionPerformed

    private void txtdatainicioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdatainicioKeyPressed
        //Programacao do keypress
    }//GEN-LAST:event_txtdatainicioKeyPressed

    private void txtdatafimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdatafimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdatafimActionPerformed

    private void txtdatafimKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdatafimKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdatafimKeyPressed

    private void btnRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioActionPerformed

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate data_inicio1 = LocalDate.parse(txtdatainicio.getText(), formato);
        LocalDate data_fim1 = LocalDate.parse(txtdatafim.getText(), formato);

        LocalDate data_inicio2 = LocalDate.parse(txtdatainicio.getText(), formato);
        LocalDate data_fim2 = LocalDate.parse(txtdatafim.getText(), formato);

        Document doc = null;
        OutputStream outPutStream = null;

        try {
            doc = new Document(PageSize.A4, 20, 30, 30, 20);
            outPutStream = new FileOutputStream("Banco.pdf");

            try {
                PdfWriter.getInstance(doc, outPutStream);
                doc.open();

                 Paragraph pTitulo = new Paragraph(new Phrase(20F, "Relatório Banco ", FontFactory.getFont(FontFactory.HELVETICA, 30F)));
                pTitulo.setAlignment(Element.ALIGN_LEFT);
                pTitulo.setAlignment(Element.ALIGN_BOTTOM);
                
                
                Image img = Image.getInstance(getClass().getResource("/imagens/logo_relatorio.jpeg"));
                img.scaleAbsoluteHeight(90);
                img.scaleAbsoluteWidth(150);
                img.setAlignment(Element.ALIGN_JUSTIFIED);
                
                PdfPTable titulo = new PdfPTable(3);
                PdfPCell t1 = new PdfPCell(img);
                t1.setBorder(PdfPCell.NO_BORDER);
                
                PdfPCell t2 = new PdfPCell(new Paragraph(pTitulo));
                t2.setBorder(PdfPCell.NO_BORDER);
                t2.setColspan(2);
                 
                titulo.addCell(t1);
                titulo.addCell(t2);
                doc.add(titulo);
  
                Paragraph espaco = new Paragraph(new Phrase(7F, "  ", FontFactory.getFont(FontFactory.HELVETICA, 7F)));
                espaco.setAlignment(Element.ALIGN_CENTER);
                doc.add(espaco);
                Connection con = new ConnectionFactory().getConnection();
                PreparedStatement s1, s2, s3,
                                  i1,i2,i3
                                 ,m1,m2,m3 
                                 ,d1,d2,d3
                                   = null;
                ResultSet  rs1, rs2, rs3,
                           ri1, ri2, ri3,
                           rm1, rm2, rm3,
                           rd1, rd2, rd3 = null;
                
                
                String receita = "select  sum(valor) as total from tbl_lancamentos where tipo = 'CREDITO'and data_lanc BETWEEN ? AND ? and banco= ' SICOOB '";
                String despesa = "select  sum(valor) as total from tbl_lancamentos where tipo = 'DEBITO'and data_lanc BETWEEN ? AND ? and banco= ' SICOOB '";
                String saldo = " Select   (SELECT sum(valor) FROM tbl_lancamentos where tipo = 'CREDITO'  and data_lanc BETWEEN ? AND ? and banco= ' SICOOB ' ) as receita ,"
                        + "         (select sum(valor) FROM tbl_lancamentos where tipo = 'DEBITO' and data_lanc BETWEEN ? AND ? and banco= ' SICOOB ' ) as  despesa ,"
                        + "         (select receita - despesa ) as saldo  ";
                
                String receita1 = "select  sum(valor) as total from tbl_lancamentos where tipo = 'CREDITO'and data_lanc BETWEEN ? AND ? and banco= ' Itaú '";
                String despesa1 = "select  sum(valor) as total from tbl_lancamentos where tipo = 'DEBITO'and data_lanc BETWEEN ? AND ? and banco= ' Itaú '";
                String saldo1 = " Select   (SELECT sum(valor) FROM tbl_lancamentos where tipo = 'CREDITO'  and data_lanc BETWEEN ? AND ? and banco= ' Itaú ' ) as receita ,"
                        + "         (select sum(valor) FROM tbl_lancamentos where tipo = 'DEBITO' and data_lanc BETWEEN ? AND ? and banco= ' Itaú ' ) as  despesa ,"
                        + "         (select receita - despesa ) as saldo  ";
                
                String receita2 = "select  sum(valor) as total from tbl_lancamentos where tipo = 'CREDITO'and data_lanc BETWEEN ? AND ? and banco= ' Dinheiro '";
                String despesa2 = "select  sum(valor) as total from tbl_lancamentos where tipo = 'DEBITO'and data_lanc BETWEEN ? AND ? and banco= ' Dinheiro '";
                String saldo2 = " Select   (SELECT sum(valor) FROM tbl_lancamentos where tipo = 'CREDITO'  and data_lanc BETWEEN ? AND ? and banco= ' Dinheiro ' ) as receita ,"
                        + "         (select sum(valor) FROM tbl_lancamentos where tipo = 'DEBITO' and data_lanc BETWEEN ? AND ? and banco= ' Dinheiro ' ) as  despesa ,"
                        + "         (select receita - despesa ) as saldo  ";
                
                String receita3 = "select  sum(valor) as total from tbl_lancamentos where tipo = 'CREDITO'and data_lanc BETWEEN ? AND ? and banco= ' Mercado Pago '";
                String despesa3 = "select  sum(valor) as total from tbl_lancamentos where tipo = 'DEBITO'and data_lanc BETWEEN ? AND ? and banco= ' Mercado Pago '";
                String saldo3 = " Select   (SELECT sum(valor) FROM tbl_lancamentos where tipo = 'CREDITO'  and data_lanc BETWEEN ? AND ? and banco= ' Mercado Pago ' ) as receita ,"
                        + "         (select sum(valor) FROM tbl_lancamentos where tipo = 'DEBITO' and data_lanc BETWEEN ? AND ? and banco= ' Mercado Pago ' ) as  despesa ,"
                        + "         (select receita - despesa ) as saldo  ";
                

                s1 = con.prepareStatement(receita);
                s1.setString(1, data_inicio1.toString());
                s1.setString(2, data_fim1.toString());
                s2 = con.prepareStatement(despesa);
                s2.setString(1, data_inicio1.toString());
                s2.setString(2, data_fim1.toString());
                s3 = con.prepareStatement(saldo);
                s3.setString(1, data_inicio1.toString());
                s3.setString(2, data_fim1.toString());
                s3.setString(3, data_inicio2.toString());
                s3.setString(4, data_fim2.toString());
                
                i1 = con.prepareStatement(receita1);
                i1.setString(1, data_inicio1.toString());
                i1.setString(2, data_fim1.toString());
                i2 = con.prepareStatement(despesa1);
                i2.setString(1, data_inicio1.toString());
                i2.setString(2, data_fim1.toString());
                i3 = con.prepareStatement(saldo1);
                i3.setString(1, data_inicio1.toString());
                i3.setString(2, data_fim1.toString());
                i3.setString(3, data_inicio2.toString());
                i3.setString(4, data_fim2.toString());
                
                d1 = con.prepareStatement(receita2);
                d1.setString(1, data_inicio1.toString());
                d1.setString(2, data_fim1.toString());
                d2 = con.prepareStatement(despesa2);
                d2.setString(1, data_inicio1.toString());
                d2.setString(2, data_fim1.toString());
                d3 = con.prepareStatement(saldo2);
                d3.setString(1, data_inicio1.toString());
                d3.setString(2, data_fim1.toString());
                d3.setString(3, data_inicio2.toString());
                d3.setString(4, data_fim2.toString());
                
                m1 = con.prepareStatement(receita3);
                m1.setString(1, data_inicio1.toString());
                m1.setString(2, data_fim1.toString());
                m2 = con.prepareStatement(despesa3);
                m2.setString(1, data_inicio1.toString());
                m2.setString(2, data_fim1.toString());
                m3 = con.prepareStatement(saldo3);
                m3.setString(1, data_inicio1.toString());
                m3.setString(2, data_fim1.toString());
                m3.setString(3, data_inicio2.toString());
                m3.setString(4, data_fim2.toString());
                
               //---------------------------------------------------------------------------------------------------------------------------- 
                Paragraph pTitulo1 = new Paragraph(new Phrase(20F, "Banco SICOOB", FontFactory.getFont(FontFactory.HELVETICA, 10F)));
                pTitulo1.setAlignment(Element.ALIGN_CENTER);
                doc.add(pTitulo1);
               
                Paragraph treceita = new Paragraph(new Phrase(20F, "Total de Crédito", FontFactory.getFont(FontFactory.HELVETICA, 10F )));
                treceita.setAlignment(Element.ALIGN_CENTER);  
                rs1 = s1.executeQuery();
                while (rs1.next()) {
                    Paragraph soma_receita = new Paragraph(
                            rs1.getString("total"), FontFactory.getFont(FontFactory.HELVETICA, 10F));
                    soma_receita.setAlignment(Element.ALIGN_CENTER);
                   
                    PdfPTable table = new PdfPTable(4);

                    PdfPCell cellS = new PdfPCell(new Paragraph(treceita));
                    cellS.setBorder(PdfPCell.NO_BORDER);
                    PdfPCell cell = new PdfPCell(new Paragraph(espaco));
                    cell.setBorder(PdfPCell.NO_BORDER);
                    cellS.setHorizontalAlignment(Element.ALIGN_LEFT);
                    PdfPCell cellTs = new PdfPCell(new Paragraph(soma_receita));
                    cellTs.setBorder(PdfPCell.NO_BORDER);
                    cellTs.setHorizontalAlignment(Element.ALIGN_RIGHT);
                    
                    table.addCell(cellS);
                    table.addCell(cell);
                    table.addCell(cell);
                    table.addCell(cellTs);
                   
                    doc.add(table);
                   
                   
                     }
                Paragraph tdespesa = new Paragraph(new Phrase(20F, "Total de Débito", FontFactory.getFont(FontFactory.HELVETICA, 10F)));
                tdespesa.setAlignment(Element.ALIGN_CENTER);
                rs2 = s2.executeQuery();
                while (rs2.next()) {
                    Paragraph soma_despesa = new Paragraph(
                            rs2.getString("total"), FontFactory.getFont(FontFactory.HELVETICA, 10F));
                    soma_despesa.setAlignment(Element.ALIGN_CENTER);
                    PdfPTable table = new PdfPTable(4);

                    PdfPCell cellS = new PdfPCell(new Paragraph(tdespesa));
                    cellS.setBorder(PdfPCell.NO_BORDER);
                    PdfPCell cell = new PdfPCell(new Paragraph(espaco));
                    cell.setBorder(PdfPCell.NO_BORDER);
                    cellS.setHorizontalAlignment(Element.ALIGN_LEFT);
                    PdfPCell cellTs = new PdfPCell(new Paragraph(soma_despesa));
                    cellTs.setBorder(PdfPCell.NO_BORDER);
                    cellTs.setHorizontalAlignment(Element.ALIGN_RIGHT);
                    
                    table.addCell(cellS);
                    table.addCell(cell);
                    table.addCell(cell);
                    table.addCell(cellTs);
                   
                    doc.add(table);
                    
                    
                }
                Paragraph tsaldo = new Paragraph(new Phrase(20F, "Saldo",  FontFactory.getFont(FontFactory.HELVETICA, 10F)));
                tsaldo.setAlignment(Element.ALIGN_CENTER);
                rs3 = s3.executeQuery();
                while (rs3.next()) {
                    Paragraph saldo_total = new Paragraph(
                            rs3.getString("saldo"), FontFactory.getFont(FontFactory.HELVETICA, 10F));
                    saldo_total.setAlignment(Element.ALIGN_CENTER);
                    
                    PdfPTable table = new PdfPTable(4);

                    PdfPCell cellS = new PdfPCell(new Paragraph(tsaldo));
                    cellS.setBorder(PdfPCell.NO_BORDER);
                    PdfPCell cell = new PdfPCell(new Paragraph(espaco));
                    cell.setBorder(PdfPCell.NO_BORDER);
                    cellS.setHorizontalAlignment(Element.ALIGN_RIGHT);
                    PdfPCell cellTs = new PdfPCell(new Paragraph(saldo_total));
                    cellTs.setBorder(PdfPCell.NO_BORDER);
                    cellTs.setHorizontalAlignment(Element.ALIGN_RIGHT);
                    
                    
                    table.addCell(cell);
                    table.addCell(cell);
                    table.addCell(cellS);
                    table.addCell(cellTs);
                   
                    doc.add(table);
                    this.dispose();
               //----------------------------------------------------------------------------------------------------------------------------- 
                doc.add(espaco);
                    doc.add(espaco);
                    Paragraph pTitulo2 = new Paragraph(new Phrase(20F, "Banco Itaú", FontFactory.getFont(FontFactory.HELVETICA, 10F)));
                pTitulo2.setAlignment(Element.ALIGN_CENTER);
                doc.add(pTitulo2);
               
                Paragraph treceita1 = new Paragraph(new Phrase(20F, "Total de Crédito", FontFactory.getFont(FontFactory.HELVETICA, 10F )));
                treceita.setAlignment(Element.ALIGN_CENTER);  
                ri1 = i1.executeQuery();
                while (ri1.next()) {
                    Paragraph soma_receita1 = new Paragraph(
                            ri1.getString("total"), FontFactory.getFont(FontFactory.HELVETICA, 10F));
                    soma_receita1.setAlignment(Element.ALIGN_CENTER);
                   
                    PdfPTable table1 = new PdfPTable(4);

                    PdfPCell cellS1 = new PdfPCell(new Paragraph(treceita1));
                    cellS1.setBorder(PdfPCell.NO_BORDER);
                    PdfPCell cell1 = new PdfPCell(new Paragraph(espaco));
                    cell1.setBorder(PdfPCell.NO_BORDER);
                    cellS1.setHorizontalAlignment(Element.ALIGN_LEFT);
                    PdfPCell cellTs1 = new PdfPCell(new Paragraph(soma_receita1));
                    cellTs1.setBorder(PdfPCell.NO_BORDER);
                    cellTs1.setHorizontalAlignment(Element.ALIGN_RIGHT);
                    
                    table1.addCell(cellS1);
                    table1.addCell(cell1);
                    table1.addCell(cell1);
                    table1.addCell(cellTs1);
                   
                    doc.add(table1);
                   
                     }
                Paragraph tdespesa1 = new Paragraph(new Phrase(20F, "Total de Débito", FontFactory.getFont(FontFactory.HELVETICA, 10F)));
                tdespesa.setAlignment(Element.ALIGN_CENTER);
                ri2 = i2.executeQuery();
                while (ri2.next()) {
                    Paragraph soma_despesa1 = new Paragraph(
                            ri2.getString("total"), FontFactory.getFont(FontFactory.HELVETICA, 10F));
                    soma_despesa1.setAlignment(Element.ALIGN_CENTER);
                    PdfPTable table1 = new PdfPTable(4);

                    PdfPCell cellS1 = new PdfPCell(new Paragraph(tdespesa1));
                    cellS1.setBorder(PdfPCell.NO_BORDER);
                    PdfPCell cell1 = new PdfPCell(new Paragraph(espaco));
                    cell1.setBorder(PdfPCell.NO_BORDER);
                    cellS.setHorizontalAlignment(Element.ALIGN_LEFT);
                    PdfPCell cellTs1 = new PdfPCell(new Paragraph(soma_despesa1));
                    cellTs1.setBorder(PdfPCell.NO_BORDER);
                    cellTs1.setHorizontalAlignment(Element.ALIGN_RIGHT);
                    
                    table1.addCell(cellS1);
                    table1.addCell(cell1);
                    table1.addCell(cell1);
                    table1.addCell(cellTs1);
                   
                    doc.add(table1);
                    
                    
                }
                Paragraph tsaldo1 = new Paragraph(new Phrase(20F, "Saldo",  FontFactory.getFont(FontFactory.HELVETICA, 10F)));
                tsaldo1.setAlignment(Element.ALIGN_CENTER);
                ri3 = i3.executeQuery();
                while (ri3.next()) {
                    Paragraph saldo_total1 = new Paragraph(
                            ri3.getString("saldo"), FontFactory.getFont(FontFactory.HELVETICA, 10F));
                    saldo_total1.setAlignment(Element.ALIGN_CENTER);
                    
                    PdfPTable table1 = new PdfPTable(4);

                    PdfPCell cellS1 = new PdfPCell(new Paragraph(tsaldo1));
                    cellS1.setBorder(PdfPCell.NO_BORDER);
                    PdfPCell cell1 = new PdfPCell(new Paragraph(espaco));
                    cell1.setBorder(PdfPCell.NO_BORDER);
                    cellS1.setHorizontalAlignment(Element.ALIGN_RIGHT);
                    PdfPCell cellTs1 = new PdfPCell(new Paragraph(saldo_total1));
                    cellTs1.setBorder(PdfPCell.NO_BORDER);
                    cellTs1.setHorizontalAlignment(Element.ALIGN_RIGHT);
                    
                    
                    table1.addCell(cell1);
                    table1.addCell(cell1);
                    table1.addCell(cellS1);
                    table1.addCell(cellTs1);
                   
                    doc.add(table1);
                    this.dispose();
                }
                //------------------------------------------------------------------------------------------------------------------------------
                 doc.add(espaco);
                    doc.add(espaco);
                   Paragraph pTitulo3 = new Paragraph(new Phrase(20F, "Dinheiro em Caixa", FontFactory.getFont(FontFactory.HELVETICA, 10F)));
                pTitulo3.setAlignment(Element.ALIGN_CENTER);
                doc.add(pTitulo3);
               
                Paragraph treceita2 = new Paragraph(new Phrase(20F, "Total de Crédito", FontFactory.getFont(FontFactory.HELVETICA, 10F )));
                treceita2.setAlignment(Element.ALIGN_CENTER);  
                rd1 = d1.executeQuery();
                while (rd1.next()) {
                    Paragraph soma_receita2 = new Paragraph(
                            rd1.getString("total"), FontFactory.getFont(FontFactory.HELVETICA, 10F));
                    soma_receita2.setAlignment(Element.ALIGN_CENTER);
                   
                    PdfPTable table1 = new PdfPTable(4);

                    PdfPCell cellS1 = new PdfPCell(new Paragraph(treceita2));
                    cellS1.setBorder(PdfPCell.NO_BORDER);
                    PdfPCell cell1 = new PdfPCell(new Paragraph(espaco));
                    cell1.setBorder(PdfPCell.NO_BORDER);
                    cellS1.setHorizontalAlignment(Element.ALIGN_LEFT);
                    PdfPCell cellTs1 = new PdfPCell(new Paragraph(soma_receita2));
                    cellTs1.setBorder(PdfPCell.NO_BORDER);
                    cellTs1.setHorizontalAlignment(Element.ALIGN_RIGHT);
                    
                    table1.addCell(cellS1);
                    table1.addCell(cell1);
                    table1.addCell(cell1);
                    table1.addCell(cellTs1);
                   
                    doc.add(table1);
                   
                     }
                Paragraph tdespesa2 = new Paragraph(new Phrase(20F, "Total de Débito", FontFactory.getFont(FontFactory.HELVETICA, 10F)));
                tdespesa2.setAlignment(Element.ALIGN_CENTER);
                rd2 = d2.executeQuery();
                while (rd2.next()) {
                    Paragraph soma_despesa2 = new Paragraph(
                            rd2.getString("total"), FontFactory.getFont(FontFactory.HELVETICA, 10F));
                    soma_despesa2.setAlignment(Element.ALIGN_CENTER);
                    PdfPTable table1 = new PdfPTable(4);

                    PdfPCell cellS1 = new PdfPCell(new Paragraph(tdespesa2));
                    cellS1.setBorder(PdfPCell.NO_BORDER);
                    PdfPCell cell1 = new PdfPCell(new Paragraph(espaco));
                    cell1.setBorder(PdfPCell.NO_BORDER);
                    cellS.setHorizontalAlignment(Element.ALIGN_LEFT);
                    PdfPCell cellTs1 = new PdfPCell(new Paragraph(soma_despesa2));
                    cellTs1.setBorder(PdfPCell.NO_BORDER);
                    cellTs1.setHorizontalAlignment(Element.ALIGN_RIGHT);
                    
                    table1.addCell(cellS1);
                    table1.addCell(cell1);
                    table1.addCell(cell1);
                    table1.addCell(cellTs1);
                   
                    doc.add(table1);
                    
                    
                }
                Paragraph tsaldo2 = new Paragraph(new Phrase(20F, "Saldo",  FontFactory.getFont(FontFactory.HELVETICA, 10F)));
                tsaldo2.setAlignment(Element.ALIGN_CENTER);
                rd3 = d3.executeQuery();
                while (rd3.next()) {
                    Paragraph saldo_total2 = new Paragraph(
                            rd3.getString("saldo"), FontFactory.getFont(FontFactory.HELVETICA, 10F));
                    saldo_total2.setAlignment(Element.ALIGN_CENTER);
                    
                    PdfPTable table1 = new PdfPTable(4);

                    PdfPCell cellS1 = new PdfPCell(new Paragraph(tsaldo2));
                    cellS1.setBorder(PdfPCell.NO_BORDER);
                    PdfPCell cell1 = new PdfPCell(new Paragraph(espaco));
                    cell1.setBorder(PdfPCell.NO_BORDER);
                    cellS1.setHorizontalAlignment(Element.ALIGN_RIGHT);
                    PdfPCell cellTs1 = new PdfPCell(new Paragraph(saldo_total2));
                    cellTs1.setBorder(PdfPCell.NO_BORDER);
                    cellTs1.setHorizontalAlignment(Element.ALIGN_RIGHT);
                    
                    
                    table1.addCell(cell1);
                    table1.addCell(cell1);
                    table1.addCell(cellS1);
                    table1.addCell(cellTs1);
                   
                    doc.add(table1);
                    this.dispose();
                }
                //---------------------------------------------------------------------------------------------------------------------
                 doc.add(espaco);
                    doc.add(espaco);
                  Paragraph pTitulo4 = new Paragraph(new Phrase(20F, "Mercado Pago", FontFactory.getFont(FontFactory.HELVETICA, 10F)));
                pTitulo4.setAlignment(Element.ALIGN_CENTER);
                doc.add(pTitulo4);
               
                Paragraph treceita3 = new Paragraph(new Phrase(20F, "Total de Crédito", FontFactory.getFont(FontFactory.HELVETICA, 10F )));
                treceita3.setAlignment(Element.ALIGN_CENTER);  
                rm1 = m1.executeQuery();
                while (rm1.next()) {
                    Paragraph soma_receita3 = new Paragraph(
                            rm1.getString("total"), FontFactory.getFont(FontFactory.HELVETICA, 10F));
                    soma_receita3.setAlignment(Element.ALIGN_CENTER);
                   
                    PdfPTable table2 = new PdfPTable(4);

                    PdfPCell cellS2 = new PdfPCell(new Paragraph(treceita3));
                    cellS2.setBorder(PdfPCell.NO_BORDER);
                    PdfPCell cell2 = new PdfPCell(new Paragraph(espaco));
                    cell2.setBorder(PdfPCell.NO_BORDER);
                    cellS2.setHorizontalAlignment(Element.ALIGN_LEFT);
                    PdfPCell cellTs2 = new PdfPCell(new Paragraph(soma_receita3));
                    cellTs2.setBorder(PdfPCell.NO_BORDER);
                    cellTs2.setHorizontalAlignment(Element.ALIGN_RIGHT);
                    
                    table2.addCell(cellS2);
                    table2.addCell(cell2);
                    table2.addCell(cell2);
                    table2.addCell(cellTs2);
                   
                    doc.add(table2);
                   
                     }
                Paragraph tdespesa3 = new Paragraph(new Phrase(20F, "Total de Débito", FontFactory.getFont(FontFactory.HELVETICA, 10F)));
                tdespesa3.setAlignment(Element.ALIGN_CENTER);
                rm2 = m2.executeQuery();
                while (rm2.next()) {
                    Paragraph soma_despesa3 = new Paragraph(
                            rm2.getString("total"), FontFactory.getFont(FontFactory.HELVETICA, 10F));
                    soma_despesa3.setAlignment(Element.ALIGN_CENTER);
                    PdfPTable table2 = new PdfPTable(4);

                    PdfPCell cellS2 = new PdfPCell(new Paragraph(tdespesa3));
                    cellS2.setBorder(PdfPCell.NO_BORDER);
                    PdfPCell cell2 = new PdfPCell(new Paragraph(espaco));
                    cell2.setBorder(PdfPCell.NO_BORDER);
                    cellS2.setHorizontalAlignment(Element.ALIGN_LEFT);
                    PdfPCell cellTs2 = new PdfPCell(new Paragraph(soma_despesa3));
                    cellTs2.setBorder(PdfPCell.NO_BORDER);
                    cellTs2.setHorizontalAlignment(Element.ALIGN_RIGHT);
                    
                    table2.addCell(cellS2);
                    table2.addCell(cell2);
                    table2.addCell(cell2);
                    table2.addCell(cellTs2);
                   
                    doc.add(table2);
                    
                    
                }
                Paragraph tsaldo3 = new Paragraph(new Phrase(20F, "Saldo",  FontFactory.getFont(FontFactory.HELVETICA, 10F)));
                tsaldo3.setAlignment(Element.ALIGN_CENTER);
                rm3 = m3.executeQuery();
                while (rm3.next()) {
                    Paragraph saldo_total3 = new Paragraph(
                            rm3.getString("saldo"), FontFactory.getFont(FontFactory.HELVETICA, 10F));
                    saldo_total3.setAlignment(Element.ALIGN_CENTER);
                    
                    PdfPTable table2 = new PdfPTable(4);

                    PdfPCell cellS2 = new PdfPCell(new Paragraph(tsaldo3));
                    cellS2.setBorder(PdfPCell.NO_BORDER);
                    PdfPCell cell2 = new PdfPCell(new Paragraph(espaco));
                    cell2.setBorder(PdfPCell.NO_BORDER);
                    cellS2.setHorizontalAlignment(Element.ALIGN_RIGHT);
                    PdfPCell cellTs2 = new PdfPCell(new Paragraph(saldo_total3));
                    cellTs2.setBorder(PdfPCell.NO_BORDER);
                    cellTs2.setHorizontalAlignment(Element.ALIGN_RIGHT);
                    
                    
                    table2.addCell(cell2);
                    table2.addCell(cell2);
                    table2.addCell(cellS2);
                    table2.addCell(cellTs2);
                   
                    doc.add(table2);
                  
                }
                
    
                Runtime.getRuntime().exec(new String[]{"cmd.exe", "/c", "start", "Banco.pdf"});
                }
                doc.close();
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(FrmLanc.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException | DocumentException | IOException ex) {
                Logger.getLogger(FrmLanc.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FrmLanc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRelatorioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmRelatorioBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRelatorioBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRelatorioBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRelatorioBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRelatorioBanco().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRelatorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JFormattedTextField txtdatafim;
    public javax.swing.JFormattedTextField txtdatainicio;
    // End of variables declaration//GEN-END:variables
}