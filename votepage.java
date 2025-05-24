
package votingsystem;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class votepage extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4;
    int a,b,c,d;
    votepage(){
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("votingsystem/icons/appa.png"));
        Image i2=i1.getImage().getScaledInstance(300,200,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l1=new JLabel(i3);
        l1.setBounds(50,50,300,200);
        add(l1);
        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("votingsystem/icons/bjp.png"));
        Image i5=i4.getImage().getScaledInstance(300,200,Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel l2=new JLabel(i6);
        l2.setBounds(800,40,300,250);
        add(l2);
        
         ImageIcon i7=new ImageIcon(ClassLoader.getSystemResource("votingsystem/icons/rjd.png"));
        Image i8=i7.getImage().getScaledInstance(300,200,Image.SCALE_DEFAULT);
        ImageIcon i9=new ImageIcon(i8);
        JLabel l3=new JLabel(i9);
        l3.setBounds(800,350,300,200);
        add(l3);
         b1=new JButton("vote");
        b1.addActionListener(this);
        b1.setBounds(100,300,150,50);
        add(b1);
        
          b2=new JButton("vote");
         b2.addActionListener(this);
        b2.setBounds(870,300,150,50);
        add(b2);
        
          b3=new JButton("Results");
         b3.addActionListener(this);
        b3.setBounds(500,260,150,50);
        add(b3);
        
          b4=new JButton("vote");
         b4.addActionListener(this);
        b4.setBounds(850,550,150,50);
        add(b4);
        setBounds(0,0,1600,700);
//        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }
    public static void main(String[] args){
        new votepage();
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            a=a+1;
            JOptionPane.showMessageDialog(null, "You vote is addded to Aam janta party");
        }
         if(e.getSource()==b2){
            b=b+1;
            JOptionPane.showMessageDialog(null, "You vote is addded to BJP");
        }
          if(e.getSource()==b4){
            c=c+1;
            JOptionPane.showMessageDialog(null, "You vote is addded to congress");
        }
           if(e.getSource()==b3){
            JOptionPane.showMessageDialog(null, "Appa="+" "+a+"BJP="+" "+b+"congreess="+c);
        }
    }
}
