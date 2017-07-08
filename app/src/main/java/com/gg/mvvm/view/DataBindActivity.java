package com.gg.mvvm.view;

import com.gg.mvvm.R;
import com.gg.mvvm.base.BaseMVVMActivity;
import com.gg.mvvm.databinding.ActivityDataBindBinding;
import com.gg.mvvm.viewmodle.DataBindViewModel;

public class DataBindActivity extends BaseMVVMActivity<ActivityDataBindBinding, DataBindViewModel> {


    @Override
    protected void inject() {
        mViewModel = new DataBindViewModel(mContext);
        mBinding.setViewModel(mViewModel);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_data_bind;
    }
}
