package org.example;

import org.testng.annotations.Test;

public class TestSuite extends BaseTest {//extends class to call method open and close browser

    //create obj to call Homepage class's methods
    HomePage homePage = new HomePage();

    //create obj to call RegisterPage class's methods
    RegisterPage registerPage = new RegisterPage();

    //create obj to call RegisterResultPage class's methods
    RegisterResultPage registerResultPage = new RegisterResultPage();

    //create obj to call ShoppingCartPage class's methods
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    //create obj to call checkoutAsGuestPage class's methods
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



    //create obj to call LoginPage class's methods
   //LoginPage loginPage = new LoginPage();

    //create obj to call ElectronicsPage class's methods
    //ElectronicsPage electronicsPage = new ElectronicsPage();

    //create obj to call CameraAndPhotoPage class's methods
    //CameraAndPhotoPage cameraAndPhotoPage = new CameraAndPhotoPage();

    //create obj to call LeicaT_MirrorlessDigital_CameraPage class's methods
    //LeicaT_MirrorlessDigital_CameraPage leicaTMirrorlessDigitalCameraPage = new LeicaT_MirrorlessDigital_CameraPage();

    //create obj to call ProductEmailAFriendPage class's methods
    //ProductEmailAFriendPage productEmailAFriendPage = new ProductEmailAFriendPage();

    //create obj to  call buildYourOwnComputerPage class's methods
    //BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();



    // create obj to call computerPage class's methods
    //ComputerPage computerPage = new ComputerPage();

    //create obj to call desktopsPage class's methods
    //DesktopsPage desktopsPage = new DesktopsPage();

    //create obj to call facebookPage class's methods
    //FacebookPage facebookPage = new FacebookPage();

    //create obj to call NopcommerceNewRelease  class's methods
    //NopcommerceNewRelease nopcommerceNewRelease = new NopcommerceNewRelease();

    //create obj to call NikePage class's methods
    Search_q_Page search_q_page= new Search_q_Page();




    @Test
    public void verifyUserShouldBeAbleToRegisterSuccessfully(){

        //click on register button from header bar
        homePage.clickOnRegisterButton();
        //enter registration details
        registerPage.enterRegistrationDetails();
        //verify user registered Successfully
        registerResultPage.userShouldBeAbleTOGetRegisterMsg();


    }

    @Test
    public void verifyUsersShouldAbleToSearchAnyProductAndEachProductTitleContainSearchedWord(){
        //type product name
        homePage.typeBrandName();
        //to click on Search button
        homePage.clickSearchButton();
        //each product contain same brand name
        search_q_page.productsTitleContainSearchedWord();

    }

    @Test
    public void guestUserShouldBeCheckOutSuccessfullyHTCOneM8AndroidLollipop(){
        //click On HTC One M8 Android Lollipop's ADD TO CART Button
        homePage.clickOnHTCAndroidADDTOCARTButton();
        //click on shopping cart
        homePage.clickOnShoppingCart();
        //click to tick term and condition
        //click on CHECKOUT
        shoppingCartPage.toCheckout();
        //click on CHECKOUT AS GUEST
        checkoutAsGuestPage.clickOnCheckoutAsGuest();
        //ill the details on checkout page
        opc_billingAddressPage.toFillBillingAddressDetail();
        //select shipping method
        opcShippingMethodPage.methodOfShipping();
        //select payment method
        opcPaymentMethodPage.selectPaymentMethod();
        //select payment information
        opcPaymentInfoPage.selectPymentInfo();
        //confirm your order
        opcConfirmOrderPage.toConfirmOrder();
        //confirm checkout completed
        checkoutCompletedPage.checkoutCompletedMsg();



    }
}
