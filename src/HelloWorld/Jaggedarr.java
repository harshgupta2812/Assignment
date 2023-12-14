package HelloWorld;

public class Jaggedarr {
	    public static void main(String[] args) {
	        int[][] jaggedArr = {{ 1, 2, 3 },
	        { 4, 5, 6, 7 },
	        { 8, 9 },
	        { 10, 11, 12, 13, 14 }};

	       
	        for (int i = 0; i < jaggedArr.length; i++) {
	            for (int j = 0; j < jaggedArr[i].length; j++) {
	                System.out.print(jaggedArr[i][j] + " ");
	            }
	            System.out.println("(Length: " + jaggedArr[i].length + ")");
	            
	        }
	    }
	}

