package jc01_homework_lesson03_training;

public class Task_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 5. Составить программу перевода радианной меры угла 
		// в градусы, минуты и секунды.

		int measure = 2;
		
		int grad = (int)(Math.toDegrees(measure));
		
		System.out.println("Количество градусов = " + grad);
		
		int minutes = (int)((Math.toDegrees(measure) - grad) * 60);
		
		System.out.println("Количество минут = " + minutes);
		
		int seconds = (int)((((Math.toDegrees(measure) - grad) * 60) - minutes) * 60);
		
		System.out.println("Количество секунд = " + seconds);
		
	}

}
