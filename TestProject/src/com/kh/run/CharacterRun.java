package com.kh.run;
import com.kh.model.vo.Character;
public class CharacterRun {
	public static void main(String[] args) {
	Character c = new Character();
	Character c1 = new Character("아따맘마", "오동동", 14, 152, '남');
	System.out.println(c1.information());
	
	c1.setName("오아리");
	System.out.println(c1.information());
	
	Character c2 = new Character("아따맘마", "한애숙", 45, 170, '여');
	System.out.println(c2.information());
	
	c2.setName("오영복");
	System.out.println(c2.information());
	
	
	}
}
