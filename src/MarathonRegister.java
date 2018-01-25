
public class MarathonRegister {
	public static void main(String[] args) {
		Marathoner bob=new Marathoner("Bob", 4.5);
		bob.setName("Robert");
		System.out.println(bob.getName()+" "+bob.getBibNumber());
		Marathoner sue=new Marathoner("Sue", 4.45);
		Marathoner.setLocation("New York");
		System.out.println("Sue will run in "+sue.getLocation());
		System.out.println("Sue's number is "+sue.getBibNumber());
		System.out.println("Bob will run in "+bob.getLocation());
			}
}
