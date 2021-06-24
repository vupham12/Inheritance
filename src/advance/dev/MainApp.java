package advance.dev;

import java.util.Scanner;

public class MainApp {
	static void input(Person[] person) {
		Scanner sc = new Scanner(System.in);
		final int number_teacher = 4;
		final int number_student = 6;
		for (int i = 0; i<5; i++) {
			System.out.println("Giao vien thu: "+(i+1));
			System.out.println("Nhập tên: ");
			String ten = sc.next();
			System.out.println("nhập tuổi: ");
			int age = sc.nextInt();
			System.out.println("Nhập số điện thoại: ");
			int phone = sc.nextInt();
			System.out.println("nhập mã GV: ");
			String maGV = sc.next();
			System.out.println("nhập hệ số lương: ");
			float heSoLuong = sc.nextFloat();
			Teacher teacher = new Teacher(ten, age, phone, maGV, heSoLuong);
		}
		for (int i=0; i<7; i++) {
			System.out.println("sinh vien thu : "+(i+1));
			System.out.println("Nhap ten: ");
			String ten = sc.next();
			System.out.println("Nhập tuổi: ");
			int age = sc.nextInt();
			System.out.println("Nhập số điện thoại: ");
			int phone = sc.nextInt();
			System.out.println("Nhập điểm toán: ");
			float diemToan = sc.nextFloat();
			System.out.println("Nhập điểm lý: ");
			float diemLy = sc.nextFloat();
			System.out.println("Nhập điểm hóa");
			float diemHoa = sc.nextFloat();
			System.out.println("Nhập mã sv: ");
			String maSV = sc.next();
			System.out.println("Nhập lớp: ");
			String lop = sc.next();
			Student sc1 = new Student(ten, age,phone, diemToan, diemHoa, diemLy, maSV, lop);
		}
	}
	static void print(Person[] person) {
		for (int i=0; i< person.length; i++) {
			System.out.println(person[1].toString());
		}
	}
	static void findTeacher(Person[] persons) {
		Person preMax = persons[0];
		for (int i = 0; i < 4; i++) {
			if(preMax.tinhLuong() < persons[i].tinhLuong()) {
				preMax = persons[i];
	
			}
			
		}
		System.out.println("So luong cao nhat:" + preMax);
		
	}
	static void findMaxDTB(Person[] persons) {
		Person MaxDTB = persons[0];
		for (int i = 0; i < 6; i++) {
			if(MaxDTB.diemTB() < persons[i].diemTB()) {
				MaxDTB = persons[i];
			}
			
		}
		System.out.println("DTB cao nhat:" + MaxDTB);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Person[] persons = new Person[10];
     input(persons);
     print(persons);
     findTeacher(persons);
     findMaxDTB(persons);
	}
	
}

			

		
	

	

