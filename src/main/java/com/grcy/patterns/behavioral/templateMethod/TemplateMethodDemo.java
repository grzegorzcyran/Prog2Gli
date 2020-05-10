package com.grcy.patterns.behavioral.templateMethod;

public class TemplateMethodDemo {
    public static void main(String[] args) {
        NewsProvider provider = new EmailNewsProvider();
        provider.setMessage("New Message");
        provider.provideNews();
    }
}
