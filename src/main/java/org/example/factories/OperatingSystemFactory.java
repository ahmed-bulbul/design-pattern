package org.example.factories;



public class OperatingSystemFactory {



    private OperatingSystemFactory() {
    }

    public static OperatingSystem getOperatingSystem(String name, String version, String architecture) {
        return switch (name) {
            case "Linux" -> new LinuxOperatingSystem(name, version, architecture);
            case "Windows" -> new WindowsOperatingSystem(name, version, architecture);
            default -> throw new IllegalArgumentException("Unknown operating system: " + name);
        };
    }

    public static void main(String[] args) {
        OperatingSystem linux = OperatingSystemFactory.getOperatingSystem("Linux", "5.4.0-42-generic", "x86_64");
        OperatingSystem windows = OperatingSystemFactory.getOperatingSystem("Windows", "10", "x86_64");

        System.out.println(linux.getName());
        System.out.println(windows.getName());

    }

}
