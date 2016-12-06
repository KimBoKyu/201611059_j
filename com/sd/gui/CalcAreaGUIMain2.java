package com.sd.gui;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class CalcAreaGUIMain2 extends JFrame implements ActionListener{
	JTextField radiousTf1;
	JTextField areaTf2;
	JButton b1 = new JButton("계산");
	JButton b2 = new JButton("취소");
	public CalcAreaGUIMain2(){
		//JFrame f = new JFrame();
		JPanel panel = new JPanel(new GridLayout(3,2));
		getContentPane().add(panel);
		JLabel label1 = new JLabel("반지름");
		JLabel label2 = new JLabel("결과값");
		radiousTf1 = new JTextField(15); // 텍스트 필드 크기 지정
		areaTf2 = new JTextField(15); // 텍스트 필드 크기 지정
		b1.addActionListener(this);
		b2.addActionListener(this);
		panel.add(label1);
		panel.add(radiousTf1);
		panel.add(label2);
		panel.add(areaTf2);
		panel.add(b1);
		panel.add(b2);
		pack();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e){
		if (e.getSource().equals(b1)) {
			b1.setText("계산했습니다.");
			b2.setText("취소");
			Double r = Double.parseDouble(radiousTf1.getText());
			areaTf2.setText(Double.toString(r*r*Math.PI));}
		else {
			b2.setText("취소했습니다.");
			b1.setText("계산");
			radiousTf1.setText("");
			areaTf2.setText("");
		}
	}
	public static void main(String[] args){
		CalcAreaGUIMain2 c = new CalcAreaGUIMain2();

	}	
}
