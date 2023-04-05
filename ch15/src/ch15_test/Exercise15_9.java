package ch15_test;

import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Exercise15_9 extends Frame{
	String fileName;
	TextArea content;
	MenuBar mb;
	Menu mFile;
	MenuItem miNew, miOpen, miSaveAs, miExit;
	
	Exercise15_9(String title) {
		super(title);
		content = new TextArea();
		add(content);
		
		mb = new MenuBar();
		mFile = new Menu("File");
		
		miNew = new MenuItem("New");
		miOpen = new MenuItem("Open");
		miSaveAs = new MenuItem("Save As...");
		miExit = new MenuItem("Exit");
		
		mFile.add(miNew);
		mFile.add(miOpen);
		mFile.add(miSaveAs);
		mFile.addSeparator(); // 메뉴 분리선(separator)을 넣는다.
		mFile.add(miExit);
		
		mb.add(mFile); // MenuBar에 Menu를 추가한다.
		setMenuBar(mb); // Frame에 MenuBar를 포함시킨다.
		
		//메뉴에 이벤트 핸들러를 등록한다.
		MyHandler handler = new MyHandler();
		miNew.addActionListener(handler);
		miOpen.addActionListener(handler);
		miSaveAs.addActionListener(handler);
		miExit.addActionListener(handler);
		
		setSize(300, 200);
		setVisible(true);
	}
	
	// TextArea 선택된 파일의 내용을 읽어서 에 보여주는 메서드
	void fileOpen(String fileName) {
		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			StringWriter output = new StringWriter();
			
			String line = "";
			
			while((line = br.readLine()) != null) {
				output.write(line + "\r \n");
			}
			
			content.append(output.toString());
			
		} catch (Exception e) {
			System.out.println("에러발생 : "+e);
		}
		
	} // fileOpen메서드의 끝
	
	
	// TextArea의 내용을 지정된 파일에 저장하는 메서드
	void saveAs(String fileName) {
		try {
			FileWriter fw = new FileWriter(fileName);
			BufferedWriter bw = new BufferedWriter(fw);

			bw.write(content.getText());			
			
			bw.close();
			fw.close();
		} catch (Exception e) {
			System.out.println("에러발생 : "+e);
		}

	} // saveAs메서드의 끝



	public static void main(String[] args) {
		Exercise15_9 mainWin = new Exercise15_9("Text Editor");
	} // main메서드의 끝
	
	// 메뉴를 클릭했을 때 메뉴별 처리코드
	class MyHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String command = e.getActionCommand();
			
			if(command.equals("New")) {
				content.setText("");
			
			} else if(command.equals("Open")) {
				FileDialog fileOpen = new FileDialog(Exercise15_9.this,
				"파일열기"); 
				fileOpen.setVisible(true);
				fileName = fileOpen.getDirectory() + fileOpen.getFile();
				System.out.println(fileName);
				// 선택된 파일의 내용을 TextArea에 보여준다.
				fileOpen(fileName);
			
			} else if(command.equals("Save As...")) {
				FileDialog fileSave = new FileDialog(Exercise15_9.this,
						"파일저장",FileDialog.SAVE); 
				fileSave.setVisible(true);
				fileName = fileSave.getDirectory() + fileSave.getFile();
				System.out.println(fileName);
				// 현재TextArea의 내용을 선택된 파일에 저장한다.
				saveAs(fileName);
			
			} else if(command.equals("Exit")) {
				System.exit(0); // 프로그램을 종료시킨다.
			}
		}
	} // class MyHandler
}
