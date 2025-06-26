import java.util.*;
public class Mainn {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        
        while (true) {
            System.out.println("\n=== Library Menu ===");
            System.out.println("1. Add Book");
            System.out.println("2. Register User");
            System.out.println("3. View Books");
            System.out.println("4. View Users");
            System.out.println("5. Issue Book");
            System.out.println("6. Return Book");
            System.out.println("0. Exit");
            System.out.print("Enter Your choice: ");
            int choice = sc.nextInt();
            
            switch(choice){
                case 1:
                   System.out.print("Enter Book ID: ");
                    int bid = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Author Name: ");
                    String author = sc.nextLine();
                    library.bookAdd(new Book(bid, title, author));
                    break;
                    
                 case 2:
                    System.out.print("Enter User ID: ");
                    int uid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter User Name: ");
                    String name = sc.nextLine();
                    library.addUser(new User(uid, name));
                    break;
                    
                case 3:
                    library.displayBook();
                    break;

                case 4:
                    library.displayUser();
                    break;   
                    
                case 5:
                    System.out.print("Enter Book ID to Issue: ");
                    int BookId = sc.nextInt();
                    System.out.print("Enter User ID: ");
                    int UserId = sc.nextInt();
                    library.issueBook(BookId, UserId);
                    break;  
                    
                case 6:
                    System.out.print("Enter Book ID to Return: ");
                    int bookId = sc.nextInt();
                    library.returnBook(bookId);
                    break;
                    
                case 0:
                    System.out.println("Exiting..");
                    System.exit(0);
                    return;

                default:
                    System.out.println("Invalid choice.");    
            }
        }
    }
}
