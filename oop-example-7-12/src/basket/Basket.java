package basket;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<String> purchasedProductList = new ArrayList<>();

    public List<String> getPurchasedProductList() {
        return purchasedProductList;
    }

    public void setPurchasedProductList(List<String> purchasedProductList) {
        this.purchasedProductList = purchasedProductList;
    }

    public String getProductIndex(int index) {
        return purchasedProductList.get(index);
    }

    public void setProductAddToCollection(String product) {
        purchasedProductList.add(product);
    }

    public void setProductAddToCollection(List<String> newPurchasedProductList) {
        purchasedProductList.addAll(newPurchasedProductList);
    }
}
