package FirstTestCase;

import org.junit.Test;

public class TestClass extends TestBase {






    @Test
    public void userCanSendOrder() {
        openURL();
        mathRandomHead();
        pickRandCards();
        goBasket();
        selectDeliveryTypePickUp();
        selectTerminalForPickUp();
        goNextOrderReg();
        fillInFields();
        selectPayType();
        sendOrder();
        waitForComplete();






    }


}