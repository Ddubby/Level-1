
public class Vault {
static int secretcode;


boolean tryCode(int code) {
	if (code==secretcode) {
		return true;
		
	}
	else {
		return false;
	}
}
public Vault(int secretcode) {
this.secretcode=secretcode;	
}
}


