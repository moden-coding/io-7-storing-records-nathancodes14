import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        //Scanner is used for collecting keyboard inputs
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<Person>();
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));
        String line = br.readLine();
        while (line != null){
            String[] parts = line.split(",");
            String name = parts[0];
        int age = Integer.valueOf(parts[1]);

        persons.add(new Person(name, age));
        line = br.readLine();

        }
        return persons;
    }
        catch(IOException e){
            return null;
        }
    }
}
