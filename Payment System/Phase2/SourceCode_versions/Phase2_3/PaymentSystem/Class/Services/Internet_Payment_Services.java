package com.Phase2.PaymentSystem.Class.Services;

import com.Phase2.PaymentSystem.Class.Provider_Service.IEtisalat;
import com.Phase2.PaymentSystem.Class.Provider_Service.IOrange;
import com.Phase2.PaymentSystem.Class.Provider_Service.IVodafone;
import com.Phase2.PaymentSystem.Class.Provider_Service.IWe;

public class Internet_Payment_Services extends Services {
	public Internet_Payment_Services() {
		this.Name = "Internet Payment Services";
		this.provider_services.add(new IOrange());
		this.provider_services.add(new IWe());
		this.provider_services.add(new IEtisalat());
		this.provider_services.add(new IVodafone());
	}
}
