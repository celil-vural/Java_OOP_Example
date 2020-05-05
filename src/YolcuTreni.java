
public class YolcuTreni extends Fabrika implements ITren,IUretim{
	private String renk;
	private double agirlik;
	public YolcuTreni(String renk,double agirlik) {
		this.renk=renk;
		this.agirlik=agirlik;
	}
	@Override
	public void kondiktorSayisi() {
		System.out.println("Kondiktör sayýsý:1");		
	}
	@Override
	public void vagonSayisi() {
		System.out.println("Vagon sayýsý:maksimum 10");
	}
	@Override
	public void calýs() {
		System.out.println("Fabrika Yolcu Treni için çalýþtý");
	}
	@Override
	public void uret() {
		System.out.println("Fabrika \n"+renk+" renkte ve "+agirlik+" aðýrlýkta"+"\nbir Yolcu Treni üretti");
		kondiktorSayisi();
		vagonSayisi();
	}
}
