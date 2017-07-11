package ������;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Border_Layout02 {

	public static void main(String[] args) {

		Dimension dim = new Dimension(400,250);
		
		JFrame frame = new JFrame("Border Layout");
		frame.setLocation(300, 300);		
		frame.setPreferredSize(dim);
		
		JLabel label1 = new JLabel("��");		//�ؽ�Ʈũ�⿡ ���� �����ϴ� ������ �����ȴ�.
		label1.setHorizontalAlignment(0);
		label1.setVerticalAlignment(SwingConstants.CENTER);
		label1.setOpaque(true);
		label1.setBackground(Color.red);		//��������
		
		JLabel label2 = new JLabel("��");		//���������߾� ���θ� �������� �ʰ� �ʿ��ѿ����� �������־
												//�������� ����� �������� ǥ�õȴ�.
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		label2.setVerticalAlignment(SwingConstants.CENTER);
		label2.setOpaque(true);
		label2.setBackground(Color.blue);
				
		JLabel label3 = new JLabel("��");
		label3.setHorizontalAlignment(SwingConstants.CENTER);
		label3.setVerticalAlignment(SwingConstants.CENTER);
		label3.setOpaque(true);
		label3.setBackground(Color.yellow);
		
		JLabel label4 = new JLabel();
		label4.setText("��");
		label4.setHorizontalAlignment(SwingConstants.CENTER);
		label4.setVerticalAlignment(SwingConstants.CENTER);
		label4.setOpaque(true);
		label4.setBackground(Color.green);
		
		JLabel label5 = new JLabel("0");
		GridLayout GL = new GridLayout(1,2);
		Button button = new Button("Counter");
		Font font = new Font("�ü�ü", Font.BOLD,30);
		
		label5.setLayout(GL);
		frame.add(label5);
		ActionListener AL = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.out.println(String.valueOf(Integer.valueOf(label5.getText())+1));
				
			}			
		};
		
		button.addActionListener(AL);
		
		button.setFont(font);
		button.setForeground(Color.PINK);
		button.setBackground(Color.white);
		
		frame.add(label3,BorderLayout.NORTH);		//��ü�������� add�Ű������� ��ġ��������
		frame.add(label2,BorderLayout.WEST);
		frame.add(label1,BorderLayout.EAST);
		frame.add(label4,BorderLayout.SOUTH);
		frame.add(button,BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);
		
	}

}
