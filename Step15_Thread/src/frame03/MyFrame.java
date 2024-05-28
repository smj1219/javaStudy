package frame03;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{
	public MyFrame(String title) {
		super(title);
		setLayout(new FlowLayout(FlowLayout.CENTER));
		var startBtn = new JButton("카운드 다운");
		add(startBtn);
		startBtn.addActionListener(this);
	}
	//run 했을 때 실행의 흐름이 시작되는 (main Thread 가 시작되는) main 메소드
	public static void main(String[] args) {
		MyFrame f = new MyFrame("스레드 테스트 프레임");
		f.setBounds(100, 100, 500, 500);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//Thread 객체를 생성하면서 CountRunnable 객체의 참조값을 넘겨주고 start() 메소드를 호출한다.
		//new Thread(new CountRunnable()).start();		
		new Thread(()->{
			//카운트 값을 저장할 지역변수 만들고 초기 값 대입
			int count=10;
			//반복문 돌면서 
			while(true) {
				System.out.println("현재 count:"+count);
				if(count==0) {//만일 카운트가 0 이면 
					break;//반복문 탈출
				}
				//1초 마다
				try {
					Thread.sleep(1000);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				//카운트를 1씩 감소 시키고 
				count--;
			}
		});
	}
}
