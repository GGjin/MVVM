package com.gg.mvvm.viewmodle;

import android.app.Activity;
import android.content.Intent;
import android.widget.Toast;

import com.gg.mvvm.base.BaseViewModel;
import com.gg.mvvm.view.DataBindActivity;

/**
 * Created by GG on 2017/7/8.
 */

public class MainViewModel extends BaseViewModel {

    public String dataStr="数据双向绑定";

    public MainViewModel(Activity context) {
        super(context);
    }


    public void startDataBindActivity() {
        Toast.makeText(mContext, "跳转到数据双向绑定的页面", Toast.LENGTH_SHORT).show();
        mContext.startActivity(new Intent(mContext, DataBindActivity.class));
    }
}
