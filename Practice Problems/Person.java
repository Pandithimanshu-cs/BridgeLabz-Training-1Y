class Person
{
int x = 10;


public Person (){

System.out.println("Persons Constructor called");
}

void display(){
System.out.println("person method called");

}
}

class Employee extends Person{
int x = 20 ;
Employee(){
super();
System.out.println("perent variable x = :"+ super.x);

super.display();

System.out.println("perent class called");

}
public static void main(String[] args){
Employee e = new Employee();
}
}

