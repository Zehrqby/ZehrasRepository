package h3;

public class H3_main {
	public static void main(String[] args) {

		int i = 10;
        int j = 102;
        int k = 150;
        
        boolean ausdruck1 = i > j;
        boolean ausdruck2 = i > 200;
        boolean ausdruck3 = j > 100;

        if (ausdruck1 && !ausdruck2 && !ausdruck3) {
            k = 1;
        } else if (ausdruck1 && ausdruck2 && !ausdruck3) {
            k = 2;
        } else if (ausdruck1 && ausdruck2 && ausdruck3) {
            k = 3;
        } else if (!ausdruck1 && !ausdruck2 && !ausdruck3) {
            k = 4;
        } else {
            k = -10;
        }
        
        System.out.println("i = " + i + ", j = " + j);
        System.out.println("Ergebnisse der Ausdrücke:");
        System.out.println("i > j: " + ausdruck1);
        System.out.println("i > 200: " + ausdruck2);
        System.out.println("j > 100: " + ausdruck3);
        System.out.println("Endwert von k: " + k);
	}

}
