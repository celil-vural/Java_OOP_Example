
public class YolcuUcagi extends Fabrika implements IUretim,IUcak{
	private String renk;
	private double agirlik;
	public YolcuUcagi(String renk,double agirlik) {
		this.renk=renk;
		this.agirlik=agirlik;
	}
	@Override
	public void cal�s() {
		System.out.println("Fabrika yolcu u�a�� i�in �al��t�");
	}
	@Override
	public void uret() {
		System.out.println("Fabrika \n"+renk+" renkte ve "+agirlik+" a��rl�kta"+"\nbir Yolcu U�a�� �retti");
		uc();
		kapasite();
	}
	@Override
	public void uc() {
		System.out.println("Bir depo ile u�u� s�resi:10 saat");
	}
	@Override
	public void kapasite() {
		System.out.println("kapasite:300");
	}
}
