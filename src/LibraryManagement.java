import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class LibraryManagement {
        private static Map<String, Librarian> librarianMap = new HashMap<>();
        private Scanner scanner = new Scanner(System.in);
        private Random rand1 = new Random();



    public void addLibrarian(){
            System.out.println("Enter Fullname: ");
            String fullName = scanner.nextLine();
            System.out.println("Enter Address: ");
            String address = scanner.nextLine();
            System.out.println("Enter State of orign: ");
            String stateOfOrign = scanner.nextLine();
//           Auto generate a new ID
            int id = rand1.nextInt(100);
            String libID = "LIB/"+id;
            System.out.println("Your Unique ID: " + libID);
//            Save librarian to hashMap
            Librarian newLibrarian = new Librarian();
            newLibrarian.setFullName(fullName);
            newLibrarian.setAddress(address);
            newLibrarian.setStateOfOrigin(stateOfOrign);
            newLibrarian.setId(libID);
            librarianMap.put(libID, newLibrarian);
        }

    public static void addLibrarian(Librarian lib) {
        librarianMap.put(lib.getId(), lib);
    }

    public void viewLibrarians() {
        for (Map.Entry<String, Librarian> entry : librarianMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
