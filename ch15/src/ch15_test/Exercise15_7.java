package ch15_test;

import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class Exercise15_7 extends Frame {
	String nickname = "";
	TextArea ta = new TextArea();
	Panel p = new Panel();
	TextField tf = new TextField(30);
	Button bSave = new Button("저장");
	
	Exercise15_7(String nickname) {
		super("Chatting");
		this.nickname = nickname;
		
		setBounds(200, 100, 300, 200);
		
		p.setLayout(new FlowLayout());
		p.add(tf);
		p.add(bSave);
		
		add(ta, "Center");
		add(p, "South");
		
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		bSave.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae) {
				FileDialog fileSave = new FileDialog(Exercise15_7.this,
											"파일저장", FileDialog.SAVE); 
				fileSave.setVisible(true);
				String fileName = fileSave.getDirectory()
								+ fileSave.getFile();
				saveAs(fileName);
			}
		});
		
		EventHandler handler = new EventHandler();
		ta.addFocusListener(handler);
		tf.addFocusListener(handler);
		tf.addActionListener(handler);
		
		ta.setText("#" + nickname + "님 즐거운 채팅되세요."); 
		ta.setEditable(false);
		
		setResizable(false);
		setVisible(true);
		tf.requestFocus();
	}
	
	void saveAs(String fileName) {
		File charRecord = new File(fileName);
		
		try {
			if(!(charRecord.exists())) 
				charRecord.createNewFile();
			
			FileOutputStream fis = new FileOutputStream(charRecord);
			
			
		} catch (Exception e) { System.out.println("에러발생 : " + e); }
		 
	} // saveAs메서드의 끝
	
	
	public static void main(String[] args) {
//		if(args.length != 1) {
//			System.out.println("USAGE : java ChatWin NICKNAME");
//			System.exit(0);
//		}
			
			
		new Exercise15_7("Apple");
	} // main
		
	class EventHandler extends FocusAdapter implements ActionListener {
		public void actionPerformed(ActionEvent ae) {
			String msg = tf.getText();
			if("".equals(msg)) return;
			
			ta.append("\r\n" + nickname +">"+ msg);
			tf.setText("");
		}
		
		public void focusGained(FocusEvent e) {
			tf.requestFocus();
		}
	} // class EventHandler
	
} // class
	
	

