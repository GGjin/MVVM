package com.gg.mvvm.viewmodle;

import android.app.Activity;
import android.databinding.ObservableField;

import com.gg.mvvm.base.BaseViewModel;
import com.gg.mvvm.bean.StudentBean;

/**
 * Created by GG on 2017/7/8.
 */

public class DataBindViewModel extends BaseViewModel {

    public final ObservableField<StudentBean> student = new ObservableField<>();

    public DataBindViewModel(Activity context) {
        super(context);
        student.set(new StudentBean("御坂美琴", 20, "超电磁炮"));
    }

    public void addCoin() {
//        Toast.makeText(mContext, "增加学生硬币", Toast.LENGTH_SHORT).show();
        student.get().coin.set(student.get().coin.get() + 1);
    }


}
