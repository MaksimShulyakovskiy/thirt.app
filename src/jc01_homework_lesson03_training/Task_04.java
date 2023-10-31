package jc01_homework_lesson03_training;

public class Task_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 4. Дано значение a. Не используя никаких функций и никаких операций, 
		// кроме умножения, получить значение а^8 за	три операции и а^10 
		// за четыре операции.
		
		int a = 2;
		int aa = a * a;
		int aaa = aa * aa;
		int aaaa = aaa * aaa;
		
		System.out.println(aaaa);
		
		int aaaaa = aaaa * aa;
		
		System.out.println(aaaaa);
	}

}
