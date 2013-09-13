package com.futurice.hackathon.fifamanager;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;

public class PlayerAdapter extends BaseAdapter {

	private Context _context;

	public PlayerAdapter(Context context) {
		_context = context;
	}

	@Override
	public int getCount() {
		return 2;
	}

	@Override
	public Object getItem(int position) {
		return position == 0 ? "Boo!" : "Hoo!";
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		TextView textView = null;
		if (convertView == null) {
			textView = new TextView(_context);
			textView.setLayoutParams(new GridView.LayoutParams(120, 80));
		} else {
			textView = (TextView) convertView;
		}
		textView.setText((String) getItem(position));
		return textView;
	}

}
