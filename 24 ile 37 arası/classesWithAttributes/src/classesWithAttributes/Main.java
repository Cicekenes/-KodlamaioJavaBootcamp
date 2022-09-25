package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product=new Product(1,"Laptop","Asus Laptop",3000,2,"Mavi");
		/*product.name="Laptop";
		product.id=1;
		product.description="Asus Laptop";
		product.price=5000.00;
		product.stockAmount=3;
		System.out.println(product.name );*/
		/*product.set_kod("asdasdassa");
		product.setId(1);
		System.out.println(product.get_kod());*/
		
		ProductManager productManager=new ProductManager();
		productManager.Add(product);

	}

}
