
public class SavasUcagi extends Fabrika implements IUcak,IUretim{
	private String renk;
	private double agirlik;
	public SavasUcagi(String renk,double agirlik) {
		this.agirlik=agirlik;
		this.renk=renk;
	}
	@Override
	public void cal�s() {
		System.out.println("Fabrika sava� u�a�� i�in �al��t�");
	}
	@Override
	public void uret() {
		System.out.println("Fabrika \n"+renk+" renkte ve "+agirlik+" a��rl�kta"+"\nbir Sava� U�a�� �retti");
		uc();
		kapasite();
	}
	@Override
	public void uc() {
		System.out.println("Bir depo ile u�u� s�resi: 4 saat");
	}
	@Override
	public void kapasite() {
		System.out.println("kapasite: 5");		
	}
}
