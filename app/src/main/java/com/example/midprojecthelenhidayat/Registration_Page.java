package com.example.midprojecthelenhidayat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.midprojecthelenhidayat.databinding.RegistrationPageBinding;

public class Registration_Page extends AppCompatActivity  {

private RegistrationPageBinding binding;

    @Override
            protected void onCreate(Bundle savedInstanceState) {
        super.onCreate((savedInstanceState));
        binding = RegistrationPageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.registerbutton.setOnClickListener(new View.OnClickListener() {
            Intent intent = new Intent(Registration_Page.this, Login_Page.class);
            @Override
            public void onClick(View v) {

            }
        });
    }


    <intent> void startActivity(intent) {

    }

}




