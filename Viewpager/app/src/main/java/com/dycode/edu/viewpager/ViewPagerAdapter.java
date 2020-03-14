package com.dycode.edu.viewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new Produk();
        } else if (position == 1) {
            return new Transaksi();
        } else if (position == 2){
            return new Akun();
        }
        throw new IllegalStateException("Position not valid");
    }

    @Override
    public int getCount() {
        return 3;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "First";
        } else if (position == 1) {
            return "Second";
        } else if (position == 2){
            return "Third";
        }
        throw new IllegalStateException("Position not valid");
    }

}
