package scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) throws IOException {
        int num = 0;
        BufferedReader br = null;
        try {

            br = new BufferedReader(new InputStreamReader(System.in));
            num = Integer.parseInt(br.readLine());
            System.out.println("You entered: " + num);

        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            br.close();
        }
    }
}
