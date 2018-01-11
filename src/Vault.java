import java.util.Random;

public class Vault {
int secretcode;


boolean tryCode(int code) {
	if (code==secretcode) {
		return true;
		
	}
	else {
		return false;
	}
}
public Vault() {
	Random a=new Random();
	secretcode=a.nextInt(1000000000);
	System.out.println(secretcode);
}
}


