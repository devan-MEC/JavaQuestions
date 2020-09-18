//implement an algorithm to determine if a string has all unique characters.What
//if you cannot use additional data structures

//NOTE:Assume that the character set is ASCII(if not, we need to increase the storage size)
//rest of the logic would be the same

//new functions to note:- charAt()

class stringunique{
	public static void main(String[] args)
	{String ques= "abcded";
	boolean ans=isUniqueChars(ques);
	System.out.println(ans);

	}

	//time:O(n)
	//space:O(n)
	public static boolean isUniqueChars(String str){
		boolean[] char_set=new boolean[256]; //new boolean array defaultly fills everything with 0
		for(int i=0;i<str.length();i++){
			int val=str.charAt(i);			//returns ascii code for the ith index
			if(char_set[val]) return false; //first time an element is encountered, char_set[val] is false 
											//and if statement doesnt execute. If the same element is encountered the next time
											//that char_set[index] now set to true and false is returned.
			char_set[val]=true;

		}
		return true;
	}
}