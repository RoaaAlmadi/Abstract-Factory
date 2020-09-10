package com.observable.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MSWindowsWidgetFactory msWindowsWidgetFactory = new MSWindowsWidgetFactory();
        Window w = msWindowsWidgetFactory.createWindow();

        MacOSXWidgetFactory macOSXWidgetFactory = new MacOSXWidgetFactory();
        Window m = macOSXWidgetFactory.createWindow();

        AbstractWidgetFactory f1 = new MSWindowsWidgetFactory();
        AbstractWidgetFactory f2 = new MacOSXWidgetFactory();
        Window w1 = f1.createWindow();
        Window w2 = f2.createWindow();

    }
}
