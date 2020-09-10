package com.observable.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MSWindowsWidgetFactory msWindowsWidgetFactory = new MSWindowsWidgetFactory();
        Window w = msWindowsWidgetFactory.createWindow();

        MacOSXWidgetFactory macOSXWidgetFactory = new MacOSXWidgetFactory();
        Window m = macOSXWidgetFactory.createWindow();

        AbstractWidgetFactory f = new MacOSXWidgetFactory();
        Window w2 = f.createWindow();

    }
}
