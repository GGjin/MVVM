package com.gg.mvvm.base;

import android.app.Activity;

/**
 * Created by GG on 2017/7/8.
 */

public class BaseViewModel {
    public Activity mContext;


    public BaseViewModel(Activity context) {
        mContext = context;
    }

}
