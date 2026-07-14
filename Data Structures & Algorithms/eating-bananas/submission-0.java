class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min = 1;
        int max = piles[0];
        for(int x: piles){
            max = Math.max(max,x);
        }
        while(min<max){
            int rate = (min+max)/2;
            int hours = 0;
            for(int i=0;i<piles.length;i++){
                if(piles[i]%rate==0) hours += piles[i]/rate;
                else hours += piles[i]/rate + 1;
            }
            if(hours>h) min = rate+1;
            else max = rate;
        }
        return min;
        
    }
}
