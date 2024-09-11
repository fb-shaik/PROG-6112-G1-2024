
package lu3_librarymgnt_interface_abstract;


public class LU3_LibraryMgnt_Interface_Abstract {

  
    public static void main(String[] args) {
        //instantiate DetailedBook object with sample data
        DetailedBook book = new DetailedBook("Moby Dick", "Herman Melville", 1851, "Adventure", 635);
        
        //display the book info
        book.displayBookInfo();
    }
    
}
