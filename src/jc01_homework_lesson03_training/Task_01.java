package jc01_homework_lesson03_training;

public class Task_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Дано действительное число R вида nnn.ddd (три цифровых разряда в
		//дробной и целой частях). Поменять местами 
		//дробную и целую части числа и вывести полученное значение числа.
		double number = 123.456;
		
		int fractional = (int)(number % 1 * 1000);
		// Значение дробной части
		
		int all = (int)((number * 1000 - fractional) / Math.pow(10, 3));
		// Значение целой части
		
		
		System.out.println("Полученное значение числа = " + fractional + "." + all);
	}

}
