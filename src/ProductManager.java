
public class ProductManager {
	private Fabrika fabrika;
	public ProductManager(Fabrika fabrika) {
		this.fabrika=fabrika;
	}
	public void calistir() {
		fabrika.cal�s();
		fabrika.uret();
	}
}
