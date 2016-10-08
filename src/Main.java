import structure.RegBST;
import structure.RegHash;
import structure.RegStructure;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by ollesvensson on 08/10/16.
 */
public class Main {

    public static void main(String[] args) throws IOException {

        long start = System.nanoTime();

        String filePath = args[0];
        Boolean duplicates = RegSolver.solve(filePath);
        String result = duplicates ? "Dubbletter." : "Ej dubbletter";
        System.out.println(result);

        long end = System.nanoTime();
        double diff = (end - start) / 1e6;

        System.out.println("Tid i ms: " + diff);
    }


}
