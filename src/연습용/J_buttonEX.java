package ������;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class J_buttonEX {

	public static void main(String[] args) {

			JFrame frame = new JFrame("HELLO");
			Dimension Dmens = new Dimension(250,250);
			frame.setLocation(300,250);
			frame.setPreferredSize(Dmens);
			
			JButton button = new JButton("Test");
			button.setText("This is Enter");
			button.setFont(new Font("����",Font.BOLD,20));	// ���� add������ �ʾƵ� �����
			button.setBackground(Color.PINK);
			button.setForeground(Color.white);
			button.setToolTipText("����â�Դϴ�");
			System.out.println("��ư Font ���� �������� => "+button.getFont());
			System.out.println(button.getText());
		
		/*	Font font = new Font("����",Font.ITALIC,24);
			JLabel label = new JLabel();
			label.setText("to my world");
			label.setFont(font);
			label.setForeground(Color.PINK);
			label.setBackground(Color.lightGray);
			label.setHorizontalAlignment(0);
			label.setVerticalAlignment(0);
			
			frame.add(label);
			*/
			frame.add(button);
			frame.pack();
			frame.setVisible(true);
			
		
	}

}
