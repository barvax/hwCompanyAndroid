package com.example.homwworkcompany;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.homwworkcompany.moduls.Company;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    ArrayList<Company> companies;
    String[] companyName = {"Fender","ESP","Gibson","Schecter","PRS","Music Man","ibanez","Rickenbacker","Godin","Friedman","Gretsch"};
    String[] companyYear = {"1946","1975","1902","1976","1985","1974","1957","1931","1972","1987","1883"};
    int [] images = {
             R.drawable.fender,
             R.drawable.esp,
             R.drawable.gibson,
            R.drawable.schecter,
            R.drawable.prs,
            R.drawable.music_man,
            R.drawable.ibanez,
            R.drawable.rickenbacker,
            R.drawable.godin,
            R.drawable.friedman,
            R.drawable.gretsch

     };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();
        getCompanies();
        CompanyAdapter adapter = new CompanyAdapter(companies);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    private void getCompanies() {
        companies = new ArrayList<>();

        for (int i = 0 ,k = 0; i < companyName.length*2; i++ ,k++) {

            if(i==companyName.length){
                k=0;
            }
            Company company = new Company(companyName[k],companyYear[k],images[k]);
            companies.add(company);


        }
    }

    private void findViews() {
        recyclerView = findViewById(R.id.recycle_company);


    }

}