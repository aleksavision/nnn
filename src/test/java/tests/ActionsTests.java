package tests;

import baseTest.BaseTest;
import pages.DragDropPage;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.switchTo;
import static com.codeborne.selenide.Selenide.title;
import static org.testng.Assert.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class ActionsTests extends BaseTest {

    @Test
    public void dragDropTest(){
        DragDropPage dragDropPage = homepage.clickDragAndDropLink();
        dragDropPage.coverBBox();
        assertEquals(dragDropPage.getLeftBox(), "B", "Box name is incorrect");
    }

    @Test
    public void rightClick(){
        DragDropPage dragDropPage = homepage.clickDragAndDropLink();
        dragDropPage.rightClickOnFooterLink();
        switchTo().window(1);
        System.out.println(title());
        assertTrue(title().contains("Home"));
    }




}
