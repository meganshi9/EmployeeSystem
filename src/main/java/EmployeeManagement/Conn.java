package EmployeeManagement;

import java.sql.*;
public class Conn {
  Connection c;
  Statement s;
  public Conn(){
    try{
      c = DriverManager.getConnection("jbdc:mysql:///employeemanagementsystem","root","Shi091397@");
      s = c.createStatement();
    }catch(Exception e){
      e.printStackTrace();
    }
  }

}
