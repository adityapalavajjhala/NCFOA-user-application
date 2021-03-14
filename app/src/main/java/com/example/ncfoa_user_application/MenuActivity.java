package com.example.ncfoa_user_application;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

public class MenuActivity extends AppCompatActivity {

    RecyclerView recview;
    myadapter myadapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        recview = (RecyclerView)findViewById(R.id.recview);
        recview.setLayoutManager(new LinearLayoutManager(this));

        FirebaseRecyclerOptions<menumodel> options =
                new FirebaseRecyclerOptions.Builder<menumodel>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("menu"), menumodel.class)
                        .build();

        myadapter = new myadapter(options);

        recview.setAdapter(myadapter);
    }
    @Override
    protected void onStart() {
        super.onStart();
        myadapter.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        myadapter.stopListening();
    }
}