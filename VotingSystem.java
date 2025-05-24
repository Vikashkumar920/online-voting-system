package votingsystem;
import java.awt.*;
import javax.swing.*;
public class VotingSystem extends JFrame{
   VotingSystem(){
       setBounds(0,0,1600,700);
       getContentPane().setBackground(Color.WHITE);
       JLabel l1=new JLabel("Welcome to");
       l1.setFont(new Font("Tahoma",Font.BOLD,50));
       setLayout(null);
       l1.setBounds(150,230,300,100);
       add(l1);
       JLabel l2=new JLabel("Online voting System");
       l2.setFont(new Font("Tahoma",Font.BOLD,50));
       setLayout(null);
       l2.setBounds(50,300,700,100);
       add(l2);
       ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("votingsystem/icons/vote.png"));
       Image i2=i1.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
       ImageIcon i3=new ImageIcon(i2);
       JLabel l3=new JLabel(i3);
      l3.setBounds(700,200,500,300);
      add(l3);
      JButton b1=new JButton("Next");
      b1.setFont(new Font("Tahoma",Font.PLAIN,20));
      b1.setBounds(250,500,300,80);
      add(b1);
       setVisible(true);
       setLayout(null);
   }
    public static void main(String[] args) {
      new VotingSystem();
    }
    
}
