package com.futurice.hackathon.fifamanager;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridView;

public class PlayerFragment extends Fragment implements View.OnClickListener {

	private GridView _rootView;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		_rootView = (GridView) inflater.inflate(R.layout.fragment_player, container, false);
		MainActivity activity = (MainActivity)getActivity();
		_rootView.setAdapter(new PlayerAdapter(activity, activity.players));
		Button addPlayerButton = (Button) _rootView.getAdapter().getView(0, null, null);
		addPlayerButton.setOnClickListener(this);
		return _rootView;
	}
	
	@Override
	public void onClick(View v) {
		// Assume button was "Add Player" button
		Player newPlayer = new Player("Jaakko");
		((MainActivity)this.getActivity()).addPlayer(newPlayer);
		((PlayerAdapter)_rootView.getAdapter()).notifyDataSetChanged();
	}
}
