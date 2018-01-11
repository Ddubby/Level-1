
public class VaultRunner {
public static void main(String[] args) {
	
	Vault one=new Vault();
	
	JamesBond jamesbond=new JamesBond();
	int code=jamesbond.findCode(one);
			if (code!=-1) {
				System.out.println("Code cracked! The code was: "+code);
				
			}
			else {
			System.out.println("No code");	
			}
}
}
