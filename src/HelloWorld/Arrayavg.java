package HelloWorld;
public class Arrayavg {

	   public static void main(String[] args) {
	        int[][] arr2D = {{2, 4, 6, 8}, {1, 3, 6, 9}, {2, 8, 12, 16}, {1, 1, 1, 1}};
	        for(int j =0; j<arr2D.length ;++j) {
	            for(int i=0;i< arr2D[j].length;++i) {

	                System.out.print( " " + arr2D[j][i]);
	            }
	            System.out.println();
	            }
	        
	        System.out.println("Diagonal Values:");
	        for (int i = 0; i < arr2D.length; ++i) {
	            System.out.print(arr2D[i][i] + " ");
	        }
	    }
	}













//	public static void main(String[] args) {
//	        int[] arr = {3, 3, 5, 6, 8, 9, 10};
//
//	        int sum = 0;
//	        for (int i = 0;i<arr.length;i++) {
//	            sum += arr[i];
//	        }
//
//	        double avg = (double) sum / arr.length;
//
//	        System.out.println("Average: " + avg);
//	    }
	

