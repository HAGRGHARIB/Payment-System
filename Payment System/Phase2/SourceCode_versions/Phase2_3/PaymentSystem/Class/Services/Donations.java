package com.Phase2.PaymentSystem.Class.Services;

import com.Phase2.PaymentSystem.Class.Provider_Service.Cancer_Hospital;
import com.Phase2.PaymentSystem.Class.Provider_Service.NGOs;
import com.Phase2.PaymentSystem.Class.Provider_Service.Schools;

public class Donations extends Services {
	public Donations() {
		this.Name = "Donations";
		this.provider_services.add(new Cancer_Hospital());
		this.provider_services.add(new Schools());
		this.provider_services.add(new NGOs());

	}
}
