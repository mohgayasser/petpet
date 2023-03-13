package gov.iti.jets;

import gov.iti.jets.persistent.dao.RepositoryImpl;
import gov.iti.jets.persistent.entity.Category;
import gov.iti.jets.persistent.entity.Product;
import gov.iti.jets.persistent.entity.User;

public class Main {
    public static void main(String[] args) {

        RepositoryImpl<Category, Integer> implC = new RepositoryImpl<>(Category.class);

        Category cat = new Category();
        cat.setId(1);

        RepositoryImpl<Product, Integer> impl = new RepositoryImpl<>(Product.class);
        Product p = new Product();
        p.setName("Fdsf");
        p.setCategory(cat);
        impl.create(p);

        // User us = impl.find(7);

        // System.out.println(us);

    }
}
