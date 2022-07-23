package com.example.homwworkcompany.moduls;

public class SessionData {
    private static SessionData instance;
    Company company;


    public static SessionData getInstance(){
        if (instance==null){
            instance = new SessionData();

        }
        return  instance;
    }


    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
