package com.Phase2.PaymentSystem.Database;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.Phase2.PaymentSystem.Class.Services.Donations;
import com.Phase2.PaymentSystem.Class.Services.Internet_Payment_Services;
import com.Phase2.PaymentSystem.Class.Services.Landline_Services;
import com.Phase2.PaymentSystem.Class.Services.Mobile_Recharge_Services;
import com.Phase2.PaymentSystem.Class.Services.Services;

@Service
public class Services_Db {
	private List<Services> services_db = new ArrayList<>();

	public Services_Db() {
		services_db.add(new Mobile_Recharge_Services());
		services_db.add(new Internet_Payment_Services());
		services_db.add(new Landline_Services());
		services_db.add(new Donations());
	}
}
