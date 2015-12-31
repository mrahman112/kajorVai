package com.learing.cucumber;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HolyTester {
	
	@Given("I am a bad tester")
	public void I_am_a_bad_tester()
	{
		System.out.println("@Given - I am a bad tester");
	}

	@When("I go to work")
	public void I_go_to_work()
	{
		System.out.println("@When - I go to work");
	}
	
	@Then("I mess with it")
	public void Then_I_mess_with_it()
	{
		System.out.println("@Then - I mess with it");
	}
	
	@And("My boss fires me")
	public void My_boss_fires_me()
	{
		System.out.println("@And - My boss fires me");
	}
	
	@But("The developer likes me")
	public void The_developer_likes_me()
	{
		System.out.println("@But - The developer likes me");
	}
}
