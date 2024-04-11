package test_practice;

public class Test_practice {

	public static void main(String[] args) {
		String str="This is java program";
		String str1= str.replace(" ","");
              System.out.println(str1);                //Thisisjavaprogram
              String rev="";
              for(int i=str1.length()-1; i>=0; i--) {
            	  rev=rev+str1.charAt(i);
              } 
              System.out.println(rev);
              String value="";
              int j=0;
              for(int i=0; i<str.length(); i++){
				if(str.charAt(i)== ' ') {
            		  value=value+" ";
            	  }else {
            		  value=value+rev.charAt(j);
            		  j=j+1;
            	  }
            	  
              }System.out.println(value);
	}

}
