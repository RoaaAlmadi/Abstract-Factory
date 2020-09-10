package com.observable.company;

public class MacOSXWindowsFactory extends AbstractWidgetFactory {

    public Window createWindow() {
        System.out.println("Mac OSX Window created: ");
        return createWindow();
    }
}
