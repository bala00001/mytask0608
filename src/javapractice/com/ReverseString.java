package javapractice.com;

public class ReverseString {

	public static String ma(String str){  
		
		char ch[]=(str).toCharArray();  
	    
	    String rev="";  
	    for(int i=ch.length-1;i>=0;i--){  
	        rev=rev+ch[i]; 
	    }  
        return rev;  
	}  
	
	
public static void main(String[] args) {
		
		String n2="I am Bala";
		
		String[] split = n2.split(" ");
		
		String reverseString = ma(split[1]);
		System.out.println(split[0]+" "+reverseString+" "+split[2]);
		
	}
}
