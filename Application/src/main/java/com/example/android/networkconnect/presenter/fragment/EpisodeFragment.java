package com.example.android.networkconnect.presenter.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.android.networkconnect.databinding.FragmentEpisodeBinding;
import com.example.android.networkconnect.domain.model.EpisodeModel;
import com.example.android.networkconnect.presenter.fragment.adapter.EpisodeAdapter;
import com.example.android.networkconnect.presenter.viewmodel.EpisodeViewModel;

import java.util.List;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class EpisodeFragment extends Fragment {

    private EpisodeViewModel viewModel;
    private FragmentEpisodeBinding binding;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = new ViewModelProvider(this).get(EpisodeViewModel.class);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentEpisodeBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        observable();
    }

    private void observable() {
        viewModel.getEpisodes();
        binding.progressBar.setVisibility(View.VISIBLE);
        viewModel.resultMutableLiveData.observe(getViewLifecycleOwner(), result -> {
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

    private void setUpRecycler(List<EpisodeModel> episodeModelList) {
        binding.rvContainer.setAdapter(new EpisodeAdapter(episodeModelList));
    }
}
