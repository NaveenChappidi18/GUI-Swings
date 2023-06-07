import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class Spin implements ActionListener{
JFrame f;
JLabel l1,l2,l3,l4,l5;
JTextField t1,t2;
JButton b;
public Spin() {
f=new JFrame();
f.setVisible(true);
f.setLayout(null);
f.setSize(500,500);
l1=new JLabel("You won dimond");
l2=new JLabel("Get one more chance");
l3=new JLabel("500 rupees cash");
l4=new JLabel();
l5=new JLabel("Enter your name:");
l1.setBounds(200,200,100,50);
l2.setBounds(300,300,150,50);
l3.setBounds(200,400,100,50);
l4.setBounds(100,300,100,50);
l5.setBounds(600,250,100,50);
l5.setForeground(Color.black);
b=new JButton("Spin");
b.setBounds(50,50,100,50);
t1=new JTextField("You won:");
t1.setBounds(400,50,150,50);
t2=new JTextField();
t2.setBounds(600,300,100,50);
b.addActionListener(this);
f.add(l1);f.add(l2);f.add(l3);f.add(l4);f.add(l5);f.add(b);f.add(t1);f.add(t2);
}
public void actionPerformed(ActionEvent e) {
Random r=new Random();
l4.setText(t2.getText());
int rot=r.nextInt(50);
int lastpos=0;
for(int i=0;i<rot;i++) {
switch(r.nextInt(5)) {
case 0:
case 1:
l1.setForeground(Color.red);
l2.setForeground(null);
l3.setForeground(null);
l4.setForeground(null);
lastpos=1;
break;
case 2:
l2.setForeground(Color.blue);
l1.setForeground(null);
l3.setForeground(null);
l4.setForeground(null);
lastpos=2;
break;
case 3:
l3.setForeground(Color.green);
l1.setForeground(null);
l4.setForeground(null);
l2.setForeground(null);
lastpos=3;
break;
case 4:
case 5:
l4.setForeground(Color.orange);
l2.setForeground(null);
l1.setForeground(null);
l3.setForeground(null);
lastpos=4;
break;
}
}
switch(lastpos) {
case 1:
case 0:
t1.setText(l1.getText());
break;
case 2:
t1.setText(l2.getText());
break;
case 3:
t1.setText(l3.getText());
break;
case 4:
case 5:
t1.setText("JACKPOT....!!!....");
break;
}
}
public static void main(String[] args) {
      new Spin();
}
}