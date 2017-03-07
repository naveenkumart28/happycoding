package Easy;

import java.util.ArrayList;
import java.util.List;

public class TruckLoaderProblem {
/*There are 5 stops. Number of ways to reach stop 5 from stop 1. 
 * Given the input starting and ending stops of trucks.
for
String[] st ={"1 2", "2 3", "2 4","2 5","3 4","3 5", "4 5"};
Nuber of ways = 4
1 2 3 4 5
1 2 5
1 2 4 5
1 2 3 5
 */
	public static void main(String[] args) {
		String[] st ={"1 2", "2 3", "2 4","2 5","3 4","3 5", "4 5"};
		List<Vehicle> list = new ArrayList<Vehicle>();
		for(int i=0; i< st.length; i++) {
			Vehicle vc = new Vehicle();
			String[] str = st[i].split(" ");
			vc.start = Integer.valueOf(str[0]);
			vc.end = Integer.valueOf(str[1]);
			vc.isvisited = false;
			list.add(vc);
		}
		int total = 0;
		for(int i=0; i <list.size();i++) {
			Vehicle vc = list.get(i);
			int path=0;
			if(vc.start == 1 && !vc.isvisited) {
				vc.isvisited = true;
				path = findTotalPath(list,vc.end);
				vc.isvisited = false;
			}
			total = total+path;
		}
		System.out.println("Number Of Ways to reach is    "+total);

	}
	
	private static int findTotalPath(List<Vehicle> list, int end) {
		if(end == 5) return 1;
		
		int total = 0;
		for(int i=0; i <list.size();i++) {
			Vehicle vc = list.get(i);
			int path=0;
			if(vc.start == end && !vc.isvisited) {
				vc.isvisited = true;
				path = findTotalPath(list,vc.end);
				vc.isvisited = false;
			}
			total = total+path;
		}
		return total;
	}

	private static class Vehicle {
		public int start;
		public int end;
		public boolean isvisited;
	}

}
