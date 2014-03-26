/**
 * 求数组中所有的满足a+b+c=0的三元组
 * @author Administrator
 *
 */
public class ThreeNumZero {
	public static void main(String[] args){
		int [] a={-1,0,1,1,2,2,-2,3};
		ArrayList<ArrayList<Integer>> result1=new ArrayList<ArrayList<Integer>>();
		result1=threeSum(a);
		for(ArrayList inte:result1){
			System.out.print(inte.toString()+" ");
		}
	}
	
	  public static ArrayList<ArrayList<Integer>> threeSum(int[] num) {
	        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	        if(num!=null && num.length>=3){
	            Arrays.sort(num);
	            int len = num.length;
	            int lasta=0;
	        
	            for(int i=0;i<len-2;++i){
	                int a = num[i];
	                if(i>0 && a==lasta){
	                    continue;
	                }
	                lasta = a;
	                int s = i+1;
	                int p = len-1;
	                int lastb = 0, j=0;
	                while(s<p){
	                    int b = num[s];
	                    int c = num[p];
	                    int t = a+b+c;
	                    if(t==0){
	                        ++s;
	                        --p;
	                        if(j>0 && b==lastb){
	                            continue;
	                        }
	                        ++j;
	                        lastb = b;
	                        ArrayList<Integer> tripplet = new ArrayList<Integer>();
	                        tripplet.add(a);
	                        tripplet.add(b);
	                        tripplet.add(c);                        
	                        result.add(tripplet);
	                    }
	                    else if(t>0){
	                        --p;
	                    }
	                    else{
	                        ++s;
	                    }
	                }
	            }
	        }
	        return result;
	    }

}
