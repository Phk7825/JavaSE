package day04.loop;

import java.util.Iterator;

/*
 * continue 문
 * 	반복문 스킵(한번 건너뛰기) 
 * 
 */

public class MainClass06 {
	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			if(i == 3) {
				continue;
			}
			System.out.println("i : " + i);
		}
	}
	

}