package com.example;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class BaseStepDef {
	
	@Before
	public void before(Scenario scenario) {
		System.out.println("i am before scenario");
	}
	
	@After
	public void after(Scenario scenario) {
		System.out.println("i am after scenario");
		if(scenario.isFailed()) {
				// -- Code to report / logging
		}
		scenario.log("basheer basheer basheer basheer basheer");
	} 
	
	@BeforeStep
	public void beforeStep() {
		System.out.println("------------beforeStep-----------------");
	}
	
	@AfterStep
	public void afterStep() {
		System.out.println("------------afterStep-----------------");
	}
	
	@Before("@critical")
	public void beforeCritical() {
		System.out.println("i am before scenario only once before @critical tags");
	}
	
}
