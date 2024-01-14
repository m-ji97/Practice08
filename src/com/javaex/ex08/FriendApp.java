package com.javaex.ex08;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] srr = new String[3];
		Friend[] frr = new Friend[3];
		String[] irr = new String[3];

		System.out.println("친구 3명 등록해주세요");
		for (int i = 0; i < srr.length; i++) {
			srr[i]= sc.nextLine();
			irr = srr[i].split(" ");
			frr[i] = new Friend(irr[0], irr[1], irr[2]);
		}
		for (int i = 0; i < frr.length; i++) {
			frr[i].showinfo();
		}		


		sc.close();
	}

}
