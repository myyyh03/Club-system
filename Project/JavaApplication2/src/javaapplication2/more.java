/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author user
 */
//package com.mycompany.main;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;


class more  {
    //public static JFrame more ;

    more()
    {
        JFrame more = new JFrame("more than one");
        more.setSize(500,500);
        more.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        more.setLayout(null);

        JLabel l1 = new JLabel("more than one to app");
        more.add(l1);          l1.setBounds(150,5,300,30);

        JLabel l2 = new JLabel("father's name");
        more.add(l2);        l2.setBounds(10,40,200,20);



//        JPanel panel = new JPanel();
//        more.add(panel);
//        panel.setSize(500,500);
//        panel.setBackground(Color.decode("#E8C4C4"));


        JTextField tf1 = new JTextField();
        more.add(tf1);         tf1.setBounds(170,48,90,20);


        JLabel l3 = new JLabel("father's last name");
        more.add(l3);         l3.setBounds(10,85,200,30);
       // panel.add(l3);


        JTextField tf2 = new  JTextField();
        more.add(tf2);         tf2.setBounds(170,95,90,20);


        JLabel l7 = new JLabel("ID number");
        more.add(l7);        l7.setBounds(10,125,200,30);
       // panel.add(l7);


        JTextField tf3 = new JTextField();
        more.add(tf3);         tf3.setBounds(170,130,90,20);


        JLabel l4 = new JLabel("number of members") ;
        more.add(l4);           l4.setBounds(10,165,200,30);
        //panel.add(l4);


        JTextField tf4 = new JTextField();
        more.add(tf4);         tf4.setBounds(170,170,90,20);


        JButton b1 = new JButton("ADD");
        more.add(b1);          b1.setBounds(50,250,90,50);


        JButton b2 = new JButton("UPDATE");
        more.add(b2);          b2.setBounds(200,250,90,50);


        JButton b3 = new JButton("DELETE");
        more.add(b3);          b3.setBounds(50,350,90,50);


        JButton b4 = new JButton("EXIT");
        more.add(b4);          b4.setBounds(200,350,90,50);


        b1.setBackground(Color.decode("#CE7777"));
        b2.setBackground(Color.decode("#CE7777"));
        b3.setBackground(Color.decode("#CE7777"));
        b4.setBackground(Color.decode("#CE7777"));
        
        more.getContentPane().setBackground(Color.decode("#F99B7D"));
        more.setResizable(false);
        b1.setBackground(Color.decode("#B04759"));
        b2.setBackground(Color.decode("#B04759"));
        b1.setForeground(Color.white);
        b2.setForeground(Color.white);
        b3.setBackground(Color.decode("#B04759"));
        b4.setBackground(Color.decode("#B04759"));
        b3.setForeground(Color.white);
        b4.setForeground(Color.white);
        
        more.setVisible(true);

        //////ADD
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
                        
                        String query = "INSERT INTO more (ID,FName,LName,num_members) VALUES('"+id+"','"+fname+"','"+lname+"','"+num+"');";
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
        
        
        
        ///////UPDATE
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
                        
                        String query = "UPDATE more SET FName='"+fname+"',LName='"+lname+"',num_members='"+num+"' WHERE ID='"+id+"';";
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
        
        
        
        
        ///////DELETE
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
                        
                        String query = "DELETE FROM more WHERE ID='"+id+"';";
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
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == b4){

                    tf1.setText("");
                    tf2.setText("");
                    tf3.setText("");
                    tf4.setText("");
                    
                    more.dispose();
                }
            }
        
        
        });


    }
    
}