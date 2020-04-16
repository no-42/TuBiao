package dao;

import daomain.Data;

public class DataImple implements Data {
	private String name;
	private int data;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getData() {
		return data;
	}

	public void setData(int b) {
		this.data = b;
	}

	public DataImple(String name, int data) {
		super();
		this.name = name;
		this.data = data;
	}

	public DataImple() {
		super();
	}

	@Override
	public String toString() {
		return "[" + "'" + name + "'" + "," + data + "]";
	}

}
