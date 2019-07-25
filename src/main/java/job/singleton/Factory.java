package job.singleton;

public class Factory {

    public static void main(String[] args) {
        Ifactory ifactory = new Factoryi();
        Product product = ifactory.PoductFactory();
        product.getProduct();
    }
}

interface Iproduct{
    void getProduct();
}
class Product implements Iproduct{

    @Override
    public void getProduct() {
        System.out.println("cp");
    }
}

interface Ifactory{
    Product PoductFactory();
}

class Factoryi implements Ifactory{

    @Override
    public Product PoductFactory(){

        return new Product();
    }
}