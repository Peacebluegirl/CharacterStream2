package CharacterStream2;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB3 {

    public static void main(String[] args) {
        try {
            PrintWriter output = new PrintWriter("data.txt");
            output.println("Harry Potter");
            output.println(19);
            output.println(60.5);
            output.println(175.00);
            output.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LAB3.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            FileReader file = new FileReader("data.txt");
            BufferedReader input = new BufferedReader(file);
            String s;
            while ((s = input.readLine()) != null) {
                System.out.println(s);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(characterstreams2.LAB1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(characterstreams2.LAB1.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            FileReader file = new FileReader("data.txt");
            Scanner scan = new Scanner(file);
            String s = scan.nextLine();
            System.out.println(s);
            int age = scan.nextInt();
            System.out.println(age);
            double weight = scan.nextDouble();
            System.out.println(weight);
            double height = scan.nextDouble();
            System.out.println(height);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LAB3.class.getName()).log(Level.SEVERE, null, ex);
        }


    }

}