package com.cucumber.learn;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HolyDentist {
	Logger APP_LOGS = Logger.getLogger("devpinoyLogger");
	
	@Given("^I am a \"([^\"]*)\" Dentist$")
	public void I_am_a_bad_Dentist(String dentistType,DataTable table)
	{
		List<Map<String,String>> data=table.asMaps();
		System.out.println("***************************************");
		APP_LOGS.debug("@Given - I am a "+dentistType+" Dentist from "+data.get(0).get("country"));
		APP_LOGS.debug("@Given - I am a "+dentistType+" Dentist from "+data.get(1).get("country"));
	}

	
	@When("^I go to clinic$")
	public void I_go_to_clinic(DataTable table)
	{
		List<Map<String,String>> data=table.asMaps();
		APP_LOGS.debug("@When - I go to "+data.get(0).get("clinictype")+" clinic");
		APP_LOGS.debug("@When - I go to "+data.get(1).get("clinictype")+" clinic");
	}
	
	
	
	@Then("^I \"([^\"]*)\" with patient$")
	public void I_mess_with_patient(String workoutput)
	{
		APP_LOGS.debug("@Then - I "+workoutput+" with patient");
	}

	
	
	@And("^My boss \"([^\"]*)\" me$")
	public void My_boss_fires_me(String bossAction)
	{
		APP_LOGS.debug("@And - My boss "+bossAction+" me");
	}
	
	
	@But("^The assistant \"([^\"]*)\" me$")
	public void The_assistant(String reaction)
	{
		APP_LOGS.debug("@But - The assistant "+reaction+" me");
	}
	
	

}
