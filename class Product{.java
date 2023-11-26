class Product{

    private String ProductName;
    private double ProductPrice;
    private int ProductQuantity;
    Product(String ProductName,double ProductPrice)
    {
        this.ProductName=ProductName;
        this.ProductPrice=ProductPrice;
        ProductQuantity=0;
    }
    Product(String ProductName,double ProductPrice,int ProductQuantity)
    {
        this.ProductName=ProductName;
        this.ProductPrice=ProductPrice;
        this.ProductQuantity=ProductQuantity;
    }
    double getTotalPrice()
    {
       return double TotalPrice=ProductPrice*ProductQuantity;
    }
    public String ProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }
    public String ProductPrice() {
        return ProductPrice;
    }

    public void setProductPrice(String ProductPrice) {
        this.ProductPrice = ProductPrice;
    }
    public String ProductQuantity() {
        return ProductQuantity;
    }

    public void setProductPrice(String ProductQuantity) {
        this.ProductQuantity= ProductQuantity;
    }
    public void displayBookInfo() {
        System.out.println("ProductName " + ProductName);
        System.out.println("ProductPrice: " + ProductPrice);
        System.out.println("ProductQuantity: " + ProductQuantity);
    }

}
class ShoppinCart
{
    int product[]=new int[9]; 
}