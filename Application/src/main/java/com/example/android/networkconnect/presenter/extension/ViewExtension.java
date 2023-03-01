package com.example.android.networkconnect.presenter.extension;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;

public class ViewExtension {

    public static Boolean isVisible(View view) {
       try {
           if (view != null &&!view.isShown()) {
               return false;
           }
           Rect rect = new Rect();
           boolean isGlobalVisible = view.getGlobalVisibleRect(rect);
           int screenWidth = Resources.getSystem().getDisplayMetrics().widthPixels;
           int screenHeight = Resources.getSystem().getDisplayMetrics().heightPixels;
           Rect screen = new Rect(0, 0, screenWidth, screenHeight);
           return isGlobalVisible && Rect.intersects(rect, screen);
       }catch (Exception e) {
           return false;
       }
    }
}
