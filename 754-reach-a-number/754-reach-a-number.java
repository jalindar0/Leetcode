class Solution {
  public int reachNumber(int target) {
        // numMoves = 1: able to get to all odd numbers in range [-1, 1]
        // numMoves = 2: able to get to all odd numbers in range [-3, 3]
        // numMoves = 3: able to get to all even numbers in range [-6, 6]
        // numMoves = 4: able to get to all even numbers in range [-10, 10]
        // numMoves = 5: able to get to all odd numbers in range [-15, 15]
        // numMoves = 6: able to get to all odd numbers in range [-21, 21]
        // ...
        target = Math.abs(target);
        boolean even_target = target%2==0;
        long lo = 1, hi = (long) 1e9;
        long ans = -1; 
        while (lo<=hi) {
            long mid = (lo+hi)/2;
            if (check(mid, (long) target)) {
                ans = mid; hi = mid-1;
            }
            else if (check(mid-1, (long) target)) {
                ans = mid-1; hi = mid-2;
            }
            else if (check(mid-2, (long) target)) {
                ans = mid-2; hi = mid-3;
            }
            else {
                lo = mid+1;
            }
        }
        return (int) ans;
    }
    public boolean check(long v, long target) {
        if (even(v)) {
            if (target%2==1) return false;
        }
        else {
            if (target%2==0) return false;
        }
        long lower = -(1L+v)*v/2;
        long higher = (1L+v)*v/2;
        if (lower<=target && target<=higher) return true;
        else return false;
    }
    public boolean even(long v) {
        return ((1L+v)*v/2) % 2 == 0;
    }
}