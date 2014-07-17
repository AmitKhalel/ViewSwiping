package UI;

import java.util.zip.Inflater;

import net.justanotherblog.swipeview.R;
import net.justanotherblog.swipeview.R.layout;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SecFragment extends Fragment {
	
	public static final String _text="text";
	
	public static final SecFragment newInstance(String text)
	{
		SecFragment f1 = new SecFragment();
		Bundle bundle = new Bundle();
		bundle.putString(_text, text);
		f1.setArguments(bundle);
		return f1;
	}
	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view= inflater.inflate(R.layout.sec_fragment,container,false);
		//String text = getArguments().getString(_text);
		
		
		return view;}

}
