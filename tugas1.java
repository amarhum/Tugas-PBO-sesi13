package tugas_sesi_13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class tugas1 extends JFrame implements ActionListener {
    

    // bagian deklarasi
    JTextField a = new JTextField(10);
    JTextField b = new JTextField(10);
    JLabel c = new JLabel(" = ");
    JTextField c1 = new JTextField(8);
    JButton b1 = new JButton("                         +                              ");
    JButton b2 = new JButton("                         -                               ");
    JButton b3 = new JButton("                         *                               ");
    JButton b4 = new JButton("                         /                                ");
    JButton b5 = new JButton("                     Modulus                     ");
    
    // akhir deklarasi

    tugas1(){
        //bagian Frame
       super("KALKULATOR");
       setSize(450,300);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setVisible(true);
       setLocationRelativeTo(null);
       getContentPane(). setBackground(Color.white);
        //akhir frame

        //Bagian Countener
       Container cr = getContentPane();
       cr.setLayout(new BorderLayout());
        //akhir Countener

        //bagian atas
       JPanel a1 = new JPanel(); 
        a1.setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
        cr.add(a1, BorderLayout.NORTH);
        a1.add(a);
        a.setPreferredSize(new Dimension(400, 40));
        a1.add(b);
        b.setPreferredSize(new Dimension(400, 40));
        a1.add(c);
        a1.add(c1);
        c1.setPreferredSize(new Dimension(100, 40));
        // akhir atas
 
        // bagian tombol
       JPanel a2 = new JPanel();
       a2.setLayout(new FlowLayout(FlowLayout.LEFT,90,0));
    //    a2.setLayout(new BoxLayout(a2,BoxLayout.Y_AXIS));
        cr.add(a2, BorderLayout.CENTER);
        a2.add(b1);
        a2.add(b2);
        a2.add(b3);
        a2.add(b4);
        a2.add(b5);
        //akhir tombol
       
      
       

        
    }
    // @Override
    // public synchronized void addFocusListener(FocusListener l) {
    //     // TODO Auto-generated method stub
    //     super.addFocusListener(l);
    // }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        double in1 = Double.parseDouble(a.getText());
        double in2 = Double.parseDouble(b.getText());

        DecimalFormat df = new DecimalFormat("0");
    if (e.getSource() == b1) {
      c1.setText(df.format(in1 + in2));
    } else if (e.getSource() == b2) {
      c1.setText(df.format(in1 - in2));
    } else if (e.getSource() == b3) {
      c1.setText(df.format(in1 * in2));
    } else if (e.getSource() == b4) {
      c1.setText(df.format(in1 / in2));
    } else if (e.getSource() == b5) {
      c1.setText(df.format(in1 % in2));
    }
    }
    public static void main(String[] args) {
        new tugas1();
    }
}
