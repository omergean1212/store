package Model;
 //writen by omer
//16.2.2021 , 15:50
public class Product {
	String barcode;
	String ProductName;
	int CostPrice; //the price that the store paid to the supplier
	int SellingPrice; //the price in the store
	Client buyer; // contains name , phone number , and a boolean - wants Updates
	public Product(String barcode,String ProductName,int CostPrice,int SellingPrice , Client buyer){
		this.barcode = barcode;
		this.ProductName = ProductName;
		this.CostPrice = CostPrice;
		this.SellingPrice = SellingPrice;
		this.buyer = buyer;
	}
	public Product(String barcode,String ProductName,int CostPrice,int SellingPrice){
		this.barcode = barcode;
		this.ProductName = ProductName;
		this.CostPrice = CostPrice;
		this.SellingPrice = SellingPrice;
	}
}

