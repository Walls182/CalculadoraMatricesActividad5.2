/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoramatrices;


import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.JTextField;



/**
 *
 * @author Walls
 */
public class Interfaz extends javax.swing.JFrame {
       
   
    
    public Interfaz() {
        initComponents();
        setLocationRelativeTo(null);
        ckeckall();
                   
        
    }

   
    
    private void ckeckall(){
     contenedor.setVisible(false);
        
        txt1.setVisible(false);
        txt2.setVisible(false);
        txt3.setVisible(false);
        txt4.setVisible(false);
        txt5.setVisible(false);
        txt6.setVisible(false);
        txt7.setVisible(false);
        txt8.setVisible(false);
        txt9.setVisible(false);
        txt10.setVisible(false);
        txt11.setVisible(false);
        txt12.setVisible(false);
        txt13.setVisible(false);
        txt14.setVisible(false);
        txt15.setVisible(false);
        txt16.setVisible(false);
        txt17.setVisible(false);
        txt18.setVisible(false);
        txt19.setVisible(false);
        txt20.setVisible(false);
        txt21.setVisible(false);
        txt22.setVisible(false);
        txt23.setVisible(false);
        txt24.setVisible(false);
        txt25.setVisible(false);
        txt26.setVisible(false);
         txt27.setVisible(false);
          txt28.setVisible(false);
           txt29.setVisible(false);
            txt30.setVisible(false);
             txt31.setVisible(false);
              txt32.setVisible(false);
               txt33.setVisible(false);
                txt34.setVisible(false);
                 txt35.setVisible(false);
                  txt36.setVisible(false);
    
    
    
    }
   
    private void check2x2(){
    
   
                      
    contenedor.setVisible(true);
    txt1.setVisible(true);
    txt2.setVisible(true);
    txt7.setVisible(true);
    txt8.setVisible(true);
    
    }
     private void check3x3(){
        
    contenedor.setVisible(true);
        txt1.setVisible(true);
        txt2.setVisible(true);
        txt3.setVisible(true);
        txt7.setVisible(true);
        txt8.setVisible(true);
        txt9.setVisible(true);
        txt13.setVisible(true);
        txt14.setVisible(true);
        txt15.setVisible(true);
       
    }
      private void check4x4(){
           
        contenedor.setVisible(true);
        txt1.setVisible(true);
        txt2.setVisible(true);
        txt3.setVisible(true);
        txt4.setVisible(true);
        txt7.setVisible(true);
        txt8.setVisible(true);
        txt9.setVisible(true);
        txt10.setVisible(true);
        txt13.setVisible(true);
        txt14.setVisible(true);
        txt15.setVisible(true);
        txt16.setVisible(true);
        txt19.setVisible(true);
        txt20.setVisible(true);
        txt21.setVisible(true);
        txt22.setVisible(true);
       
    
    }
       private void check5x5(){
          
         contenedor.setVisible(true);
        txt1.setVisible(true);
        txt2.setVisible(true);
        txt3.setVisible(true);
        txt4.setVisible(true);
        txt5.setVisible(true);
        txt7.setVisible(true);
        txt8.setVisible(true);
        txt9.setVisible(true);
        txt10.setVisible(true);
        txt11.setVisible(true);
        txt13.setVisible(true);
        txt14.setVisible(true);
        txt15.setVisible(true);
        txt16.setVisible(true);
        txt17.setVisible(true);
        txt19.setVisible(true);
        txt20.setVisible(true);
        txt21.setVisible(true);
        txt22.setVisible(true);
        txt23.setVisible(true);
        txt31.setVisible(true);
        txt32.setVisible(true);
        txt33.setVisible(true);
        txt34.setVisible(true);
        txt35.setVisible(true);
        
    }
        private void check6x6(){
           
        contenedor.setVisible(true);
        txt1.setVisible(true);
        txt2.setVisible(true);
        txt3.setVisible(true);
        txt4.setVisible(true);
        txt5.setVisible(true);
        txt6.setVisible(true);
        
        txt7.setVisible(true);
        txt8.setVisible(true);
        txt9.setVisible(true);
        txt10.setVisible(true);
        txt11.setVisible(true);
        txt12.setVisible(true);
        
        txt13.setVisible(true);
        txt14.setVisible(true);
        txt15.setVisible(true);
        txt16.setVisible(true);
        txt17.setVisible(true);
        txt18.setVisible(true);
        
        txt19.setVisible(true);
        txt20.setVisible(true);
        txt21.setVisible(true);
        txt22.setVisible(true);
        txt23.setVisible(true);
        txt24.setVisible(true);
        
        txt25.setVisible(true);
        txt26.setVisible(true);
        txt27.setVisible(true);
        txt28.setVisible(true);
        txt29.setVisible(true);
        txt30.setVisible(true);
        
        txt31.setVisible(true);
        txt32.setVisible(true);
        txt33.setVisible(true);
        txt34.setVisible(true);
        txt35.setVisible(true);
        txt36.setVisible(true);
   
    }
       private int[][] matrices(){
          int [][]resultado = null;
           if (listaM.getSelectedItem()=="2x2") {
              int matriz1 [][]= {{Integer.parseInt(txt1.getText()),Integer.parseInt(txt2.getText())},
                       {Integer.parseInt(txt7.getText()),Integer.parseInt(txt8.getText())}};
              resultado = matriz1;
           
           }
          if (listaM.getSelectedItem()=="3x3") {
            
         int matriz2 [][]= {{Integer.parseInt(txt1.getText()),Integer.parseInt(txt2.getText()),Integer.parseInt(txt3.getText())},
                            {Integer.parseInt(txt7.getText()),Integer.parseInt(txt8.getText()),Integer.parseInt(txt9.getText())},
                            {Integer.parseInt(txt13.getText()),Integer.parseInt(txt14.getText()),Integer.parseInt(txt15.getText())}};
              resultado = matriz2;
          }
          if (listaM.getSelectedItem()=="4x4") {
       int matriz3 [][]= {{Integer.parseInt(txt1.getText()),Integer.parseInt(txt2.getText()),Integer.parseInt(txt3.getText()),Integer.parseInt(txt4.getText())},
                             {Integer.parseInt(txt7.getText()),Integer.parseInt(txt8.getText()),Integer.parseInt(txt9.getText()),Integer.parseInt(txt10.getText())},
                             {Integer.parseInt(txt13.getText()),Integer.parseInt(txt14.getText()),Integer.parseInt(txt15.getText()),Integer.parseInt(txt16.getText())},
                             {Integer.parseInt(txt19.getText()),Integer.parseInt(txt20.getText()),Integer.parseInt(txt21.getText()),Integer.parseInt(txt22.getText())}};
         resultado = matriz3;
          }
          if(listaM.getSelectedItem()=="5x5") {
        int matriz4 [][]= {{Integer.parseInt(txt1.getText()),Integer.parseInt(txt2.getText()),Integer.parseInt(txt3.getText()),Integer.parseInt(txt4.getText()),Integer.parseInt(txt5.getText())},
                             {Integer.parseInt(txt7.getText()),Integer.parseInt(txt8.getText()),Integer.parseInt(txt9.getText()),Integer.parseInt(txt10.getText()),Integer.parseInt(txt11.getText())},
                             {Integer.parseInt(txt13.getText()),Integer.parseInt(txt14.getText()),Integer.parseInt(txt15.getText()),Integer.parseInt(txt16.getText()),Integer.parseInt(txt17.getText())},
                             {Integer.parseInt(txt19.getText()),Integer.parseInt(txt20.getText()),Integer.parseInt(txt21.getText()),Integer.parseInt(txt22.getText()),Integer.parseInt(txt23.getText())},
                             {Integer.parseInt(txt31.getText()),Integer.parseInt(txt32.getText()),Integer.parseInt(txt33.getText()),Integer.parseInt(txt34.getText()),Integer.parseInt(txt35.getText())}};
           resultado = matriz4;
          }
          if (listaM.getSelectedItem()=="6x6"){
        int matriz5 [][]= {{Integer.parseInt(txt1.getText()),Integer.parseInt(txt2.getText()),Integer.parseInt(txt3.getText()),Integer.parseInt(txt4.getText()),Integer.parseInt(txt5.getText()),Integer.parseInt(txt6.getText())},
                              {Integer.parseInt(txt7.getText()),Integer.parseInt(txt8.getText()),Integer.parseInt(txt9.getText()),Integer.parseInt(txt10.getText()),Integer.parseInt(txt11.getText()),Integer.parseInt(txt12.getText())},
                              {Integer.parseInt(txt13.getText()),Integer.parseInt(txt14.getText()),Integer.parseInt(txt15.getText()),Integer.parseInt(txt16.getText()),Integer.parseInt(txt17.getText()),Integer.parseInt(txt18.getText())},
                              {Integer.parseInt(txt19.getText()),Integer.parseInt(txt20.getText()),Integer.parseInt(txt21.getText()),Integer.parseInt(txt22.getText()),Integer.parseInt(txt23.getText()),Integer.parseInt(txt24.getText())},
                              {Integer.parseInt(txt25.getText()),Integer.parseInt(txt26.getText()),Integer.parseInt(txt27.getText()),Integer.parseInt(txt28.getText()),Integer.parseInt(txt29.getText()),Integer.parseInt(txt30.getText())},
                              {Integer.parseInt(txt31.getText()),Integer.parseInt(txt32.getText()),Integer.parseInt(txt33.getText()),Integer.parseInt(txt34.getText()),Integer.parseInt(txt35.getText()),Integer.parseInt(txt36.getText())}};
          resultado = matriz5;
          }
        return resultado;
       } 
        private int [][]b1(){
        int c=Integer.parseInt(txtm1.getText());
            System.out.println(c);
        return b1;
        }
        private int[][]b2(){
        
        
        return b2;
        }
        
         private void imp2(int [][]resultado1){
          
            
            String s;
            for (int i = 0; i <resultado1.length; i++) {
                
                txtm1.append("\n");
                for (int j = 0; j <resultado1[i].length; j++) {
                   
                    txtm2.append(resultado1[i][j]+"     ");  
                }
            
            }
           
        
       
        }
      
            private void imp(int [][]resultado){
            
            
            String s;
            for (int i = 0; i <resultado.length; i++) {
                
                txtm1.append("\n");
                for (int j = 0; j <resultado[i].length; j++) {
                   
                    txtm1.append(resultado[i][j]+"     ");  
                }
            
            }
           
        
       
        }
        private void ele(){
            Calculos c = new Calculos();
        String ele= cb2.getName();
            switch (ele) {
                case "sumar":
                 int a= Integer.parseInt(txtm1.getText());
                 int b= Integer.parseInt(txtm2.getText());  
                 c.sumar();
                            
                   
                    break;
                case "restar":
                    
                    break;
                case "traza":
                    
                    break;
                case "determinante":
                    
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Eliga una opcion valida");
            }
  
        } 
     
        private void borrar(){
        JTextField cajas;
            for (int i = 0; i < contenedor.getComponentCount(); i++) {
                if (contenedor.getComponent(i).getClass().getName().equals("javax.swing.JTextField")) {
                   cajas= (JTextField)contenedor.getComponent(i);
                   cajas.setText("");
                }
            }
        
        }
        private void llaves(){
         if (listaM.getSelectedItem()=="2x2") {
            check2x2();
            
         
        }if (listaM.getSelectedItem()=="3x3") {
            check3x3();
            
        }if (listaM.getSelectedItem()=="4x4") {
            check4x4();
            
        }if (listaM.getSelectedItem()=="5x5") {
            check5x5();
            
        }if (listaM.getSelectedItem()=="6x6") {
            check6x6();
           
        }
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pp1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        contenedor = new javax.swing.JPanel();
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        txt3 = new javax.swing.JTextField();
        txt4 = new javax.swing.JTextField();
        txt5 = new javax.swing.JTextField();
        txt6 = new javax.swing.JTextField();
        txt7 = new javax.swing.JTextField();
        txt8 = new javax.swing.JTextField();
        txt9 = new javax.swing.JTextField();
        txt10 = new javax.swing.JTextField();
        txt11 = new javax.swing.JTextField();
        txt12 = new javax.swing.JTextField();
        txt13 = new javax.swing.JTextField();
        txt14 = new javax.swing.JTextField();
        txt15 = new javax.swing.JTextField();
        txt16 = new javax.swing.JTextField();
        txt17 = new javax.swing.JTextField();
        txt18 = new javax.swing.JTextField();
        txt19 = new javax.swing.JTextField();
        txt20 = new javax.swing.JTextField();
        txt21 = new javax.swing.JTextField();
        txt22 = new javax.swing.JTextField();
        txt23 = new javax.swing.JTextField();
        txt24 = new javax.swing.JTextField();
        txt25 = new javax.swing.JTextField();
        txt26 = new javax.swing.JTextField();
        txt27 = new javax.swing.JTextField();
        txt28 = new javax.swing.JTextField();
        txt29 = new javax.swing.JTextField();
        txt30 = new javax.swing.JTextField();
        txt31 = new javax.swing.JTextField();
        txt32 = new javax.swing.JTextField();
        txt33 = new javax.swing.JTextField();
        txt34 = new javax.swing.JTextField();
        txt35 = new javax.swing.JTextField();
        txt36 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        listaM = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtm2 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtm1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtm3 = new javax.swing.JTextArea();
        cb2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnIng = new javax.swing.JButton();
        btnVer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Calculadora de matrices");

        contenedor.setForeground(new java.awt.Color(255, 255, 255));

        txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1ActionPerformed(evt);
            }
        });
        txt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt1KeyTyped(evt);
            }
        });

        txt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt2ActionPerformed(evt);
            }
        });
        txt2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt2KeyTyped(evt);
            }
        });

        txt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt3ActionPerformed(evt);
            }
        });
        txt3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt3KeyTyped(evt);
            }
        });

        txt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt4ActionPerformed(evt);
            }
        });
        txt4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt4KeyTyped(evt);
            }
        });

        txt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt5ActionPerformed(evt);
            }
        });
        txt5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt5KeyTyped(evt);
            }
        });

        txt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt6ActionPerformed(evt);
            }
        });
        txt6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt6KeyTyped(evt);
            }
        });

        txt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt7ActionPerformed(evt);
            }
        });
        txt7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt7KeyTyped(evt);
            }
        });

        txt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt8ActionPerformed(evt);
            }
        });
        txt8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt8KeyTyped(evt);
            }
        });

        txt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt9ActionPerformed(evt);
            }
        });
        txt9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt9KeyTyped(evt);
            }
        });

        txt10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt10ActionPerformed(evt);
            }
        });
        txt10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt10KeyTyped(evt);
            }
        });

        txt11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt11ActionPerformed(evt);
            }
        });
        txt11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt11KeyTyped(evt);
            }
        });

        txt12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt12ActionPerformed(evt);
            }
        });
        txt12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt12KeyTyped(evt);
            }
        });

        txt13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt13ActionPerformed(evt);
            }
        });
        txt13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt13KeyTyped(evt);
            }
        });

        txt14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt14ActionPerformed(evt);
            }
        });
        txt14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt14KeyTyped(evt);
            }
        });

        txt15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt15ActionPerformed(evt);
            }
        });
        txt15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt15KeyTyped(evt);
            }
        });

        txt16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt16ActionPerformed(evt);
            }
        });
        txt16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt16KeyTyped(evt);
            }
        });

        txt17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt17ActionPerformed(evt);
            }
        });
        txt17.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt17KeyTyped(evt);
            }
        });

        txt18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt18ActionPerformed(evt);
            }
        });
        txt18.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt18KeyTyped(evt);
            }
        });

        txt19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt19ActionPerformed(evt);
            }
        });
        txt19.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt19KeyTyped(evt);
            }
        });

        txt20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt20ActionPerformed(evt);
            }
        });
        txt20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt20KeyTyped(evt);
            }
        });

        txt21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt21ActionPerformed(evt);
            }
        });
        txt21.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt21KeyTyped(evt);
            }
        });

        txt22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt22ActionPerformed(evt);
            }
        });
        txt22.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt22KeyTyped(evt);
            }
        });

        txt23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt23ActionPerformed(evt);
            }
        });
        txt23.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt23KeyTyped(evt);
            }
        });

        txt24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt24ActionPerformed(evt);
            }
        });
        txt24.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt24KeyTyped(evt);
            }
        });

        txt25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt25ActionPerformed(evt);
            }
        });
        txt25.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt25KeyTyped(evt);
            }
        });

        txt26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt26ActionPerformed(evt);
            }
        });
        txt26.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt26KeyTyped(evt);
            }
        });

        txt27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt27ActionPerformed(evt);
            }
        });
        txt27.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt27KeyTyped(evt);
            }
        });

        txt28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt28ActionPerformed(evt);
            }
        });
        txt28.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt28KeyTyped(evt);
            }
        });

        txt29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt29ActionPerformed(evt);
            }
        });
        txt29.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt29KeyTyped(evt);
            }
        });

        txt30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt30ActionPerformed(evt);
            }
        });
        txt30.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt30KeyTyped(evt);
            }
        });

        txt31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt31ActionPerformed(evt);
            }
        });
        txt31.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt31KeyTyped(evt);
            }
        });

        txt32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt32ActionPerformed(evt);
            }
        });
        txt32.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt32KeyTyped(evt);
            }
        });

        txt33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt33ActionPerformed(evt);
            }
        });
        txt33.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt33KeyTyped(evt);
            }
        });

        txt34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt34ActionPerformed(evt);
            }
        });
        txt34.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt34KeyTyped(evt);
            }
        });

        txt35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt35ActionPerformed(evt);
            }
        });
        txt35.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt35KeyTyped(evt);
            }
        });

        txt36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt36ActionPerformed(evt);
            }
        });
        txt36.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt36KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addComponent(txt7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addComponent(txt13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt17, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt18, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addComponent(txt19, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt20, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt21, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt22, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt23, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt24, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addComponent(txt25, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt26, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt27, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt28, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt29, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt30, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addComponent(txt31, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt32, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt33, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt34, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt35, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt36, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel2.setText("Seleccione el numero de filas y columnas de la matriz");

        listaM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "     ", "2x2", "3x3", "4x4", "5x5", "6x6" }));
        listaM.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                listaMItemStateChanged(evt);
            }
        });

        jLabel3.setText("Ingrese los elementos de la matriz y presione ingresar matriz, haga lo mismo para segunda matriz");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel2)
                        .addGap(30, 30, 30)
                        .addComponent(listaM, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(listaM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pp1Layout = new javax.swing.GroupLayout(pp1);
        pp1.setLayout(pp1Layout);
        pp1Layout.setHorizontalGroup(
            pp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pp1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(327, 327, 327))
            .addGroup(pp1Layout.createSequentialGroup()
                .addGroup(pp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pp1Layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(jLabel1))
                    .addGroup(pp1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pp1Layout.setVerticalGroup(
            pp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pp1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        txtm2.setColumns(20);
        txtm2.setRows(5);
        jScrollPane1.setViewportView(txtm2);

        txtm1.setColumns(20);
        txtm1.setRows(5);
        jScrollPane2.setViewportView(txtm1);

        txtm3.setColumns(20);
        txtm3.setRows(5);
        jScrollPane3.setViewportView(txtm3);

        cb2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "     ", "sumar", "restar", "traza", "determinante", " " }));
        cb2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb2ItemStateChanged(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setText("=");

        jLabel4.setText("Eliga las opciones");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(cb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(403, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(65, 65, 65))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel4)
                        .addGap(30, 30, 30)
                        .addComponent(cb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addGap(16, 16, 16))))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addGap(16, 16, 16)))
        );

        btnIng.setText("Ingresar Primera Matriz");
        btnIng.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIngMouseClicked(evt);
            }
        });
        btnIng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngActionPerformed(evt);
            }
        });

        btnVer.setText("Ingresar Segunda Matriz");
        btnVer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVerMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(142, Short.MAX_VALUE)
                .addComponent(btnIng, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97)
                .addComponent(btnVer, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIng)
                    .addComponent(btnVer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1ActionPerformed
        
    }//GEN-LAST:event_txt1ActionPerformed

    private void txt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt2ActionPerformed

    private void txt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt3ActionPerformed

    private void txt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt4ActionPerformed

    private void txt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt5ActionPerformed

    private void txt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt6ActionPerformed

    private void txt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt7ActionPerformed

    private void txt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt8ActionPerformed

    private void txt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt9ActionPerformed

    private void txt10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt10ActionPerformed

    private void txt11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt11ActionPerformed

    private void txt12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt12ActionPerformed

    private void txt13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt13ActionPerformed

    private void txt14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt14ActionPerformed

    private void txt15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt15ActionPerformed

    private void txt16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt16ActionPerformed

    private void txt17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt17ActionPerformed

    private void txt18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt18ActionPerformed

    private void txt22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt22ActionPerformed

    private void txt19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt19ActionPerformed

    private void txt23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt23ActionPerformed

    private void txt24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt24ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt24ActionPerformed

    private void txt21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt21ActionPerformed

    private void txt20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt20ActionPerformed

    private void txt30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt30ActionPerformed

    private void txt29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt29ActionPerformed

    private void txt28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt28ActionPerformed

    private void txt27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt27ActionPerformed

    private void txt25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt25ActionPerformed

    private void txt26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt26ActionPerformed

    private void txt35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt35ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt35ActionPerformed

    private void txt32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt32ActionPerformed

    private void txt34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt34ActionPerformed

    private void txt31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt31ActionPerformed

    private void txt36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt36ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt36ActionPerformed

    private void txt33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt33ActionPerformed

    private void listaMItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_listaMItemStateChanged
        revalidate();
         ckeckall();
        llaves();
      
      
    }//GEN-LAST:event_listaMItemStateChanged

    private void txt1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1KeyTyped
        int key = evt.getKeyChar();

    boolean numeros = key >= 48 && key <= 57;
        
    if (!numeros)
    {
        evt.consume();
    }
    }//GEN-LAST:event_txt1KeyTyped

    private void txt2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2KeyTyped
       int key = evt.getKeyChar();

    boolean numeros = key >= 48 && key <= 57;
        
    if (!numeros)
    {
        evt.consume();
    }
    }//GEN-LAST:event_txt2KeyTyped

    private void txt3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt3KeyTyped
       int key = evt.getKeyChar();

    boolean numeros = key >= 48 && key <= 57;
        
    if (!numeros)
    {
        evt.consume();
    }
    }//GEN-LAST:event_txt3KeyTyped

    private void txt4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt4KeyTyped
       int key = evt.getKeyChar();

    boolean numeros = key >= 48 && key <= 57;
        
    if (!numeros)
    {
        evt.consume();
    }
    }//GEN-LAST:event_txt4KeyTyped

    private void txt5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt5KeyTyped
        int key = evt.getKeyChar();

    boolean numeros = key >= 48 && key <= 57;
        
    if (!numeros)
    {
        evt.consume();
    }
    }//GEN-LAST:event_txt5KeyTyped

    private void txt6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt6KeyTyped
       int key = evt.getKeyChar();

    boolean numeros = key >= 48 && key <= 57;
        
    if (!numeros)
    {
        evt.consume();
    }
    }//GEN-LAST:event_txt6KeyTyped

    private void txt7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt7KeyTyped
int key = evt.getKeyChar();

    boolean numeros = key >= 48 && key <= 57;
        
    if (!numeros)
    {
        evt.consume();
    }        // TODO add your handling code here:
    }//GEN-LAST:event_txt7KeyTyped

    private void txt8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt8KeyTyped
int key = evt.getKeyChar();

    boolean numeros = key >= 48 && key <= 57;
        
    if (!numeros)
    {
        evt.consume();
    }        // TODO add your handling code here:
    }//GEN-LAST:event_txt8KeyTyped

    private void txt9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt9KeyTyped
int key = evt.getKeyChar();

    boolean numeros = key >= 48 && key <= 57;
        
    if (!numeros)
    {
        evt.consume();
    }        // TODO add your handling code here:
    }//GEN-LAST:event_txt9KeyTyped

    private void txt10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt10KeyTyped
int key = evt.getKeyChar();

    boolean numeros = key >= 48 && key <= 57;
        
    if (!numeros)
    {
        evt.consume();
    }        // TODO add your handling code here:
    }//GEN-LAST:event_txt10KeyTyped

    private void txt11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt11KeyTyped
int key = evt.getKeyChar();

    boolean numeros = key >= 48 && key <= 57;
        
    if (!numeros)
    {
        evt.consume();
    }        // TODO add your handling code here:
    }//GEN-LAST:event_txt11KeyTyped

    private void txt12KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt12KeyTyped
int key = evt.getKeyChar();

    boolean numeros = key >= 48 && key <= 57;
        
    if (!numeros)
    {
        evt.consume();
    }        // TODO add your handling code here:
    }//GEN-LAST:event_txt12KeyTyped

    private void txt13KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt13KeyTyped
int key = evt.getKeyChar();

    boolean numeros = key >= 48 && key <= 57;
        
    if (!numeros)
    {
        evt.consume();
    }        // TODO add your handling code here:
    }//GEN-LAST:event_txt13KeyTyped

    private void txt14KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt14KeyTyped
int key = evt.getKeyChar();

    boolean numeros = key >= 48 && key <= 57;
        
    if (!numeros)
    {
        evt.consume();
    }        // TODO add your handling code here:
    }//GEN-LAST:event_txt14KeyTyped

    private void txt15KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt15KeyTyped
int key = evt.getKeyChar();

    boolean numeros = key >= 48 && key <= 57;
        
    if (!numeros)
    {
        evt.consume();
    }        // TODO add your handling code here:
    }//GEN-LAST:event_txt15KeyTyped

    private void txt16KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt16KeyTyped
int key = evt.getKeyChar();

    boolean numeros = key >= 48 && key <= 57;
        
    if (!numeros)
    {
        evt.consume();
    }        // TODO add your handling code here:
    }//GEN-LAST:event_txt16KeyTyped

    private void txt17KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt17KeyTyped
int key = evt.getKeyChar();

    boolean numeros = key >= 48 && key <= 57;
        
    if (!numeros)
    {
        evt.consume();
    }        // TODO add your handling code here:
    }//GEN-LAST:event_txt17KeyTyped

    private void txt18KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt18KeyTyped
int key = evt.getKeyChar();

    boolean numeros = key >= 48 && key <= 57;
        
    if (!numeros)
    {
        evt.consume();
    }        // TODO add your handling code here:
    }//GEN-LAST:event_txt18KeyTyped

    private void txt19KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt19KeyTyped
int key = evt.getKeyChar();

    boolean numeros = key >= 48 && key <= 57;
        
    if (!numeros)
    {
        evt.consume();
    }        // TODO add your handling code here:
    }//GEN-LAST:event_txt19KeyTyped

    private void txt20KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt20KeyTyped
int key = evt.getKeyChar();

    boolean numeros = key >= 48 && key <= 57;
        
    if (!numeros)
    {
        evt.consume();
    }        // TODO add your handling code here:
    }//GEN-LAST:event_txt20KeyTyped

    private void txt21KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt21KeyTyped
int key = evt.getKeyChar();

    boolean numeros = key >= 48 && key <= 57;
        
    if (!numeros)
    {
        evt.consume();
    }        // TODO add your handling code here:
    }//GEN-LAST:event_txt21KeyTyped

    private void txt22KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt22KeyTyped
int key = evt.getKeyChar();

    boolean numeros = key >= 48 && key <= 57;
        
    if (!numeros)
    {
        evt.consume();
    }        // TODO add your handling code here:
    }//GEN-LAST:event_txt22KeyTyped

    private void txt23KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt23KeyTyped
int key = evt.getKeyChar();

    boolean numeros = key >= 48 && key <= 57;
        
    if (!numeros)
    {
        evt.consume();
    }        // TODO add your handling code here:
    }//GEN-LAST:event_txt23KeyTyped

    private void txt24KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt24KeyTyped
int key = evt.getKeyChar();

    boolean numeros = key >= 48 && key <= 57;
        
    if (!numeros)
    {
        evt.consume();
    }        // TODO add your handling code here:
    }//GEN-LAST:event_txt24KeyTyped

    private void txt25KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt25KeyTyped
int key = evt.getKeyChar();

    boolean numeros = key >= 48 && key <= 57;
        
    if (!numeros)
    {
        evt.consume();
    }        // TODO add your handling code here:
    }//GEN-LAST:event_txt25KeyTyped

    private void txt26KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt26KeyTyped
int key = evt.getKeyChar();

    boolean numeros = key >= 48 && key <= 57;
        
    if (!numeros)
    {
        evt.consume();
    }        // TODO add your handling code here:
    }//GEN-LAST:event_txt26KeyTyped

    private void txt27KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt27KeyTyped
int key = evt.getKeyChar();

    boolean numeros = key >= 48 && key <= 57;
        
    if (!numeros)
    {
        evt.consume();
    }        // TODO add your handling code here:
    }//GEN-LAST:event_txt27KeyTyped

    private void txt28KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt28KeyTyped
int key = evt.getKeyChar();

    boolean numeros = key >= 48 && key <= 57;
        
    if (!numeros)
    {
        evt.consume();
    }        // TODO add your handling code here:
    }//GEN-LAST:event_txt28KeyTyped

    private void txt29KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt29KeyTyped
int key = evt.getKeyChar();

    boolean numeros = key >= 48 && key <= 57;
        
    if (!numeros)
    {
        evt.consume();
    }        // TODO add your handling code here:
    }//GEN-LAST:event_txt29KeyTyped

    private void txt30KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt30KeyTyped
int key = evt.getKeyChar();

    boolean numeros = key >= 48 && key <= 57;
        
    if (!numeros)
    {
        evt.consume();
    }        // TODO add your handling code here:
    }//GEN-LAST:event_txt30KeyTyped

    private void txt31KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt31KeyTyped
int key = evt.getKeyChar();

    boolean numeros = key >= 48 && key <= 57;
        
    if (!numeros)
    {
        evt.consume();
    }        // TODO add your handling code here:
    }//GEN-LAST:event_txt31KeyTyped

    private void txt32KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt32KeyTyped
int key = evt.getKeyChar();

    boolean numeros = key >= 48 && key <= 57;
        
    if (!numeros)
    {
        evt.consume();
    }        // TODO add your handling code here:
    }//GEN-LAST:event_txt32KeyTyped

    private void txt33KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt33KeyTyped
int key = evt.getKeyChar();

    boolean numeros = key >= 48 && key <= 57;
        
    if (!numeros)
    {
        evt.consume();
    }        // TODO add your handling code here:
    }//GEN-LAST:event_txt33KeyTyped

    private void txt34KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt34KeyTyped
int key = evt.getKeyChar();

    boolean numeros = key >= 48 && key <= 57;
        
    if (!numeros)
    {
        evt.consume();
    }        // TODO add your handling code here:
    }//GEN-LAST:event_txt34KeyTyped

    private void txt35KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt35KeyTyped
int key = evt.getKeyChar();

    boolean numeros = key >= 48 && key <= 57;
        
    if (!numeros)
    {
        evt.consume();
    }        // TODO add your handling code here:
    }//GEN-LAST:event_txt35KeyTyped

    private void txt36KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt36KeyTyped
int key = evt.getKeyChar();

    boolean numeros = key >= 48 && key <= 57;
        
    if (!numeros)
    {
        evt.consume();
    }        // TODO add your handling code here:
    }//GEN-LAST:event_txt36KeyTyped

    private void btnIngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngActionPerformed
       
    }//GEN-LAST:event_btnIngActionPerformed

    private void btnIngMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngMouseClicked
        imp(matrices());
        
        borrar();

    }//GEN-LAST:event_btnIngMouseClicked

    private void cb2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb2ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cb2ItemStateChanged
         
   

    private void btnVerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVerMouseClicked
       imp2(matrices());
        borrar();
    }//GEN-LAST:event_btnVerMouseClicked

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIng;
    private javax.swing.JButton btnVer;
    private javax.swing.JComboBox<String> cb2;
    private javax.swing.JPanel contenedor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox<String> listaM;
    private javax.swing.JPanel pp1;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt10;
    private javax.swing.JTextField txt11;
    private javax.swing.JTextField txt12;
    private javax.swing.JTextField txt13;
    private javax.swing.JTextField txt14;
    private javax.swing.JTextField txt15;
    private javax.swing.JTextField txt16;
    private javax.swing.JTextField txt17;
    private javax.swing.JTextField txt18;
    private javax.swing.JTextField txt19;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt20;
    private javax.swing.JTextField txt21;
    private javax.swing.JTextField txt22;
    private javax.swing.JTextField txt23;
    private javax.swing.JTextField txt24;
    private javax.swing.JTextField txt25;
    private javax.swing.JTextField txt26;
    private javax.swing.JTextField txt27;
    private javax.swing.JTextField txt28;
    private javax.swing.JTextField txt29;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt30;
    private javax.swing.JTextField txt31;
    private javax.swing.JTextField txt32;
    private javax.swing.JTextField txt33;
    private javax.swing.JTextField txt34;
    private javax.swing.JTextField txt35;
    private javax.swing.JTextField txt36;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txt5;
    private javax.swing.JTextField txt6;
    private javax.swing.JTextField txt7;
    private javax.swing.JTextField txt8;
    private javax.swing.JTextField txt9;
    private javax.swing.JTextArea txtm1;
    private javax.swing.JTextArea txtm2;
    private javax.swing.JTextArea txtm3;
    // End of variables declaration//GEN-END:variables
}
