//Основы наследования
class TwoDShape {
	private double width;
	private double height;
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
		//Установка значений переменной подкласса
		style = s;
		//Установка значений для перемменых суперкласса
		setWidth(w);
		setHeight(h);

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
                //Установка значений переменной подкласса
                outline  = o;
                //Установка значений для перемменых суперкласса
                setWidth(w);
                setHeight;
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

class proo9 {
	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle();
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		t1.setWidth = 4.0;
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
