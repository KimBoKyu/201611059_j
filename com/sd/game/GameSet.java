package com.sd.game;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import com.sd.game.*;
import ch.aplu.turtle.*;

public class GameSet extends JFrame implements ActionListener{
	static JTextField player1 = new JTextField(11);
	static JTextField player2 = new JTextField(11);
	JLabel label1 = new JLabel("Player1");
	JLabel label2 = new JLabel("Player2");
	JButton b1 = new JButton("Start");
	JButton b2 = new JButton("EXIT");
	JButton b3 = new JButton("Dice Game");
	JButton b4 = new JButton("Yut Game");
	String p1;
	String p2;
	static Scanner sc = new Scanner(System.in);
	public GameSet(){
		setTitle("Game ver 1.0");
		JPanel panel = new JPanel(new GridLayout(4,2));
		getContentPane().add(panel);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		panel.add(label1);
		panel.add(player1);
		panel.add(label2);
		panel.add(player2);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		pack();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(180,130);
	}
	public String getName(JTextField p){
		return p.getText();
	}
	public void actionPerformed(ActionEvent e){
		if (e.getSource().equals(b1)) {
			p1 = getName(player1);
			p2 = getName(player2);
			System.out.println("Hi "+p1);
			System.out.println("Hi "+p2);
			System.out.println("Select Game!");
		}
		else if(e.getSource().equals(b2)){
			p1 = getName(player1);
			p2 = getName(player2);
			System.out.println("You must write epilogue");
			WriteFile w = new WriteFile();
			System.out.println("Write epilogue "+p1);
			w.write(p1);
			System.out.println("Write epilogue "+p2);
			w.write(p2);
			System.exit(0);}
		else if(e.getSource().equals(b3)){
				System.out.println("Dice Game");
				System.out.println("Roll the dice two times. And sum that numbers.Get bigger number is winner");
				new DiceGame();}
		else if(e.getSource().equals(b4)){
			System.out.println("Yut Game");
			System.out.println("Roll the Yut. Do is 1. Gae is 2. Gul is 3. Yut is 4. Mo is 5. Back Do is -1.");
			System.out.println("And Your Turtle is going to your get number.");
			new YutGame();}
		else{
			System.out.println("Reclick Start or EXIT");
			}
		}
	public static void main(String[] args){
		System.out.println("Put in your name");
		System.out.print("Player 1 : ");
		player1.setText(sc.nextLine());
		System.out.print("Player 2 : ");
		player2.setText(sc.nextLine());
		System.out.println("Click Start or EXIT");
		new GameSet();
	}
}
