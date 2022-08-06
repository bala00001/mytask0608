package javapractice.com;

public class StringPractice {
	
	public static String reverseString(String str){  
	    char ch[]=str.toCharArray();  
	    String rev="";  
	    for(int i=ch.length-1;i>=0;i--){  
	        rev+=ch[i];  
	    }  
	    return rev;  
	}  
	
	public static void main(String[] args) {
		
	
//	String s1= "bala";
//	System.out.println(s1);
//	   char charAt = s1.charAt(2);
//	   System.out.println(charAt);
//	   
//	   String s2="GreensTechnology";
//	     char charAt = s2.charAt(9);
//	     System.out.println(charAt);
////	   int length = s2.length();
//	   int lastIndexOf = s2.lastIndexOf('g');
//	   System.out.println(lastIndexOf);
//	   System.out.println(length);
//	   int indexOf = s2.indexOf('o');
//	   System.out.println(indexOf);
//	   
//	   String s3="SeleniumAutomationtool";
//	   int length2 = s3.length();
//	   System.out.println(length2);
//	   
//	   String s4="velmurugan";
//	   int length3 = s4.length();
//	   System.out.println(length3);
//	   
//	   String s5="j a v a p r o g r a m";
//	   int length4 = s5.length();
//	   System.out.println(length4);
//	   
//	   String s6="9095484678";
//	   char charAt2 = s6.charAt(8);
//	   System.out.println(charAt2);
//	   int length5 = s6.length();
//	   System.out.println(length5);
//	   int indexOf2 = s6.indexOf('6');
//	   System.out.println(indexOf2);
//	   
	   
//	   String m1="java";
//	   String m2="Java";
//	   boolean b = m1.equalsIgnoreCase(m2);
//	   System.out.println(b);
//	   
//      String m3="velmurugank451@gmail.com";
//	
//      boolean contains = m3.contains("#");
//      System.out.println(contains);
//	   
//      String m4="92058888800";
//      boolean flag=false;
//      int length = m4.length();
//      
//      
//      if (length==10) {
//          for ( int i=0;i<m4.length();i++) {
//        	  
//    		  char ch = m4.charAt(i);
//    		  
//    		  if( ch=='0' || ch=='1' || ch=='2'|| ch=='3' || ch=='4' || ch=='5'|| ch=='6' || ch=='7' || ch=='8'|| ch=='9' ) {
//    			  flag=true;
//    		  }
//    		  else 
//    		  {
//    			  flag=false;
//    			  break;
//    		  }  
//          }
//          
//          System.out.println(flag);
//	}
//      else {
//          System.out.println(flag);
//
//      }
//      
      
  
      
//		String m5="978724317";
//		int length = m5.length();
//		
//		
//		if (length==10) {
//			
//			System.out.println("correct");
//			
//			
//		}
//		else {
//			
//System.out.println("incorrect");		}
//		}	
//		
	
//  String m5="Welcome to class java";
//  String replace = m5.replace("java", "SQL");
//   System.out.println(replace);		
//		
		
//		String m6="Greens Adayar";
//		String replace2 = m6.replace("Adayar", "OMR");
//		System.out.println(replace2);
//		
//		String m7="Welcome to java class";
//		String replace = m7.replace(" ", "#");
//		System.out.println(replace);
//		
//		
//		String m8="Nishakerala24@gmail.com";
//		boolean contains = m8.contains("gmail");
//		
//		if (contains==true) {
//			String replace3 = m8.replace("gmail", "yahoo");
//			System.out.println(replace3);
//
//		}
//			 else {
//				 System.out.println("gmail is not present");
//		}
	
		
//		String m9="5-35-2a,venkatesh nivas,Aruppukottai,pincode-626101";
//		boolean contains = m9.contains("pincode");
//		if (contains==true) {
//			String replace = m9.replace("pincode-626101", " ");
//			System.out.println(replace);
//			
//		}
		
//		String n1= "Hello welcome to java class";
//		System.out.println(n1.length());
//
//		String[] x = n1.split(" ");
//		System.out.println(x.length);
//		
//		for (String string : x) {
//		    
//			System.out.println(string.toUpperCase());
//			
//		}		
//		System.out.println(n1.toUpperCase());
//			
//		}
//		
//		String n9="hello";
//       	String upperCase = n9.toUpperCase();
////		System.out.println(upperCase);
//		String substring = n9.substring(1,5).toLowerCase();
////		System.out.println(substring);
//		char charAt = upperCase.charAt(0);
//		System.out.println(charAt+substring);
//		
//		
		
//		String n9="hello java program String result String result String result String result String result String result String result String result";
//		String result="";
//		
//		String[] split = n9.split(" ");
//		for (String string : split) {
//			String substring = string.substring(0,1).toUpperCase()+string.substring(1);
//			result=result+substring+" ";
//		}
//		
//		System.out.println(result);
//      
//		String substring = n9.substring(0,1).toUpperCase()+n9.substring(1,4).toLowerCase()+n9.substring(4,6)+n9.substring(6,7).toUpperCase()+n9.substring(7,10);
//		System.out.println(substring);
//		
		
//		String m10="WelcomE";
//		
//		String lowerCase = m10.substring(0,1).toLowerCase()+m10.substring(1,6).toUpperCase()+m10.substring(6).toLowerCase();
//		System.out.println(lowerCase);
//		
//		String m11="one or more method execute or behave with same method name under same class but they are associated";
//		
//		String[] split = m11.split(" ");
//		System.out.println(split.length);
//         for (int i = 0; i < split.length; i++) {
//			System.out.print(split[i].substring(0,1).toUpperCase()+split[i].substring(1)+" ");
//		}
//		
//		String m12="One Suppon* a Time there Lived a ghosT";
//		int upper=0,lower=0,space=0,special=0;
//		char[] charArray = m12.toCharArray();
//		
//         for (char c : charArray) {
//			if (c>='A' && c<='Z') {
//				upper++;
//		    }
//			else if (c>='a' && c<='z') {
//				lower++;
//			}
//			else if (c==' ') {
//				space++;
//			}
//			
//						
//			else {
//				special++;
//			}
//         
//         }	
//         System.out.println(upper);
//         System.out.println(lower);
//         System.out.println(space);
//         System.out.println(special);
//         
//         String m15=" ";
//         boolean startsWith = m15.endsWith("java");
//         System.out.println(startsWith);
//         boolean empty = m15.isEmpty();
//         System.out.println(empty);
//         
         
		String m22="ae";
		int a=0,e=0,i=0,o=0,u=0,A=0,E=0,I=0,O=0,U=0;
		char[] cc = m22.toCharArray();
		
		for (char c : cc) {
			if (c=='a') {
				a++;
			}
				else if (c=='e') {
					e++;
			    }
			
				else if (c=='i') {
					i++;
		        }
				else if (c=='o') {
					o++;
		        }
		
				else if (c=='u') {
					u++;
				}
				else if (c=='A') {
					A++;
				}
	            else if (c=='E') {
			    E++;
	            }
	            else if (c=='I') {
				 I++;
	            } 
				 else if (c=='O') {
					    O++;
				 } 
				 else if (c=='U') {
					U++;
				}
//				 else {
//					continue;
//				}
		}
			    System.out.println("count of 'a' vowels" + a);   
                System.out.println("count of 'e' Vowels" + e);   
                System.out.println("count of 'i' vowels" + i);   
                System.out.println("count of 'o' vowels" + o);   
                System.out.println("count of 'u' vowels" + u);   
                System.out.println("count of 'A' vowels" + A);   
                System.out.println("count of 'E' vowels" + E);   
                System.out.println("count of 'I' vowels" + I);   
                System.out.println("count of 'O' vowels" + O);
                System.out.println("count of 'U' vowels" + U);   

//            String n="abstraction, inhetitance, mthod overloading#$ 123,this is the oops";
//            int a=0,e=0;
//            char[] cs = n.toCharArray();
//            
//            for (int i = 0; i < cs.length; i++) {
//			
//	
//                 if (cs[i]=='a') {
//					a++;
//				}
//                 else if (cs[i]=='e') {
//            		e++;
//					
//			
//                }
//                 else
//                	 continue;
//			}
//		
//             System.out.println("vowels count a"+a);
//      		System.out.println("vowels count e"+e);

//		String n2="I am Balakrishnan";
//		
//		String[] split = n2.split("");
//		
//       for (int i = split.length-1; i >0; i--) {
//		System.out.println(split[i]);
//	}	
		        		
		
		
	}		
     
        	  
}			
	   
			
		
			
        	
			
		
        
		
			
			
	
		

	
         
         
         
         
         
         
         
         
			
			
			
		
	       
	        
			
		


	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

	
	
	
		
		
	

      
	   
	
	


