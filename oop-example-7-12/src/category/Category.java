package category;

import java.util.ArrayList;
import java.util.List;

public class Category {
    private String name;
    private List<String> productList = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<String> productList) {
        this.productList = productList;
    }

    public String getProductIndex(int index) {
        return productList.get(index);
    }

    public void setProductAddToCollection(String product) {
        productList.add(product);
    }
}
