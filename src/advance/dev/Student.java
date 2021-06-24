package advance.dev;

public class Student extends Person{
	float diemToan;
    float diemLy;
	float diemHoa;
	String maSV;
	String lop;
	public Student(String name, int age, int phone, float diemToan2, float diemHoa2, float diemLy2, String maSV2, String lop2) {
		super(name, age, phone);
		this.diemToan = diemToan;
		this.diemLy = diemLy;
		this.diemHoa = diemHoa;
		this.maSV = maSV;
		this.lop = lop;
	}
	float diemTrungBinh() {
		return(diemToan + diemLy + diemHoa)/3;
	}
	
	public  String toString() {
		// TODO Auto-generated method stub
		return String.format("Name: %s -- Old: %d -- Phone: %s -- Diem 3 mon: %f, %f, %f -- maSV: %s -- Lop: %s",name,age,phone,diemToan,diemLy,diemHoa);

	}
	public float diemTB() {
		return 0;
	}
	public float tinhLuong() {
		return 0;
	}

}
