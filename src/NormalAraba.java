
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
	public void cal�s() {
		System.out.println("Fabrika Normal Araba i�in �al��t�");
	}
	@Override
	public void uret() {
		System.out.println("Fabrika \n"+renk+" renkte ve "+agirlik+" a��rl�kta"+"\nbir Normal Araba �retti");
		mesafeGit();
		kapasite();
	}
	@Override
	public void kapasite() {
		System.out.println("Kapasite:Maks. 6");
	}
}
