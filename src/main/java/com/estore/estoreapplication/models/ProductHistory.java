package com.estore.estoreapplication.models;

import java.util.Date;

public class ProductHistory {
	private int USER_ID;
	private String PRODUCT_DESC;
	private long ORDER_CODE;
	private OrderStatus ORDER_STATUS;
	private String PRODUCT_NAME;
	private Date ORDER_CREATION_DATE;
	private int ORDER_QUANTITY;
	private double ORDER_AMOUNT;
	private double ORDER_DISCOUNT_PRICE;
	private PaymentMethod PAYMENT_METHOD;
	private String SHIP_TO_ADDRESS;
	private String SHIP_TO_CITY;
	private String SHIP_TO_FIRSTNAME;
	private String SHIP_TO_LASTNAME;
	private String SHIP_TO_EMAIL;
	private String SHIP_TO_PHONE_NO;
	private int SHIP_TO_POSTAL_CODE;
	public ProductHistory(int uSER_ID, String pRODUCT_DESC, long oRDER_CODE, OrderStatus oRDER_STATUS,
			String pRODUCT_NAME, Date oRDER_CREATION_DATE, int oRDER_QUANTITY, double oRDER_AMOUNT,
			double oRDER_DISCOUNT_PRICE, PaymentMethod pAYMENT_METHOD, String sHIP_TO_ADDRESS, String sHIP_TO_CITY,
			String sHIP_TO_FIRSTNAME, String sHIP_TO_LASTNAME, String sHIP_TO_EMAIL, String sHIP_TO_PHONE_NO,
			int sHIP_TO_POSTAL_CODE) {
		super();
		USER_ID = uSER_ID;
		PRODUCT_DESC = pRODUCT_DESC;
		ORDER_CODE = oRDER_CODE;
		ORDER_STATUS = oRDER_STATUS;
		PRODUCT_NAME = pRODUCT_NAME;
		ORDER_CREATION_DATE = oRDER_CREATION_DATE;
		ORDER_QUANTITY = oRDER_QUANTITY;
		ORDER_AMOUNT = oRDER_AMOUNT;
		ORDER_DISCOUNT_PRICE = oRDER_DISCOUNT_PRICE;
		PAYMENT_METHOD = pAYMENT_METHOD;
		SHIP_TO_ADDRESS = sHIP_TO_ADDRESS;
		SHIP_TO_CITY = sHIP_TO_CITY;
		SHIP_TO_FIRSTNAME = sHIP_TO_FIRSTNAME;
		SHIP_TO_LASTNAME = sHIP_TO_LASTNAME;
		SHIP_TO_EMAIL = sHIP_TO_EMAIL;
		SHIP_TO_PHONE_NO = sHIP_TO_PHONE_NO;
		SHIP_TO_POSTAL_CODE = sHIP_TO_POSTAL_CODE;
	}
	public ProductHistory() {
		super();
	}
	public int getUSER_ID() {
		return USER_ID;
	}
	public void setUSER_ID(int uSER_ID) {
		USER_ID = uSER_ID;
	}
	public String getPRODUCT_DESC() {
		return PRODUCT_DESC;
	}
	public void setPRODUCT_DESC(String pRODUCT_DESC) {
		PRODUCT_DESC = pRODUCT_DESC;
	}
	public long getORDER_CODE() {
		return ORDER_CODE;
	}
	public void setORDER_CODE(long oRDER_CODE) {
		ORDER_CODE = oRDER_CODE;
	}
	public OrderStatus getORDER_STATUS() {
		return ORDER_STATUS;
	}
	public void setORDER_STATUS(OrderStatus oRDER_STATUS) {
		ORDER_STATUS = oRDER_STATUS;
	}
	public String getPRODUCT_NAME() {
		return PRODUCT_NAME;
	}
	public void setPRODUCT_NAME(String pRODUCT_NAME) {
		PRODUCT_NAME = pRODUCT_NAME;
	}
	public Date getORDER_CREATION_DATE() {
		return ORDER_CREATION_DATE;
	}
	public void setORDER_CREATION_DATE(Date oRDER_CREATION_DATE) {
		ORDER_CREATION_DATE = oRDER_CREATION_DATE;
	}
	public int getORDER_QUANTITY() {
		return ORDER_QUANTITY;
	}
	public void setORDER_QUANTITY(int oRDER_QUANTITY) {
		ORDER_QUANTITY = oRDER_QUANTITY;
	}
	public double getORDER_AMOUNT() {
		return ORDER_AMOUNT;
	}
	public void setORDER_AMOUNT(double oRDER_AMOUNT) {
		ORDER_AMOUNT = oRDER_AMOUNT;
	}
	public double getORDER_DISCOUNT_PRICE() {
		return ORDER_DISCOUNT_PRICE;
	}
	public void setORDER_DISCOUNT_PRICE(double oRDER_DISCOUNT_PRICE) {
		ORDER_DISCOUNT_PRICE = oRDER_DISCOUNT_PRICE;
	}
	public PaymentMethod getPAYMENT_METHOD() {
		return PAYMENT_METHOD;
	}
	public void setPAYMENT_METHOD(PaymentMethod pAYMENT_METHOD) {
		PAYMENT_METHOD = pAYMENT_METHOD;
	}
	public String getSHIP_TO_ADDRESS() {
		return SHIP_TO_ADDRESS;
	}
	public void setSHIP_TO_ADDRESS(String sHIP_TO_ADDRESS) {
		SHIP_TO_ADDRESS = sHIP_TO_ADDRESS;
	}
	public String getSHIP_TO_CITY() {
		return SHIP_TO_CITY;
	}
	public void setSHIP_TO_CITY(String sHIP_TO_CITY) {
		SHIP_TO_CITY = sHIP_TO_CITY;
	}
	public String getSHIP_TO_FIRSTNAME() {
		return SHIP_TO_FIRSTNAME;
	}
	public void setSHIP_TO_FIRSTNAME(String sHIP_TO_FIRSTNAME) {
		SHIP_TO_FIRSTNAME = sHIP_TO_FIRSTNAME;
	}
	public String getSHIP_TO_LASTNAME() {
		return SHIP_TO_LASTNAME;
	}
	public void setSHIP_TO_LASTNAME(String sHIP_TO_LASTNAME) {
		SHIP_TO_LASTNAME = sHIP_TO_LASTNAME;
	}
	public String getSHIP_TO_EMAIL() {
		return SHIP_TO_EMAIL;
	}
	public void setSHIP_TO_EMAIL(String sHIP_TO_EMAIL) {
		SHIP_TO_EMAIL = sHIP_TO_EMAIL;
	}
	public String getSHIP_TO_PHONE_NO() {
		return SHIP_TO_PHONE_NO;
	}
	public void setSHIP_TO_PHONE_NO(String sHIP_TO_PHONE_NO) {
		SHIP_TO_PHONE_NO = sHIP_TO_PHONE_NO;
	}
	public int getSHIP_TO_POSTAL_CODE() {
		return SHIP_TO_POSTAL_CODE;
	}
	public void setSHIP_TO_POSTAL_CODE(int sHIP_TO_POSTAL_CODE) {
		SHIP_TO_POSTAL_CODE = sHIP_TO_POSTAL_CODE;
	}
	@Override
	public String toString() {
		return "ProductHistory [USER_ID=" + USER_ID + ", PRODUCT_DESC=" + PRODUCT_DESC + ", ORDER_CODE=" + ORDER_CODE
				+ ", ORDER_STATUS=" + ORDER_STATUS + ", PRODUCT_NAME=" + PRODUCT_NAME + ", ORDER_CREATION_DATE="
				+ ORDER_CREATION_DATE + ", ORDER_QUANTITY=" + ORDER_QUANTITY + ", ORDER_AMOUNT=" + ORDER_AMOUNT
				+ ", ORDER_DISCOUNT_PRICE=" + ORDER_DISCOUNT_PRICE + ", PAYMENT_METHOD=" + PAYMENT_METHOD
				+ ", SHIP_TO_ADDRESS=" + SHIP_TO_ADDRESS + ", SHIP_TO_CITY=" + SHIP_TO_CITY + ", SHIP_TO_FIRSTNAME="
				+ SHIP_TO_FIRSTNAME + ", SHIP_TO_LASTNAME=" + SHIP_TO_LASTNAME + ", SHIP_TO_EMAIL=" + SHIP_TO_EMAIL
				+ ", SHIP_TO_PHONE_NO=" + SHIP_TO_PHONE_NO + ", SHIP_TO_POSTAL_CODE=" + SHIP_TO_POSTAL_CODE + "]";
	}
	
	
	
	
}
