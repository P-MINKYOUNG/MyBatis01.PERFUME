package model;

import java.util.Date;

public class PerfumeDTO {
	
	private int perfumeNo;
	private String perfumeName;
	private int categoryNo;
	private int brandNo;
	private int amount;
	private int price;
	private int storageAmount;
	private Date manufacturedDate;
	private String orderableStatus;
	
	public PerfumeDTO() {}
	
	public PerfumeDTO(int perfumeNo, String perfumeName, int categoryNo, int brandNo, int amount, int price,
			int storageAmount, Date manufacturedDate, String orderableStatus) {
		super();
		this.perfumeNo = perfumeNo;
		this.perfumeName = perfumeName;
		this.categoryNo = categoryNo;
		this.brandNo = brandNo;
		this.amount = amount;
		this.price = price;
		this.storageAmount = storageAmount;
		this.manufacturedDate = manufacturedDate;
		this.orderableStatus = orderableStatus;
	}

	public int getPerfumeNo() {
		return perfumeNo;
	}

	public void setPerfumeNo(int perfumeNo) {
		this.perfumeNo = perfumeNo;
	}

	public String getPerfumeName() {
		return perfumeName;
	}

	public void setPerfumeName(String perfumeName) {
		this.perfumeName = perfumeName;
	}

	public int getCategoryNo() {
		return categoryNo;
	}

	public void setCategoryNo(int categoryNo) {
		this.categoryNo = categoryNo;
	}

	public int getBrandNo() {
		return brandNo;
	}

	public void setBrandNo(int brandNo) {
		this.brandNo = brandNo;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStorageAmount() {
		return storageAmount;
	}

	public void setStorageAmount(int storageAmount) {
		this.storageAmount = storageAmount;
	}

	public Date getManufacturedDate() {
		return manufacturedDate;
	}

	public void setManufacturedDate(Date manufacturedDate) {
		this.manufacturedDate = manufacturedDate;
	}

	public String getOrderableStatus() {
		return orderableStatus;
	}

	public void setOrderableStatus(String orderableStatus) {
		this.orderableStatus = orderableStatus;
	}

	@Override
	public String toString() {
		return "\n[제품 번호 : " + perfumeNo 
			 + "\n제품명 : " + perfumeName 
			 + "\n카테고리 번호 : " + categoryNo
			 + "\n브랜드 번호 : " + brandNo
			 + "\n가격 : " + price 
			 + "\n재고 : " + storageAmount 
			 + "\n제조일자 : " + manufacturedDate 
			 + "\n주문 가능 여부 : " + orderableStatus
			 + "]\n";
	}


	
	
}
