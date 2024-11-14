package com.example.tarea02aal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;

import com.example.tarea02aal.databinding.CardviewBinding;

import java.util.ArrayList;

public class CharRecyclerViewAdapter extends RecyclerView.Adapter<CharViewHolder> {

    private final ArrayList<Character> characters;
    private final Context context;
    private Character currentChar;

    public CharRecyclerViewAdapter(ArrayList<Character> characters, Context context){
        this.characters = characters;
        this.context = context;
    }

    @NonNull
    //@Override
    public CharViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        CardviewBinding binding = CardviewBinding.inflate(
                LayoutInflater.from(parent.getContext()), parent, false
        );
        return new CharViewHolder(binding);
    }



    @Override
    public void onBindViewHolder(@NonNull CharViewHolder holder, int position){
        currentChar = this.characters.get(position);
        holder.bind(currentChar);

        holder.itemView.setOnClickListener(view -> itemClicked(currentChar));
    }

    //@Override
    public int getItemCount(){
        return characters.size();
    }

    public void itemClicked(Character currentChar){
        //((MainActivity) context).charClicked(currentChar);
    }

}
