package org.example.factories;

public abstract class OperatingSystem {
    private String name;
    private String version;
    private String architecture;

    public OperatingSystem(String name, String version, String architecture) {
        this.name = name;
        this.version = version;
        this.architecture = architecture;
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    public String getArchitecture() {
        return architecture;
    }

    public abstract void changeDir(String dir);
    public abstract void removeDir(String dir);
}
