package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    String s1[], s2[];
    int images[] = {
            R.drawable.baseline_10k_24,
            R.drawable.baseline_3k_plus_24,
            R.drawable.baseline_4k_plus_24,
            R.drawable.baseline_5k_24,
            R.drawable.baseline_adjust_24,
            R.drawable.baseline_arrow_circle_left_24,
            R.drawable.baseline_battery_unknown_24,
            R.drawable.baseline_build_24,
            R.drawable.baseline_call_made_24,
            R.drawable.baseline_call_to_action_24,
            R.drawable.baseline_cases_24,
            R.drawable.baseline_cast_for_education_24,
            R.drawable.baseline_cell_wifi_24,
            R.drawable.baseline_check_24,
            R.drawable.baseline_checklist_rtl_24,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_foreground
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s1 =getResources().getStringArray(R.array.songs);
        s2 =getResources().getStringArray(R.array.writers);
        recyclerView = findViewById(R.id.recyclerview);
        MyAdapter myAdapter;
        myAdapter = new MyAdapter(this,s1,s2,images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}