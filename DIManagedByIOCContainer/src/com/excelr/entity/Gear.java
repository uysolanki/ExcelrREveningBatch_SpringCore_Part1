package com.excelr.entity;

import org.springframework.stereotype.Component;

@Component
public class Gear {
	String gearMfgName;
	String gearType;
	
	public Gear() {}
	public Gear(String gearMfgName, String gearType) {
		this.gearMfgName = gearMfgName;
		this.gearType = gearType;
	}
	public String getGearMfgName() {
		return gearMfgName;
	}
	public void setGearMfgName(String gearMfgName) {
		this.gearMfgName = gearMfgName;
	}
	public String getGearType() {
		return gearType;
	}
	public void setGearType(String gearType) {
		this.gearType = gearType;
	}
	@Override
	public String toString() {
		return "Gear [gearMfgName=" + gearMfgName + ", gearType=" + gearType + "]";
	}
	
	
}
