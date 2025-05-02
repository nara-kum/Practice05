package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {

		Member[] member = new Member[3];
		Member mem01 = new Member("jws","정우성",50000);
		Member mem02 = new Member("yjs","유재석",30000);
		Member mem03 = new Member("lhr","이효리",40000);
		
		member[0] = mem01;
		member[1] = mem02;
		member[2] = mem03;
		
		for(int i=0; i<member.length; i++) {
			member[i].showInfo();
		}
	}

}
