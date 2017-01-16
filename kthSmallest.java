public class Solution {
	// DO NOT MODIFY THE LIST. IT IS READ ONLY
	public int kthsmallest(final List<Integer> a, int k) {
	    PriorityQueue<Integer> q = new PriorityQueue<Integer>(k,  Collections.reverseOrder());
        for(int i: a){
            q.offer(i);
 
            if(q.size()>k){
                q.poll();
            }
        }
    return q.peek();
    }
}
