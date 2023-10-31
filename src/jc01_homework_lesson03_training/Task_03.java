package jc01_homework_lesson03_training;

public class Task_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3. Найти площадь треугольника, две стороны которого равны а и b, 
		//а угол между этими сторонами у.

		double a = 5;
		double b = 4.2;
		
		double deg_y = 30;
		
		double rad_y = Math.toRadians(deg_y);
		
		double S = a * b * Math.sin(rad_y);
		
		System.out.println("Площадь треугольника = " + S);
	}

}
