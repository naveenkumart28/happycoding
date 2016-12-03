
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility  classes
import java.util.*;


class ReadFromFile {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int rows = Integer.parseInt(br.readLine());
		int cols = Integer.parseInt(br.readLine());
		int arr[][] = new int[rows][cols];
		boolean[][] isvisited = new boolean[rows][cols];
		boolean lineExists = true;
		int i = 0;
		while(lineExists && i < rows) {
		StringTokenizer st = new StringTokenizer(br.readLine());
		if(st == null) {
			lineExists = false;
			break;
		}
		int j=0;
		while(st.hasMoreTokens() && j < cols){
			arr[i][j] = Integer.parseInt(st.nextToken());
			isvisited[i][j] =false;
			j++;
		}
		i++;
		}
		int maxCount=Integer.MIN_VALUE;
		for(int rc=0;rc<rows;rc++){
			for(int cc=0;cc<cols;cc++) {
				if(!isvisited[rc][cc]) {
					maxCount = Math.max(maxCount,findCellRecursive(arr,isvisited,rc,cc,rows,cols));
				}
			}
		}
        System.out.println("Hello World!");
    }
    
    public static int findCellRecursive(int[][] arr,boolean[][] isvisited,int rc,int cc,int rows,int cols) {
    	if(rc < 0 || cc < 0 || rc >=rows || rc >= cols) return 0;
    	if(isvisited[rc][cc]) return 0;
    	isvisited[rc][cc] = true;
    	if(arr[rc][cc] == 0) return 0;
    	else return 1+findCellRecursive(arr,isvisited,rc-1,cc-1,rows,cols)+findCellRecursive(arr,isvisited,rc-1,cc,rows,cols)+findCellRecursive(arr,isvisited,rc-1,cc+1,rows,cols)+findCellRecursive(arr,isvisited,rc,cc-1,rows,cols)+findCellRecursive(arr,isvisited,rc,cc,rows,cols)+findCellRecursive(arr,isvisited,rc,cc+1,rows,cols)+findCellRecursive(arr,isvisited,rc+1,cc-1,rows,cols)+findCellRecursive(arr,isvisited,rc+1,cc,rows,cols)+findCellRecursive(arr,isvisited,rc+1,cc+1,rows,cols);
    }
    	
}

