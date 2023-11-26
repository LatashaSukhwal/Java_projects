// import java.util.Scanner;
// class Book
// {   
//       private  String title;
//       private   String author;
//       private int publicationyear;
//      Book(String title,String author,int publicationyear )
//     { 
//       this.title=title;
//        this.author=author;
//        this.publicationyear=publicationyear;

//     }
//     Book(String title,String author)
//     {
//         this.title=title;
//         this.author=author;
//         this.publicationyear=0;
//     }
//     void displayBookInfo()
//     {
//         System.out.println("title:"+title);
//         System.out.println("author:"+author);
//         System.out.println("publicationyear:"+publicationyear);
//     }
//     // void gett()
//     // {
//     //    displayBookInfo();
//     // }
//     // void setter()
//     // { 
//     //     Book(title,author,publication_year);
//     //     Book(title,author);

//     // }
    
// }
//  class Library
// {   
   
//      public static  void main(String[] args)
//     {
        
//          Scanner sc=new Scanner(System.in);
//          String title;
//          String author;
//          int publication_year;
//          //Book b[]=new Book[4];

//         for(int i=1;i<=4;i++)
//         { 
//            System.out.println("Enter title name of book:");
//            title=sc.nextLine();
//            System.out.println("Enter author name of book:");
//            author=sc.nextLine();
//            System.out.println("Enter publication year of book:");
//            publication_year=sc.nextInt();
//            Book b=new Book(title,author,publication_year);
         
//         }

       
//     }
// }




class Book {
    private String title;
    private String author;
    private int publicationYear;

    // Parameterized constructor
    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    // Overloaded constructors
    public Book(String title, String author) {
        this(title, author, 0);
    }

    // Getter and setter methods
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    // Method to display book information
    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication Year: " + publicationYear);
    }
}

class Library {
    private Book[] books;
    private int capacity;
    private int count;

    public Library(int capacity) {
        this.capacity = capacity;
        this.books = new Book[capacity];
        this.count = 0;
    }

    // Method to add book to the library
    public void addBook(Book book) {
        if (count < capacity) {
            books[count] = book;
            count++;
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    // Method to search books by author
    public String searchBookByAuthor(String authorName) {
        StringBuilder result = new StringBuilder();
        for (Book book : books) {
            if (book != null && book.getAuthor().equalsIgnoreCase(authorName)) {
                result.append(book.getTitle()).append(" by ").append(book.getAuthor())
                        .append(" (Published in ").append(book.getPublicationYear()).append(")\n");
            }
        }
        return result.toString();
    }

    public Book[] getBooks() {
        return books;
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating a Library object with capacity 5
        Library library = new Library(5);

        // Adding books to the library
        library.addBook(new Book("Book1", "Author1", 2000));
        library.addBook(new Book("Book2", "Author2", 2005));
        library.addBook(new Book("Book3", "Author1", 2010));

        // Displaying book information
        for (Book book : library.getBooks()) {
            if (book != null) {
                book.displayBookInfo();
                System.out.println();
            }
        }

        // Searching for books by author
        System.out.println("Books by Author1: ");
        System.out.println(library.searchBookByAuthor("Author1"));
    }
}
