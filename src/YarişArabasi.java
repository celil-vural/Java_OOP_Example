
public class Yari�Arabasi extends Fabrika implements IAraba,IUretim{
	private String renk;
	private double agirlik;
	public Yari�Arabasi(String renk,double agirlik) {
		this.renk=renk;
		this.agirlik=agirlik;
	}
	@Override
	public void mesafeGit() {
		System.out.println("Bir depo ile gidilebilicek mesafe:200 km ");		
	}

	@Override
	public void cal�s() {
		System.out.println("Fabrika Yar�� Arabas� i�in �al��t�");
	}
	@Override
	public void uret() {
		System.out.println("Fabrika \n"+renk+" renkte ve "+agirlik+" a��rl�kta"+"\nbir Yar�� Arabs� �retti");
		mesafeGit();
		kapasite();
	}
	@Override
	public void kapasite() {
		System.out.println("kapasite:2");
	}
}
