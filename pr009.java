//Основы наследования
class TwoDShape {
	private double width;
	private double height;

	//Конструктор без параметров
	TwoDShape() {
	

	//Конструктор суп
	TwoDShape(double w, double h) {
		width = w;
		hieght = h;
	void showDim() {
		System.out.println("Ширина и высота: " + width + " и " + height);
		}
	double getWidth() {
		return width;
	}
	double getHeight() {
		return height;
	}
	void  setWidth(double w) {
		if(w>200)
			width = 200;
		else width = w;
	}
	void  setHeight(double h) {
		if(h>290)
                        height = 290;
                else height = h;

}
}
class Triangle extends TwoDShape {
	String style;
	//Конструктор 
	Triangle(String s, double  w, double h) {
	//Вызов конструктора супер класса
		suoer (w, h);
		//Установка значений для перемменой подкласса
		stile  = s;
	
	//Конструктор с одним параметром
	Triangle (double x) (
		super(x);
		stile  = "закрашеенный"
	double area() {
		return getWidth()*getHeight()/2;
	}
	void showStyle() {
		System.out.println("Стиль: " + style);
	}
}

class Rectangle extends TwoDShape {
	String outline;
	//Конструктор 
        Rectangle(String o, double  w, double h) {
		//Вызов конструктора супер класса 
		super(w, h);
                //Установка значений переменной подкласса
                outline  = o;
	}

	double area()  {
		return getWidth()*getHeight();
	}
	boolean isSquare() {
		if (getWidth() == getHeight()) return true;
		return false;
	}
	void showOutline() { 
		System.out.println("Рамка: " + outline);
	}
}

class pr009 {
	public static void main(String[] args) {
		Triangle t1 = new Triangle("закрашенный", 4.0, 4.0);
		Triangle t2 = new Triangle("контурный", 8.0, 12.0);
		Rectangle r1 = new Rectangle("сплошная", 4.0, 4.0);
		Rectangle r2 = new Rectangle("пунктирная", 8.0, 12.0);
		 System.out.println();
		
	/*	t1.setWidth = 4.0;
		t1.setHeight = 4.0;
		t1.style = "закрашенный";

		t2.setWidth = 8.0;
                t2.setHeight = 12.0;
                t2.style = "контурный";

		r1.setWidth = 4.0;
                r1.setHeight = 4.0;
                r1.outline = "сплошная";


                r2.setWidth = 8.0;
                r2.setHeight = 12.0;
                r2.outline = "пунктирная";
	*/

		System.out.println("Информация об обекте t1: ");
		t1.showStyle();
		t1.showDim();
		System.out.println("Площадь: " + t1.area());
		System.out.println();
		System.out.println("Информация об обекте t2: ");
		t2.showStyle();
                t2.showDim();
		System.out.println("Площадь: " + t2.area());
                System.out.println();

		System.out.println("Информация об обекте r1: ");
		r1.showOutline();
		r1.showDim();
		if(r1.isSquare())
			System.out.println("Является квадратом");
		else
			System.out.println("Не является квадратом");
		System.out.println("Площадь: " + r1.area());
		System.out.println();
		System.out.println("Информация об обекте r1: ");

		r2.showOutline();
                r2.showDim();
		if(r2.isSquare())
                        System.out.println("Является квадратом");






	}
}





			
//
