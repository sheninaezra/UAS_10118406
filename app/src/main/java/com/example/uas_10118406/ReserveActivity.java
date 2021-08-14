package com.example.uas_10118406;

import androidx.appcompat.app.AppCompatActivity ;


import android.os.Bundle;
import android.widget.EditText;
import android.view.View;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ReserveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ActivityReserve);


}

    public void Click1(View view){
//instansiasi edittext
        EditText text1 = (EditText) findViewById(R.id.edit1);

//instansiasi database firebase
        FirebaseDatabase database = FirebaseDatabase.getInstance();

//Referensi database yang dituju
        DatabaseReference myRef = database.getReference("Username");

//memberi nilai pada referensi yang dituju
        myRef.setValue(text1.getText().toString()); }

}