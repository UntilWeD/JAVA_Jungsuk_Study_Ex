package ch07;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.EventHandler;

public class InnerEx7 {

	public static void main(String[] args) {
		Button b = new Button("Start");
		b.addActionListener(new EventHandler());
	}
}

class EventHandler implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		System.out.println("Action Event occurred!!!");
	}
}