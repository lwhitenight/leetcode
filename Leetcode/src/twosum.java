import java.util.HashMap;

public class twosum {
/*
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */
	public static int[] twosum (int[] nums , int target) 
	{
		if(nums==null||nums.length<2) 
		{
			return new int[] {-1,-1};
		}//首先输入不能为空，且长度要大于2
		int[] res =new int[]{-1,-1};
		HashMap<Integer, Integer> hash= new HashMap<>();
		for(int i=0;i<nums.length;i++) 
		{
			if(hash.containsKey(target-nums[i])) 
			{
				res[0]=hash.get(target-nums[i]);
				res[1]=i;
				break;
			}//判断两数和是否为target
			hash.put(nums[i], i);//将nums存入hashmap
		}
		return res;
		
	}
	 public static void main(String[] args)
	{
		int[]  a= {2, 7, 11, 15,8};
		int b=10;
		int[] c=twosum(a,b);
		System.out.println(c[0]);
		System.out.println(c[1]);	
	}
}
	

