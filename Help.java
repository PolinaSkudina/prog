class Help { 
        public static void main(String args[]) throws java.io.IOException {
        char choice, ignore;
	do {
        	System.out.println("Справка по операторам: ");
        	System.out.println(" 1. if");
		System.out.println(" 2. switch");
		System.out.println(" 3. for");
		System.out.println(" 4. while");
		System.out.println(" 5. do-while");
		System.out.println("Выберете номер раздела: ");
		choice =(char) System.in.read();
		do {
			ignore = (char) System.in.read();
		} while(ignore != '\n');
	} while (choice < '1' | choice > '5');

	System.out.print("\n");
	switch (choice) {
		case '1':
			 System.out.println("Опратор if:\n");
			 System.out.println("if(условие) оператор;");
			 System.out.println("else оператор;");
			 break;
		 case '2':
                         System.out.println("Опратор switch:\n");
                         System.out.println("switch(выражение) {");
                         System.out.println("case константа: ");
			 System.out.println("Последовательность операторов");
			 System.out.println(" break;");
			 System.out.println(" . . . ");
			 System.out.println("} ");
                         break;
		case '3':
			 System.out.println("Цикл for:\n");
                         System.out.println("for(инициализация; условие; интерация)");
                         System.out.println(" оператор;");
			 break;

		case '4':
			 System.out.println("Цикл while:\n");
                         System.out.println("while(условие) оператор:");
			 break;
		case '5':
			 System.out.println("Цикл do-while:\n");
			 System.out.println("do {");
			 System.out.println(" оператор:");
                         System.out.println("while (условие):");
			 break;
				

		default:
			 System.out.print("Неверный выбор раздела");
		}
	}	
}
