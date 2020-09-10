package com.observable.company;

public class MSWindowsWidgetFactory implements AbstractWidgetFactory {

    public Window createWindow() {
        Window w = new MSWindow();
        w.setTitle("MS Window");
        return w;
    }
}
