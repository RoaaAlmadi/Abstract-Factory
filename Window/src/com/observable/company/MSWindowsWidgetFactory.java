package com.observable.company;

public class MSWindowsWidgetFactory implements AbstractWidgetFactory {

    public Window createWindow() {
        return new MSWindow();
    }
}
