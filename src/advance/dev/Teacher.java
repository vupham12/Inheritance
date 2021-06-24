package advance.dev;

public class Teacher extends Person {
	String maGV;
	float hesoluong;
	
	public Teacher(String name, int age, int phone, String maGV, float hesoluong) {
		super(name, age, phone);
		this.maGV = maGV;
		this.hesoluong = hesoluong;
	}
	public float tinhLuong() {
		return hesoluong * 1200000;
	}
	public String toString() {
		return String.format("name: %s -- age: %d -- phone:%s -- MaGV: %s, He so luong: %f\", ten,old,number,maGV,heSoLuong)");
		
	}
	public float diemTB() {
		return 0;
	}

	

	}


