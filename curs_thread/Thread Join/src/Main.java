class Numere{
	int max;
	int sirNegative[];
	int sirPozitive[];
	public Numere(int m){
		max = m;
		sirNegative = new int[max];
		sirPozitive = new int[max];
	}
	public void negative() {
		int cnt = 0;
		for (int i = -max; i < 0; i++) {
			if (cnt == 5) {
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					System.out.println("Exceptie tratata");
				}
			}
			sirNegative[cnt++] = i;
			System.out.println("Negativ " + i);
		}
	}
	public void pozitive(){
		int cnt = 0;
		for (int i = 0; i <max; i++) {
			sirPozitive[cnt++] = i;
			System.out.println("Pozitiv " + i);
		}
	}
	public void afisare(){
		for (int n:sirNegative)
			System.out.println("Afisare Negativ " + n);
		for (int p:sirPozitive)
			System.out.println("Afisare Pozitiv " + p);
	}
}
public class Main {
	public static void main(String[] args) {
		Numere obj = new Numere(100);

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				obj.negative();
			}
		});
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				obj.pozitive();
			}
		});

		Thread t3 = new Thread(new Runnable() {
			@Override
			public void run() {
				obj.afisare();
			}
		});
		t1.setPriority(1);
		t2.setPriority(1);
		t3.setPriority(10);
		t1.start();
		t2.start();
		try {
			t1.join(); //threadul curent asteapta ca t1 sa finalizeze executia
			t2.join();
		} catch (InterruptedException e) {
			System.out.println("T1/T2 join tratat !");
		}
		t3.start();

		try {
			t3.join();
		} catch (InterruptedException e) {
			System.out.println("T3 join tratat !");
		}
		System.out.println("Done!");
	}
}