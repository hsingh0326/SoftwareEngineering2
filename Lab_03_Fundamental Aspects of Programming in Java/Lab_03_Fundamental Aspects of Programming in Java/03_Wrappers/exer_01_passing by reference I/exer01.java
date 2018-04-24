// A Java program to demonstrate that we can swap two
// objects be swapping members.
// A Box with number class Box
class Box
{
int no;
Box(int no) { this.no = no; }
}
// A class that uses Box objects
class Main
{
// To swap c1 and c2
public static void swap(Box c1, Box c2)
{
int temp = c1.no;
c1.no = c2.no;
c2.no = temp;
}
// Driver method
public static void main(String[] args)
{
Box c1 = new Box(1);
Box c2 = new Box(2);
swap(c1, c2);
System.out.println("c1.no = " + c1.no);
System.out.println("c2.no = " + c2.no);
}
}
