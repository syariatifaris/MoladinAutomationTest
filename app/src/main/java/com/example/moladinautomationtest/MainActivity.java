package com.example.moladinautomationtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView countryList;
    String countries [] = {"Indonesia", "Singapore", "Myanmar", "Thailand", "Brunei", "Malaysia"};
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.countryList = this.findViewById(R.id.simpleListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.country_listview, R.id.textView, this.countries);
        this.countryList.setAdapter(arrayAdapter);
    }
}