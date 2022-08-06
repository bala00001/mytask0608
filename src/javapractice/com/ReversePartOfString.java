package javapractice.com;

public class ReversePartOfString {
	public static StringBuffer reverseString(String[] str, int index){ 
		
		StringBuffer resultString = new StringBuffer();
		
	    char ch[]=str[index].toCharArray();  
	    String rev="";  
	    for(int i=ch.length-1;i>=0;i--){  
	        rev+=ch[i];  
	    }  
	    
	    
	    for (int i=0;i<str.length;i++) {
	    	if(i==index) {
	    		resultString.append(rev+ " ");
	    	}
	    	else {
	    	resultString.append(str[i]+" ");
	    	}
		}

	    return resultString;  
	}  
	
	public static void main(String[] args) {
		
		String n2="This is java";
		
		String[] split = n2.split(" ");
		
		System.out.println(reverseString(split,2));
		
	}
}
