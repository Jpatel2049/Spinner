package edu.temple.spinner;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ColorAdapter extends BaseAdapter {

    String[] colors, display;
    Context context;

    public ColorAdapter(Context context, String[] colors, String [] display) {
        this.context = context;
        this.colors = colors;
        this.display = display;
    }

    @Override
    public int getCount() {
        return colors.length;
    }

    @Override
    public Object getItem(int position) {
        return colors[position];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        TextView textView;

        if (view == null) {
            textView = new TextView(context);
        } else {
            textView = (TextView) view;
        }

        textView.setText(display[position]);
        textView.setBackgroundColor(Color.parseColor(colors[position]));

        return textView;
    }
}
