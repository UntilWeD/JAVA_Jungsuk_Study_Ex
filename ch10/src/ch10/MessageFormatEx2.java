package ch10;

import java.text.*;


public class MessageFormatEx2 {

	public static void main(String[] args) throws Exception{
		String tableName = "CUST_INFO";
		String msg = "Insert INTO "+ tableName + " VALUES (''{0}'',''{1}'',''{2}'',''{3}'');";
		String[] data = {
				"Insert INTO CUST_INFO VALUES('이자바','02-123-1234',27,'07-09');",
				"Insert INTO CUST_INFO VALUES('김프로','032-333-1234',33,'10-07');",
		};
		
		Object[][] arguments = {
				{"이자바","02-123-1234","27","07-09"},
				{"김프로","032-333-1234","33","10-07"}
		};
		
		for(int i=0;i<arguments.length;i++) {
			String result = MessageFormat.format(msg, arguments[i]);
			System.out.println(result);

		}
	}

}
