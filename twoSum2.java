// You get passed an array of numbers. Find the indices of two numbers that add upto a particlar target twoSum
// assume that there is only one solution
//but as opposed to twoSum1, here the input is a sorted array

class twoSum2{
	public static int[] twoSum(int[] nums,int target){
		int i=0;
		int j=nums.length-1;
		//i and j point to the extreme ends of the sorted array

		while(i<j){
			int a=nums[i]+nums[j];
			if(a>target)
				j--;
			else if(a<target)
				i++;
			else
				break;
		}
		return new int[] {i,j};
	}

	public static void main(String[] args){
		int[] nums= {1,2,3,4,6};
		int target=7;
		int[] ans=twoSum(nums,target);
		for(int i:ans)
			System.out.println(i+" "); //returns 0,4 corresponding to 1 and 6 where 1+6=7
	}
}