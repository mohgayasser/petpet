package gov.iti.jets.services;

import gov.iti.jets.persistent.dao.RepositoryImpl;
import gov.iti.jets.persistent.dto.ProductDto;
import gov.iti.jets.persistent.entity.Product;
import gov.iti.jets.services.mapper.ProductMapper;

public class AddProductService {

    public Boolean addProduct(ProductDto product) {

        RepositoryImpl<Product, Integer> repo = new RepositoryImpl<>(Product.class);

        Product p = new ProductMapper().toEntity(product);

        System.out.println(p);

        Product result = repo.create(p);
        if (result != null) {
            return true;
        }

        return false;
    }

}
