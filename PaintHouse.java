package coding_practice;


//hackerrank Question
/*
 * There are a row of n houses, each house can be painted with one of the three colors: 
 * red, blue or green. The cost of painting each house with a certain color is different.
 *  You have to paint all the houses such that no two adjacent houses have the same color.
The cost of painting each house with a certain color is represented by a n x 3 cost matrix.
 For example, costs[0][0] is the cost of painting house 0 with color red; 
 costs[1][2] is the cost of painting house 1 with color green, and so on... 
 Find the minimum cost to paint all houses.
 
 Input: [[17,2,17],[16,16,5],[14,3,19]]
Output: 10
Explanation: Paint house 0 into blue, paint house 1 into green, paint house 2 into blue. 
             Minimum cost: 2 + 5 + 3 = 10.
 */

	public class PaintHouse {
		   
		   public int minCost(int[][] color){
		       if(color==null || color.length==0)
		       return 0;
		       for(int i=1;i<color.length;i++)
		       {
		           color[i][0]+=Math.min( color[i-1][1], color[i-1][2]);
		           color[i][1]+=Math.min( color[i-1][0], color[i-1][2]);
		           color[i][2]+=Math.min( color[i-1][0], color[i-1][1]);
		       }
		       int n=color.length-1;
		       
		       return Math.min( color[n][0], Math.min( color[n][1],color[n][2]));
		   }
		    public static void main(String[] args) {
		    	
		    	PaintHouse sol=new PaintHouse();
		        int[][] arr={{14,2,11},{11,14,5},{14,3,10}};
		        System.out.println(sol.minCost(arr));
		    }
		}


