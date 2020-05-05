
public class YukTreni extends Fabrika implements ITren,IUretim{
	private String renk;
	private double agirlik;
	public YukTreni(String renk,double agirlik) {
		this.renk=renk;
		this.agirlik=agirlik;
	}
	@Override
	public void kondiktorSayisi() {
		System.out.println("Kondiktör sayýsý:2");		
	}
	@Override
	public void vagonSayisi() {
		System.out.println("Vagon sayýsý:maksimum 25");
	}
	@Override
	public void calýs() {
		System.out.println("Fabrika Yük Treni için çalýþtý");
	}
	@Override
	public void uret() {
		System.out.println("Fabrika \n"+renk+" renkte ve "+agirlik+" aðýrlýkta"+"\nbir Yuk Treni üretti");
		kondiktorSayisi();
		vagonSayisi();
	}
}
