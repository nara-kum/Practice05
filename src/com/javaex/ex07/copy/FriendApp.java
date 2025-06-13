package com.javaex.ex07.copy;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//정보를 담을 3개짜리 배열
		Friend[] fArray = new Friend[3];
		
		System.out.println("친구를 3명 등록해 주세요");
		
		for(int i=0; i<fArray.length; i++) {
			
			System.out.print("이름: "); String name = sc.nextLine();
			System.out.print("핸드폰: "); String hp = sc.nextLine();
			System.out.print("학교: "); String school = sc.nextLine();
			System.out.println("------------------------------------");
			
			//객체 생성하여 데이터 넣기
			Friend fr = new Friend();
			fr.setName(name);
			fr.setHp(hp);
			fr.setSchool(school);
			
			fArray[i] = fr;
		}
		
		for(int i=0; i<fArray.length; i++) {
			fArray[i].showInfo();
		}
		
		sc.close();

	}

}