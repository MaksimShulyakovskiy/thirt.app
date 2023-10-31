package jc01_homework_lesson03_training;

public class Task_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2. Вычислить корни квадратного уравнения ах2+ bх + с = 0 с 
		// заданными коэффициентами a, b и с (предполагается, что а≠0 и 
		// что дискриминант уравнения неотрицателен).
		
		double a = 3;
		double b = 5;
		double c = -2;
		
		double D = Math.pow(b, 2) - 4 * a * c;
		
		if (D < 0) {
			System.out.println("Дискриминант отрицательный, введите новые значения переменных a, b, c");
		}
		else if (D == 0) {
			double x = (-b)/ (2 * a);
			System.out.println("Значение корня x = " + x);
		}
		else {
			double x_1 = (-b - Math.sqrt(D))/(2 * a);
			double x_2 = (-b + Math.sqrt(D))/(2 * a);
			
			System.out.println("Значение корня x1 = " + x_1);
			System.out.println("Значение корня x2 = " + x_2);
		}
	}

}
