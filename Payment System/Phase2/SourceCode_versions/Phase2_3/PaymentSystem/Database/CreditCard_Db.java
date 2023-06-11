package com.Phase2.PaymentSystem.Database;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.Phase2.PaymentSystem.Class.Payment.CreditCard;

@Service
public class CreditCard_Db {
	private static List<CreditCard> creditcard_db = new ArrayList<>();

	public String Add_CreditCard(CreditCard creditcard) {
		creditcard_db.add(creditcard);
		return "Added Successfully";
	}

	public CreditCard Update_CreditCard(String Username, double Amount) {
		for (CreditCard c : creditcard_db) {
			if (c.Username.equals(Username)) {
				if (c.Amount >= Amount) {
					c.Amount = c.Amount - Amount;
					return c;
				} else
					return null;
			}
		}
		return null;
	}

	public String Add_To_CreditCard(String Username, double Amount) {
		for (CreditCard c : creditcard_db) {
			if (c.Username.equals(Username)) {
				c.Amount += Amount;
				return "Updated Successfully";
			}
		}
		return "Not Found such as " + Username;
	}

	public CreditCard Get_CreditCard(String Username) {
		for (CreditCard c : creditcard_db) {
			if (c.Username.equals(Username)) {
				return c;
			}
		}
		return null;
	}
}
