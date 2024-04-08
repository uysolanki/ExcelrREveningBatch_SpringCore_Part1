package com.excelr.entity;

public class Car {
		String carMfgName;
		String carModel;
		double carPrice;
		
		Engine engine;
		Gear gear;
		public Car() {}
		public Car(String carMfgName, String carModel, double carPrice, Engine engine, Gear gear) {
			this.carMfgName = carMfgName;
			this.carModel = carModel;
			this.carPrice = carPrice;
			this.engine = engine;
			this.gear = gear;
		}
		public void setCarMfgName(String carMfgName) {
			this.carMfgName = carMfgName;
		}
		public void setCarModel(String carModel) {
			this.carModel = carModel;
		}
		public void setCarPrice(double carPrice) {
			this.carPrice = carPrice;
		}

		public void setEngine(Engine engine) {
			this.engine = engine;
		}
		public void setGear(Gear gear) {
			this.gear = gear;
		}
		public String getCarMfgName() {
			return carMfgName;
		}
		public String getCarModel() {
			return carModel;
		}
		public double getCarPrice() {
			return carPrice;
		}
		public Engine getEngine() {
			return engine;
		}
		public Gear getGear() {
			return gear;
		}
		@Override
		public String toString() {
			return "Car [carMfgName=" + carMfgName + ", carModel=" + carModel + ", carPrice=" + carPrice + ", engine="
					+ engine + ", gear=" + gear + "]";
		}
		
		
		
		
}
