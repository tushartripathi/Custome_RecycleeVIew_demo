package com.vubird.customelistview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import java.util.ArrayList;


import customAdapter.MyListCustomeAdapter;
import objectClass.Entry;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;
    private MyListCustomeAdapter recyclerViewCustomAdapter;
    private ArrayList<Entry> tasklist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tasklist = new ArrayList<>();
        recyclerView = findViewById(R.id.recycleViewContainer);

        final Entry entr1 = new Entry("Ross", 100,"qwew");
        Entry entr2 = new Entry("Joye",34234,"sdfds");
        Entry entr3 = new Entry("Chandler",3425 ,"xcv");
        Entry entr4 = new Entry("Rachel",1234 ,"tyry");
        Entry entr5 = new Entry("Monica",5341 ,"wert");
        Entry entr6 = new Entry("Pheobie", 1234,"cvxbvb");

        tasklist.add(entr1);
        tasklist.add(entr2);
        tasklist.add(entr3);
        tasklist.add(entr4);
        tasklist.add(entr5);
        tasklist.add(entr6);

        linearLayoutManager = new LinearLayoutManager(this);
        recyclerViewCustomAdapter = new MyListCustomeAdapter(tasklist);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(recyclerViewCustomAdapter);

    }


}