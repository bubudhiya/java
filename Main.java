
Here’s a Java console application for the given asset management system using a human approach without in-built libraries (except core ones like ArrayList, Date, etc.) and with modularity. It follows simplicity and intuitive problem-solving.

The solution is split into different classes for better structure:
1. Employee: Manages the employee details.
2. Device: Handles the device details.
3. Software: Handles the software and licensing information.
4. Vendor: Represents the software vendor.
5. AssetManagementSystem: Main class for managing and reporting installations.
Java Code
Employee.java

java

import java.util.ArrayList;

public class Employee {
    private String employeeId;
    private String name;
    private ArrayList<Device> devices;

    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
        this.devices = new ArrayList<>();
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public void addDevice(Device device) {
        devices.add(device);
    }

    public ArrayList<Device> getDevices() {
        return devices;
    }
}

Device.java

java

import java.util.ArrayList;

public class Device {
    private String deviceId;
    private ArrayList<Software> installedSoftware;

    public Device(String deviceId) {
        this.deviceId = deviceId;
        this.installedSoftware = new ArrayList<>();
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void installSoftware(Software software) {
        installedSoftware.add(software);
    }

    public ArrayList<Software> getInstalledSoftware() {
        return installedSoftware;
    }
}

Software.java

java

import java.util.Date;

public class Software {
    private String softwareName;
    private Date licenseExpiry;
    private double price;
    private Vendor vendor;

    public Software(String softwareName, Date licenseExpiry, double price, Vendor vendor) {
        this.softwareName = softwareName;
        this.licenseExpiry = licenseExpiry;
        this.price = price;
        this.vendor = vendor;
    }

    public String getSoftwareName() {
        return softwareName;
    }

    public Date getLicenseExpiry() {
        return licenseExpiry;
    }

    public double getPrice() {
        return price;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public boolean isLicenseExpired(Date currentDate) {
        return currentDate.after(licenseExpiry);
    }
}

Vendor.java

java

import java.util.ArrayList;

public class Vendor {
    private String vendorName;
    private ArrayList<Software> softwareSold;

    public Vendor(String vendorName) {
        this.vendorName = vendorName;
        this.softwareSold = new ArrayList<>();
    }

    public String getVendorName() {
        return vendorName;
    }

    public void sellSoftware(Software software) {
        softwareSold.add(software);
    }

    public ArrayList<Software> getSoftwareSold() {
        return softwareSold;
    }
}
