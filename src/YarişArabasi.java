
public class YarişArabasi extends Fabrika implements IAraba,IUretim{
	private String renk;
	private double agirlik;
	public YarişArabasi(String renk,double agirlik) {
		this.renk=renk;
		this.agirlik=agirlik;
	}
	@Override
	public void mesafeGit() {
		System.out.println("Bir depo ile gidilebilicek mesafe:200 km ");		
	}

	@Override
	public void calıs() {
		System.out.println("Fabrika Yarış Arabası için çalıştı");
	}
	@Override
	public void uret() {
		System.out.println("Fabrika \n"+renk+" renkte ve "+agirlik+" ağırlıkta"+"\nbir Yarış Arabsı üretti");
		mesafeGit();
		kapasite();
	}
	@Override
	public void kapasite() {
		System.out.println("kapasite:2");
	}
}
