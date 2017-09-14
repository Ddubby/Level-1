
public class Runner2 {
public static void main(String[] args) {
	

	Smurf j=new Smurf ("Handy");
Smurf k=new Smurf ("Papa");
Smurf l=new Smurf ("Smurfette");

j.eat();
System.out.println(k.getName());
System.out.println(l.getName());
System.out.println(k.getHatColor());
System.out.println(k.isGirlOrBoy());
System.out.println(l.getHatColor());
System.out.println(l.isGirlOrBoy());
}
}