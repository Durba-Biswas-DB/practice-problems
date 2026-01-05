public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int singleNumber(final List<Integer> A) {
        int ans =0;

        for(int i=0;i<32;i++){
            int count =0;
            for(int j=0;j<A.size();j++){
                int n = A.get(j);
                if((n&(1<<i))>0){
                    count++;
                }
           }
            if(count%3!=0){

                ans = ans | 1<<i;

            }else{
                ans = ans | 0;
            }

        }
        return ans;

    }
}
