package model;

public class CategoryDTO {
	
	private int categoryNo;
	private String CategoryName;
	
	public CategoryDTO() {}

	public CategoryDTO(int categoryNo, String categoryName) {
		super();
		this.categoryNo = categoryNo;
		CategoryName = categoryName;
	}

	public int getCategoryNo() {
		return categoryNo;
	}

	public void setCategoryNo(int categoryNo) {
		this.categoryNo = categoryNo;
	}

	public String getCategoryName() {
		return CategoryName;
	}

	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}

	@Override
	public String toString() {
		return "\n[카테고리 번호 : " + categoryNo + "\n카테고리명 : " + CategoryName + "]\n";
	}
	
	
}
