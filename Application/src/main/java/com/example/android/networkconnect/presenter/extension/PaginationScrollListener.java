package com.example.android.networkconnect.presenter.extension;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public abstract class PaginationScrollListener extends RecyclerView.OnScrollListener {

    private GridLayoutManager linearLayoutManager;

    public PaginationScrollListener(GridLayoutManager linearLayoutManager) {
        this.linearLayoutManager = linearLayoutManager;
    }

    @Override
    public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
        super.onScrollStateChanged(recyclerView, newState);
        int index = linearLayoutManager.findLastCompletelyVisibleItemPosition();
        boolean status = ViewExtension.isVisible(linearLayoutManager.findViewByPosition(index));

        if (status) {
            loadMoreItems();
        }
    }

    public abstract void loadMoreItems();
}
