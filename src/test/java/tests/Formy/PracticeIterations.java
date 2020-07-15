package tests.Formy;
// THIS LANE ADDED RECENTLY
// steps to reproduce
// go to homepage
// locate to link
// put them on list and iterate
// click on desirable link

// Acceptance Criteria
// click on desirable link using list collections
// verify the current URL

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.FormyHomePage;
import utils.Driver;

import java.util.*;

public class PracticeIterations {

    public List<String> links(){
        List<String> nameLinks = new ArrayList<>();
        nameLinks.add("Autocomplete");
        nameLinks.add("Buttons");
        nameLinks.add("Checkbox");
        nameLinks.add("Datepicker");
        nameLinks.add("Drag and Drop");

        return nameLinks;
    }


    public Set<String> linksWithSet(){
        Set<String> nameLinks = new LinkedHashSet<>();
        nameLinks.add("Dropdown");
        nameLinks.add("Enabled and disabled elements");
        nameLinks.add("File Upload");
        nameLinks.add("Key and Mouse Press");
        nameLinks.add("Modal");

        return nameLinks;
    }

    public Map<String,String> linksWithMap(){

        Map<String,String> nameLinks = new HashMap<>();
            nameLinks.put("1","Page Scroll");
            nameLinks.put("2","Radio Button");
            nameLinks.put("3","Switch Window");
            nameLinks.put("4","Complete Web Form");

            return nameLinks;
    }


    @Test
    public void Test1(){
        FormyHomePage formyHomePage = new FormyHomePage();
        Driver.get().get(formyHomePage.url);

        List<WebElement> listOfLinks = formyHomePage.links;
        int i=0;
        for (WebElement listLink : listOfLinks) {
            if(listLink.getText().equals(links().get(i))){
                listLink.click();
                break;
            }
            i++;
        }

        Driver.close();
    }

    @Test
    public void Test2() throws InterruptedException {
        FormyHomePage formyHomePage = new FormyHomePage();
        Driver.get().get(formyHomePage.url);

        List<WebElement> listOfLinks = formyHomePage.links;
        List<String> name = new ArrayList<>();
        name.addAll(linksWithSet());



        for (int i = 0 ; i < listOfLinks.size() ; i++) {
            if ( listOfLinks.get(i).getText().equals(name.get(2)) ){
                listOfLinks.get(i).click();
                Thread.sleep(2000);
                break;
            }
        }


        //Driver.close();
    }

    @Test
    public void Test3() throws InterruptedException {
        FormyHomePage formyHomePage = new FormyHomePage();
        Driver.get().get(formyHomePage.url);
        // converting map to the list
        List<String> names = new ArrayList<>(linksWithMap().values());
        System.out.println(names); // prints names

        List<WebElement> listOfLinks = formyHomePage.links;
        for ( WebElement each : listOfLinks ) {
            if (each.getText().equals( names.get(1))) {
                each.click();
                Thread.sleep(2000);
                break;
            }
        }
    }



}
