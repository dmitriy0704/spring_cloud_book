package com.optimagrowth.license.service;

import com.optimagrowth.license.model.License;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class LicenseService {

    //GET
    public License getLicense(String licenseId, String organizationId) {
        License license = new License();
        license.setId(new Random().nextInt(1000));
        license.setLicenseId(licenseId);
        license.setOrganizationId(organizationId);
        license.setDescription("Software product");
        license.setProductName("Ostock");
        license.setLicenseType("full");
        return license;
    }

    //POST
    public String createLicense(License license, String organizationId) {
        String responseMessage = null;
        if (license != null) {
            license.setOrganizationId(organizationId);
            responseMessage =
                    String.format(
                            "This is post and the object is: %s",
                            license.toString()
                    );
        }
        return responseMessage;
    }

    //PUT
    public String updateLicense(License license, String organizationId) {
        String responseMessage = null;
        if (license != null) {
            license.setOrganizationId(organizationId);
            responseMessage =
                    String.format(
                            "This is put and the object is: %s",
                            license.toString()
                    );
        }
        return responseMessage;
    }

    //DELETE
    public String deleteLicense(String licenseId, String organizationId) {
        String responseMessage = null;
        responseMessage =
                String.format(
                        "Deleting  license with id %S for the organization %s",
                        licenseId, organizationId
                );
        return responseMessage;
    }
}
