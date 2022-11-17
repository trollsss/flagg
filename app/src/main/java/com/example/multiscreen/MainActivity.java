package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends ListActivity {

    String[] things = {"Аргентина", "Бразилия", "Колумбия", "Уругвай","Чили"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ArrayAdapter<String> adapter;
        adapter = new ArrayAdapter<String>( this, android.R.layout.simple_list_item_1, things);
        setListAdapter(adapter);

        AdapterView.OnItemClickListener ItemListener = new AdapterView.OnItemClickListener(){
            @Override
            public  void onItemClick(AdapterView<?> parent, View view, int position, long id){
              switch (position){
                  case 1:
                        Intent intent1 = new Intent(MainActivity.this, Brass.class);
                        startActivity(intent1);
                       break;
                  case 2:
                      Intent intent2 = new Intent(MainActivity.this, Argen.class);
                      startActivity(intent2);

                      break;
                  case 3:
                      Intent intent3 = new Intent(MainActivity.this, Jili.class);
                      startActivity(intent3);

                      break;
                  case 4:
                      Intent intent4 = new Intent(MainActivity.this, Kolum.class);
                      startActivity(intent4);

                      break;
                  case 5:
                      Intent intent5 = new Intent(MainActivity.this, Urugvai.class);
                      startActivity(intent5);

                      break;

              }
                Toast.makeText(getApplicationContext(), "Вы Выбрали"
                        + parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();
            }
        };
        getListView().setOnItemClickListener(ItemListener);
    }
}