package ArrayApplication;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MakeMovieAlbum {
	static int start = 2;

	public static void main(String[] args) {
		
		//Name
		String[] title = {"Top Gun", "AVATAR", "Hansan", "JJangGu", "Nope"};
		
		//Poster
		String[] img = {"/Library/eclipqse_WorkSpace/java03/TopGun.jpeg", 
				"/Library/eclipqse_WorkSpace/java03/AVATAR.jpeg", 
				"/Library/eclipqse_WorkSpace/java03/Hansan.jpeg", 
				"/Library/eclipqse_WorkSpace/java03/JjangGu.jpeg", 
				"/Library/eclipqse_WorkSpace/java03/Nope.jpeg"};
		
		//Score
		double[] score = {9.60, 8.57, 9.57, 9.44, 7.41};
		
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.WHITE);
		f.setSize(600, 600);
		
		JLabel Top = new JLabel(title[start]);
		Top.setBackground(Color.WHITE);
		Top.setHorizontalAlignment(SwingConstants.CENTER);
		Top.setFont(new Font("Adelle Sans Devanagari", Font.BOLD, 40));
		f.getContentPane().add(Top, BorderLayout.NORTH);
		
		JLabel Bottom = new JLabel(score[start] + "");
		Bottom.setHorizontalAlignment(SwingConstants.CENTER);
		Bottom.setFont(new Font("Lucida Grande", Font.PLAIN, 40));
		Top.setHorizontalAlignment(SwingConstants.CENTER);
		f.getContentPane().add(Bottom, BorderLayout.SOUTH);
		
		JLabel Center = new JLabel("");
		ImageIcon icon = new ImageIcon(img[start]);
		Center.setIcon(icon);
		f.getContentPane().add(Center, BorderLayout.CENTER);
		f.setVisible(true);
		f.getContentPane().add(Center, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton("<<");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				start--;
				if(start < 0) {
					start = title.length - 1;	//가장 작은 인덱스에서 한칸 더 이동 시 배열의 가장 마지막 인덱스로 이동
				}
				Top.setText(title[start]);
				Bottom.setText(score[start]+"점");
				ImageIcon icon = new ImageIcon(img[start]);
				Center.setIcon(icon);
			}
		});
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 40));
		f.getContentPane().add(btnNewButton, BorderLayout.WEST);
		
		JButton btnNewButton_1 = new JButton(">>");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				start++;
				if(start > title.length) {
					start = 0;	//가장 큰 인덱스에서 한 칸 더 이동 시 배열의 처음인덱스로 이동 
				}
				Top.setText(title[start]);
				Bottom.setText(score[start]+"점");
				ImageIcon icon = new ImageIcon(img[start]);
				Center.setIcon(icon);
			}
		});
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.PLAIN, 40));
		f.getContentPane().add(btnNewButton_1, BorderLayout.EAST);
		
		
	}

}
