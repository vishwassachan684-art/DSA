class Solution {
    public int[] searchRange(int[] nums, int target) {
    int left = binarySearch(nums, target, true);
    
    int right = binarySearch(nums, target, false);
    int[] arr = {left,right};

    return arr;
    
    }

    private int binarySearch(int[] arr, int target, boolean leftmost) {
    int lo = 0;
    int hi = arr.length - 1;
    int idx = -1;
    while (lo <= hi) {
        int mid = (lo + hi) >>> 1;

        if (target > arr[mid]) {
            lo = mid + 1;
        } else if (target < arr[mid]) {
            hi = mid - 1;
        } else {
            idx = mid;
            if (leftmost) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
    }
    return idx;
}
}