package com.example.tarea02aal;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.tarea02aal.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {



    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Añadimos el binding
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        // Añadimos eventos
        binding.acceptButton.setOnClickListener((this::acceptPressed));
        // acceptButton.setOnClickListener(this::acceptPressed);
        
    }

    private void acceptPressed(View view) {
        binding.img.setVisibility(View.GONE);
        System.out.println("Button Pressed");
        Toast.makeText(this, "Button Pressed", Toast.LENGTH_SHORT).show();
    }
}