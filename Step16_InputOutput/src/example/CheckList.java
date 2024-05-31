package example;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class CheckList extends JFrame {

	JTextField inputItem, inputMakeup, inputMedi, inputClo, inputElect;
	
	public CheckList(String title) {
		super(title);
		setLayout(new BorderLayout());
		JLabel label1=new JLabel("필수품");
		JLabel label2=new JLabel("화장품");
		JLabel label3=new JLabel("비상약");
		JLabel label4=new JLabel("의류");
		JLabel label5=new JLabel("전자기기");
		
		
		inputItem=new JTextField(8);
		inputMakeup=new JTextField(8);
		inputMedi=new JTextField(8);
		inputClo=new JTextField(8);
		inputElect=new JTextField(8);
		
		JButton addBtn=new JButton("추가");
		
		JPanel panel=new JPanel();
		panel.add(label1);
		panel.add(inputItem);
		panel.add(label2);
		panel.add(inputMakeup);
		panel.add(label3);
		panel.add(inputMedi);
		panel.add(label4);
		panel.add(inputClo);
		panel.add(label5);
		panel.add(inputElect);
		panel.add(addBtn);
		
		add(panel, BorderLayout.NORTH);
		
		JCheckBox jcb = new JCheckBox();
		
		JTable table=new JTable();
		String[] colNames= {"필수품", "화장품", "비상약","의류","전자기기"};
		DefaultTableModel model=new DefaultTableModel(colNames, 0);
		table.setModel(model);
		JScrollPane scroll=new JScrollPane(table);
		add(scroll, BorderLayout.CENTER);
		
		
		//인풋에 입력된 문자열 불러오기
		addBtn.addActionListener((e)->{
			String[] content= {inputItem.getText(),inputMakeup.getText(),inputMedi.getText(),
					inputClo.getText(),inputElect.getText()};
			
			model.addRow(content);
		});
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		CheckList c=new CheckList("Check List");
		c.setDefaultCloseOperation(EXIT_ON_CLOSE);
		c.setBounds(100, 100, 800, 500);
		c.setVisible(true);
	}
}
