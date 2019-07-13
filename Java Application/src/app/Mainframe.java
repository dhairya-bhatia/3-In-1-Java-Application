package app;

import java.awt.Color;
import java.awt.Container;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.ProcessBuilder.Redirect;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Mainframe extends JFrame {
 public Mainframe() {
  Container c = null;
  c = getContentPane();
  ImageIcon icn = new ImageIcon("rsz_word-counter.jpg");
  JButton lbl1 = new JButton(icn);
  lbl1.setBounds(550, 250, 300, 200);
  c.add(lbl1);
  ImageIcon icn3 = new ImageIcon("Puzzle Game.jpg");
  JButton lbl3 = new JButton(icn3);
  lbl3.setBackground(Color.BLUE);
  lbl3.setBounds(851, 450, 270, 200);
  c.add(lbl3);
  ImageIcon icn4 = new ImageIcon("Exam System.jpg");
  JButton lbl4 = new JButton(icn4);
  lbl4.setBackground(Color.BLUE);
  lbl4.setBounds(585, 650, 270, 248);
  c.add(lbl4);
  //c.setBackground(Color.RED);
  lbl1.addActionListener(new ActionListener() {

   @Override
   public void actionPerformed(ActionEvent arg0) {
    // TODO Auto-generated method stub
    CharCount chr = new CharCount();
   }
  });

  lbl3.addActionListener(new ActionListener() {

   @Override
   public void actionPerformed(ActionEvent arg0) {
    // TODO Auto-generated method stub
    Puzzle tic = new Puzzle();
   }
  });
  lbl4.addActionListener(new ActionListener() {

   @Override
   public void actionPerformed(ActionEvent arg0) {
    // TODO Auto-generated method stub
    ExamSystem exam = new ExamSystem();

   }
  });

  setLayout(null);
  setVisible(true);
  setTitle("Application Mania");
  setDefaultCloseOperation(2);
  setSize(Toolkit.getDefaultToolkit().getScreenSize());
 }

}