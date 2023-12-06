package com.ryan.devoop3;

public class Test {

	public static void main(String[] args) {
        Developer dev1 = new Developer("Megan Patel", 26, 100);
        Developer dev2 = new Developer(26, 100);
        Developer dev3 = new Developer("Megan Testing", 26, 100);
        Developer dev4 = new Developer("Megan Test", 26, 100);

        BackEndDev dev5 = new BackEndDev();
        
        dev5.giveRaise(100000);
        
        dev5.displayStatus();
        
        
        
//        dev1.setSalary(dev1.getSalary()+ 50);
//
//        dev2.displayStatus();
//        dev1.addLanguage("Python");
//        dev1.addLanguage("Java");
//
//        System.out.println(Developer.getDevCount());
//        System.out.println(Developer.getTotalSalary());

	}

}
