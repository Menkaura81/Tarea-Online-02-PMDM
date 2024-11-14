package com.example.tarea02aal;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.example.tarea02aal.databinding.ActivityMainBinding;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private ArrayList<Character> characters;
    private CharRecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Añadimos el binding
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        characters = new ArrayList<>(Arrays.asList (
            new Character(R.drawable.mario, "Mario", getString(R.string.mario_description), getString(R.string.mario_skills)),
            new Character(R.drawable.luigi, "Luigi", getString(R.string.luigi_description), getString(R.string.luigi_skills)),
            new Character(R.drawable.peach, "Peach", getString(R.string.peach_description), getString(R.string.peach_skills)),
            new Character(R.drawable.toad, "Toad", getString(R.string.toad_description), getString(R.string.toad_skills)),
            new Character(R.drawable.lakitu, "Lakitu", getString(R.string.lakitu_description), getString(R.string.lakitu_skills)),
            new Character(R.drawable.dkong, "Donkey Kong", getString(R.string.dk_description), getString(R.string.dk_skills)),
            new Character(R.drawable.bowser, "Bowser", getString(R.string.bowser_description), getString(R.string.bowser_skills)),
            new Character(R.drawable.yoshi, "Yoshi", getString(R.string.yoshi_description), getString(R.string.yoshi_skills)),
            new Character(R.drawable.planta, "Planta Piraña", getString(R.string.planta_description), getString(R.string.planta_skills))
        ));

        adapter = new CharRecyclerViewAdapter(characters, this);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        binding.recyclerView.setAdapter(adapter);
        
    }

}