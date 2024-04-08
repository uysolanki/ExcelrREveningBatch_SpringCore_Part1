package com.excelr.app;

import com.excelr.entity.Car;
import com.excelr.entity.Engine;
import com.excelr.entity.Gear;

public class DriverApp {
public static void main(String[] args) {
	
	Engine e1=new Engine(12,"Honda",1200,"Petrol");
	
	Gear g1=new Gear();
	g1.setGearMfgName("Honda");
	g1.setGearType("Automatic");
	
	Car c1=new Car();
	c1.setCarMfgName("Honda");
	c1.setCarModel("City");
	c1.setCarPrice(10000);
	c1.setEngine(e1);
	c1.setGear(g1);
	System.out.println(c1);
	
	
	//Car c2=new Car("Honda","City",10000,e1,g1);
	
}
}
