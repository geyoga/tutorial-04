package com.apap.tu04.service;

import com.apap.tu04.model.PilotModel;
/*
 * 
 * Pilot Service
 * 
 */

public interface PilotService {
	
	PilotModel getPilotDetailByLicenseNumber(String licenseNumber);
	PilotModel getPilotDetailByID(Long id);
	
	void addPilot(PilotModel pilot);
	void deletePilot(PilotModel pilot);
}