package com.excelr.entity;

public class Engine {
		int engineLiterCapacity;
		String engineMfgName;
		int engineCC;
		String engineType;
		
		public Engine() {}
		public Engine(int engineLiterCapacity, String engineMfgName, int engineCC, String engineType) {
			this.engineLiterCapacity = engineLiterCapacity;
			this.engineMfgName = engineMfgName;
			this.engineCC = engineCC;
			this.engineType = engineType;
		}
		public int getEngineLiterCapacity() {
			return engineLiterCapacity;
		}
		public void setEngineLiterCapacity(int engineLiterCapacity) {
			this.engineLiterCapacity = engineLiterCapacity;
		}
		public String getEngineMfgName() {
			return engineMfgName;
		}
		public void setEngineMfgName(String engineMfgName) {
			this.engineMfgName = engineMfgName;
		}
		public int getEngineCC() {
			return engineCC;
		}
		public void setEngineCC(int engineCC) {
			this.engineCC = engineCC;
		}
		public String getEngineType() {
			return engineType;
		}
		public void setEngineType(String engineType) {
			this.engineType = engineType;
		}
		@Override
		public String toString() {
			return "Engine [engineLiterCapacity=" + engineLiterCapacity + ", engineMfgName=" + engineMfgName
					+ ", engineCC=" + engineCC + ", engineType=" + engineType + "]";
		}
		
		
		
		
}
