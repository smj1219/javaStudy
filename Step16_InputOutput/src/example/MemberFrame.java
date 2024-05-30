package example;

import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class MemberFrame extends JFrame {

	//필요한 필드 정의하기
	JTextField inputNum, inputName, inputAddr;
	//생성자
	public MemberFrame(String title) {
		super(title);
		setLayout(new BorderLayout());
		//JLable 3개
		JLabel label1=new JLabel("번호");
		JLabel label2=new JLabel("이름");
		JLabel label3=new JLabel("주소");
		//JTextField 3개
		inputNum=new JTextField(10);
		inputName=new JTextField(10);
		inputAddr=new JTextField(10);
		//JButton
		JButton addBtn=new JButton("추가");
		
		//페널에 UI 배치
		JPanel panel=new JPanel();
		panel.add(label1);
		panel.add(inputNum);
		panel.add(label2);
		panel.add(inputName);
		panel.add(label3);
		panel.add(inputAddr);
		panel.add(addBtn);
		
		//페널을 프레임의 위쪽에 배치
		add(panel, BorderLayout.NORTH);
		
		//테이블
		JTable table = new JTable();
		//테이블의 칼럼명을 배열로 미리 준비한다
		String[] colNames = {"번호", "이름", "주소"};
		//테이블에 연결할 모델
		DefaultTableModel model = new DefaultTableModel(colNames, 0);
		//모델을 데이블에 연결
		table.setModel(model);
		//스크롤이 가능하도록 테이블을 JscrollPane 에 감싼다
		JScrollPane scroll=new JScrollPane(table);
		//JscrollPane 을 프레임의 가운데에 배치하기
		add(scroll, BorderLayout.CENTER);
		
		Object[] data1= {1, "김구라","노량진"};
		Object[] data2= {2, "해골","행신동"};
		model.addRow(data1);
		model.addRow(data2);
		
		Vector<Object> data3 = new Vector<>();
		data3.add(3);
		data3.add("원숭이");
		data3.add("동물원");
		model.addRow(data3);
		
		
		addBtn.addActionListener((e)->{
			String[] content= {inputNum.getText(),inputName.getText(),inputAddr.getText()};
			model.addRow(content);
		});
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		MemberFrame f=new MemberFrame("회원정보 관리");
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setBounds(100, 100, 800, 500);
		f.setVisible(true);
	}
}
