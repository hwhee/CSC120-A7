/* This is a stub for the Library class */

import java.util.Hashtable;

public class Library extends Building implements LibraryRequirements{
  
  //attributes
  private Hashtable<String, Boolean> collection;

  //constructor
  public Library(String name, String address, int nFloors) {
    super(name, address, nFloors);
    this.collection = new Hashtable<String, Boolean>();
    System.out.println("You have built a library: 📖");
  }

  //methods
  public void addTitle(String title){
    this.collection.put(title, true);
  }

  public String removeTitle(String title){
    this.collection.remove(title);
    return title;
  }

  public void checkOut(String title){
    this.collection.replace(title, false);
  }

  public void returnBook(String title){
    this.collection.replace(title,true);
  }

  public boolean containsTitle(String title){ // returns true if the title appears as a key in the Libary's collection, false otherwise
    if (this.collection.containsKey(title)){
      return true;
    } else{
      return false;
    }
  } 
  
  public boolean isAvailable(String title){ // returns true if the title is currently available, false otherwise
    if (this.collection.get(title)){
      return true;
    } else{
      return false;
    }
  } 
  
  public void printCollection(){// prints out the entire collection in an easy-to-read way (including checkout status)
    System.out.println("Collection:");
    this.collection.forEach(
      (k,v)-> System.out.println("Title: " + k + "; Available for checkout: " + v));

  } 
  
  public static void main(String[] args) {
    Library library = new Library("Neilson", "7 Neilson Drive", 4);
    library.addTitle("The Lorax by Dr. Seuss");
    library.printCollection();
    library.addTitle("The Bell Jar by Sylvia Plath");
    library.checkOut("The Lorax by Dr. Seuss");
    library.printCollection();
    library.returnBook("The Lorax by Dr. Seuss");
    library.printCollection();
  }
  
  }