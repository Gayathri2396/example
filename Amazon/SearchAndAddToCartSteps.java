import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class SearchAndAddToCartSteps {

    @Given("User is on Amazon.in homepage")
    public void userIsOnAmazonHomepage() {
        // Code to navigate to Amazon.in homepage
    }

    @When("User searches for {string}")
    public void userSearchesForProduct(String product) {
        // Code to search for the specified product
    }

    @When("User selects the first result from the list")
    public void userSelectsFirstResult() {
        // Code to select the first result from the search list
    }

    @When("User goes to the product details page")
    public void userGoesToProductDetails() {
        // Code to navigate to the product details page
    }

    @When("User stores the price in a variable")
    public void userStoresPriceInVariable() {
        // Code to extract and store the price in a variable
    }

    @When("User adds the product to the cart")
    public void userAddsProductToCart() {
        // Code to add the product to the cart
    }

    @Then("Product should be added to the cart successfully")
    public void productAddedToCartSuccessfully() {
        // Code to verify that the product is added to the cart
    }
}