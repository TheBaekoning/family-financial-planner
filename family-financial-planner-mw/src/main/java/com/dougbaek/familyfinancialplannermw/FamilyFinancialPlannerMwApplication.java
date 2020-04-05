package com.dougbaek.familyfinancialplannermw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@AutoConfigurationPackage
public class FamilyFinancialPlannerMwApplication {

	public static void main(String[] args) {
		SpringApplication.run(FamilyFinancialPlannerMwApplication.class, args);
	}

}
