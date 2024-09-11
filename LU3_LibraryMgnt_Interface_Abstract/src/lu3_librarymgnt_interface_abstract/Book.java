
package lu3_librarymgnt_interface_abstract;

/*
    Abstract class called Book
    Will provide a base structure for all books
    Required to implement the interface called IBookDisplay

General Syntax: abstract class ClassName {}

Implement an interface, the syntax:
abstract class ClassName implements interfaceName
*/
abstract class Book  implements IBookDisplay{
    //attributes common to all books
    private String title;
    private String author;
    private int publicationYear;

    //constructor to initialize the common attributes
    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }
//getter methods for each attribute
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    
    
    
}
