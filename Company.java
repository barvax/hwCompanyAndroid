package com.example.homwworkcompany.moduls;

public class Company {
    String companyName;
    String companyYear;
    int imageIndex;

    public Company(String companyName, String companyYear, int imageIndex) {
        this.companyName = companyName;
        this.companyYear = companyYear;
        this.imageIndex = imageIndex;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyYear() {
        return companyYear;
    }

    public void setCompanyYear(String companyYear) {
        this.companyYear = companyYear;
    }

    public int getImageIndex() {
        return imageIndex;
    }

    public void setImageIndex(int imageIndex) {
        this.imageIndex = imageIndex;
    }
}
