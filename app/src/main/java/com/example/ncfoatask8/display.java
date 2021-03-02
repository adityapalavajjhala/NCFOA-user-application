package com.example.ncfoatask8;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class display extends AppCompatActivity {
    TextView t1;
    TextView t2;
    TextView t3;
    TextView t4;
    DatabaseReference dbref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        dbref= FirebaseDatabase.getInstance().getReference("Items").child("9687511463");
        dbref.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String s1=snapshot.child("id").getValue(String.class);
                //Setting the value for username details
                t1.setText(s1);
                String s2=snapshot.child("item").getValue(String.class);
                //Setting the value for username details
                t2.setText(s2);
                String s3=snapshot.child("description").getValue(String.class);
                //Setting the value for username details
                t3.setText(s3);
                String s4=snapshot.child("phoneNo").getValue(String.class);
                //Setting the value for username details
                t4.setText(s4);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                        System.out.println(error.toString());
            }
        });

    }
}