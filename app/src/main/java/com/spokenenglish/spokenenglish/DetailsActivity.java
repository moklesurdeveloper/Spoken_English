package com.spokenenglish.spokenenglish;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.spokenenglish.spokenenglish.Class.DetailsInfo;
import com.spokenenglish.spokenenglish.Class.HomeInfo;
import com.spokenenglish.spokenenglish.adapter.DetailsAdapter;
import com.spokenenglish.spokenenglish.adapter.HomeAdapter;

import java.util.ArrayList;

public class DetailsActivity extends AppCompatActivity {

    private RecyclerView recyclerDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        recyclerDetails = findViewById(R.id.recyclerDetailsId);
        recyclerDetails.setLayoutManager(new GridLayoutManager(this,2));
        ArrayList<DetailsInfo> titleList = InputAllInfo();
        DetailsAdapter adapter = new DetailsAdapter(this,titleList);
        recyclerDetails.setAdapter(adapter);
    }

    private ArrayList<DetailsInfo> InputAllInfo()
    {

        ArrayList<DetailsInfo> list = new ArrayList<>();
        list.add(new DetailsInfo(1,"Love u ","valobase"));
        list.add(new DetailsInfo(1,"Love u ","valobase"));
        list.add(new DetailsInfo(1,"Love u ","valobase"));
        list.add(new DetailsInfo(1,"Love u ","valobase"));
        list.add(new DetailsInfo(1,"Love u ","valobase"));
        list.add(new DetailsInfo(1,"Love u ","valobase"));
        list.add(new DetailsInfo(1,"Love u ","valobase"));
        list.add(new DetailsInfo(1,"Love u ","valobase"));
        list.add(new DetailsInfo(1,"Love u ","valobase"));
        list.add(new DetailsInfo(1,"Love u ","valobase"));
        list.add(new DetailsInfo(1,"Love u ","valobase"));
        list.add(new DetailsInfo(1,"Love u ","valobase"));
        return list;
    }
}
