class Avtomobil {
	int pass; //количество пассажиров
	int v; // обьем топливного бака в л.
	double rash; //расход топлива в л. на 100 км

	void rasst() {
		System.out.println("Расстояние на полном баке: " + ((int)(v/rash *100)));
	}

	int rasst2() {
		return(int)(v/rash *100);


	}
	double fuelNeeded(int km) {
		return ((double)km/100)*rash;
	}

}
class Avto {
  	public static void main(String args[]) {
		//Создание экземпляра класса
		Avtomobil Lada = new Avtomobil();
		Avtomobil porsh = new Avtomobil();
		int rasst, rasst2;

		//Присвоение значений внутренних переменых экземпляра класса
		Lada.pass = 4;
		Lada.v = 40;
		Lada.rash = 5.5;

		porsh.pass = 1;
		porsh.v = 100;
		porsh.rash = 14.0;
		
		System.out.println("Для расстояния в 10 км. нужно " + Lada.fuelNeeded(10) + "литров бензина ");
		rasst = 10;
		System.out.println("Для расстояния в 10 км. нужно " + Lada.fuelNeeded(rasst) + "литров бензина ");


		//Расчет расстояния, которое Lada проедет на полном баке
		//rasst = (int)(Lada.v/Lada.rash * 100);
		//rasst2 = (int)(porsh.v/porsh.rash * 100);

		System.out.println("Для Lada: ");
		Lada.rasst();
		rasst = Lada.rasst2();
		 System.out.println("Результат вызова метода rasst2(): " + rasst );


		System.out.println("Для Porse");
		porsh.rasst();
		System.out.println("Результат вызова метода rasst2(): " + porsh.rasst2() );
	}
}
