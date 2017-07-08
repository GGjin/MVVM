package com.gg.mvvm.base;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by GG on 2017/7/8.
 */

public abstract class BaseMVVMActivity<T extends ViewDataBinding, D extends BaseViewModel> extends AppCompatActivity {

    protected T mBinding;
    protected D mViewModel;
    public Activity mContext;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, getLayoutId());
        mContext=this;
        inject();
    }

    /**
     * 初始化DataBinding
     */
    protected abstract void inject();

    /**
     * 传入布局文件
     *
     * @return 基类会自动生成对应的DataBinding供导出类使用
     */
    protected abstract int getLayoutId();

    @Override
    protected void onDestroy() {
        if (mBinding != null)
            mBinding.unbind();

        super.onDestroy();
    }
}
