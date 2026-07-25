class Product
{
	int product_id;
	String product_name;
	double price;
	
	public Product() {
		super();
		this.product_id = 544;
		this.product_name = "Phone";
		this.price = 200000;
	}
	
	public Product(int product_id, String product_name, double price) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.price = price;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	void display()
	{
		System.out.println("Product Id:"+this.product_id);
		System.out.println("Product Name:"+this.product_name);
		System.out.println("Price:"+this.price);
	}
	
}//Product class ends here

class ElectronicProduct extends Product
{
	String brand;
	double warranty_period;
	
	public ElectronicProduct() {
		super();
		this.brand = "Apple";
		this.warranty_period = 9;
	}
	
	public ElectronicProduct(int product_id, String product_name, double price,String brand, double warranty_period) {
		super(product_id,product_name,price);
		this.brand = brand;
		this.warranty_period = warranty_period;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getWarranty_period() {
		return warranty_period;
	}

	public void setWarranty_period(double warranty_period) {
		this.warranty_period = warranty_period;
	}
	
	void display()
	{
		super.display();
		System.out.println("Brand Name:"+this.brand);
		System.out.println("Warranty Period:"+this.warranty_period);
		System.out.println();
	}
}//ElectronicProduct class ends here

class ClothingProduct extends Product
{
	int size;
	String fabric_type;
	
	public ClothingProduct() {
		super();
		this.size = 7;
		this.fabric_type = "Cotton";
	}
	
	public ClothingProduct(int product_id, String product_name, double price,int size, String fabric_type) {
		super(product_id,product_name,price);
		this.size = size;
		this.fabric_type = fabric_type;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getFabric_type() {
		return fabric_type;
	}

	public void setFabric_type(String fabric_type) {
		this.fabric_type = fabric_type;
	}
	
	void display()
	{
		super.display();
		System.out.println("Cloth Size:"+this.size);
		System.out.println("Fabric Type:"+this.fabric_type);
		System.out.println();
	}
}//ClothingProduct class ends here

class FurnitureProduct extends Product
{
	String material;
	double weight;
	
	public FurnitureProduct() {
		super();
		this.material = "Jute";
		this.weight = 9;
	}
	
	public FurnitureProduct(int product_id, String product_name, double price,String material, double weight) {
		super(product_id,product_name,price);
		this.material = material;
		this.weight = weight;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	void display()
	{
		super.display();
		System.out.println("Material:"+this.material);
		System.out.println("Weight:"+this.weight);
		System.out.println();
	}
}//FurnitureProduct class ends here

public class Test_E_Commerce_Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Product p1 = new Product();
        p1.display();
        Product p2 = new Product(54,"Siddhu",8500);
        p2.display();
        
        ClothingProduct cp1 = new ClothingProduct();
        cp1.display();
        ClothingProduct cp2 = new ClothingProduct(75,"Om",900,5,"Cotton");
        cp2.display();
        
        ElectronicProduct ep1 = new ElectronicProduct();
        ep1.display();
        ElectronicProduct ep2 = new ElectronicProduct(877,"Jai",7800,"Samsung",8);
        ep2.display();
        
        FurnitureProduct  fp1 = new FurnitureProduct(988,"Rohan",452000,"Wooden",78);
        fp1.display();
        FurnitureProduct  fp2 = new FurnitureProduct();
        fp2.display();
	}

}
