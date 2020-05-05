
public class YukTreni extends Fabrika implements ITren,IUretim{
	private String renk;
	private double agirlik;
	public YukTreni(String renk,double agirlik) {
		this.renk=renk;
		this.agirlik=agirlik;
	}
	@Override
	public void kondiktorSayisi() {
		System.out.println("Kondikt�r say�s�:2");		
	}
	@Override
	public void vagonSayisi() {
		System.out.println("Vagon say�s�:maksimum 25");
	}
	@Override
	public void cal�s() {
		System.out.println("Fabrika Y�k Treni i�in �al��t�");
	}
	@Override
	public void uret() {
		System.out.println("Fabrika \n"+renk+" renkte ve "+agirlik+" a��rl�kta"+"\nbir Yuk Treni �retti");
		kondiktorSayisi();
		vagonSayisi();
	}
}
