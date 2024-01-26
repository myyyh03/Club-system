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


class male3  {
    //public static JFrame male3 ;

    male3()
    {
        JFrame male3 = new JFrame(" male 35 - 60");
        male3.setVisible(true);
        male3.setSize(500,500);
        male3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        male3.setLayout(null);

        JLabel l1 = new JLabel("male age from 35 to 60 ");
        male3.add(l1);          l1.setBounds(150,5,300,30);

        JLabel l2 = new JLabel("first name");
        male3.add(l2);        l2.setBounds(10,40,200,20);



        // JPanel panel = new JPanel();
        // male3.add(panel);
        // panel.setSize(500,500);
        // panel.setBackground(Color.decode("#E8C4C4"));


        JTextField tf1 = new JTextField();
        male3.add(tf1);         tf1.setBounds(170,48,90,20);


        JLabel l3 = new JLabel("last name");
        male3.add(l3);         l3.setBounds(10,85,200,30);
        //panel.add(l3);


        JTextField tf2 = new  JTextField();
        male3.add(tf2);         tf2.setBounds(170,95,90,20);


        JLabel l7 = new JLabel("ID");
        male3.add(l7);        l7.setBounds(10,125,200,30);
        //panel.add(l7);


        JTextField tf3 = new JTextField();
        male3.add(tf3);         tf3.setBounds(170,130,90,20);


        JLabel l4 = new JLabel("your age") ;
        male3.add(l4);           l4.setBounds(10,165,200,30);
            //panel.add(l4);


        JTextField tf4 = new JTextField();
        male3.add(tf4);         tf4.setBounds(170,170,90,20);


        JButton b1 = new JButton("ADD");
        male3.add(b1);          b1.setBounds(50,230,90,50);


        JButton b2 = new JButton("UPDATE");
        male3.add(b2);          b2.setBounds(50,315,90,50);


        JButton b3 = new JButton("DELETE");
        male3.add(b3);          b3.setBounds(50,400,90,50);


        JButton b4 = new JButton("EXIT");
        male3.add(b4);          b4.setBounds(200,400,90,50);


        b1.setBackground(Color.decode("#CE7777"));
        b2.setBackground(Color.decode("#CE7777"));
        b3.setBackground(Color.decode("#CE7777"));
        b4.setBackground(Color.decode("#F2E5E5"));
        
        
        male3.getContentPane().setBackground(Color.decode("#F99B7D"));
        male3.setResizable(false);
        b1.setBackground(Color.decode("#B04759"));
        b2.setBackground(Color.decode("#B04759"));
        b1.setForeground(Color.white);
        b2.setForeground(Color.white);
        b3.setBackground(Color.decode("#B04759"));
        b4.setBackground(Color.decode("#B04759"));
        b3.setForeground(Color.white);
        b4.setForeground(Color.white);

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
                        
                        String query = "INSERT INTO one (ID,FName,LName,age,type) VALUES('"+id+"','"+fname+"','"+lname+"','"+num+"','M');";
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
                    
                    male3.dispose();
                }
            }
        
        
        });


    }

}
