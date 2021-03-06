package com.example.exercisepam1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter {
    Context mContext;
    LayoutInflater inflater;
    private ArrayList<ClassNama> arrayList;
    @Override
    public int getCount() {
        return Home_Activity.classNamaArrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return Home_Activity.classNamaArrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        final Viewholder holder;

        if (view == null) {
            holder = new Viewholder();
            view = inflater.inflate(R.layout.item_listview,null);
            view.setTag(holder);
        }else {
            holder = (Viewholder) view.getTag();
        }
        holder.name.setText(Home_Activity.classNamaArrayList.get(i).getNama());

        return view;
    }
    public ListViewAdapter(Context context) {
        mContext = context;
        inflater = LayoutInflater.from(mContext);
        this.arrayList = new ArrayList<ClassNama>();
        this.arrayList.addAll(Home_Activity.classNamaArrayList);
    }
    public class Viewholder{
        TextView name;
    }
}
