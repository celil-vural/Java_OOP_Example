
public class TatilGemisi extends Fabrika implements IGemi,IUretim{
	private String renk;
	private double agirlik;
	public TatilGemisi(String renk,double agirlik) {
		this.renk=renk;
		this.agirlik=agirlik;
	}
	@Override
	public void sudaKal() {
		System.out.println("Bir depo ile suda kal�� s�resi:10 hafta");
	}
	@Override
	public void cal�s() {
	System.out.println("Fabrika Tatil Gemisi i�in �al��t�");
	}
	@Override
	public void uret() {
		System.out.println("Fabrika \n"+renk+" renkte ve "+agirlik+" a��rl�kta"+"\nbir Tatil Gemisi �retti");
		sudaKal();
		kapasite();
	}
	@Override
	public void kapasite() {
		System.out.println("kapasite:1000");
	}

}
