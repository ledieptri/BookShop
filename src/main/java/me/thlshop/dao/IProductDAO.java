package me.thlshop.dao;

import java.util.List;
import java.util.Set;

import me.thlshop.entity.CategoryEntity;
import me.thlshop.entity.ImageEntity;
import me.thlshop.entity.InformationEntity;
import me.thlshop.entity.OrderDetailEntity;
import me.thlshop.entity.ProductEntity;

public interface IProductDAO {
	List<ProductEntity> findAll();
	ProductEntity findOne(Integer productId);
	List<ProductEntity> findByBrand(Integer brandId);
	void update(ProductEntity productEntity);
	Integer insert(ProductEntity productEntity);
	void delete(Integer productId);
	List<ProductEntity> search(String keyWord);
	List<ProductEntity> findByCategory(Integer categoryId);
	List<ProductEntity> findProductOutstanding();
	Long productNumber();
	List<ProductEntity> findPromotionPercentProduct();
	
	public default ProductEntity createProduct(Integer productId, String productName, CategoryEntity category, ImageEntity image,
            InformationEntity information, Set<OrderDetailEntity> orderDetails, String description, Long price) {
        return new ProductEntity.Builder(productName)
        		.productId(productId)
                .categoryId(category)
                .imageId(image)
                .infoId(information)
                .orderId(orderDetails)
                .description(description)
                .price(price)
                .build();
    }
}
