package com.example.ubay.likeeat;

import android.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.widget.Switch;

/**
 * Created by black on 3/24/2018.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {

    int mNoOfTabs;

    public PagerAdapter(FragmentManager fragmentManager,int NumberOfTabs)
    {
        super(fragmentManager);
        this.mNoOfTabs = NumberOfTabs;
    }
    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        switch(position)
        {
            case 0:
                Tab1 tab1 =new Tab1();
                return tab1;
            case 1:
                Tab2 tab2 = new Tab2();
                return tab2;
                default:
                    return null;
        }

    }

    @Override
    public int getCount() {
        return mNoOfTabs;
    }
}
