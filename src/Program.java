import vn.edu.tdtu.*;

import java.io.File;

public class Program {
    public static void main(String[] args) {
        int[] a = {2,6,3,4};
        int[] b = {6,1,3,2};

        ArrayOutput.print(a);
        ArrayOutput.print(b);

        int[] c = ArrayHandler.merge(a, b);
        ArrayOutput.print(c);

//        ArrayOutput.print(ArrayHandler.sort(c));
        File out = new File("output.txt");




    }
}