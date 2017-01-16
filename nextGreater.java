public class Solution {
	public static ArrayList<Integer> nextGreater(ArrayList<Integer> a) {

	    	Stack<Integer> s = new Stack<Integer>();
		s.push(0);
		ArrayList<Integer> greater = new ArrayList<Integer>();
		for(int i = 0; i < a.size(); ++i) {
			greater.add(-1);
		}

		if (a.size() == 1) {
		    return greater;
		}

		for (int i = 1; i < a.size(); i++) {
		    //System.out.println("i = " + i);
		    if (!s.empty()) {
		        while (true) {
			    //System.out.println("s.peek() = " + s.peek() + ", i = " + i);
		            if (s.empty() || a.get(s.peek()) >= a.get(i)) {
				if(!s.empty()) {
					/*System.out.println("breaking at s.p = " + s.peek() +
						   ", a.get(s.peek()) = " + a.get(s.peek()) +
						   ", i = " + i + ", a.get(i) = " + a.get(i));*/
				}
		                break;
		            }
			    if(a.get(s.peek()) < a.get(i)) {
				    greater.set(s.peek(), a.get(i));
				    //System.out.println("popping " + s.peek());
				    //s.pop();
			    }
			    /*System.out.println("about to pop: stack is " + s);
			    System.out.println("lhs = " + a.get(s.peek()) + 
					       " rhs = " + a.get(i) +
					       " comparison = " + (a.get(s.peek()) > a.get(i)));*/
			    s.pop();
		        }
		    }
		    s.push(i);
		}

		//System.out.println("stack is " + s);
        	return greater;
	}
}

