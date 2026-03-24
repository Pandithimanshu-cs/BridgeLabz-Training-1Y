public class Studentdata
{
 private int marks;
public  void setMarks(int m) {
if (m>=0) {
marks = m ;

}
}
public int getMarks() {
return marks;
}
public class EncapsulationExample {
public static void main(String[] args)    {
StudentData s = new StudentData();
s.setMarks(90);
}
}
}


