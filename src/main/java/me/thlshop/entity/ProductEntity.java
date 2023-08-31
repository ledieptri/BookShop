package me.thlshop.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "product")
public class ProductEntity {
	@Id
	@Column(name = "product_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer productId;

	@Column(name = "product_name")
	private String productName;

	@ManyToOne
	@JoinColumn(name = "category_id")
	@JsonIgnore
	private CategoryEntity categoryId;

	@ManyToOne
	@JoinColumn(name = "image_id")
	@JsonIgnore
	private ImageEntity imageId;

	@ManyToOne
	@JoinColumn(name = "info_id")
	@JsonIgnore
	private InformationEntity infoId;

	@OneToMany(mappedBy = "productId", cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<OrderDetailEntity> orderId;

	@Column(name = "description")
	private String description;

	@Column(name = "price")
	private Long price;
	
	@Column(name = "is_promotion")
	private Boolean isPromotion;

	// Constructor private để chỉ cho phép Builder truy cập
	public ProductEntity() {
	}

	public Integer getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public CategoryEntity getCategoryId() {
		return categoryId;
	}

	public ImageEntity getImageId() {
		return imageId;
	}

	public InformationEntity getInfoId() {
		return infoId;
	}

	public Set<OrderDetailEntity> getOrderId() {
		return orderId;
	}

	public String getDescription() {
		return description;
	}

	public Long getPrice() {
		return price;
	}

	public Boolean getIsPromotion() {
		return isPromotion;
	}

	public void setIsPromotion(Boolean isPromotion) {
		this.isPromotion = isPromotion;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setCategoryId(CategoryEntity categoryId) {
		this.categoryId = categoryId;
	}

	public void setImageId(ImageEntity imageId) {
		this.imageId = imageId;
	}

	public void setInfoId(InformationEntity infoId) {
		this.infoId = infoId;
	}

	public void setOrderId(Set<OrderDetailEntity> orderId) {
		this.orderId = orderId;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setPrice(Long price) {
		this.price = price;
	}



	public static class Builder {
		private ProductEntity product;

		public Builder(String productName) {
			product = new ProductEntity();
			product.productName = productName;
		}
		
		public Builder productId(Integer productId) {
			product.productId = productId;
			return this;
		}

		public Builder categoryId(CategoryEntity categoryId) {
			product.categoryId = categoryId;
			return this;
		}

		public Builder imageId(ImageEntity imageId) {
			product.imageId = imageId;
			return this;
		}

		public Builder infoId(InformationEntity infoId) {
			product.infoId = infoId;
			return this;
		}

		public Builder orderId(Set<OrderDetailEntity> orderId) {
			product.orderId = orderId;
			return this;
		}

		public Builder description(String description) {
			product.description = description;
			return this;
		}

		public Builder price(Long price) {
			product.price = price;
			return this;
		}

		public ProductEntity build() {
			return product;
		}
	}

	@Override
	public String toString() {
		return "ProductEntity{" +
				"productId=" + productId +
				", productName='" + productName + '\'' +
				", categoryId=" + categoryId +
				", imageId=" + imageId +
				", infoId=" + infoId +
				", orderId=" + orderId +
				", description='" + description + '\'' +
				", price=" + price +
				'}';
	}
}
