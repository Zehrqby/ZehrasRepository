package h2;

public class H2_main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 7;
        int j = 20;
        int k = 150;
        int min;
        int max;
        
        if (i < j && i < k) {
            min = i;
        } else if (j < i && j < k) {
            min = j;
        } else {
            min = k;
        }
        if (i > j && i > k) {
            max = i;
        } else if (j > i && j > k) {
            max = j;
        } else {
            max = k;
        }

        System.out.println("i = " + i + ", j = " + j + ", k = " + k);
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        
	}
	}
