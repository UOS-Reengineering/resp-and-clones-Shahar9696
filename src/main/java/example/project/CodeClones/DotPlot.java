package example.project.CodeClones;

public class DotPlot {

    public static void printDotPlot(char[] sequence1, char[] sequence2) {
        for (char c2 : sequence2) {System.out.print("\t"+c2);}
        System.out.println("");
        for (char c1 : sequence1) {
            System.out.print(c1+"\t");
            for (char c2 : sequence2) {
                if (c1 == c2) {System.out.print("+\t");} else {System.out.print(" \t");}
            }
            System.out.println("");
        }
    }
}
