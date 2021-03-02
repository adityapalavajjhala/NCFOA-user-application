package com.example.ncfoatask8;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    //EditText id;
    EditText name;
    EditText description;
    EditText price;
    Button btn;
    EditText phoneNo;
    FirebaseDatabase rootNode;
    DatabaseReference reference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //id=findViewById(R.id.editTextTextPersonName);
        name=findViewById(R.id.editTextTextPersonName2);
        description=findViewById(R.id.editTextTextPersonName3);
        price=findViewById(R.id.editTextTextPersonName4);
        btn=findViewById(R.id.button);
        final Double p=890.0;
       //phoneNo=findViewById(R.id.editTextTextPersonName5);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rootNode=FirebaseDatabase.getInstance();
                System.out.println(rootNode.toString());
                reference=rootNode.getReference().child("9675125815");
                System.out.println(reference.toString());
                Items i=new Items(2,name.toString(),description.toString(), p);
                reference.push().setValue(i);
            }
        });
    }
}