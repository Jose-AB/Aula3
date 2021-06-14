package lab3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class lab3 {

    public static void main(String[] args) throws IOException {

// Create a program who reads the file called oscar_age_female.csv who have this columns
// Index, Year, Age, Name, Movie in format csv read it print it in a new file called result.txt
// in the following format.
//Name: name
//Year: year
//Age: age
//Movie: movie

        int lineNumber = 0;
        File file = new File("H:\\Bootcamp\\aula3\\src\\lab3\\oscar_age_female.csv");
        Scanner scanner = new Scanner(file);
        FileWriter writer = new FileWriter("H:\\Bootcamp\\aula3\\src\\lab3\\result.txt", true);
        scanner.nextLine();

          while (scanner.hasNextLine()) {

              String line = scanner.nextLine();
                String[] values = line.split(",");

                writer.write("Name: " + values[3] + "\n");
                writer.write("Year: " + values[1] + "\n");
                writer.write("Age: " + values[2] + "\n");
                writer.write("Movie: " + values[4] + "\n");
                writer.write("==============\n");

        //        System.out.println(values[1] + " " + values[values.length - 1]);
        }
            writer.close();
            scanner.close();


    }
}
