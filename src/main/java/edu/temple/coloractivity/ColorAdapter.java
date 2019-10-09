package edu.temple.coloractivity;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ColorAdapter extends BaseAdapter {

    Context context;
    String [] colors;

    public ColorAdapter(Context context, String [] colors){
        this.context = context;
        this.colors = colors;

    }
    @Override
    public int getCount() {
        return colors.length;
    }

    @Override
    public Object getItem(int pos) {
        return colors[pos];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int pos, View view, ViewGroup viewGroup) {
        TextView textView = new TextView(context);
        String color = colors[pos];

        textView.setText(color);

        textView.setBackgroundColor(Color.parseColor(color));
        textView.setTextSize(33);
        textView.setPadding(10,10,0,10);

        return textView;
    }
}
