package EmployeeManagement;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Home extends JFrame implements ActionListener{
  JButton view, add, update, remove;
  Home(){
    setLayout(null);

    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
    Image i2 = i1.getImage().getScaledInstance(1120, 630, Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    JLabel image = new JLabel(i3);
    image.setBounds(0, 0, 1120, 630);
    add(image);

    JLabel heading = new JLabel("Employee Management System");
    heading.setBounds(620, 20, 400, 40);
    heading.setFont(new Font("Raleway", Font.BOLD, 25));
    image.add(heading);

    add = new JButton("Add Employee");
    add.setBounds(650, 80, 150, 40);
    add.addActionListener(this);
    image.add(add);

    view = new JButton("View Employee");
    add.setBounds(820, 80, 150, 40);
    view.addActionListener(this);
    image.add(view);

    remove = new JButton("Remove Employee");
    add.setBounds(650, 140, 150, 40);
    remove.addActionListener(this);
    image.add(remove);

    update = new JButton("Update Employee");
    add.setBounds(820, 140, 150, 40);
    update.addActionListener(this);
    image.add(update);

    setSize(1120, 630);
    setLocation(250, 100);
    setVisible(true);
  }

  public void actionPerformed(ActionEvent ae){
    if(ae.getSource() == add){

    }else if(ae.getSource() == view){

    }else if(ae.getSource() == remove){

    }else{

    }
  }

  public static void main(String[] args){
    new Home();
  }
}
