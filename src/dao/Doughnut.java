package dao;

public class Doughnut {
	int data;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Doughnut() {
		super();
	}

	public Doughnut(int data) {
		super();
		this.data = data;
	}

	@Override
	public String toString() {
		return data + "";
	}
}
