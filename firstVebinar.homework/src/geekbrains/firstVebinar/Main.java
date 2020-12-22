package geekbrains.firstVebinar;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Main {
	final static int FR_YRS = 4;
	final static int HNDRD_YRS = 100;
	final static int FR_HNDRDS_OF_YRS = 400;
	static Scanner num = new Scanner (System.in);//объект ввода для пункта 8.3
	final static int numOfYear = num.nextInt();//переменна, принимающая значение от ввода.

	public static void main(String[] args) {

		byte b = 127;
		short st = 10000;
		int it = 1000000;
		long lg = 100000000000L;
		float ft = 1543.13555f;
		double dl = 126675.21353423;
		char cr = 'ф';
		boolean boo = true;
		String str = "Hello world!!!";
		/**
		 * Также, как я понял, любая примитивная переменная может стать ссылочной,
		 * если написать её с большой буквы. Например Byte или Int.
		 */
		float e1 = 5f; //это пошли переменные для первого метода
		float e2 = 10f;
		float e3 = 15f;
		float e4 = 20f;
		System.out.println(b);
		System.out.println(st);
		System.out.println(it);
		System.out.println(lg);
		System.out.println(ft);
		System.out.println(dl);
		System.out.println(cr);
		System.out.println(boo);
		System.out.println(str);
		float f1 = equation (e1,e2,e3,e4); // вызываем метод из пункта 3
		System.out.println(f1);//выводим результат метода под пунктом 3
		comparison (15,30); // вызываем метод из пункта 4
		comparison_2(0); // вызываем метод из пункта 5
		boolean x = comparison_3(-5);//задаем переменную от команды return в методе
		System.out.println(x);//выводим эту переменную
		String name = lineOutput("Илья");//вызываем метод 7 пункта
		System.out.println(name); //выводим переменную, использовавшую метод 7 пункта. А можно как-то выводить резуьтат сразу из тела метода 7, а не из метода main? И имеет ли это смысл вообще?
		String yearNum1 = yearCheck1(7);// переменная и вызов 8.1 пункта,
		System.out.println(yearNum1);     // а также его переменная.
		String yearNum2 = yearCheck2(8);// переменная и вызов 8.2 пункта,
		System.out.println(yearNum2);     // а также его переменная.
		System.out.println("Введите год:");
		String yearNum3 = yearCheck3();
		System.out.println(yearNum3);

	}
	private static float equation (float a, float b, float c, float d) { // метод пункта 3 (долго разбирался, как вывести return на экран, потому что не понимал, куда return 'вовзращает' результат)0
		return (a*(b+(c/d)));

	}

	private static void comparison (int a, int b) { //метод пункта 4 (тут все довольно просто)
		if ((a+b)>=10&&(a+b)<=20){
			System.out.println(true);}
		else{
			System.out.println(false);}
	}

	private static void comparison_2 (int a) { //метод пункта 5 (тоже изи)
		if (a>=0){
			System.out.println("Число положительно");}
		else{
			System.out.println("Число отрицательно");}
	}
	private static boolean comparison_3 (int a) { //метод пункта 6 Вроде просто, но это можно сделать через String и через boolean(как я сделал). Как правильнее?
		if (a>=0){
			return (true);}
		else{
			return (false);}

	}
	private static String lineOutput (String a) { //собственно метод 7 пункта
		return ("Привет, "+a+"!");
	}
	private static String yearCheck1 (int year) { //метод пункта 8.1
		if ((year%FR_HNDRDS_OF_YRS)==0){
			return ("Год високосный, говорит нам метод 8.1");}
		else if (year%HNDRD_YRS==0)
			return ("Год не високосный, говорит нам метод 8.1");
		else if (year%FR_YRS==0)
			return("Год високосный, говорит нам метод 8.1");
		else
			return ("Год не високосный, говорит нам метод 8.1");}


	private static String yearCheck2 (int year) { //метод пункта 8.2
		int fourYears = 4;
		int hundredYears = 100;
		int fourHundredYears = 400;
		if ((year%fourHundredYears)==0){
			return ("Год високосный, говорит нам метод 8.2");}
		else if (year%hundredYears==0)
			return ("Год не високосный, говорит нам метод 8.2");
		else if (year%fourYears==0)
			return("Год високосный, говорит нам метод 8.2");
		else
			return ("Год не високосный, говорит нам метод 8.2");}

	private static String yearCheck3 (){
		if ((numOfYear%FR_HNDRDS_OF_YRS)==0){
			return ("Год високосный, говорит нам метод 8.3");}
		else if (numOfYear%HNDRD_YRS==0)
			return ("Год не високосный, говорит нам метод 8.3");
		else if (numOfYear%FR_YRS==0)
			return("Год високосный, говорит нам метод 8.3");
		else
			return ("Год не високосный, говорит нам метод 8.3");}
			}



