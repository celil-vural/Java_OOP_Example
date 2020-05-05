
public class NormalAraba extends Fabrika implements IAraba,IUretim{
	private String renk;
	private double agirlik;
	public NormalAraba(String renk,double agirlik) {
		this.renk=renk;
		this.agirlik=agirlik;
	}
	@Override
	public void mesafeGit() {
		System.out.println("Bir depo ile gidilebilicek mesafe:300 km ");		
	}

	@Override
	public void calýs() {
		System.out.println("Fabrika Normal Araba için çalýþtý");
	}
	@Override
	public void uret() {
		System.out.println("Fabrika \n"+renk+" renkte ve "+agirlik+" aðýrlýkta"+"\nbir Normal Araba üretti");
		mesafeGit();
		kapasite();
	}
	@Override
	public void kapasite() {
		System.out.println("Kapasite:Maks. 6");
	}
}
