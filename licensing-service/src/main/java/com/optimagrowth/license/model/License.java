package com.optimagrowth.license.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@Entity
@Table(name = "licenses")
public class License {

    @Id
    @Column(name = "license_Id", nullable = false)
    private String licenseId;

    private String description;

    @Column(name = "organization_Id", nullable = false)
    private String organizationId;

    @Column(name = "product_Name", nullable = false)
    private String productName;

    @Column(name = "license_Type", nullable = false)
    private String licenseType;

    @Column(name = "comment")
    private String comment;

    public License withComment(String comment) {
        this.setComment(comment);
        return this;
    }
}
