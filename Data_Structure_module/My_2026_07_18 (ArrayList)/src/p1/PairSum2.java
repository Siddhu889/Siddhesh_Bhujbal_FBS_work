//Pair sum 2
//find if any pair in a sorted and rotated Arraylist has a target sum
//list =[11,15,6,8,9,10], target = 16

package p1;

import java.util.ArrayList;

public class PairSum2 {

	public static boolean pairsum(ArrayList<Integer> list, int target)
	{
		int bp = -1;
		int n = list.size();
		for(int i=0; i<list.size(); i++)
		{
			if(list.get(i) > list.get(i+1))//breaking point
			{
				bp = i;
				break;
			}
		}
		
		int lp = bp+1;//smallest
		int rp = bp;
		
		while(lp != rp)
		{
			//case1
			if(list.get(lp) + list.get(rp) == target)
			{
				return true;
			}
			
			//case2
			if(list.get(lp) +list.get(rp) < target)
			{
				lp = (lp+1) % n;
			}else
			{
				//case3
				rp = (n+rp-1) % n;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		list.add(11);
		list.add(15);
		list.add(6);
		list.add(8);
		list.add(9);
		list.add(10);
		
		int target = 100;
		
		System.out.println(pairsum(list, target));
	}

}
