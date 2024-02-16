package common;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner inputScanner =new Scanner(System.in);
		System.out.println("기능 선택");
		int select = inputScanner.nextInt();
		switch (select) {
		case 1:
			재환
			break;
		case 2:
			영모
			break;
		}
	}
}
