package com.sd.game;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import com.sd.game.*;
public class DiceGame extends JFrame implements ActionListener,Playing{
	static JTextField player_1 = new JTextField(11);
	static JTextField player_2 = new JTextField(11);	
	static JTextField p1num = new JTextField(15);
	static JTextField p2num = new JTextField(15);
	JLabel label1 = new JLabel("Player1");
	JLabel label2 = new JLabel("Player2");
	JLabel label3 = new JLabel("Player1 Sum");
	JLabel label4 = new JLabel("Player2 Sum");
	JButton b1 = new JButton("P1 Roll");
	JButton b2 = new JButton("P2 Roll");
	JButton b3 = new JButton("Result");
	JButton b4 = new JButton("Home");
	GameSet s = new GameSet();
	String p1 = s.getName(s.player1);
	String p2 = s.getName(s.player2);
	int num=0;
	int p1_num = 0;
	int p1_sum = 0;
	int p2_sum = 0;
	int p2_num = 0;
	public DiceGame(){
		setTitle("Game ver 1.0 - DiceGame");
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

	}
	public int roll(){
		int num = (int)(Math.random()*6+1);
		return num;
	}
	public void actionPerformed(ActionEvent e){
		if (e.getSource().equals(b1)) {
			p1_num = roll();
			p1_sum = p1_sum + p1_num;
			p1_sum = roll();
			p1_sum = p1_sum + p1_num;
			System.out.println("Player 1 get : "+p1_sum);
			p1num.setText(Integer.toString(p1_sum));
			b1.setText("End Turn");
		}
		else if(e.getSource().equals(b2)){
			p2_num = roll();
			p2_sum = p2_sum + p2_num;
			p2_sum = roll();
			p2_sum = p2_sum + p2_num;
			System.out.println("Player 2 get : "+p2_sum);
			p2num.setText(Integer.toString(p2_sum));
			b2.setText("End Turn");
		}
		else if(e.getSource().equals(b3)){
			b1.setText("P1 Roll");
			b2.setText("P2 Roll");
			if(p1_sum > p2_sum){
				System.out.println("Player 1 is winner");
			}
			else if(p1_sum < p2_sum){
				System.out.println("Player 2 is winner");
			}
			else{
				System.out.println("Draw");
			}
		}
		else{
			GameSet s = new GameSet();
		}
	}
}

