package com.Phase2.PaymentSystem.Database;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.Phase2.PaymentSystem.Class.Payment.Wallet;


@Service
public class Wallet_Db {
	private static List<Wallet> wallet_db = new ArrayList<>();

	public String Add_Wallet(Wallet wallet) {
		wallet_db.add(wallet);
		return "Added Successfully";
	}

	public Wallet Update_Wallet(String Username, double Amount) {
		System.out.println(Username);
		for (Wallet w : wallet_db) {
			if (w.Username.equals(Username)) {
				if (w.Amount >= Amount) {
					w.Amount = w.Amount - Amount;
					return w;
				} else
					return null;
			}
		}
		return null;
	}

	public String Add_To_Wallet(String Username, double Amount) {
		for (Wallet w : wallet_db) {
			if (w.Username.equals(Username)) {
				w.Amount += Amount;
				return "Updated Successfully";
			}
		}
		return "Not Found such as " + Username;

	}
}
