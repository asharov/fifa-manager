package com.futurice.hackathon.fifamanager;

import java.util.ArrayList;

import android.content.Context;
import android.support.v4.widget.SimpleCursorAdapter.ViewBinder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;

public class PlayerAdapter extends ArrayAdapter<Player> {

	private MainActivity _context;
	private ArrayList<Player> _players;
	private Button _addPlayerButton;

	public PlayerAdapter(MainActivity context, ArrayList<Player> players) {
		super(context, 0);
		_context = context;
		_players = players;
	}

	@Override
	public int getCount() {
		return _players.size() + 1;
	}

	@Override
	public Player getItem(int position) {
		if (position == 0) {
			return null;
		} else {
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
			if (_addPlayerButton == null) {
				_addPlayerButton = new Button(_context);
				_addPlayerButton.setText("Add Player");
			}
			return _addPlayerButton;
		} else {
			Player player = _players.get(position - 1);
			TextView playerView = new TextView(_context);
			playerView.setText(player.name);
			return playerView;
		}
	}

}
