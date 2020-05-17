package com.grcy.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NewMatcher {

    public boolean checkNameMatches(String name) {
        String regexp = "[A-Z][a-z]*";
        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();

    }

    public boolean checkNameFind(String name) {
        String regexp = "[A-Z][a-z]*";
        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(name);
        return matcher.find();
    }

    public boolean checkFullName(String fullName) {
        String regexp = "[A-Z][a-z]* [A-Z][a-z]*";
        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(fullName);
        return matcher.find();
    }

    public Matcher checkFullNameGroup(String fullName) {
        String regexp = "([A-Z][a-z]*) ([A-Z][a-z]*)";
        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(fullName);
        matcher.matches();
        return matcher;
    }



    public static void main(String[] args) {
        NewMatcher newMatcher = new NewMatcher();

        System.out.println("find Jan : " + newMatcher.checkNameFind("Jan"));
        System.out.println("match Jan : " + newMatcher.checkNameMatches("Jan"));
        System.out.println("===========");
        System.out.println("find JJan : " + newMatcher.checkNameFind("JJan"));
        System.out.println("match JJan : " + newMatcher.checkNameMatches("JJan"));
        System.out.println("===========");

        System.out.println("find Jan Kowalski: " + newMatcher.checkFullName("Jan Kowalski"));
        System.out.println("find Jan kowalski: " + newMatcher.checkFullName("Jan kowalski"));

        System.out.println("===========");
        if(newMatcher.checkFullNameGroup("Jan Kowalski").find()) {
            //System.out.println("Match group 0 : " + newMatcher.checkFullNameGroup("Jan Kowalski").group(0));
            System.out.println("Match group 0 : " + newMatcher.checkFullNameGroup("Jan Kowalski").group());
            System.out.println("Match group 0 : " + newMatcher.checkFullNameGroup("Jan Kowalski").group(2));
        }

        System.out.println("find Jan Kowalski: " + newMatcher.checkFullNameRange("Jan Kowalski"));
        System.out.println("find Jan kowalski: " + newMatcher.checkFullNameRange("Janek kowalski"));

        // {2}
        // {1,4}
    }

    public boolean checkFullNameRange(String fullName) {
        String regexp = "[A-Z][a-z]{2} [A-Z][a-z]*";
        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(fullName);
        return matcher.find();
    }


}
