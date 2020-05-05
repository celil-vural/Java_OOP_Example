
public class YolcuUcagi extends Fabrika implements IUretim,IUcak{
	private String renk;
	private double agirlik;
	public YolcuUcagi(String renk,double agirlik) {
		this.renk=renk;
		this.agirlik=agirlik;
	}
	@Override
	public void calýs() {
		System.out.println("Fabrika yolcu uçaðý için çalýþtý");
	}
	@Override
	public void uret() {
		System.out.println("Fabrika \n"+renk+" renkte ve "+agirlik+" aðýrlýkta"+"\nbir Yolcu Uçaðý üretti");
		uc();
		kapasite();
	}
	@Override
	public void uc() {
		System.out.println("Bir depo ile uçuþ süresi:10 saat");
	}
	@Override
	public void kapasite() {
		System.out.println("kapasite:300");
	}
}
