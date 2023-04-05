package com.estore.estoreapplication.models;

public enum PaymentMethod {
	UPI, CASHONDELIVERY, CARD, NETBANKING;
	public String toString() {
        switch (this) {
            case UPI:
                return "UPI";
            case CASHONDELIVERY:
                return "Cash on delivery";
            case CARD:
                return "Card";
            case NETBANKING:
                return "Netbanking";
        }
        return "";
    }
}
