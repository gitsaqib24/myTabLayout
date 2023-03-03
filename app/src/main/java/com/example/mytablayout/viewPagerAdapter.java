package com.example.mytablayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class viewPagerAdapter extends FragmentPagerAdapter {

    public viewPagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int position) {
        if (position == 0)
        {
            return new AFragment();
        } else if (position == 1) {
            return new BFragment();
        } else  {
            return new CFragment();
        }
    }

    @Override
    public int getCount() {
        return 3; //no of tab and viewpager
    }


    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0)
        {
            return "Chatt";
        } else if (position == 1) {
            return "Status";
        } else  {
            return "Calls";
        }
    }
}
