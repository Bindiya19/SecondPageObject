package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepDefs extends Utils {
    HomePage homePage = new HomePage();

    RegisterPage registerPage = new RegisterPage();

    RegisterResultPage registerResultPage = new RegisterResultPage();

    Search_q_Page search_q_page = new Search_q_Page();

    ElectronicsPage electronicsPage =new ElectronicsPage();

    ProductEmailAFriendPage productEmailAFriendPage = new ProductEmailAFriendPage();

    CameraAndPhotoPage cameraAndPhotoPage = new CameraAndPhotoPage();

    LeicaT_MirrorlessDigital_CameraPage leicaTMirrorlessDigitalCameraPage = new LeicaT_MirrorlessDigital_CameraPage();

    NopcommerceNewRelease nopcommerceNewRelease = new NopcommerceNewRelease();

    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    CheckoutAsGuestPage checkoutAsGuestPage = new CheckoutAsGuestPage();

    //
    Opc_BillingAddressPage opc_billingAddressPage = new Opc_BillingAddressPage();

    //
    Opc_ShippingMethodPage opcShippingMethodPage = new Opc_ShippingMethodPage();

    //
    Opc_PaymentMethodPage opcPaymentMethodPage = new Opc_PaymentMethodPage();

    //
    Opc_PaymentInfoPage opcPaymentInfoPage = new Opc_PaymentInfoPage();

    //
    Opc_ConfirmOrderPage opcConfirmOrderPage = new Opc_ConfirmOrderPage();

    //
    CheckoutCompletedPage checkoutCompletedPage = new  CheckoutCompletedPage();





    @Given("I am on home page")
    public void i_am_on_home_page() {

    }
    @Given("I click on register button")
    public void i_click_on_register_button() {
        homePage.clickOnRegisterButton();

    }
    @When("I enter registration details")
    public void i_enter_registration_details() {
        registerPage.enterRegistrationDetails();

    }
    @Then("I should be able to register successfully")
    public void i_should_be_able_to_register_successfully() {
        registerResultPage.userShouldBeAbleTOGetRegisterMsg();

    }
    @When("I click on {string} button")
    public void i_click_on_button(String buttonName) {
        homePage.clickOnButtonByGivenButtonName(buttonName);

    }
    @Then("I should be able to verify that user navigated to {string} page")
    public void i_should_be_able_to_verify_that_user_navigated_to_page(String url_contains) {
        verifyURLContains(url_contains);

    }
    @When("I enter {string} in search box")
    public void i_enter_in_search_box(String brandName) {
        homePage.typeBrandName(brandName);
    }
    @When("I click on search button")
    public void i_click_on_search_button() {
        homePage.clickSearchButton();

    }
    @Then("I should be able to see each product contain {string}")
    public void i_should_be_able_to_see_each_product_contain(String searchedBrand) {
        search_q_page.productsTitleContainSearchedWord(searchedBrand);

    }
    @Then("I should verify navigated url contain searched {string}")
    public void i_should_verify_navigated_url_contain_searched(String word) {
        verifyURLContains(word);

    }
    @When("I click on Electronics button")
    public void i_click_on_electronics_button() {
        homePage.clickOnElectronicsButton();

    }
    @Then("I click Camera & photo from list")
    public void i_click_camera_photo_from_list() {
        electronicsPage.clickOnCameraAndPhoto();

    }
    @Then("I click on Leica T Mirrorless Digital Camera from display products")
    public void i_click_on_leica_t_mirrorless_digital_camera_from_display_products() {
        cameraAndPhotoPage.clickOnT_MirrorDigitalCamera();

    }
    @When("I click on Email a friend button")
    public void i_click_on_email_a_friend_button() {
        leicaTMirrorlessDigitalCameraPage.emailAFriend();

    }
    @Then("I enter friend's email")
    public void i_enter_friend_s_email() {
        productEmailAFriendPage.toReferAFriend();

    }
    @Then("I enter my email address")
    public void i_enter_my_email_address() {
        productEmailAFriendPage.enterMyEmail();

    }
    @Then("I type personal message")
    public void i_type_personal_message() {
        productEmailAFriendPage.enterPersonalMsg();

    }
    @Then("I click on SEND EMAIL button")
    public void i_click_on_send_email_button() {
        productEmailAFriendPage.toClickOnSENDEMAIlButton();

    }
    @When("I click on DETAILS under nopCommerce new release!")
    public void i_click_on_details_under_nop_commerce_new_release() {
        homePage.clickOnDetailButton();

    }
    @When("I type title in Title box after I type comment in Comment box click on NEW COMMENT")
    public void i_type_title_in_title_box_after_i_type_comment_in_comment_box_click_on_new_comment() {
        nopcommerceNewRelease.enterYourTitleAndComment();

    }
    @When("I verify new comment msg after that compare text msg")
    public void i_verify_new_comment_msg_after_that_compare_text_msg() {
        nopcommerceNewRelease.verifyAndCompereMsg();

    }
    @Then("I verify my comment show in list in last")
    public void i_verify_my_comment_show_in_list_in_last() {
        nopcommerceNewRelease.myCommentShowInListAtLast();

    }
    @When("I select {string} from option")
    public void iSelectFromOption(String currency) {
        homePage.selectCurrency(currency);
    }

    @Then("Each product contain {string} symbol")
    public void eachProductContainSymbol(String currencySymbol) {
        homePage.verifyEachProductContainCurrencySymbol(currencySymbol);
    }
    @When("I click on ADD TO CART Button under\\(HTC One M8 Android Lollipop)")
    public void i_click_on_add_to_cart_button_under_htc_one_m8_android_lollipop() {
       homePage.clickOnHTCAndroidADDTOCARTButton();
    }
    @Then("I click on shopping cart to checkout")
    public void i_click_on_shopping_cart_to_checkout() {
        homePage.clickOnShoppingCart();
    }
    @Then("I click to tick term and condition after that I click on CHECKOUT")
    public void i_click_to_tick_term_and_condition_after_that_i_click_on_checkout() {
        shoppingCartPage.toCheckout();
    }
    @When("I click on CHECKOUT AS GUEST")
    public void i_click_on_checkout_as_guest() {
        checkoutAsGuestPage.clickOnCheckoutAsGuest();
    }
    @Then("I fill billing address details on checkout page after that i click on continue button")
    public void i_fill_billing_address_details_on_checkout_page_after_that_i_click_on_continue_button() {
        opc_billingAddressPage.toFillBillingAddressDetail();
    }
    @Then("I select shipping method after that i click on continue button")
    public void i_select_shipping_method_after_that_i_click_on_continue_button() {
        opcShippingMethodPage.methodOfShipping();
    }
    @And("I select payment method after that i click on continue button")
    public void iSelectPaymentMethodAfterThatIClickOnContinueButton() {
        opcPaymentMethodPage.selectPaymentMethod();
    }
    @Then("I fill select payment information after that i click on continue button")
    public void i_fill_select_payment_information_after_that_i_click_on_continue_button() {
        opcPaymentInfoPage.selectPymentInfo();
    }
    @When("I click confirm your order")
    public void i_click_confirm_your_order() {
        opcConfirmOrderPage.toConfirmOrder();
    }
    @Then("I confirm checkout completed msg")
    public void i_confirm_checkout_completed_msg() {
        checkoutCompletedPage.checkoutCompletedMsg();
    }
    @Then("I confirm is order num display")
    public void i_confirm_is_order_num_display() {
        checkoutCompletedPage.orderNumIsDisplay();
    }

}
