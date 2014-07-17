package UI;

import java.util.zip.Inflater;

import net.justanotherblog.swipeview.R;
import net.justanotherblog.swipeview.R.layout;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Firstfragment extends Fragment {
	
	public static final String _text="text";
	
	public static final Firstfragment newInstance(String text)
	{
		Firstfragment f1 = new Firstfragment();
		Bundle bundle = new Bundle();
		bundle.putString(_text, text);
		f1.setArguments(bundle);
		return f1;
	}
	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view= inflater.inflate(R.layout.myfragmentlayout,container,false);
		//String text = getArguments().getString(_text);
		
		
		return view;}

}
