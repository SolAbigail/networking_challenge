package com.example.android.networkconnect.presenter.fragment.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android.networkconnect.databinding.ItemLocationBinding;
import com.example.android.networkconnect.domain.model.LocationModel;

import java.util.List;

public class LocationAdapter extends RecyclerView.Adapter<LocationAdapter.ItemViewHolder> {

    private final List<LocationModel> locationModelList;

    public LocationAdapter(List<LocationModel> locationModelList) {
        this.locationModelList = locationModelList;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ItemViewHolder(ItemLocationBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        holder.binding.setLocation(locationModelList.get(position));
    }

    @Override
    public int getItemCount() {
        return locationModelList.size();
    }

    static class ItemViewHolder extends RecyclerView.ViewHolder {

        public ItemLocationBinding binding;

        public ItemViewHolder(ItemLocationBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
