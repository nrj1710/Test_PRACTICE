package test_practice;

public class Reverse_of_each_word_ {

	public static void main(String[] args) {
		String str="hello how are you";
		String[]x=str.split(" ");
		for(int i=0; i<x.length; i++) {
			for(int j=x[i].length()-1; j>=0; j--) {
				System.out.print(x[i].charAt(j));
			}System.out.print(" ");
		}

	}

}
