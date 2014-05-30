import java.util.*;
public class reverseString {
 public static void main (String [] args)
 {
	 String PreRever = "abcdefghi";
	 StringBuffer buf = new StringBuffer(PreRever);
	 int i = 0 ;
	 int j = PreRever.length()-1;
	 while ( i < j)
	 {
		 char temp = buf.charAt(i);
		 buf.setCharAt(i, buf.charAt(j));
		 buf.setCharAt(j, temp);
		 i++; j--;
	 }
	// PreRever = buf.toString();
	 System.out.println(PreRever);
	 StringBuffer buf2 = new StringBuffer(PreRever);
	 buf2.reverse();
	 PreRever = buf2.toString();
	 System.out.println(PreRever);
     int a = 22;
     String inte = String.valueOf(a);
	 System.out.println(inte.length());
     
 }
}
