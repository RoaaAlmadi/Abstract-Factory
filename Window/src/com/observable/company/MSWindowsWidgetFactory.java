package com.observable.company;

public class MSWindowsWidgetFactory extends AbstractWidgetFactory {

    public Window createWindow() {
        System.out.println("Microsoft Window created: ");
        return createWindow();
    }
}
