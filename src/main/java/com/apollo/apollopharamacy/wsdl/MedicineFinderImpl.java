package com.apollo.apollopharamacy.wsdl;

import javax.jws.WebService;

import com.apollo.apollopharamacy.types.Criteria;
import com.apollo.apollopharamacy.types.Medicine;
import com.apollo.apollopharamacy.types.MedicineList;
import com.apollo.apollopharamacy.types.Store;

@WebService(endpointInterface = "com.apollo.apollopharamacy.wsdl.MedicineFinder", serviceName = "apollopharamacyMedicineFinderService", portName = "apollopharamacySOAPPort")
public class MedicineFinderImpl implements MedicineFinder {

	public MedicineList search(Criteria criteria, Store store) {
		// TODO Auto-generated method stub
		MedicineList medList = null;
		Medicine med = null;
		medList = new MedicineList();
		for (int i = 1; i < 5; i++) {
			med = new Medicine();
			med.setAvailableQty(10);
			med.setGeneric(true);
			med.setManufacturer("CIPLA");
			med.setMedicineName("SINAREST" + i);
			med.setPricePerUnit(345.67f);

			medList.getMedicineList().add(med);
		}

		return medList;
	}

}
