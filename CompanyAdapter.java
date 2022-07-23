package com.example.homwworkcompany;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.homwworkcompany.moduls.Company;
import com.example.homwworkcompany.moduls.SessionData;

import java.util.ArrayList;

public class CompanyAdapter extends RecyclerView.Adapter<CompanyAdapter.companyViewHolder> {

    ArrayList<Company> companiesList;
    Context context;

    public CompanyAdapter(ArrayList<Company> companiesList ) {
        this.companiesList = companiesList;

    }

    @NonNull
    @Override

    public companyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.company_row,parent,false);
      companyViewHolder vh  = new companyViewHolder(view);

        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull companyViewHolder holder, int position) {
        Company company = companiesList.get(position);
        holder.tvCompanyName.setText(company.getCompanyName());
        holder.tvCompanyYear.setText(company.getCompanyYear());
        holder.companyImage.setImageResource(company.getImageIndex());


        holder.companyImage.setOnClickListener(view -> {
//            SessionData sessionData =  SessionData.getInstance();
//            sessionData.setCompany(company);
            Intent intent = new Intent(context ,AboutActivity.class);
            intent.putExtra("COMPANY" , company);
            context.startActivity(intent);
        });

    }

    @Override
    public int getItemCount() {
        if (companiesList==null){
            return 0;
        }
        return companiesList.size();
    }

    static class companyViewHolder extends RecyclerView.ViewHolder{
        TextView tvCompanyName;
        TextView tvCompanyYear;
        ImageView companyImage;




        public companyViewHolder(@NonNull View itemView ) {
            super(itemView);

            findViews(itemView);

        }

        private void findViews(View itemView) {

            tvCompanyName = itemView.findViewById(R.id.tv_company_name);
            tvCompanyYear = itemView.findViewById(R.id.tv_company_year);
            companyImage = itemView.findViewById(R.id.company_image);

        }

    }
}
