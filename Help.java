class Help { 
        public static void main(String args[]) throws java.io.IOException {
        char choice;
        System.out.print("Справка по операторам: ");
        System.out.print(" 1. if);
	System.out.print(" 2. switch);
	System.out.print("Выберете номер раздела: ");
	choice =(char); System.in.read();

	System.out.print("\n);
	switch (choice) {
		case '1':
			 System.out.print("Опратор if:\n);
			 System.out.print("if(условие) оператор;");
			 System.out.print("else оператор;");
			 break;
		 case '2':
                         System.out.print("Опратор switch:\n);
                         System.out.print("switch(выражение) {");
                         System.out.print("case константа: ");
			 System.out.print("Последовательность операторов");
			 System.out.print(" break;");
			 System.out.print(" . . . ");
			 System.out.print("} ");
                         break;
		default:
			 System.out.print("Неверный выбор раздела");
		}
	}	
}
