package com.gg.mvvm.bean;

import android.databinding.ObservableField;

import com.gg.mvvm.base.BaseBean;

/**
 * Created by GG on 2017/7/8.
 */

public class StudentBean extends BaseBean {


    public StudentBean(String name, int coin, String nick) {
        this.name.set(name);
        this.coin.set(coin);
        this.nick.set(nick);
    }

    public ObservableField<String> name = new ObservableField<>();

    public ObservableField<Integer> coin = new ObservableField<>();

    public ObservableField<String> nick = new ObservableField<>();

//    public ObservableField<String> getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name.set(name);
//    }
//
//    public int getCoin() {
//        return coin.get();
//    }
//
//    public void setCoin(int coin) {
//        this.coin.set(coin);
//    }
//
//    public String getNick() {
//        return nick.get();
//    }
//
//    public void setNick(String nick) {
//        this.nick.set(nick);
//    }

}
