/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cryptofire;


import java.io.File;
import java.io.*;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.filechooser.FileFilter;
/**
 *
 * @author AvinashPC
 */
public class CryptoFire extends javax.swing.JFrame {

    /**
     * Creates new form CryptoFire
     */
    public CryptoFire() {
        initComponents();
        
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jTextFieldSI = new javax.swing.JTextField();
        jTextFieldSF = new javax.swing.JTextField();
        jTextFieldDF = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel2 = new javax.swing.JPanel();
        jTextFieldDSI = new javax.swing.JTextField();
        jTextFieldDDF = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jProgressBar2 = new javax.swing.JProgressBar();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CryptoFire -by papaNature");
        setResizable(false);

        jTextFieldSI.setText("Enter the Source Image");
        jTextFieldSI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSIActionPerformed(evt);
            }
        });

        jTextFieldSF.setText("Enter the Source File");

        jTextFieldDF.setText("Enter the Destination File");

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Enter Password");

        jButton4.setText("START");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton1.setText("Browse...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Browse...");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Browse...");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jProgressBar1.setToolTipText("");
        jProgressBar1.setAutoscrolls(true);
        jProgressBar1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextFieldDF)
                    .addComponent(jTextFieldSF)
                    .addComponent(jTextFieldSI))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldSF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jTabbedPane1.addTab("Encryption", jPanel1);

        jTextFieldDSI.setText("Enter Source Encrypted Image");
        jTextFieldDSI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDSIActionPerformed(evt);
            }
        });

        jTextFieldDDF.setText("Enter decrypted file path");

        jButton5.setText("Browse...");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton7.setText("Browse...");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel2.setText("Enter Password");

        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });

        jButton8.setText("START");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jProgressBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldDDF)
                    .addComponent(jTextFieldDSI, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordField2)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton7))
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDSI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Decryption", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jProgressBar1.setValue(0);
        
        
        Thread t;
        t = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                FileEncryptor fe=new FileEncryptor(jTextFieldSI.getText(),jTextFieldSF.getText(),jTextFieldDF.getText(),jPasswordField1.getText());
                try
                {
                    fe.encrypt();
                }
                catch (IOException ex) 
                {
                    //Logger.getLogger(cryptofire.class.getName()).log(Level.SEVERE, null, ex);
                } 
            }
            
        });
        t.start();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser fc=new JFileChooser();
        fc.setCurrentDirectory(new File(System.getProperty("user.home")+"\\Desktop"));
        fc.setFileFilter(new ImageFilter());
        
        int retVal=fc.showOpenDialog(this);
        
        if (retVal == JFileChooser.APPROVE_OPTION) 
        {
            File file = fc.getSelectedFile();
            jTextFieldSI.setText(file.getPath());
            String ext=Utils.getExtension(file);
            jTextFieldDF.setText(file.getPath()+"_Encrypted."+ext);
            
            //log.append("Opening: " + file.getName() + "." + newline);
        } else {
            //log.append("Open command cancelled by user." + newline);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JFileChooser fc=new JFileChooser();
        fc.setCurrentDirectory(new File(System.getProperty("user.home")+"\\Desktop"));
        int retVal=fc.showOpenDialog(this);
        if (retVal == JFileChooser.APPROVE_OPTION) 
        {
            File file = fc.getSelectedFile();
            jTextFieldSF.setText(file.getPath());
            
            //log.append("Opening: " + file.getName() + "." + newline);
        } else {
            //log.append("Open command cancelled by user." + newline);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JFileChooser fc=new JFileChooser();
        fc.setCurrentDirectory(new File(System.getProperty("user.home")+"\\Desktop"));
        fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int retVal=fc.showOpenDialog(this);
        if (retVal == JFileChooser.APPROVE_OPTION) 
        {
            File file = fc.getSelectedFile();
            jTextFieldDF.setText(file.getPath());
            
            //log.append("Opening: " + file.getName() + "." + newline);
        } else {
            //log.append("Open command cancelled by user." + newline);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextFieldDSIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDSIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDSIActionPerformed

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        JFileChooser fc=new JFileChooser();
        fc.setCurrentDirectory(new File(System.getProperty("user.home")+"\\Desktop"));
        int retVal=fc.showOpenDialog(this);
        if (retVal == JFileChooser.APPROVE_OPTION) 
        {
            File file = fc.getSelectedFile();
            jTextFieldDSI.setText(file.getPath());
            jTextFieldDDF.setText(file.getParent()+"\\");
            //log.append("Opening: " + file.getName() + "." + newline);
        } else {
            //log.append("Open command cancelled by user." + newline);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        JFileChooser fc=new JFileChooser();
        fc.setCurrentDirectory(new File(System.getProperty("user.home")+"\\Desktop"));
        int retVal=fc.showOpenDialog(this);
        if (retVal == JFileChooser.APPROVE_OPTION) 
        {
            File file = fc.getSelectedFile();
            jTextFieldDDF.setText(file.getPath());
            
            //log.append("Opening: " + file.getName() + "." + newline);
        } else {
            //log.append("Open command cancelled by user." + newline);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Thread t=new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                FileDecryptor fe=new FileDecryptor(jTextFieldDDF.getText(),jTextFieldDSI.getText(),jPasswordField2.getText());
                fe.decrypt();
            }
        });
        t.start();
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jTextFieldSIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSIActionPerformed

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
            java.util.logging.Logger.getLogger(CryptoFire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CryptoFire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CryptoFire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CryptoFire.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CryptoFire().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    public static javax.swing.JProgressBar jProgressBar1;
    public static javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextFieldDDF;
    private javax.swing.JTextField jTextFieldDF;
    private javax.swing.JTextField jTextFieldDSI;
    private javax.swing.JTextField jTextFieldSF;
    private javax.swing.JTextField jTextFieldSI;
    // End of variables declaration//GEN-END:variables
    
}
class ImageFilter extends FileFilter
{
    @Override
    public boolean accept(File f) 
    {
        if (f.isDirectory())
        {
            return true;
        }

        String extension = Utils.getExtension(f);
        if (extension != null) 
        {
            return extension.equals(Utils.tif) ||
                    extension.equals(Utils.tiff) ||
                    extension.equals(Utils.gif) ||
                    extension.equals(Utils.jpeg) ||
                    extension.equals(Utils.jpg) ||
                    extension.equals(Utils.png);
         }

    return false;
}

    @Override
    public String getDescription() 
    {
        return "Images";
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

class Utils
{

    public final static String jpeg = "jpeg";
    public final static String jpg = "jpg";
    public final static String gif = "gif";
    public final static String tiff = "tiff";
    public final static String tif = "tif";
    public final static String png = "png";

    /*
     * Get the extension of a file.
     */  
    public static String getExtension(File f) {
        String ext = null;
        String s = f.getName();
        int i = s.lastIndexOf('.');

        if (i > 0 &&  i < s.length() - 1) {
            ext = s.substring(i+1).toLowerCase();
        }
        return ext;
    }
}
class Encryptor
{
    byte[] encryptionKey;
    Encryptor(String password)
    {
        try
        {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(password.getBytes("UTF-8")); // Change this to "UTF-16" if needed
            encryptionKey = md.digest();
        }
        catch(NoSuchAlgorithmException | UnsupportedEncodingException e)
        {
            e.printStackTrace();
        }
            
    }
    public byte[] encrypt(byte[] PlainText)
    {
        try 
        {
            return AES.encrypt(PlainText,encryptionKey);
        } 
        catch (Exception ex) 
        {
            Logger.getLogger(Encryptor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
    public byte[] decrypt(byte[] cipherText)
    {
        try 
        {
            return AES.decrypt(cipherText,encryptionKey);
        } 
        catch (Exception ex) 
        {
            Logger.getLogger(Encryptor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
class FileEncryptor
{
    String Source1,Source2,Dest,Password;
    FileEncryptor(String source1,String source2,String dest,String password)
    {
        Source1=source1;
        Source2=source2;
        Dest=dest;
        Password=password;
    }
    public void encrypt() throws FileNotFoundException, IOException
    {
        
        
        int ch,len,pad=0;
        Encryptor en=new Encryptor(Password);
        //byte txt[]=new byte[16];
        BufferedInputStream in1=new BufferedInputStream(new FileInputStream(Source1));
        File f=new File(Source2);
        long size=f.length();
        System.out.println(size);
        BufferedInputStream in2=new BufferedInputStream(new FileInputStream(Source2));
        FileOutputStream out=new FileOutputStream(Dest);
        
        int bufsize=2048;
        byte buffer[]=new byte[bufsize];
        
        while((ch=in1.read(buffer))!=-1)
            out.write(buffer);
        long block=size/bufsize+1;
        System.out.println(block);
        long count=0;
        
        while((len=in2.read(buffer))!=-1)
        {
            
            if(len<bufsize)
            {
                pad=bufsize-len;
                for(int i=len;i<bufsize;i++)
                {
                    buffer[i]='\0';
                }
            }
            out.write(en.encrypt(buffer));    
            count++;
            int value=(int) (count*100/block);
            //System.out.println(value);
            CryptoFire.jProgressBar1.setValue(value);  
             
        }
        CryptoFire.jProgressBar1.setValue(100);
        //System.out.println("Block="+count+" pad= "+pad);
        DataOutputStream fout=new DataOutputStream(out);
        fout.writeLong(count);
        fout.writeInt(pad);
        fout.close();
        in1.close();
        in2.close();
        out.close();
        JOptionPane.showMessageDialog(null,"Encryption Completed");
        
    }
}
class FileDecryptor
{
    String Source2,Dest,Password;
    FileDecryptor(String source2,String dest,String password)
    {
        //Source1=source1;
        Source2=source2;
        Dest=dest;
        Password=password;
    }
    public void decrypt()
    {
        int ch=0,chprev=0,len;
        Encryptor en=new Encryptor(Password);
        
        
        int bufsize=2048;
        byte buffer[]=new byte[bufsize];
        try
        {
            FileOutputStream out2=new FileOutputStream(Source2);
        
            FileInputStream in=new FileInputStream(Dest);
            File f=new File(Dest);
        
            long size=f.length();
        
        
            DataInputStream fin=new DataInputStream(in);
            fin.skip(size-12);
        
            long block=fin.readLong();
            int pad=fin.readInt();
        //System.out.println("DBlock="+block+" Dpad= "+pad);
            in.getChannel().position(in.getChannel().size()-12-block*bufsize);
        
            long count=0;
            while((len=in.read(buffer))!=-1)
            {
               
                count++;
                if(count<block)
                {
                    out2.write(en.decrypt(buffer));    
                //System.out.println("Count block called");
                }
                else
                {
                    out2.write(en.decrypt(buffer),0,(bufsize-pad));
                //System.out.println("Ending Count block called");
                    break;
                }
                int value=(int) (count*100/block);
                CryptoFire.jProgressBar2.setValue(value);
            
            }
            CryptoFire.jProgressBar2.setValue(100);
            in.close();
            out2.close();
            JOptionPane.showMessageDialog(null,"Decryption Completed");
        
        }
        catch(FileNotFoundException fe)
        {
            JOptionPane.showMessageDialog(null,"FileNotFoundException occured");
        }
        catch(IOException e)
        {
            JOptionPane.showMessageDialog(null,"IOException-File can't be opened");
        }
    }
}