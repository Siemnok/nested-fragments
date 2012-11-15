package com.burnside.digital.nestedfragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.burnside.digital.nestedfragments.R;

public class TextViewFragment extends Fragment {

    public static final String POSITION_KEY = "com.burnside.embeddedfragmenttest.POSITION";

    public static TextViewFragment newInstance(Bundle args) {
	TextViewFragment fragment = new TextViewFragment();
	fragment.setArguments(args);
	return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
	return inflater.inflate(R.layout.fragment_test, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
	super.onViewCreated(view, savedInstanceState);

	final int position = getArguments().getInt(POSITION_KEY);

	TextView textview = (TextView) view.findViewById(R.id.textViewPosition);
	textview.setText("Position number: " + position);
	textview.setOnClickListener(new OnClickListener() {

	    @Override
	    public void onClick(View v) {

		Toast.makeText(v.getContext(), "Clicked Position: " + position, Toast.LENGTH_LONG).show();
	    }
	});
    }

}
