
package lu3_librarymgnt_interface_abstract;

/*
    Subclass of the abstract Book class
    Will add more details to the base structure provided in the Parent Class: Book
    This will be the inheritance aspect of the app

Syntax: public childClass extends ParentClass
*/
public class DetailedBook  extends Book {
  //additional attributes that are exclusive to DetailedBook class
    private String genre;
    private int pageCount;

    //Constructor that accepts all parameters
    public DetailedBook(String title, String author, int publicationYear, String genre, int pageCount) 
    {
        super(title, author, publicationYear);//the constructor from the parent class called Book
        this.genre = genre;
        this.pageCount = pageCount; 
    }
   
    //Implement the interface abstract method called displayBookInfo()
    @Override
    public void displayBookInfo() {
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Publication Year: " + getPublicationYear());
        System.out.println("Genre: " + genre);
        System.out.println("Page Count: " + pageCount); 
    }
    
}
