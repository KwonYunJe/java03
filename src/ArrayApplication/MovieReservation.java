package ArrayApplication;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MovieReservation {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(600, 700);
		
		//왼쪽에서부터 차례로 (물처럼 흐르듯?)
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		/*JButton b1 = new JButton("Seat 01");
		JButton b2 = new JButton("Seat 02");
		JButton b3 = new JButton("Seat 03");
		*/
		/*f.add(b1);
		f.add(b2);
		f.add(b3);*/
		
		
		
		
		for(int i = 0 ; i < 500; i++) {
			JButton b = new JButton("" + (i+1));
			f.add(b);
			
			b.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {	//클릭 감지 함수
					String s = e.getActionCommand();	//버튼 위 숫자를 get
					JOptionPane.showMessageDialog(f, "No." + s + " Reservation Success");
					b.setEnabled(false);	//기능 정지
					b.setBackground(Color.red);
					
					int[] seat = new int[500];
					int index = Integer.parseInt(s);
					seat[index] = 1;
					
					int count = 0;
					String[] select = new String[500];
					
					for(int j = 0 ; j < seat.length ; j ++) {
						
					}
					
					for(int i = 0 ; i < seat.length ; i++) {
						int j =0;
						if(seat[i] == 1){
							count++;
							select[j] = ("Seat " + i);
							j++;
						}
					}
					
					int a = 10;
					String[] selectCount =new String[count];
					for(int i = 0 ; i < count ; i++) {
						selectCount[i] = select[i];
					}
					JOptionPane.showMessageDialog(f, "You selected " + count + " seat(s) \nTotal : " + (count*15000) + "won");
					JOptionPane.showMessageDialog(f, "현재까지 선택한 좌석" + Arrays.toString(selectCount));
				}
			});
		}
		
		f.setVisible(true);//해당 라인 윗줄에 있는 것들만 보이게 해줌 

		
		
	}

}
