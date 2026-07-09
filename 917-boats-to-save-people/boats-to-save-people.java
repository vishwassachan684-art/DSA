class Solution {
    public int numRescueBoats(int[] people, int limit) {
      int n = people.length;
      if(n==0) return 0;
      Arrays.sort(people);

      int l=0;
      int r = n-1;
      int count=0;

      while(l <= r){
        if(people[l] + people[r] <= limit){
            l++;
            r--;
            count++;
        } else if(l == r) {
            l++;
            count ++;
        }
        else{
            r -=  1;
            count++;
        }
      } 
      return count; 
    }
}