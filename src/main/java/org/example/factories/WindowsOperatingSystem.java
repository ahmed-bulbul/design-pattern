package org.example.factories;

public class WindowsOperatingSystem extends OperatingSystem {
    public WindowsOperatingSystem(String name, String version, String architecture) {
        super(name, version, architecture);
    }

    @Override
    public void changeDir(String dir) {

    }

    @Override
    public void removeDir(String dir) {

    }
}

