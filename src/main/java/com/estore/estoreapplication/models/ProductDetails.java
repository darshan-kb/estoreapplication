package com.estore.estoreapplication.models;

public class ProductDetails {
	private int PROD_CODE;
	private String PROD_NAME;
	private String PROD_DESC;
	private String BRAND;
	private String COLOR;
	private String PROD_DIM;
	private double PRICE;
	private double DISCOUNT;
	private String PROD_CAT;
	private double QUANTITY;
	private int RATING;
	private boolean OFFER;
	public int getPROD_CODE() {
		return PROD_CODE;
	}
	public void setPROD_CODE(int pROD_CODE) {
		PROD_CODE = pROD_CODE;
	}
	public String getPROD_NAME() {
		return PROD_NAME;
	}
	public void setPROD_NAME(String pROD_NAME) {
		PROD_NAME = pROD_NAME;
	}
	public String getPROD_DESC() {
		return PROD_DESC;
	}
	public void setPROD_DESC(String pROD_DESC) {
		PROD_DESC = pROD_DESC;
	}
	public String getBRAND() {
		return BRAND;
	}
	public void setBRAND(String bRAND) {
		BRAND = bRAND;
	}
	public String getCOLOR() {
		return COLOR;
	}
	public void setCOLOR(String cOLOR) {
		COLOR = cOLOR;
	}
	public String getPROD_DIM() {
		return PROD_DIM;
	}
	public void setPROD_DIM(String pROD_DIM) {
		PROD_DIM = pROD_DIM;
	}
	public double getPRICE() {
		return PRICE;
	}
	public void setPRICE(double pRICE) {
		PRICE = pRICE;
	}
	public double getDISCOUNT() {
		return DISCOUNT;
	}
	public void setDISCOUNT(double dISCOUNT) {
		DISCOUNT = dISCOUNT;
	}
	public String getPROD_CAT() {
		return PROD_CAT;
	}
	public void setPROD_CAT(String pROD_CAT) {
		PROD_CAT = pROD_CAT;
	}
	public double getQUANTITY() {
		return QUANTITY;
	}
	public void setQUANTITY(double qUANTITY) {
		QUANTITY = qUANTITY;
	}
	public int getRATING() {
		return RATING;
	}
	public void setRATING(int rATING) {
		RATING = rATING;
	}
	public ProductDetails(int pROD_CODE, String pROD_NAME, String pROD_DESC, String bRAND, String cOLOR,
			String pROD_DIM, double pRICE, double dISCOUNT, String pROD_CAT, double qUANTITY, int rATING, boolean oFFER) {
		super();
		PROD_CODE = pROD_CODE;
		PROD_NAME = pROD_NAME;
		PROD_DESC = pROD_DESC;
		BRAND = bRAND;
		COLOR = cOLOR;
		PROD_DIM = pROD_DIM;
		PRICE = pRICE;
		DISCOUNT = dISCOUNT;
		PROD_CAT = pROD_CAT;
		QUANTITY = qUANTITY;
		RATING = rATING;
		OFFER = OFFER;
	}
	public ProductDetails() {
		super();
	}
	public boolean getOFFER() {
		return OFFER;
	}
	public void setOFFER(boolean oFFER) {
		OFFER = oFFER;
	}
	
}
