package com.example.android.networkconnect.presenter.fragment.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.android.networkconnect.databinding.ItemCharacterBinding;
import com.example.android.networkconnect.domain.model.CharacterModel;

import java.util.List;

public class CharacterAdapter extends RecyclerView.Adapter<CharacterAdapter.ItemViewHolder> {

    private final List<CharacterModel> characterModels;

    public CharacterAdapter(List<CharacterModel> characterModels) {
        this.characterModels = characterModels;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ItemViewHolder(ItemCharacterBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        holder.binding.setCharacter(characterModels.get(position));
        Glide.with(holder.itemView.getContext())
                .load(characterModels.get(position).getImage())
                .into(holder.binding.image);
    }

    public void setListCharacter(List<CharacterModel> characterModels) {
        this.characterModels.clear();
        this.characterModels.addAll(characterModels);
        notifyDataSetChanged();
    }

    public void setUpdateList(List<CharacterModel> characterModels) {
        this.characterModels.addAll(characterModels);
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return characterModels.size();
    }

    static class ItemViewHolder extends RecyclerView.ViewHolder {

        public ItemCharacterBinding binding;

        public ItemViewHolder(ItemCharacterBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
