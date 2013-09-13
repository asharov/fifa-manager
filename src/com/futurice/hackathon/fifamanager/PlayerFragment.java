package com.futurice.hackathon.fifamanager;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

public class PlayerFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		GridView rootView = (GridView) inflater.inflate(R.layout.fragment_player, container, false);
		return rootView;
	}
}
