import java.util.ArrayList;

public class House extends Building implements HouseRequirements{

  //attributes
  private ArrayList<Student> residents; //The <Student> tells Java what kind of data we plan to store IN the ArrayList
  private boolean hasDiningRoom;


  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
    super(name, address, nFloors);
    this.residents = new ArrayList<Student>();
    this.hasDiningRoom = hasDiningRoom;
    System.out.println("You have built a house: 🏠");
  }


  //accessors
  public boolean hasDiningRoom(){
    return this.hasDiningRoom;
  }

  public int nResidents(){
    return this.residents.size();
  }


  //methods
  public void moveIn(Student s){
    this.residents.add(s);
  }

  public Student moveOut(Student s){//return the student who moved out
    this.residents.remove(s);
    return(s);
  }

  public boolean isResident(Student s){
    if (this.residents.contains(s)){
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    House house = new House("Talbot", "25 Prospect Street", 4, false);
    System.out.println(house);
  }

}