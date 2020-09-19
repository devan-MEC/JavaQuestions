// Write a code to reverse a C-style String
// (i.e C-style:abcd is represented as 5 characters including the null character)

//NOTE: .charAt(index),setCharAt(index,charactertobeset)
public class revstring{
	public static void main(String[] args){
		String ques="wellhellothere";
		String ans=reverse(ques);
		System.out.println(ans);
	}
	//you can simply call the reverse method on a string buffer

	//basically swapping characters from either ends
	 static String reverse(String a){
		StringBuilder s=new StringBuilder(a);
		int length=s.length();
		for(int i=0;i<length/2;i++){
			char current=s.charAt(i); //temp variable
			int otherEnd= length-i-1;
			s.setCharAt(i,s.charAt(otherEnd));
			s.setCharAt(otherEnd,current);
		}
		return s.toString();
	}
}