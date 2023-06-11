package com.Phase2.PaymentSystem.Class.Services;

import com.Phase2.PaymentSystem.Class.Provider_Service.MEtisalat;
import com.Phase2.PaymentSystem.Class.Provider_Service.MOrange;
import com.Phase2.PaymentSystem.Class.Provider_Service.MVodafone;
import com.Phase2.PaymentSystem.Class.Provider_Service.MWe;

public class Mobile_Recharge_Services extends Services {
	public Mobile_Recharge_Services() {
		this.Name = "Mobile Recharge Services";
		this.provider_services.add(new MOrange());
		this.provider_services.add(new MWe());
		this.provider_services.add(new MEtisalat());
		this.provider_services.add(new MVodafone());

	}
}
