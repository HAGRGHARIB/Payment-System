package com.Phase2.PaymentSystem.Class.Services;

import com.Phase2.PaymentSystem.Class.Provider_Service.Monthly_Receipt;
import com.Phase2.PaymentSystem.Class.Provider_Service.Quarter_Receipt;

public class Landline_Services extends Services {
	public Landline_Services() {
		this.Name = "Landline Services";
		this.provider_services.add(new Monthly_Receipt());
		this.provider_services.add(new Quarter_Receipt());
	}
}
