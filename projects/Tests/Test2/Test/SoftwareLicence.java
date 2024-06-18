package Tests.Test2.Test;

import java.util.Date;

public class SoftwareLicence {
    private String Name;
    private String Description;
    private double Price;
    private String LicenceKey;
    private Date ActivationDate;
    private String LicenseType;

    public SoftwareLicence(String name, String description, double price, String licenceKey, Date activationDate, String licenseType) {
        Name = name;
        Description = description;
        Price = price;
        LicenceKey = licenceKey;
        ActivationDate = activationDate;
        LicenseType = licenseType;
    }
}
