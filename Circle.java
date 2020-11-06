package SemuaCircle.CircleKecil; //create package
// asal java.sun.com --> package com.sun.java

public class Circle {
	//field of attribute
	private double jejari, x; //non-static field
	public static int bilObjekWujud = 0; //static field


    //lab w4 //default constructor
	public Circle() {
		jejari = 1;
		x = 5;
		bilObjekWujud++;
	}

	//overloading constructor kena ada parameter
	public Circle (double jejari) {
		//instead of letak terus x = 15 takut salah
		//this();//constructor //panggil default constructor
		this.jejari = jejari;
		x = 5;

		//atau boleh panggil constructor 2 parameter
		//this(jejari, 59);// constructor 2 parameter
		bilObjekWujud++;
	}

	//overloading constructor ni takde limit
	public Circle (double jejari, double x) {
		this.jejari = jejari;
		this.x = x;
		bilObjekWujud++;
	}

	//overload method toString()
	public String toString() {
		String tentangCircle;
		tentangCircle = "Bil objek ialah " + bilObjekWujud;
		//tentangCircle = "Jejari = " + jejari + "\nx = " + x + "\nLuas adalah = " + KiraLuas() ;
		return tentangCircle; //banyak variable,tapi satu nilai je retun
	}



	//lect w4 //method
	//static method1
	public double KiraLuas(){
		return getJejari() * getJejari() * Math.PI;
	}

	//static method2
	public static double UkurLilit (double j) {
		return 2 * Math.PI * j;
	}


	//setter hanya ada satu baris saja
	public void setJejari(double jejari) {
		this.jejari = jejari; 
	} 

	//getter hanya ada satu baris saja
	public double getJejari() {
		return jejari;
	}

}