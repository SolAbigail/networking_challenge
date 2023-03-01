package com.example.android.networkconnect.presenter.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.android.networkconnect.databinding.FragmentLocationBinding;
import com.example.android.networkconnect.domain.model.LocationModel;
import com.example.android.networkconnect.presenter.fragment.adapter.LocationAdapter;
import com.example.android.networkconnect.presenter.viewmodel.LocationViewModel;

import java.util.List;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class LocationFragment extends Fragment {

    private FragmentLocationBinding binding;
    private LocationViewModel viewModel;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = new ViewModelProvider(this).get(LocationViewModel.class);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentLocationBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        observable();
    }

    private void observable() {
        viewModel.getLocations();
        binding.progressBar.setVisibility(View.VISIBLE);
        viewModel.mutableLiveData.observe(getViewLifecycleOwner(), result -> {
            switch (result.status) {
                case SUCCESS:
                    setUpRecycler(result.getData());
                    binding.progressBar.setVisibility(View.GONE);
                    break;
                case ERROR:
                    binding.progressBar.setVisibility(View.GONE);
                    break;
            }
        });
    }

    private void setUpRecycler(List<LocationModel> locationModels) {
        binding.rvContainer.setAdapter(new LocationAdapter(locationModels));
    }
}
