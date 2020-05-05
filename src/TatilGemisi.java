
public class TatilGemisi extends Fabrika implements IGemi,IUretim{
	private String renk;
	private double agirlik;
	public TatilGemisi(String renk,double agirlik) {
		this.renk=renk;
		this.agirlik=agirlik;
	}
	@Override
	public void sudaKal() {
		System.out.println("Bir depo ile suda kalýþ süresi:10 hafta");
	}
	@Override
	public void calýs() {
	System.out.println("Fabrika Tatil Gemisi için çalýþtý");
	}
	@Override
	public void uret() {
		System.out.println("Fabrika \n"+renk+" renkte ve "+agirlik+" aðýrlýkta"+"\nbir Tatil Gemisi üretti");
		sudaKal();
		kapasite();
	}
	@Override
	public void kapasite() {
		System.out.println("kapasite:1000");
	}

}
