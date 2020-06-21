package org.example.citybikes.test.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;

import static io.restassured.RestAssured.given;

public class CityBikes {
    private Response response;
    private String uri = "http://api.citybik.es/v2/networks";

    @Given("^Citybikes servie is up & running$")
    public void citybikes_servie_is_up_running() {

    }

    @Given("^Citybikes networks service is invoked$")
    public void citybikes_networks_service_is_invoked() {
        response = given().get(uri);
//        System.out.println(response.getBody().asString());
    }

    @When("^a success response is received$")
    public void a_success_response_is_received() {
        Assert.assertEquals(response.getStatusCode(), 200);
    }

    @Then("^Verify that City \"([^\"]*)\" is present in Country \"([^\"]*)\"$")
    public void verify_that_City_is_present_in_Country(String city, String country) {
        String responseBody = response.getBody().asString();


    }

    @Then("^the company in the city is located at latitude \"([^\"]*)\" longitude \"([^\"]*)\"$")
    public void the_company_in_the_city_is_located_at_latitude_longitude(String arg1, String arg2) {


    }

    @Then("^the company in the city has valid latitude and longitude$")
    public void the_company_in_the_city_has_valid_latitude_and_longitude() {

    }
}
