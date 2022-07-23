package com.example.homwworkcompany;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.homwworkcompany.moduls.Company;
import com.example.homwworkcompany.moduls.SessionData;

public class AboutActivity extends AppCompatActivity {
    ScrollView companyText;
    TextView aboutText;
    TextView companyYear;
    ImageView companyImage;
    Button btnBack;
    String lorem  = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus egestas, dui id blandit viverra, libero risus lacinia nulla, ut aliquet lectus neque consectetur orci. Donec hendrerit a odio tincidunt elementum. Integer interdum purus vel blandit elementum. Praesent quis ornare nisi. Duis in viverra est, sit amet mollis sem. Pellentesque nec metus eu lorem efficitur iaculis. Nullam mollis vel leo id porttitor. Ut interdum egestas ante, nec efficitur nisi faucibus id. Phasellus eros ipsum, ullamcorper non lectus varius, blandit blandit quam. Aliquam et malesuada purus. Mauris at ultrices velit. Aliquam at blandit velit, ut aliquet mi. Donec pellentesque, dolor quis vehicula fringilla, enim eros venenatis orci, at gravida velit odio at velit. Curabitur sit amet dolor ut sem interdum sodales. Aenean ligula arcu, molestie tincidunt neque id, elementum scelerisque erat. Nam mollis nunc eu luctus sollicitudin.\n" +
            "\n" +
            "Nunc malesuada metus vitae mi iaculis, at venenatis augue semper. Fusce non elit faucibus, ornare dolor et, varius tortor. Quisque ultricies, turpis vel cursus consectetur, mi lacus venenatis sapien, eu feugiat urna massa ac erat. In eget tincidunt tellus. Vivamus elementum, risus quis posuere gravida, mauris turpis vehicula sem, at dapibus eros purus ut massa. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Sed non blandit tellus. Cras tempus quis diam eu auctor. Suspendisse sed mauris ipsum. Vestibulum mauris augue, mattis sit amet enim eu, lacinia volutpat ipsum. Nam in nisi tellus. Vivamus pulvinar ultrices ultricies. Sed mauris lectus, fringilla sit amet vestibulum eu, mollis non arcu. Mauris in egestas tortor. Aenean rutrum gravida libero, in eleifend erat porta efficitur. Mauris euismod risus in nibh dapibus maximus.";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        findViews();
        setViews();
        listeners();

    }

    private void listeners() {
        btnBack.setOnClickListener(view -> {
            finish();
        });
    }

    private void setViews() {
        SessionData sessionData =  SessionData.getInstance();
        Company company = sessionData.getCompany();
        companyImage.setImageResource(company.getImageIndex());
        companyYear.setText(company.getCompanyYear());
        aboutText.setText(lorem);

    }

    private void findViews() {
        companyImage = findViewById(R.id.image_about);
        companyYear = findViewById(R.id.tv_about_year);
        companyText = findViewById(R.id.sv);
        aboutText = findViewById(R.id.tv_about_text);
        btnBack = findViewById(R.id.btn_back);



    }
}