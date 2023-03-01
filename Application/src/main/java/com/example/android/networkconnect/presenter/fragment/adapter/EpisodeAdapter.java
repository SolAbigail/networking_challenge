package com.example.android.networkconnect.presenter.fragment.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android.networkconnect.databinding.ItemEpisodeBinding;
import com.example.android.networkconnect.domain.model.EpisodeModel;

import java.util.List;

public class EpisodeAdapter extends RecyclerView.Adapter<EpisodeAdapter.ItemViewHolder> {

    private final List<EpisodeModel> episodeModelList;

    public EpisodeAdapter(List<EpisodeModel> episodeModelList) {
        this.episodeModelList = episodeModelList;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ItemViewHolder(ItemEpisodeBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        holder.binding.setEpisode(episodeModelList.get(position));
    }

    @Override
    public int getItemCount() {
        return episodeModelList.size();
    }

    static class ItemViewHolder extends RecyclerView.ViewHolder {

        public ItemEpisodeBinding binding;

        public ItemViewHolder(ItemEpisodeBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
