package com.sd.game;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import com.sd.game.*;
import ch.aplu.turtle.*;
public class YutGame extends JFrame implements ActionListener,Playing{
	static JTextField player_1 = new JTextField(11);
	static JTextField player_2 = new JTextField(11);	
	static JTextField p1num = new JTextField(15);
	static JTextField p2num = new JTextField(15);
	TurtleBackGround tp1 = new TurtleBackGround();
	TurtleBackGround tp2 = new TurtleBackGround();
	JLabel label1 = new JLabel("Player1");
	JLabel label2 = new JLabel("Player2");
	JLabel label3 = new JLabel("Player1 Result");
	JLabel label4 = new JLabel("Player2 Result");
	JButton b1 = new JButton("P1 Roll");
	JButton b2 = new JButton("P2 Roll");
	JButton b3 = new JButton("Reset");
	JButton b4 = new JButton("Home");
	GameSet s = new GameSet();
	String p1 = s.getName(s.player1);
	String p2 = s.getName(s.player2);
	int num=0;
	public YutGame(){
		setTitle("Game ver 1.0 - YutGame");
		JPanel panel = new JPanel(new GridLayout(3,2));
		getContentPane().add(panel);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		panel.add(label1);
		panel.add(player_1);
		panel.add(label2);
		panel.add(player_2);
		panel.add(label3);
		panel.add(p1num);
		panel.add(label4);
		panel.add(p2num);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		pack();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,150);
		player_1.setText(p1);
		player_2.setText(p2);
		tp1.setTitle1();
		tp1.setColor1();
		tp2.setTitle2();
		tp2.setColor2();
		tp1.turtleset();
		tp2.turtleset();
	}
	public int roll(){
		int num = (int)(Math.random()*6+1);
		return num;
	}
	public void actionPerformed(ActionEvent e){
		if (e.getSource().equals(b1)) {
			int p1_num=0;
			p1_num = roll();
			if(p1_num==1){
				System.out.println("Back Do!!");
				System.out.println("XOOO");
				p1num.setText("Back Do");
				b1.setText("End Turn");
				b2.setText("P2 Roll");
				tp1.movebk(p1_num);
			}
			else if(p1_num == 2){
				System.out.println("Do!!");
				System.out.println("IOOO");
				p1num.setText("Do");
				b1.setText("End Turn");
				b2.setText("P2 Roll");
				tp1.movefd(p1_num);
			}
			else if(p1_num == 3){
				System.out.println("Gae!!");
				System.out.println("IIOO");
				p1num.setText("Gae");
				b1.setText("End Turn");
				b2.setText("P2 Roll");
				tp1.movefd(p1_num);
			}
			else if(p1_num==4){
				System.out.println("Gul!!");
				System.out.println("IIIO");
				p1num.setText("Gul");
				b1.setText("End Turn");
				b2.setText("P2 Roll");
				tp1.movefd(p1_num);
			}
			else if(p1_num == 5){
				System.out.println("Yut!!");
				System.out.println("OOOO");
				p1num.setText("Yut");
				tp1.movefd(p1_num);
				System.out.println("One more roll!!!");
			}
			else if(p1_num == 6){
				System.out.println("Mo!!");
				System.out.println("IIII");
				p1num.setText("Mo");
				tp1.movefd(p1_num);
				System.out.println("One more roll!!!");
			}
			if(tp1.getPos()>=200.){
				System.out.println("Player one "+p1+" is winner");
				new Alarm();
			}
		}
		else if(e.getSource().equals(b2)){
			int p2_num=0;
			p2_num = roll();
			if(p2_num==1){
				System.out.println("Back Do!!");
				System.out.println("XOOO");
				p2num.setText("Back Do");
				b2.setText("End Turn");
				b1.setText("P1 Roll");
				tp2.movebk(p2_num);
			}
			else if(p2_num == 2){
				System.out.println("Do!!");
				System.out.println("IOOO");
				p2num.setText("Do");
				b2.setText("End Turn");
				b1.setText("P1 Roll");
				tp2.movefd(p2_num);
			}
			else if(p2_num == 3){
				System.out.println("Gae!!");
				System.out.println("IIOO");
				p2num.setText("Gae");
				b2.setText("End Turn");
				b1.setText("P1 Roll");
				tp2.movefd(p2_num);
			}
			else if(p2_num==4){
				System.out.println("Gul!!");
				System.out.println("IIIO");
				p2num.setText("Gul");
				b2.setText("End Turn");
				b1.setText("P1 Roll");
				tp2.movefd(p2_num);
			}
			else if(p2_num == 5){
				System.out.println("Yut!!");
				System.out.println("OOOO");
				p2num.setText("Yut");
				tp2.movefd(p2_num);
				System.out.println("One more roll!!!");
			}
			else if(p2_num == 6){
				System.out.println("Mo!!");
				System.out.println("IIII");
				p2num.setText("Mo");
				tp2.movefd(p2_num);
				System.out.println("One more roll!!!");
			}
			if(tp2.getPos()>=200.){
				System.out.println("Player two "+p2+" is winner");
				new Alarm();
			}
		}
		else if(e.getSource().equals(b3)){
			tp1.turtlereset();
			tp2.turtlereset();
			p1num.setText("");
			p2num.setText("");
		}
		else{
			GameSet s = new GameSet();
		}
	}
}

