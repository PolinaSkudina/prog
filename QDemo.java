//Оцередь
class Queue {
	char[] q;
	int pultoc, getloc; //указатели элементов очереди

	Queue (int size) {
		q = new char[size];
		pultoc = getloc = 0;
	}

	//Метод для помещения символа в очередь
	void put(char ch) {
		if(pultoc==q.length) {
			System.out.println(" - невозможно вставить символ, так как очередь переполнена. ");
			return;
		}
		q[pultoc++] = ch;
	}

	//Метод для извлечения символа из очереди
	char get() {
		if(getloc == pultoc) {
			System.out.println(" - невозможно вставить символ, так как очередь пуста. ");
			return (char) 0;
		}
		return q[getloc++];
	}
}

class QDemo {
	public static void main(String[] args) {
	Queue bigQ = new Queue(100);
	Queue smallQ = new Queue(4);
	char ch;
	int i;

	System.out.println("Использование очереди bigQ для сохранения символа ");
	for(i = 0; i < 26; i++)
		bigQ.put((char)('A' + i));
	
	//Извлекаем элементы из очереди bigQ
	System.out.print("Содержимое bigQ: ");
	for(i = 0; i < 26; i++) {
		ch = bigQ.get();
		if(ch != (char) 0)
			System.out.print(ch);
	}
	System.out.println("\n");

	//Использование очереди smallQ
	 for(i = 0; i < 5; i++) {
		  System.out.print("Попытка сохранения " + (char) ('Z' - i));
		  smallQ.put((char)('Z' - i));
		  System.out.println();
	}
	System.out.println("\n");
	System.out.print("Содержимое small.Q: ");
	for(i = 0; i < 5; i++) {
		ch = smallQ.get();
		if(ch != (char) 0)  System.out.print(ch);

		}
	}
}
