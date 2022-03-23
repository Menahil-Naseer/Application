package com.example.application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ArrayList<contactmodel> arrcontacts=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView= findViewById(R.id.recyclerContact);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        contactmodel model= new contactmodel(R.drawable.person,"Fatima","0345 80879076");
        arrcontacts.add(model);
        contactmodel model1= new contactmodel(R.drawable.person,"Maryam","0345 80879076");
        arrcontacts.add(model1);
        contactmodel model2= new contactmodel(R.drawable.person,"Ayesha","0345 80879076");
        arrcontacts.add(model2);
        contactmodel model3= new contactmodel(R.drawable.person,"Mashall","0345 80879076");
        arrcontacts.add(model3);
        contactmodel model4= new contactmodel(R.drawable.person,"Azka","0345 80879076");
        arrcontacts.add(model4);
        contactmodel model5= new contactmodel(R.drawable.person,"Ehtesham","0345 80879076");
        arrcontacts.add(model5);
        contactmodel model6= new contactmodel(R.drawable.person,"Ibtesam","0345 80879076");
        arrcontacts.add(model6);
        contactmodel model7= new contactmodel(R.drawable.person,"Naseer","0345 80879076");
        arrcontacts.add(model7);
        contactmodel model8= new contactmodel(R.drawable.person,"Hafsa","0345 80879076");
        arrcontacts.add(model8);
        contactmodel model9= new contactmodel(R.drawable.person,"Sonia","0345 80879076");
        arrcontacts.add(model9);
        contactmodel model10= new contactmodel(R.drawable.person,"Huda","0345 80879076");
        arrcontacts.add(model10);
        contactmodel model11= new contactmodel(R.drawable.person,"Rida","0345 80879076");
        arrcontacts.add(model11);

        RecyclercontactAdapter recycle=new RecyclercontactAdapter(this,arrcontacts);
        recyclerView.setAdapter(recycle);

    }
}