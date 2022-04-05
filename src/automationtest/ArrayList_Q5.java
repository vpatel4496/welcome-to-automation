package automationtest;

import java.util.ArrayList;

public class ArrayList_Q5 {
    public static void main(String[] args){
        ArrayList<String>valueList = new ArrayList<>();
        valueList.add ("Scrum");
        valueList.add ("Java");
        valueList.add ("Jira");
        valueList.add ("Selenium");
        valueList.add ("Cucumber");
        valueList.add ("Postman");
        valueList.add ("Rest Assured");
        for (String testingTool:valueList);
        System.out.println(valueList);
    }
}
