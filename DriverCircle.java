import SemuaCircle.Circle.CircleKecil; //import specific class
//import SemuaCircle.*; //import all class

public class DriverCircle {

	public static void main(String[] args) {

		//object or reference
		Circle bulat, bulat1, bulat2, bulat3;
		bulat  = new Circle(); //DEFAULT
		System.out.println("Print apa? " + bulat);

		bulat1 = new Circle(76); //instantiate object
		System.out.println("Print apa? " + bulat1);

        bulat2 = new Circle(10, 2); //overloading constructor
        System.out.println("Print apa? " + bulat2);

        bulat3 = new Circle(10, 2); //overloading constructor
        System.out.println("Print apa? " + bulat3);

        //cara panggil static method1
        //System.out.println("UkurLilit = " + UkurLilit(4)); //atau
        System.out.println("UkurLilit = " + UkurLilit(bulat3.getJejari()));

        //cara panggil static method2
        System.out.println("UkurLilit = " + Circle.UkurLilit(bulat3.getJejari())); //kena letak circle sebab ukurlilit bukan dalam kelas circle

        System.out.println("Luas ialah = " + KiraLuas(bulat2));

        System.out.println("Luas ialah = " + KiraLuas(bulat2));

        System.out.println("Paparan menunjukkan  " + Papar());
	}

	//static method that return a reference (object)
	public static Circle Papar() {
		int j = 5;
	    return new Circle(j);//create objek
	} 

	//call by reference static method that accept object as its parameter
	//object sebagai parameter sebab dia luar dari class
	public static double KiraLuas(Circle b) {
		return b.getJejari() * b.getJejari() * Math.PI;
	}

	//static method1(luar main)
	public static double UkurLilit (double jejari) {
		return 2 * Math.PI * jejari;
	}
}

    