package javafundamental.Inheritance;

import java.util.*;
/** Class Person disini berlaku sebagai super class dari Employee maupun Student */
public class Person {
	private String name;
	private Date tglLahir;
	
	final String getName() {
		return name;
	}
	
	public Date getTglLahir() {
		return tglLahir;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setTglLahir(Date tglLahir) {
		this.tglLahir = tglLahir;
	}
}
