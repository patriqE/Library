import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LibraryManagement library = new LibraryManagement();
        ReadersManagement read = new ReadersManagement();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add New Reader");
            System.out.println("2. Add New Librarian");
            System.out.println("3. Display Reader(s)");
            System.out.println("4. Display Librarian(s)");
            System.out.println("5. Convert Reader to Librarian");
            System.out.println("6. Exit");
            System.out.println("Enter your choice:");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    read.addReader();
                    break;
                case 2:
                    library.addLibrarian();
                    break;
                case 3:
                    read.displayReaders();
                    break;
                case 4:
                    library.viewLibrarians();
                    break;
                case 5: {
                    System.out.println("Enter reader ID");
                    String id = scanner.next();
                    read.convertReaderToLibrarian(id, library);
                    break;
                }
                case 6:
                    System.out.println("Goodbye...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice, pls choose from the available  options");
            }
        }
    }
}