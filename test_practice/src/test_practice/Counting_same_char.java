package test_practice;

public class Counting_same_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str ="hollyday";
String temp=str;
for(int i=0; i<=str.length(); i++) {
	int count=1;
	if(temp.charAt(i) !='#') {
		for(int j=i+1; j<=str.length(); j++) {
			if(temp.charAt(i)==temp.charAt(j)) {
				count=count+1;
				
			}
			
		}
		
		temp=temp.replace(str.charAt(i),'#');
	}System.out.println(str.charAt(i)+" "+count);
}
	}

}
