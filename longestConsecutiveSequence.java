public class Solution {
	public int longestConsecutive(final List<Integer> a) {
	    // if array is empty, return 0
	    if (a.size() == 0) {
		    return 0;
	    }
 
	    Set<Integer> set = new HashSet<Integer>();
	    int max = 1;
 
	    for (int i : a)
		    set.add(i);
 
	    for (int i : a) {
		    int left = i - 1;
		    int right = i + 1;
		    int count = 1;
 
		    while (set.contains(left)) {
			    count++;
			    set.remove(left);
			    left--;
		    }
 
		    while (set.contains(right)) {
			    count++;
			    set.remove(right);
			    right++;
		    }
 
		    max = Math.max(count, max);
	    }
 
	return max;
	}
}
