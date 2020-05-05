
public class Main {

	public static void main(String[] args) {
		/*
		 * Fabrikamýz uçak,gemi,araba,tren üreticek
		 * iki çeþit uçak var yolcu uçaðý ve savaþ uçaðý
		 * üç çeþit gemi var tatil gemisi,savaþ gemisi,yük gemisi
		 * iki çeþit araba var yarýþ arabasý,normal araba
		 * iki çeþit tren var yolcu treni, yük treni
		 * */
		SavasGemisi product=new SavasGemisi("kýrmýzý",10500);
		ProductManager manager=new ProductManager(product);
		manager.calistir();

	}

}
