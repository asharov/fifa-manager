package com.futurice.hackathon.fifamanager;

import java.util.ArrayList;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;

public class PlayerAdapter extends BaseAdapter {

	private Context _context;
	private ArrayList<Player> _players;

	public PlayerAdapter(Context context, ArrayList<Player> players) {
		_context = context;
		_players = players;
	}

	@Override
	public int getCount() {
		return _players.size() + 1;
	}

	@Override
	public Object getItem(int position) {
		if (position == 0) {
			return null;
		}
		else {
			return _players.get(position - 1);
		}
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if (position == 0) {
			Button button = new Button(_context);
			button.setText("Add Player");
			return button;
		}
		else {
			Player player = _players.get(position - 1);
			TextView playerView = new TextView(_context);
			playerView.setText(player.name);
			return playerView;
		}
	}

}
