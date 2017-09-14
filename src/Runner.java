
public class Runner {
public static void main(String[] args) {
	
SeaCreature s=new SeaCreature("Squidward");
SeaCreature h=new SeaCreature("Patrick");
	SeaCreature j=new SeaCreature("Spongebob");
j.eat();
j.laugh();
System.out.println(s.getName());
System.out.println(h.getName());
s.eat();
h.eat();
s.laugh();
h.laugh();
	
	
}
}