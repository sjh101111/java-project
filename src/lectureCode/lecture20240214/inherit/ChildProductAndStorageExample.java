package lectureCode.lecture20240214.inherit;

import java.util.Arrays;

public class ChildProductAndStorageExample {

    public static void main(String[] args) {
        ChildProduct<Tv, String, String> product = new ChildProduct<Tv, String, String>();
        product.setKind(new Tv());
        product.setModel("SmartTv");
        product.setCompany("Samsoong");

        System.out.println(product.getKind());
        System.out.println(product.getModel());
        System.out.println(product.getCompany());

        Storage<Tv> storage = new StorageImpl<>(100);
        storage.add(new Tv(), 0);

    }
}
