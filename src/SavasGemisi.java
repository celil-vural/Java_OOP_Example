
public class SavasGemisi extends Fabrika implements IGemi,IUretim{
	private String renk;
	private double agirlik;
	public SavasGemisi(String renk,double agirlik) {
		this.renk=renk;
		this.agirlik=agirlik;
	}

	@Override
	public void sudaKal() {
		System.out.println("Bir depo ile suda kalýþ süresi:5 hafta");
	}

	@Override
	public void calýs() {
		System.out.println("Fabrika	Savaþ Gemisi için çalýþtý");
	}
	@Override
	public void uret() {
		System.out.println("Fabrika \n"+renk+" renkte ve "+agirlik+" aðýrlýkta"+"\nbir Savaþ Gemisi üretti");
		sudaKal();
		kapasite();
	}

	@Override
	public void kapasite() {
		System.out.println("kapasite:100");
	}
}
