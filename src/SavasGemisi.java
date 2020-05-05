
public class SavasGemisi extends Fabrika implements IGemi,IUretim{
	private String renk;
	private double agirlik;
	public SavasGemisi(String renk,double agirlik) {
		this.renk=renk;
		this.agirlik=agirlik;
	}

	@Override
	public void sudaKal() {
		System.out.println("Bir depo ile suda kal�� s�resi:5 hafta");
	}

	@Override
	public void cal�s() {
		System.out.println("Fabrika	Sava� Gemisi i�in �al��t�");
	}
	@Override
	public void uret() {
		System.out.println("Fabrika \n"+renk+" renkte ve "+agirlik+" a��rl�kta"+"\nbir Sava� Gemisi �retti");
		sudaKal();
		kapasite();
	}

	@Override
	public void kapasite() {
		System.out.println("kapasite:100");
	}
}
