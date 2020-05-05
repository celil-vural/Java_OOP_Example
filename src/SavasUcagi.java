
public class SavasUcagi extends Fabrika implements IUcak,IUretim{
	private String renk;
	private double agirlik;
	public SavasUcagi(String renk,double agirlik) {
		this.agirlik=agirlik;
		this.renk=renk;
	}
	@Override
	public void calýs() {
		System.out.println("Fabrika savaþ uçaðý için çalýþtý");
	}
	@Override
	public void uret() {
		System.out.println("Fabrika \n"+renk+" renkte ve "+agirlik+" aðýrlýkta"+"\nbir Savaþ Uçaðý üretti");
		uc();
		kapasite();
	}
	@Override
	public void uc() {
		System.out.println("Bir depo ile uçuþ süresi: 4 saat");
	}
	@Override
	public void kapasite() {
		System.out.println("kapasite: 5");		
	}
}
