package com.demo.mdb.firebasedemo;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.GenericTypeIndicator;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {
    final ArrayList<Message> messages = new ArrayList<>();
    final ListAdapter adapter = new ListAdapter(getApplicationContext(), messages);
    DatabaseReference ref = FirebaseDatabase.getInstance().getReference("/messages");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        RecyclerView recyclerAdapter = (RecyclerView)findViewById(R.id.recyclerView);
        recyclerAdapter.setLayoutManager(new LinearLayoutManager(this));


        //Part 2: implement getList
        //Question 1: add Firebase Realtime Database to your project
        recyclerAdapter.setAdapter(adapter);
        //Question 2: initialize the messages based on what is in the database
        adapter.notifyDataSetChanged();

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), NewMessageActivity.class);
                startActivity(intent);
            }
        });

        //Question 3: add an event listener for the children of the ref, and make it such that
        // every time a message is added, it creates a new message, adds it to messages and updates
        // the UI

        //Next part in NewMessageActivity
    }
}
