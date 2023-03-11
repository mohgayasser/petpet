package gov.iti.jets.persistent.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ProductImageId implements Serializable {
    private static final long serialVersionUID = -2346405764870086940L;
    @Column(name = "product_id", nullable = false)
    private Integer productId;

    @Column(name = "image_url", nullable = false, length = 100)
    private String imageUrl;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ProductImageId entity = (ProductImageId) o;
        return Objects.equals(this.productId, entity.productId) &&
                Objects.equals(this.imageUrl, entity.imageUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, imageUrl);
    }

}