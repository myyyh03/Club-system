/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author user
 */
///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.mycompany.main;

/**
 *
 * @author user
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


class female1  {
    //public static JFrame female1 ;

    female1()
    {
        JFrame female1 = new JFrame(" female 5 - 15");
        female1.setSize(500,500);
        female1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        female1.setLayout(null);

        JLabel l1 = new JLabel("female age from 5 to 15 ");
        female1.add(l1);          l1.setBounds(150,5,300,30);

        JLabel l2 = new JLabel("first name");
        female1.add(l2);        l2.setBounds(10,40,200,20);



//        //JPanel panel = new JPanel();
//        female1.add(panel);
//        panel.setSize(500,500);
//        panel.setBackground(Color.decode("#D4ADFC"));


        JTextField tf1 = new JTextField();
        female1.add(tf1);         tf1.setBounds(170,48,90,20);


        JLabel l3 = new JLabel("last name");
        female1.add(l3);         l3.setBounds(10,85,200,30);
        //panel.add(l3);


        JTextField tf2 = new  JTextField();
        female1.add(tf2);         tf2.setBounds(170,95,90,20);


        JLabel l7 = new JLabel("ID");
        female1.add(l7);        l7.setBounds(10,125,200,30);
        //panel.add(l7);


        JTextField tf3 = new JTextField();
        female1.add(tf3);         tf3.setBounds(170,130,90,20);


        JLabel l4 = new JLabel("your age") ;
        female1.add(l4);           l4.setBounds(10,165,200,30);
        //panel.add(l4);


        JTextField tf4 = new JTextField();
        female1.add(tf4);         tf4.setBounds(170,170,90,20);


        JButton b1 = new JButton("ADD");
        female1.add(b1);          b1.setBounds(50,230,90,50);


        JButton b2 = new JButton("UPDATE");
        female1.add(b2);          b2.setBounds(50,315,90,50);


        JButton b3 = new JButton("DELETE");
        female1.add(b3);          b3.setBounds(50,400,90,50);


        JButton b4 = new JButton("EXIT");
        female1.add(b4);          b4.setBounds(200,400,90,50);


        b1.setBackground(Color.decode("#5C469C"));
        b2.setBackground(Color.decode("#5C469C"));
        b3.setBackground(Color.decode("#5C469C"));
        b4.setBackground(Color.decode("#5C469C"));
        
        female1.getContentPane().setBackground(Color.decode("#F99B7D"));
        female1.setResizable(false);
        b1.setBackground(Color.decode("#B04759"));
        b2.setBackground(Color.decode("#B04759"));
        b1.setForeground(Color.white);
        b2.setForeground(Color.white);
        b3.setBackground(Color.decode("#B04759"));
        b4.setBackground(Color.decode("#B04759"));
        b3.setForeground(Color.white);
        b4.setForeground(Color.white);

        female1.setVisible(true);
        
        
        
        
        ////ADD
        b1.addActionListener(new ActionListener(){
        
                @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == b1){
                    
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/participants", "root", "12345678");
                        Statement stat = con.createStatement();
                        
                        String fname = tf1.getText();
                        String lname = tf2.getText();
                        String id = tf3.getText();
                        String x = tf4.getText();
                        int num = Integer.parseInt(x);
                        
                        String query = "INSERT INTO one (ID,FName,LName,age,type) VALUES('"+id+"','"+fname+"','"+lname+"','"+num+"','F');";
                        stat.executeUpdate(query);
                        
                    } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                    }

                    tf1.setText("");
                    tf2.setText("");
                    tf3.setText("");
                    tf4.setText("");
                }
            }
        });
        
        
        
        
        
        ////UPDATE
        b2.addActionListener(new ActionListener(){
        
                @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == b2){
                    
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/participants", "root", "12345678");
                        Statement stat = con.createStatement();
                        
                        String fname = tf1.getText();
                        String lname = tf2.getText();
                        String id = tf3.getText();
                        String x = tf4.getText();
                        int num = Integer.parseInt(x);
                        
                        String query = "UPDATE one SET FName='"+fname+"',LName='"+lname+"',age='"+num+"' WHERE ID='"+id+"';";
                        stat.executeUpdate(query);
                        
                    } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                    }

                    tf1.setText("");
                    tf2.setText("");
                    tf3.setText("");
                    tf4.setText("");
                }
            }
        
        
        });
        
        
        
        
        ////DELETE
        b3.addActionListener(new ActionListener(){
        
                @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == b3){
                    
                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/participants", "root", "12345678");
                        Statement stat = con.createStatement();
                        
                        String fname = tf1.getText();
                        String lname = tf2.getText();
                        String id = tf3.getText();
                        String x = tf4.getText();
                        int num = Integer.parseInt(x);
                        
                        String query = "DELETE FROM one WHERE ID='"+id+"';";
                        stat.executeUpdate(query);
                        
                    } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                    }

                    tf1.setText("");
                    tf2.setText("");
                    tf3.setText("");
                    tf4.setText("");
                }
            }
        
        
        });
        
        
        ///EXIT
        b4.addActionListener(new ActionListener(){
        
             @Override
            public void actionPerformed(ActionEvent e){
                if(e.getSource() == b4){

                    tf1.setText("");
                    tf2.setText("");
                    tf3.setText("");
                    tf4.setText("");
                    
                    female1.dispose();
                }
            }
        
        
        });

    }

}

