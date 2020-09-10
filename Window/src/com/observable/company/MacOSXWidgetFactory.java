package com.observable.company;

public class MacOSXWidgetFactory implements AbstractWidgetFactory {

    public Window createWindow() {
        Window w = new MacOSXWindow();
        w.setTitle("MacOSX Window");
        return w;
    }
}
