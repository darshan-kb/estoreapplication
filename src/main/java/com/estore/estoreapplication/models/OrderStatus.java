package com.estore.estoreapplication.models;

public enum OrderStatus {
	PACKED, ONTHEWAY, RETURNED, RETURNEDREQUESTED, DELIVERED, CONFIRMED;
	public String toString() {
        switch (this) {
            case PACKED:
                return "Packed";
            case ONTHEWAY:
                return "On the way";
            case RETURNED:
                return "Returned";
            case RETURNEDREQUESTED:
                return "Return Requested";
            case DELIVERED:
                return "Delivered";
            case CONFIRMED:
                return "Confirmed";
        }
        return "";
    }
}
