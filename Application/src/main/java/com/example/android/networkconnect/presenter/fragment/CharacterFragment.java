package com.example.android.networkconnect.presenter.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.android.networkconnect.databinding.FragmentCharacterBinding;
import com.example.android.networkconnect.domain.model.CharacterModel;
import com.example.android.networkconnect.presenter.extension.PaginationScrollListener;
import com.example.android.networkconnect.presenter.extension.SpaceDecoration;
import com.example.android.networkconnect.presenter.extension.ViewExtension;
import com.example.android.networkconnect.presenter.fragment.adapter.CharacterAdapter;
import com.example.android.networkconnect.presenter.viewmodel.CharacterViewModel;

import java.util.ArrayList;
import java.util.List;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class CharacterFragment extends Fragment{

    private FragmentCharacterBinding binding;
    private CharacterViewModel characterViewModel;
    private CharacterAdapter adapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        characterViewModel = new ViewModelProvider(this).get(CharacterViewModel.class);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentCharacterBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setUpRecycler();
        observable();
    }

    private void observable() {
        getCharacter();
        characterViewModel.resultLiveData.observe(getViewLifecycleOwner(), result -> {
            switch (result.status) {
                case SUCCESS:
                    setValueList(result.getData());
                    binding.progressBarAditional.setVisibility(View.GONE);
                    binding.progressBar.setVisibility(View.GONE);
                    break;
                case ERROR:
                    binding.progressBarAditional.setVisibility(View.GONE);
                    binding.progressBar.setVisibility(View.GONE);
                    break;
            }
        });
    }

    public void getCharacter() {
        if (binding.progressBar.getVisibility() == View.VISIBLE || binding.progressBarAditional.getVisibility() == View.VISIBLE) return;
        characterViewModel.getCharacters();
        if (characterViewModel.page.getValue() > 1) {
            binding.progressBarAditional.setVisibility(View.VISIBLE);
        } else binding.progressBar.setVisibility(View.VISIBLE);
    }

    private void setUpRecycler() {
        adapter = new CharacterAdapter(new ArrayList<>());
        binding.rvContainer.addItemDecoration(new SpaceDecoration(requireContext(), 10));
        binding.rvContainer.setAdapter(adapter);

    }

    private void setValueList(List<CharacterModel> characterModels) {
        if (characterViewModel.page.getValue()!=null && characterViewModel.page.getValue() == 1) {
            adapter.setListCharacter(characterModels);
        } else if (characterViewModel.page.getValue()!=null && characterViewModel.page.getValue() > 1) {
            adapter.setUpdateList(characterModels);
        }
        binding.rvContainer.addOnScrollListener(new PaginationScrollListener((GridLayoutManager) binding.rvContainer.getLayoutManager()) {
            @Override
            public void loadMoreItems() {
                characterViewModel.setNumberPage();
                getCharacter();
            }
        });
    }
}
