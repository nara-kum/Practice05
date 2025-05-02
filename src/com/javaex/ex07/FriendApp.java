package com.javaex.ex07;

import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

        Friend[] friendArray = new Friend[3];
        Scanner sc = new Scanner(System.in);
        String name;
        String hp;
        String school;
        
        System.out.println("친구를 3명 등록해 주세요");
        
        //for문 시작
        //친구정보 3명 입력 로직 --> 반복문 사용
        for(int i=0; i<3; i++) {
            System.out.print("이름: ");name = sc.nextLine();
            System.out.print("핸드폰: ");hp = sc.nextLine();
            System.out.print("학교: ");school = sc.nextLine();
            System.out.println("--------------------------");
            Friend friend = new Friend(name,hp,school);
            friendArray[i]= friend;
        }
        
        //for문 끝
        
        // 친구정보 출력
        for (int i = 0; i < friendArray.length; i++) {
            //친구정보 출력 메소드 호출
        	friendArray[i].showInfo();
        }

        sc.close();
    }

}
