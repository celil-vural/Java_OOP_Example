
public class Main {

	public static void main(String[] args) {
		/*
		 * Fabrikam�z u�ak,gemi,araba,tren �reticek
		 * iki �e�it u�ak var yolcu u�a�� ve sava� u�a��
		 * �� �e�it gemi var tatil gemisi,sava� gemisi,y�k gemisi
		 * iki �e�it araba var yar�� arabas�,normal araba
		 * iki �e�it tren var yolcu treni, y�k treni
		 * */
		SavasGemisi product=new SavasGemisi("k�rm�z�",10500);
		ProductManager manager=new ProductManager(product);
		manager.calistir();

	}

}
