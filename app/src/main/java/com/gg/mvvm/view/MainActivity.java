package com.gg.mvvm.view;

import com.gg.mvvm.R;
import com.gg.mvvm.base.BaseMVVMActivity;
import com.gg.mvvm.databinding.ActivityMainBinding;
import com.gg.mvvm.viewmodle.MainViewModel;

public class MainActivity extends BaseMVVMActivity<ActivityMainBinding, MainViewModel> {

    MainViewModel mainViewModel;

    @Override
    protected void inject() {
        mainViewModel = new MainViewModel(mContext);
        mBinding.setViewModel(mainViewModel);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }


}
