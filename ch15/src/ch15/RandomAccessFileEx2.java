package ch15;

import java.io.*;

public class RandomAccessFileEx2 {
	public static void main(String[] args) {
		int[] score = {1, 100,  90,  90,
				       2,  70,  90, 100,
				       3, 100, 100, 100,
				       4,  70,  60,  80,
				       5,  70,  90, 100,
		};
		
		try {
			RandomAccessFile raf = new RandomAccessFile("score.dat", "rw");
			for(int i=0;i<score.length;i++) {
				raf.writeInt(score[i]);
			}
			
			while(true) {
				System.out.println(raf.readInt());
			}
		} catch (EOFException oaf) {
			// readInt()를 호출했을때 더이상 읽을 내용이 없으면 EOFException이 발생한다.
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
