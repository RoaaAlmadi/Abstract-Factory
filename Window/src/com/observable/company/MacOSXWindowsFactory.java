package com.observable.company;

public class MacOSXWindowsFactory implements AbstractWidgetFactory {

    public Window createWindow() {
        return new MacOSXWindow();
    }
}
