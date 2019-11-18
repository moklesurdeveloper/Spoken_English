package com.spokenenglish.spokenenglish;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.spokenenglish.spokenenglish.Class.HomeInfo;
import com.spokenenglish.spokenenglish.adapter.HomeAdapter;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    private RecyclerView recyclerViewHome;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerViewHome = findViewById(R.id.recyclerHomeId);
        recyclerViewHome.setLayoutManager(new GridLayoutManager(this,2));
        ArrayList<HomeInfo> titleList = InputAllInfo();
        HomeAdapter adapter = new HomeAdapter(this,titleList);
        recyclerViewHome.setAdapter(adapter);

    }

    private ArrayList<HomeInfo> InputAllInfo()
    {
        ArrayList<HomeInfo> list = new ArrayList<>();


        list.add(new HomeInfo(0,"সাধারন কথাবার্তা"));
        list.add(new HomeInfo(1,"স্পোকেন ইংলিশ"));
        list.add(new HomeInfo(2,"স্পোকেন ইংলিশ"));
        list.add(new HomeInfo(3,"স্পোকেন ইংলিশ"));
        list.add(new HomeInfo(4,"স্পোকেন ইংলিশ"));
        list.add(new HomeInfo(5,"স্পোকেন ইংলিশ"));
        list.add(new HomeInfo(6,"স্পোকেন ইংলিশ"));
        list.add(new HomeInfo(7,"স্পোকেন ইংলিশ"));
        list.add(new HomeInfo(8,"স্পোকেন ইংলিশ"));
        list.add(new HomeInfo(9,"স্পোকেন ইংলিশ"));
        list.add(new HomeInfo(10,"স্পোকেন ইংলিশ"));
        list.add(new HomeInfo(11,"স্পোকেন ইংলিশ"));
        list.add(new HomeInfo(12,"স্পোকেন ইংলিশ"));
        list.add(new HomeInfo(13,"স্পোকেন ইংলিশ"));
        list.add(new HomeInfo(14,"স্পোকেন ইংলিশ"));
        list.add(new HomeInfo(15,"স্পোকেন ইংলিশ"));
        list.add(new HomeInfo(16,"স্পোকেন ইংলিশ"));
        list.add(new HomeInfo(17,"স্পোকেন ইংলিশ"));
        list.add(new HomeInfo(18,"স্পোকেন ইংলিশ"));
        list.add(new HomeInfo(20,"স্পোকেন ইংলিশ"));
        list.add(new HomeInfo(21,"স্পোকেন ইংলিশ"));
        list.add(new HomeInfo(22,"স্পোকেন ইংলিশ"));
        list.add(new HomeInfo(23,"স্পোকেন ইংলিশ"));
        list.add(new HomeInfo(24,"স্পোকেন ইংলিশ"));
        list.add(new HomeInfo(25,"স্পোকেন ইংলিশ"));
        list.add(new HomeInfo(26,"স্পোকেন ইংলিশ"));
        list.add(new HomeInfo(27,"স্পোকেন ইংলিশ"));
        list.add(new HomeInfo(28,"স্পোকেন ইংলিশ"));
        list.add(new HomeInfo(29,"স্পোকেন ইংলিশ"));
        list.add(new HomeInfo(30,"স্পোকেন ইংলিশ"));
        list.add(new HomeInfo(31,"স্পোকেন ইংলিশ"));
        list.add(new HomeInfo(32,"স্পোকেন ইংলিশ"));
        list.add(new HomeInfo(33,"স্পোকেন ইংলিশ"));
        list.add(new HomeInfo(34,"স্পোকেন ইংলিশ"));
        list.add(new HomeInfo(35,"স্পোকেন ইংলিশ"));
        list.add(new HomeInfo(36,"স্পোকেন ইংলিশ"));
        list.add(new HomeInfo(37,"স্পোকেন ইংলিশ"));
        list.add(new HomeInfo(38,"স্পোকেন ইংলিশ"));
        list.add(new HomeInfo(39,"স্পোকেন ইংলিশ"));
        list.add(new HomeInfo(40,"স্পোকেন ইংলিশ"));
        list.add(new HomeInfo(41,"স্পোকেন ইংলিশ"));
        list.add(new HomeInfo(12,"স্পোকেন ইংলিশ"));
        list.add(new HomeInfo(13,"স্পোকেন ইংলিশ"));
        list.add(new HomeInfo(44,"স্পোকেন ইংলিশ"));
        list.add(new HomeInfo(45,"স্পোকেন ইংলিশ"));
        list.add(new HomeInfo(46,"স্পোকেন ইংলিশ"));
        list.add(new HomeInfo(47,"স্পোকেন ইংলিশ"));
        list.add(new HomeInfo(48,"স্পোকেন ইংলিশ"));
        list.add(new HomeInfo(49,"স্পোকেন ইংলিশ"));
        list.add(new HomeInfo(50,"স্পোকেন ইংলিশ"));
        list.add(new HomeInfo(51,"স্পোকেন ইংলিশ"));
        list.add(new HomeInfo(52,"স্পোকেন ইংলিশ"));
        list.add(new HomeInfo(53,"স্পোকেন ইংলিশ"));
        list.add(new HomeInfo(54,"স্পোকেন ইংলিশ"));
        list.add(new HomeInfo(55,"স্পোকেন ইংলিশ"));


        return list;




    }
}
