package com.example.testtextview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ItemAdapter extends BaseAdapter {
    private ArrayList<Item> itemArrayList=new ArrayList<Item>();
    private Activity activity;
    public ItemAdapter(Activity activity,ArrayList<Item> itemArrayList){
        this.activity=activity;
        this.itemArrayList=itemArrayList;
    }
    @Override
    public int getCount() {
        return itemArrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return itemArrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater=activity.getLayoutInflater();
        view = inflater.inflate(R.layout.mess,null);
        TextView tvname=(TextView)view.findViewById(R.id.tvname);
        TextView tvnoidung=(TextView)view.findViewById(R.id.tvnoidung);
        TextView tvavata=(TextView)view.findViewById(R.id.tvavata);
        tvname.setText(itemArrayList.get(i).getName());
        tvnoidung.setText(itemArrayList.get(i).getNoiDung());
        tvavata.setText(String.valueOf(itemArrayList.get(i).getName().charAt(0)));
        return view;
    }
}
