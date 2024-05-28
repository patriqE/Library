import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class ReadersManagement {
    private Map<String, Reader> readers = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);
    private Random rand = new Random();

    public void addReader() {
        System.out.println("Enter Full name of Reader: ");
        String fullName = scanner.nextLine();
        System.out.println("Enter your address: ");
        String address = scanner.nextLine();
        System.out.println("Enter your State of Origin: ");
        String stateOfOrigin = scanner.nextLine();
//           Auto generate a new ID
        int id = rand.nextInt(10000);
        String uniqueID = "RDR/" + id;
        System.out.println("This is your Unique ID: " + uniqueID);
//        Save Reader to map
        Reader newReader = new Reader(fullName, address, stateOfOrigin, uniqueID);
        newReader.setFullName(fullName);
        newReader.setAddress(address);
        newReader.setStateOfOrigin(stateOfOrigin);
        newReader.setId(uniqueID);
        readers.put(uniqueID, newReader);
    }

    public void displayReaders() {
        for (Map.Entry<String, Reader> entry : readers.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }

    public void convertReaderToLibrarian(String readerID, LibraryManagement libraryManagement){
        Reader readerToConvert = readers.get(readerID);
        if (readerToConvert != null) {
            Librarian newLibrarian = new Librarian();
            newLibrarian.setFullName(readerToConvert.getFullName());
            newLibrarian.setAddress(readerToConvert.getAddress());
            newLibrarian.setStateOfOrigin(readerToConvert.getStateOfOrigin());
            newLibrarian.setId("LIB/"+rand.nextInt(100));
//            add new converted librarian
            LibraryManagement.addLibrarian(newLibrarian);
//            remove new librarian from readers map
            readers.remove(readerID);
            System.out.println("Reader converted successfully! ");
        } else {
            System.out.println("Reader with ID " + readerID + "not found...");
        }
    }

}
