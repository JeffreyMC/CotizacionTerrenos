/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import Clases.Cliente;
import Clases.Cotizacion;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import javax.swing.JOptionPane;
/**
 *
 * @author jeff
 */
public class Calculos extends javax.swing.JFrame {

    private Cliente cliente;
    Cotizacion cotizacion = new Cotizacion();
    
    public Calculos(Cliente cliente) {
        initComponents();
        setLocationRelativeTo(null);
        this.cliente = cliente;
        inicializarValores();
    }
    
    public Calculos(){}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idCotText = new javax.swing.JTextField();
        fechaTextLabel = new javax.swing.JLabel();
        fechaText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tamanioLoteText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        siRadio = new javax.swing.JRadioButton();
        noRadio = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        valorConstText = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        anioConstText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        bonoText = new javax.swing.JTextField();
        btnCotizacion = new javax.swing.JButton();
        
        

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel1.setText("DATOS DE COTIZACIÓN");

        jLabel2.setText("ID Cotización");

        idCotText.setEditable(false);

        fechaTextLabel.setText("Fecha");

        fechaText.setEditable(false);
        fechaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaTextActionPerformed(evt);
            }
        });

        jLabel3.setText("Tamaño del lote");

        tamanioLoteText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamanioLoteTextActionPerformed(evt);
            }
        });

        jLabel4.setText("Contiene contrucción");

        buttonGroup.add(siRadio);
        siRadio.setText("SI");
        siRadio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                siRadioMouseClicked(evt);
            }
        });

        buttonGroup.add(noRadio);
        noRadio.setSelected(true);
        noRadio.setText("NO");
        noRadio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                noRadioMouseClicked(evt);
            }
        });

        jLabel5.setText("Si contiene contrucción rellene la siguiente información");

        jLabel6.setText("Valor de la construcción");

        jLabel7.setText("Año de la construcción");

        jLabel8.setText("Aplica bono");

        bonoText.setEditable(false);

        btnCotizacion.setText("Realizar Cotización");
        btnCotizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCotizacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 134, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(132, 132, 132))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(46, 46, 46)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(fechaTextLabel)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addGap(27, 27, 27)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(idCotText)
                                .addComponent(fechaText)
                                .addComponent(tamanioLoteText, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(siRadio)
                                    .addGap(18, 18, 18)
                                    .addComponent(noRadio))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(196, 196, 196)
                            .addComponent(jLabel1))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel6)
                                .addComponent(jLabel8))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(valorConstText)
                                .addComponent(anioConstText)
                                .addComponent(bonoText, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(btnCotizacion)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idCotText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechaTextLabel)
                    .addComponent(fechaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tamanioLoteText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(siRadio)
                    .addComponent(noRadio))
                .addGap(27, 27, 27)
                .addComponent(jLabel5)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(valorConstText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(anioConstText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(bonoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(btnCotizacion)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void inicializarValores(){
        
        Random random = new Random();
        
        int idCotizacion = random.nextInt(0 + 30000) + 0;
        
        idCotText.setText(String.valueOf(idCotizacion));
        
        //inicializar el valor de la contrucción
        valorConstText.setText("0");
        
        //inicializar año construcción
        anioConstText.setText("0");
        
        //desabilita los campos de construcción por defecto
        valorConstText.setEnabled(false);
        anioConstText.setEnabled(false);
        
        //fecha de la cotización
        LocalDateTime now = LocalDateTime.now();
        String fecha = now.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        fechaText.setText(fecha);
        
        if(cliente.getSalario() < 350000){
            bonoText.setText("Aplica para bono");
        }
        else{
            bonoText.setText("NO aplica para bono");
        }
        
        //se pasan los valores al objeto Cotizacion
        cotizacion.setIdCotizacion(idCotizacion);
        cotizacion.setFecha(fecha);
        
    }
    
    private void fechaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaTextActionPerformed

    private void tamanioLoteTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamanioLoteTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tamanioLoteTextActionPerformed

    private void btnCotizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCotizacionActionPerformed
        
        try{
            double tamanioLote = Double.parseDouble(tamanioLoteText.getText());
            double valorConst = Double.parseDouble(valorConstText.getText());
            int anioConst = Integer.parseInt(anioConstText.getText());
            boolean contConst;
            
            if(siRadio.isSelected())
                contConst = true;
            else
                contConst = false;
            
            //se llenan los datos del objeto
            cotizacion.setTamanioLote(tamanioLote);
            cotizacion.setValorConst(valorConst);
            cotizacion.setAnioConst(anioConst);
            cotizacion.setContieneConst(contConst);
            
            //realiza los cálculos
            Reporte reporte = new Reporte(cotizar());
            reporte.setVisible(true);
            this.setVisible(false);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Ingrese solo datos numéricos", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCotizacionActionPerformed

    private void siRadioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_siRadioMouseClicked
        valorConstText.setEnabled(true);
        anioConstText.setEnabled(true);
    }//GEN-LAST:event_siRadioMouseClicked

    private void noRadioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noRadioMouseClicked
        valorConstText.setEnabled(false);
        anioConstText.setEnabled(false);
    }//GEN-LAST:event_noRadioMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowOpened
    
    public String cotizar(){
        String factura = "*****DATOS CLIENTE*****\n" +
                         "Nombre cliente: " + cliente.getNombreCompleto() + "\n" + 
                         "Identificación: " + cliente.getId() + "\n" +
                         "Edad: " + cliente.getEdad() + "\n" +
                         "Salario: " + cliente.getSalario() + "\n\n" +
                         "*****DATOS COTIZACIÓN*****\n" + 
                         "ID Cotización: " + cotizacion.getIdCotizacion() + "\n" +
                         "Fecha: " + cotizacion.getFecha() + "\n" + 
                         "Tamaño lote: " + cotizacion.getTamanioLote() + "\n" + 
                         "Contiene construcción: " + cotizacion.getContieneConst() + "\n" +
                         "Valor de la construcción: " + cotizacion.getValorConst() + "\n" +
                         "Año de construcción: " + cotizacion.getAnioConst() + "\n\n" +
                         "*****VALOR DE LA COTIZACIÓN FINAL*****\n" + 
                         valorDeLote(cotizacion.getTamanioLote(), cotizacion.getValorConst(), cotizacion.getContieneConst());
        
        
        
        return factura;
    }
    
    public String valorDeLote(double tamanio, double valorConst, boolean contieneConst){
        
        if(contieneConst){
            //Calculo de construcción
            double calcConst = valorConst * 0.3;
            //Valor del lote sin impuesto
            double loteSinIVA = calcConst * (tamanio * 300);
            //IVA
            double iva = (loteSinIVA * 0.1) + (calcConst * 0.5);
            //TOTAL
            double total = loteSinIVA + iva;
        
            String facturaValor = "Cáculo de construcción: " + String.format("%1$,.2f",calcConst) + "\n" + 
                                  "Valor del lote sin impuesto: " + String.format("%1$,.2f",loteSinIVA) + "\n" +
                                  "IVA: " + String.format("%1$,.2f", iva) + "\n\n" + 
                                  "TOTAL: " + String.format("%1$,.2f", total);
        
        
            return facturaValor;
        }
        
        //Valor del lote sin impuesto
        double loteSinIVA = tamanio * 300;
        //IVA
        double iva = loteSinIVA * 0.1;
        //TOTAL
        double total = loteSinIVA + iva;
        
        String facturaValor = "Valor del lote sin impuesto: " + String.format("%1$,.2f",loteSinIVA) + "\n" +
                              "IVA: " + String.format("%1$,.2f", iva) + "\n\n" + 
                              "TOTAL:" + String.format("%1$,.2f", total);
        
        
        return facturaValor;
        
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anioConstText;
    private javax.swing.JTextField bonoText;
    private javax.swing.JButton btnCotizacion;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JTextField fechaText;
    private javax.swing.JLabel fechaTextLabel;
    private javax.swing.JTextField idCotText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton noRadio;
    private javax.swing.JRadioButton siRadio;
    private javax.swing.JTextField tamanioLoteText;
    private javax.swing.JTextField valorConstText;
    // End of variables declaration//GEN-END:variables
}
