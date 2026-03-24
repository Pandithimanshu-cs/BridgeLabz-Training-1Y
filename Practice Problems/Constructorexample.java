class Constructorexample 
{
int id ;
String name ;
int age ;
public Constructorexample(){
System.out.println("default Constructor");
}
public Constructorexample(int id, String name , int age){
this.id = id ;
this.name = name;
this.age = age;
}
void display(){
System.out.println("id" +id);
System.out.println("name" +name);
System.out.println("age" + age);
}
public static void main(String[] args){
Constructorexample cb = new Constructorexample(34,"Himanshu",17);
cb.display();

}
}



