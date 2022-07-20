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
import com.itextpdf.text.Rectangle;
import static com.itextpdf.text.html.HtmlTags.ALIGN;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPCellEvent;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import static java.lang.Integer.sum;
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
public class FrmRelatorio extends javax.swing.JFrame {

    /**
     * Creates new form FrmRelatorio
     */
    public FrmRelatorio() {
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
            doc = new Document(PageSize.A4.rotate(), 20, 30, 30, 20);
            outPutStream = new FileOutputStream("Financeiro.pdf");

            try {
                PdfWriter.getInstance(doc, outPutStream);
                doc.open();

                Paragraph pTitulo = new Paragraph(new Phrase(20F, "Relatório Financeiro ", FontFactory.getFont(FontFactory.HELVETICA, 30F)));
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

                PdfPTable tableE = new PdfPTable(8);
                PdfPCell a = new PdfPCell(new Paragraph(espaco));
                PdfPCell b = new PdfPCell(new Paragraph(espaco));
                PdfPCell c = new PdfPCell(new Paragraph(espaco));
                PdfPCell d = new PdfPCell(new Paragraph(espaco));
                PdfPCell e = new PdfPCell(new Paragraph(espaco));
                PdfPCell f = new PdfPCell(new Paragraph(espaco));
                PdfPCell g = new PdfPCell(new Paragraph(espaco));
                PdfPCell h = new PdfPCell(new Paragraph(espaco));

                a.setBorder(PdfPCell.NO_BORDER);
                b.setBorder(PdfPCell.NO_BORDER);
                c.setBorder(PdfPCell.NO_BORDER);
                d.setBorder(PdfPCell.NO_BORDER);
                e.setBorder(PdfPCell.NO_BORDER);
                f.setBorder(PdfPCell.NO_BORDER);
                g.setBorder(PdfPCell.NO_BORDER);
                h.setBorder(PdfPCell.NO_BORDER);

                tableE.addCell(a);
                tableE.addCell(b);
                tableE.addCell(c);
                tableE.addCell(d);
                tableE.addCell(e);
                tableE.addCell(f);
                tableE.addCell(g);
                tableE.addCell(h);
                doc.add(tableE);

                Paragraph m_data = new Paragraph(new Phrase(7F, "Data", FontFactory.getFont(FontFactory.HELVETICA, 5F)));
                Paragraph m_tipo = new Paragraph(new Phrase(7F, "Tipo", FontFactory.getFont(FontFactory.HELVETICA, 5F)));
                Paragraph m_descricao = new Paragraph(new Phrase(7F, "Descrição", FontFactory.getFont(FontFactory.HELVETICA, 5F)));
                Paragraph m_status = new Paragraph(new Phrase(7F, "Status", FontFactory.getFont(FontFactory.HELVETICA, 5F)));
                Paragraph m_classificacao = new Paragraph(new Phrase(7F, "Classificação", FontFactory.getFont(FontFactory.HELVETICA, 5F)));
                Paragraph m_documentacao = new Paragraph(new Phrase(7F, "Documentação Suporte", FontFactory.getFont(FontFactory.HELVETICA, 5F)));
                Paragraph m_banco = new Paragraph(new Phrase(7F, "Banco", FontFactory.getFont(FontFactory.HELVETICA, 5F)));
                Paragraph m_valor = new Paragraph(new Phrase(7F, "Valor", FontFactory.getFont(FontFactory.HELVETICA, 5F)));

                PdfPTable tablem = new PdfPTable(21);
                PdfPCell cella = new PdfPCell(new Paragraph(m_data));
                PdfPCell cellb = new PdfPCell(new Paragraph(m_tipo));
                PdfPCell cellc = new PdfPCell(new Paragraph(m_descricao));
                PdfPCell celld = new PdfPCell(new Paragraph(m_status));
                PdfPCell celle = new PdfPCell(new Paragraph(m_classificacao));
                PdfPCell cellf = new PdfPCell(new Paragraph(m_documentacao));
                PdfPCell cellg = new PdfPCell(new Paragraph(m_banco));
                PdfPCell cellh = new PdfPCell(new Paragraph(m_valor));
                
                 cellc.setColspan(3);
                    celld.setColspan(4);
                    celle.setColspan(4);
                    cellf.setColspan(5);
                    cellg.setColspan(2);
                cella.setHorizontalAlignment(Element.ALIGN_CENTER);
                cellb.setHorizontalAlignment(Element.ALIGN_CENTER);
                cellc.setHorizontalAlignment(Element.ALIGN_CENTER);
                celld.setHorizontalAlignment(Element.ALIGN_CENTER);
                celle.setHorizontalAlignment(Element.ALIGN_CENTER);
                cellf.setHorizontalAlignment(Element.ALIGN_CENTER);
                cellg.setHorizontalAlignment(Element.ALIGN_CENTER);
                cellh.setHorizontalAlignment(Element.ALIGN_CENTER);

                tablem.addCell(cella);
                tablem.addCell(cellb);
                tablem.addCell(cellc);
                tablem.addCell(celld);
                tablem.addCell(celle);
                tablem.addCell(cellf);
                tablem.addCell(cellg);
                tablem.addCell(cellh);

                doc.add(tablem);
                doc.add(tableE);

                Connection con = new ConnectionFactory().getConnection();
                PreparedStatement ps, ps1, ps2, ps3,ps4 = null;
                ResultSet rs, rs1, rs2, rs3, rs4 = null;

                String query = "select l.id , date_format(data_lanc,'%d/%m/%Y') as data_formatada , l.tipo, l.descricao, l.status_,l.classificacao,l.documentacao_suporte, l.valor, l.banco  "
                        + "from tbl_lancamentos as l  where l.data_lanc BETWEEN ? AND ?";

                String receita = "select  sum(valor) as total from tbl_lancamentos where tipo = 'CREDITO'and data_lanc BETWEEN ? AND ?  ";

                String despesa = "select  sum(valor) as total from tbl_lancamentos where tipo = 'DEBITO'and data_lanc BETWEEN ? AND ?  ";

                String saldo = " Select   (SELECT sum(valor) FROM tbl_lancamentos where tipo = 'CREDITO'  and data_lanc BETWEEN ? AND ?  ) as receita ,"
                        + "         (select sum(valor) FROM tbl_lancamentos where tipo = 'DEBITO' and data_lanc BETWEEN ? AND ?   ) as  despesa ,"
                        + "         (select receita - despesa ) as saldo  ";
               
                String saldos = " Select   (SELECT sum(valor) FROM tbl_lancamentos where tipo = 'CREDITO'  and data_lanc BETWEEN ? AND ? and banco= ' SICOOB ' ) as receita ,"
                        + "         (select sum(valor) FROM tbl_lancamentos where tipo = 'DEBITO' and data_lanc BETWEEN ? AND ? and banco= ' SICOOB ' ) as  despesa ,"
                        + "         (select receita - despesa ) as saldo  ";

                ps = con.prepareStatement(query);
                ps.setString(1, data_inicio1.toString());
                ps.setString(2, data_fim1.toString());

                ps1 = con.prepareStatement(receita);
                ps1.setString(1, data_inicio1.toString());
                ps1.setString(2, data_fim1.toString());

                ps2 = con.prepareStatement(despesa);
                ps2.setString(1, data_inicio1.toString());
                ps2.setString(2, data_fim1.toString());

                ps3 = con.prepareStatement(saldo);
                ps3.setString(1, data_inicio1.toString());
                ps3.setString(2, data_fim1.toString());
                ps3.setString(3, data_inicio2.toString());
                ps3.setString(4, data_fim2.toString());
                
                ps4 = con.prepareStatement(saldos);
                ps4.setString(1, data_inicio1.toString());
                ps4.setString(2, data_fim1.toString());
                ps4.setString(3, data_inicio2.toString());
                ps4.setString(4, data_fim2.toString());

                rs = ps.executeQuery();

                while (rs.next()) {
                    Paragraph id = new Paragraph(
                            rs.getString("l.id"), FontFactory.getFont(FontFactory.HELVETICA, 7F));

                    Paragraph data = new Paragraph(
                            rs.getString("data_formatada"), FontFactory.getFont(FontFactory.HELVETICA, 5F));

                    Paragraph tipo = new Paragraph(
                            rs.getString("l.tipo"), FontFactory.getFont(FontFactory.HELVETICA, 5F));

                    Paragraph descricao = new Paragraph(
                            rs.getString("l.descricao"), FontFactory.getFont(FontFactory.HELVETICA, 5F));

                    Paragraph status = new Paragraph(
                            rs.getString("l.status_"), FontFactory.getFont(FontFactory.HELVETICA, 5F));

                    Paragraph classificacao = new Paragraph(
                            rs.getString("l.classificacao"), FontFactory.getFont(FontFactory.HELVETICA, 5F));

                    Paragraph documentacao = new Paragraph(
                            rs.getString("l.documentacao_suporte"), FontFactory.getFont(FontFactory.HELVETICA, 5F));

                    Paragraph banco = new Paragraph(
                            rs.getString("l.banco"), FontFactory.getFont(FontFactory.HELVETICA, 5F));

                    Paragraph valor = new Paragraph(
                            rs.getString("l.valor"), FontFactory.getFont(FontFactory.HELVETICA, 5F));

                    PdfPTable table = new PdfPTable(21);

                    PdfPCell cell1 = new PdfPCell(new Paragraph(data));
                    PdfPCell cell2 = new PdfPCell(new Paragraph(tipo));
                    PdfPCell cell3 = new PdfPCell(new Paragraph(descricao));
                    PdfPCell cell4 = new PdfPCell(new Paragraph(status));
                    PdfPCell cell5 = new PdfPCell(new Paragraph(classificacao));
                    PdfPCell cell6 = new PdfPCell(new Paragraph(documentacao));
                    PdfPCell cell7 = new PdfPCell(new Paragraph(banco));
                    PdfPCell cell8 = new PdfPCell(new Paragraph(valor));

                    cell3.setColspan(3);
                    cell4.setColspan(4);
                    cell5.setColspan(4);
                    cell6.setColspan(5);
                    cell7.setColspan(2);
                   

                    cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
                    cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
                    cell3.setHorizontalAlignment(Element.ALIGN_CENTER);
                    cell4.setHorizontalAlignment(Element.ALIGN_CENTER);
                    cell5.setHorizontalAlignment(Element.ALIGN_CENTER);
                    cell6.setHorizontalAlignment(Element.ALIGN_CENTER);
                    cell7.setHorizontalAlignment(Element.ALIGN_CENTER);
                    cell8.setHorizontalAlignment(Element.ALIGN_RIGHT);
                   
                     
                   
                    table.addCell(cell1);
                    table.addCell(cell2);
                    table.addCell(cell3);
                    table.addCell(cell4);
                    table.addCell(cell5);
                    table.addCell(cell6);
                    table.addCell(cell7);
                    table.addCell(cell8);
                    
                   
                    doc.add(table);

                    doc.add(new Paragraph(""));

                }

                doc.add(espaco);

                Paragraph treceita = new Paragraph(new Phrase(20F, "CRÉDITO", FontFactory.getFont(FontFactory.HELVETICA, 7F)));
                treceita.setAlignment(Element.ALIGN_RIGHT);
                Paragraph R$ = new Paragraph(new Phrase(20F, "R$", FontFactory.getFont(FontFactory.HELVETICA, 7F)));

                rs1 = ps1.executeQuery();
                while (rs1.next()) {
                    Paragraph soma_receita = new Paragraph(
                            rs1.getString("total"), FontFactory.getFont(FontFactory.HELVETICA, 7F));

                    PdfPTable table1 = new PdfPTable(17);
                    PdfPCell cellT = new PdfPCell(new Paragraph(treceita));
                    cellT.setBorder(PdfPCell.NO_BORDER);
                    cellT.setHorizontalAlignment(Element.ALIGN_LEFT);
                    PdfPCell celli = new PdfPCell(new Paragraph(espaco));
                    celli.setBorder(PdfPCell.NO_BORDER);

                    PdfPCell cellR = new PdfPCell(new Paragraph(soma_receita));
                    PdfPCell cells = new PdfPCell(new Paragraph(R$));
                    cells.setBorder(PdfPCell.NO_BORDER);
                    cells.setHorizontalAlignment(Element.ALIGN_RIGHT);
                    cells.setColspan(3);
                    cellR.setBorder(PdfPCell.NO_BORDER);
                    cellR.setHorizontalAlignment(Element.ALIGN_RIGHT);

                    table1.addCell(celli);
                    table1.addCell(celli);
                    table1.addCell(celli);
                    table1.addCell(celli);
                    table1.addCell(celli);
                    table1.addCell(celli);
                    table1.addCell(celli);
                    table1.addCell(celli);
                    table1.addCell(celli);
                    table1.addCell(celli);
                    table1.addCell(celli);
                    table1.addCell(celli);

                    table1.addCell(cellT);
                    table1.addCell(cells);
                    table1.addCell(cellR);

                    doc.add(table1);
                }

                Paragraph tdespesa = new Paragraph(new Phrase(20F, "DÉBITO", FontFactory.getFont(FontFactory.HELVETICA, 7F)));
                tdespesa.setAlignment(Element.ALIGN_RIGHT);

                rs2 = ps2.executeQuery();
                while (rs2.next()) {
                    Paragraph soma_despesa = new Paragraph(
                            rs2.getString("total"), FontFactory.getFont(FontFactory.HELVETICA, 7F));

                    PdfPTable table2 = new PdfPTable(17);
                    PdfPCell cellT = new PdfPCell(new Paragraph(tdespesa));
                    cellT.setBorder(PdfPCell.NO_BORDER);
                    cellT.setHorizontalAlignment(Element.ALIGN_LEFT);

                    PdfPCell cellz = new PdfPCell(new Paragraph(espaco));
                    cellz.setBorder(PdfPCell.NO_BORDER);

                    PdfPCell cells = new PdfPCell(new Paragraph(R$));
                    cells.setBorder(PdfPCell.NO_BORDER);
                    cells.setHorizontalAlignment(Element.ALIGN_RIGHT);
                    cells.setColspan(3);

                    PdfPCell cellD = new PdfPCell(new Paragraph(soma_despesa));

                    cellD.setBorder(PdfPCell.NO_BORDER);
                    cellD.setHorizontalAlignment(Element.ALIGN_RIGHT);

                    table2.addCell(cellz);
                    table2.addCell(cellz);
                    table2.addCell(cellz);
                    table2.addCell(cellz);
                    table2.addCell(cellz);
                    table2.addCell(cellz);
                    table2.addCell(cellz);
                    table2.addCell(cellz);
                    table2.addCell(cellz);
                    table2.addCell(cellz);
                    table2.addCell(cellz);
                    table2.addCell(cellz);

                    table2.addCell(cellT);
                    table2.addCell(cells);
                    table2.addCell(cellD);

                    doc.add(table2);
                }

                Paragraph tsaldo = new Paragraph(new Phrase(20F, "SALDO", FontFactory.getFont(FontFactory.HELVETICA, 7F)));
                tsaldo.setAlignment(Element.ALIGN_RIGHT);

                rs3 = ps3.executeQuery();
                while (rs3.next()) {
                    Paragraph saldo_total = new Paragraph(
                            rs3.getString("saldo"), FontFactory.getFont(FontFactory.HELVETICA, 7F));

                    PdfPTable table3 = new PdfPTable(17);

                    PdfPCell cellS = new PdfPCell(new Paragraph(tsaldo));
                    cellS.setBorder(PdfPCell.NO_BORDER);
                    cellS.setHorizontalAlignment(Element.ALIGN_LEFT);

                    PdfPCell celli = new PdfPCell(new Paragraph(" "));
                    celli.setBorder(PdfPCell.NO_BORDER);
                    PdfPCell cells = new PdfPCell(new Paragraph(R$));
                    cells.setBorder(PdfPCell.NO_BORDER);
                    cells.setColspan(3);
                    cells.setHorizontalAlignment(Element.ALIGN_RIGHT);

                    PdfPCell cellT = new PdfPCell(new Paragraph(saldo_total));
                    cellT.setBorder(PdfPCell.NO_BORDER);
                    cellT.setHorizontalAlignment(Element.ALIGN_RIGHT);

                    table3.addCell(celli);
                    table3.addCell(celli);
                    table3.addCell(celli);
                    table3.addCell(celli);
                    table3.addCell(celli);
                    table3.addCell(celli);
                    table3.addCell(celli);
                    table3.addCell(celli);
                    table3.addCell(celli);
                    table3.addCell(celli);
                    table3.addCell(celli);
                    table3.addCell(celli);

                    table3.addCell(cellS);
                    table3.addCell(cells);
                    table3.addCell(cellT);

                    
                    doc.add(table3);
                    this.dispose();
                    
                     Paragraph tsaldos = new Paragraph(new Phrase(20F, "SALDO Sicoob", FontFactory.getFont(FontFactory.HELVETICA, 7F)));
                tsaldos.setAlignment(Element.ALIGN_RIGHT);

                rs4 = ps4.executeQuery();
                while (rs4.next()) {
                    Paragraph saldo_totals = new Paragraph(
                            rs4.getString("saldo"), FontFactory.getFont(FontFactory.HELVETICA, 7F));

                    PdfPTable table4 = new PdfPTable(17);

                    PdfPCell cellSs = new PdfPCell(new Paragraph(tsaldos));
                    cellS.setBorder(PdfPCell.NO_BORDER);
                    cellS.setHorizontalAlignment(Element.ALIGN_LEFT);

                    PdfPCell cellis = new PdfPCell(new Paragraph(" "));
                    cellis.setBorder(PdfPCell.NO_BORDER);
                    PdfPCell cellss = new PdfPCell(new Paragraph(R$));
                    cellss.setBorder(PdfPCell.NO_BORDER);
                    cellss.setColspan(3);
                    cellss.setHorizontalAlignment(Element.ALIGN_RIGHT);

                    PdfPCell cellTs = new PdfPCell(new Paragraph(saldo_totals));
                    cellTs.setBorder(PdfPCell.NO_BORDER);
                    cellTs.setHorizontalAlignment(Element.ALIGN_RIGHT);

                    table4.addCell(cellis);
                    table4.addCell(cellis);
                    table4.addCell(cellis);
                    table4.addCell(cellis);
                    table4.addCell(cellis);
                    table4.addCell(cellis);
                    table4.addCell(cellis);
                    table4.addCell(cellis);
                    table4.addCell(cellis);
                    table4.addCell(cellis);
                    table4.addCell(cellis);
                    table4.addCell(cellis);

                    table4.addCell(cellSs);
                    table4.addCell(cellss);
                    table4.addCell(cellTs);

                    
                  //  doc.add(table4);
                }
                }
               
                Runtime.getRuntime().exec(new String[]{"cmd.exe", "/c", "start", "Financeiro.pdf"});
                
                doc.close();

            } catch (FileNotFoundException ex) {
                Logger.getLogger(FrmLanc.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(FrmLanc.class.getName()).log(Level.SEVERE, null, ex);
            } catch (DocumentException ex) {
                Logger.getLogger(FrmLanc.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
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
            java.util.logging.Logger.getLogger(FrmRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRelatorio().setVisible(true);
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
