package com.optimagrowth.license.repository;

import com.optimagrowth.license.model.License;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LicenseRepository extends CrudRepository<License, String> {
    List<License> findByOrganizationId(String organizationId);
    List<License> findByOrganizationIdAndLicenseId(String organizationId, String licenseId);
}
