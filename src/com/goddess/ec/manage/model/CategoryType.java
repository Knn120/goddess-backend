package com.goddess.ec.manage.model;

/**
 * 商品顶级类别
 * 
 * @author bighua
 *
 */
public enum CategoryType {

	CATEGORY_BAG("1", "包袋", "-1"),

    CATEGORY_ACCESSORY("2", "配饰", "-2"),
	
	CATEGORY_CLOTHING("3","服装","-3"),
	
	CATEGORY_SHOES("4","鞋履","-4"),
	
	CATEGORY_LIFE("5","家居","-5");
	
	private String _code;
	private String _text;
	private String _id;
	
	private CategoryType(String code, String text, String id) {
		this._code = code;
		this._text = text;
		this._id = id;
	}
	
	public String getCode() {
		return _code;
	}
	
	public String getText() {
		return _text;
	}
	
	public String getId() {
		return _id;
	}
	
	public static CategoryType getEnumByCode(String code) {
		CategoryType[] types = CategoryType.values();
		for (CategoryType t : types) {
			if (t.getCode().equals(code))
				return t;
		}
		return null;
	}
	
	public static CategoryType getEnumById(String id) {
		CategoryType[] types = CategoryType.values();
		for (CategoryType t : types) {
			if (t.getId().equals(id))
				return t;
		}
		return null;
	}
}
