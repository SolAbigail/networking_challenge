package com.example.android.networkconnect.databinding;
import com.example.android.networkconnect.R;
import com.example.android.networkconnect.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemEpisodeBindingImpl extends ItemEpisodeBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tvAirDate, 4);
        sViewsWithIds.put(R.id.cardView, 5);
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    @NonNull
    private final android.widget.TextView mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemEpisodeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ItemEpisodeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[5]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[3]
            );
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.tvName.setTag(null);
        this.tvType.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.episode == variableId) {
            setEpisode((com.example.android.networkconnect.domain.model.EpisodeModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setEpisode(@Nullable com.example.android.networkconnect.domain.model.EpisodeModel Episode) {
        this.mEpisode = Episode;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.episode);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String episodeAirDate = null;
        java.lang.String episodeName = null;
        com.example.android.networkconnect.domain.model.EpisodeModel episode = mEpisode;
        java.lang.String episodeEpisode = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (episode != null) {
                    // read episode.airDate
                    episodeAirDate = episode.getAirDate();
                    // read episode.name
                    episodeName = episode.getName();
                    // read episode.episode
                    episodeEpisode = episode.getEpisode();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, episodeAirDate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvName, episodeName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvType, episodeEpisode);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): episode
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}