package h3;

public class H3_main {
	public static void main(String[] args) {

		int i = 200;
        int j = 15;
        int k = -10;
        
        boolean ausdruck1 = i > j;
        boolean ausdruck2 = i > 200;
        boolean ausdruck3 = j > 100;

        if (ausdruck1 && !ausdruck2 && !ausdruck3) {
            k = 1;
        }
        if (ausdruck1 && ausdruck2 && !ausdruck3) {
            k = 2;
        }
        if (ausdruck1 && ausdruck2 && ausdruck3) {
            k = 3;
        }
        if (!ausdruck1 && !ausdruck2 && !ausdruck3) {
            k = 4;
        }
        if (k == -10) {
            k = -10;
        }
        
        System.out.println("i = " + i + ", j = " + j);
        System.out.println("Ergebnisse der Ausdrücke:");
        System.out.println("i > j: " + ausdruck1);
        System.out.println("i > 200: " + ausdruck2);
        System.out.println("j > 100: " + ausdruck3);
        System.out.println("k = " + k);
	}

}
