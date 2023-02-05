package model;

public class BrandDTO {
	
	private int brandNo;
	private String brandName;
	private String nationalCode;
	
	public BrandDTO() {}

	public BrandDTO(int brandNo, String brandName, String nationalCode) {
		super();
		this.brandNo = brandNo;
		this.brandName = brandName;
		this.nationalCode = nationalCode;
	}

	public int getBrandNo() {
		return brandNo;
	}

	public void setBrandNo(int brandNo) {
		this.brandNo = brandNo;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getNationalCode() {
		return nationalCode;
	}

	public void setNationalCode(String nationalCode) {
		this.nationalCode = nationalCode;
	}

	@Override
	public String toString() {
		return "\n[브랜드 번호 : " + brandNo + "\n브랜드명 : " + brandName + "\n국가 코드 : " + nationalCode + "]\n";
	}
	
	
}
