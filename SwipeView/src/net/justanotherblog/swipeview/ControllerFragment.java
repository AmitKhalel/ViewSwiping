package net.justanotherblog.swipeview;

import java.util.List;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.View;
import android.widget.LinearLayout;

public class ControllerFragment extends FragmentPagerAdapter {

	
	List<Fragment> fragments ;
	Context context;
	
	
	public ControllerFragment(FragmentManager fm,List<Fragment> fragments) {
		super(fm);
		this.fragments=fragments;
	}

	@Override
	public Fragment getItem(int pos) {
		
		return fragments.get(pos);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return fragments.size();
	}
	
	
	

}
