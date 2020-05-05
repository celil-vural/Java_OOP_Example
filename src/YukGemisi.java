
public class YukGemisi extends Fabrika implements IGemi,IUretim{
	private String renk;
	private double agirlik;
	public YukGemisi(String renk,double agirlik) {
		this.renk=renk;
		this.agirlik=agirlik;
	}
	@Override
	public void sudaKal() {
		System.out.println("Bir depo ile suda kal�� s�resi:12 hafta");		
	}

	@Override
	public void cal�s() {
		System.out.println("Fabrika Y�k Gemisi i�in �al��t�");
	}
	@Override
	public void uret() {
		System.out.println("Fabrika \n"+renk+" renkte ve "+agirlik+" a��rl�kta"+"\nbir Y�k Gemisi �retti");
		sudaKal();
		kapasite();
	}
	@Override
	public void kapasite() {
		System.out.println("kapasite:50");
	}

}
