package test_practice;

public class Captitalize_first_letter {

	public static void main(String[] args) {
		String str="i have a car";
		String[]x=str.split(" ");
		String temp=" ";
		for(int i=0; i<x.length; i++) {
			temp=temp+" "+x[i].replace(x[i].charAt(0),Character.toUpperCase(x[i].charAt(0)));
			
		}System.out.println(temp);

	}

}
