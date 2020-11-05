package com.example.testtextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Item> itemArrayList=new ArrayList<Item>();
        Item item=new Item("Mai Ngọc Tùng Sơn","đây là tin nhắn của mai ngọc tùng sơn");
        Item item1=new Item("Nguyễn Quang Hải","hải quay xe");
        Item item2=new Item("Huỳnh Anh","yêu anh hải quanh xe với 1 vài anh khác");
        Item item3=new Item("nhật lệ","người yêu cũ của hải quay xe");
        itemArrayList.add(item);
        itemArrayList.add(item2);
        itemArrayList.add(item3);
        itemArrayList.add(item1);

        listView=findViewById(R.id.listviewitem);
        ItemAdapter itemAdapter=new ItemAdapter(this,itemArrayList);
        listView.setAdapter(itemAdapter);
    }
}