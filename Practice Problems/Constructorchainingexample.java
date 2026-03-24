class Constructorchainingexample 
{
int engineno ;
String model ;

public Constructorchainingexample (){
this(1234,"KTM");
System.out.println("default Constructor called");
}
public Constructorchainingexample (int engineno, String model ){
this.engineno = engineno ;
this.model = model;
System.out.println("default Constructor called");
}
void display(){
System.out.println(model + " "+engineno);


}
public static void main(String[] args){
Constructorchainingexample cb = new Constructorchainingexample(1234,"KTM");
cb.display();

}
}



