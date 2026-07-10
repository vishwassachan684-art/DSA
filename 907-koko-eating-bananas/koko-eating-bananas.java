class Solution {

    public int minEatingSpeed(int[] piles, int h) {
        int maxelement = 0;
        int n = piles.length;
        if( h == 1000000000) return piles.length;
        Arrays.sort(piles);
        maxelement = piles[n-1];
        if(n == h) return maxelement;
        int l=1, r = maxelement;

        while(l<=r){
        int hour = 0;
            
            int mid = (l+r)/2;

            for(int e : piles){
                if(e < mid){
                    hour++;
                }else{
                    if( e % mid == 0) {
                        hour += e/mid;
                    } else{
                        hour += Math.floorDiv(e,mid)+1;
                    }
                }
            }

            if(hour <= h){
                r = mid -1;
            }else {
                l = mid+1;
            }

        }

            return l;




    }
}