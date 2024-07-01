package tests;

import baseTest.BaseTest;
import pages.AddRemoveElementsPage;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class AddRemoveTests extends BaseTest {

    @Test
    public void addRemoveOneElement(){
        AddRemoveElementsPage addRemoveElementsPage = homepage.clickAddRemoveElementsLink();
        addRemoveElementsPage.addElement();
        addRemoveElementsPage.removeElement();
        assertEquals(addRemoveElementsPage.deleteButtonQty(), 0, "Delete button qty is incorrect");
    }

    @Test
    public void addNotOneElement(){
        AddRemoveElementsPage addRemoveElementsPage = homepage.clickAddRemoveElementsLink();
        addRemoveElementsPage.addElement();
        addRemoveElementsPage.addElement();
        addRemoveElementsPage.addElement();
        assertEquals(addRemoveElementsPage.deleteButtonQty(), 3, "Delete button qty is incorrect");
    }


}
