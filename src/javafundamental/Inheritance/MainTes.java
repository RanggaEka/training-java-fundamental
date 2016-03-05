package javafundamental.Inheritance;

import java.util.*;
public class MainTes {
	public static void main(String[] args) {
		
		List<Student> listStudent = new ArrayList<Student>();
		List daftar = new ArrayList();
		for (int i=0; i<5; i++) {
			Student std = new Student();
			std.setName("Irwan " + i);     // ini property dari parent class (person)
			std.setSchollName("SMU " + i); // ini milik si student itu sendiri
			
			// Masukkkan object student ke listStudent
			listStudent.add(std);
			
			// Before jdk 1.5
			daftar.add(std);
		}
		
		System.out.println("Sblm JDK1.5");
		for (int i=0; i<daftar.size(); i++) {
			Student s = (Student) daftar.get(i);
			System.out.println("Nama : " + s.getName() + " School : " + s.getSchollName());
		}
		
		System.out.println("Tampilkan data pelajar");
		for (Student st : listStudent) {
			System.out.println("Nama : " + st.getName() + " School : " + st.getSchollName());
		}
		/*
		Employe emp = new Employe();
		emp.setName("Joko");	// ini dari parent class (person)
		emp.setKode("12345");	// ini milik employe sendiri
		
		System.out.println("Data Pelajar");
		System.out.println("Nama : " + std.getName() + " Nama Sekolah : " + std.getSchollName() + " Tgl Lahir : " + std.getTglLahir());
		
		System.out.println("Data Pegawai");
		System.out.println("Nama : " + emp.getName() + " Kode Pegawai : " + emp.getKode());*/
	}
}
