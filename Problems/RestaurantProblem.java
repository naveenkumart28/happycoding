import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class RestaurantProblem {
	// N = 3
	// ABCDEFABFDEC

	// Output : F
	public static void main(String[] args) {
		int size = 3;
		String s = "ABCDEFABFDEC";
		Set<Character> set = new HashSet<Character>();
		int popElement = 0;
		Queue<Character> queue = new LinkedList<>();
		char[] ch = s.toCharArray();
		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			if (set != null && set.contains(ch[i])) {
				set.remove(ch[i]);
				if (!queue.isEmpty()) {
					set.add(queue.poll());
				}
			} else if (set != null && !set.contains(ch[i])) {
				if (queue.contains(ch[i])) {
					count++;
				} else if (set.size() == size) {
					queue.add(ch[i]);
				} else {
					set.add(ch[i]);
				}
			}

		}
		System.out.println(count);

	}

}
