package com.spokenenglish.spokenenglish.adapter;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Movie;
import android.preference.PreferenceManager;
import android.renderscript.Sampler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.spokenenglish.spokenenglish.Class.HomeInfo;
import com.spokenenglish.spokenenglish.DetailsActivity;
import com.spokenenglish.spokenenglish.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.HomeClass>
{

    private HashMap<Integer, Boolean> isChecked = new HashMap<>();
    Context context;
    ArrayList<HomeInfo> titleList;
    private List<String> product_list;




    public HomeAdapter(Context context, ArrayList<HomeInfo> titleList)
    {
        this.context = context;
        this.titleList = titleList;
    }

    @NonNull
    @Override
    public HomeClass onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_item_home,parent,false);

        HomeClass hClass = new HomeClass(view);
        return hClass;
    }
    @Override
    public void onBindViewHolder(@NonNull final HomeClass holder, final int i)
    {
        final HomeInfo getName = titleList.get(i);

            holder.tvTitle.setText(getName.getName());
            holder.tvPosiiton.setText(String.valueOf(getName.getPositon()));

            holder.linearLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v)
                {
                    Intent intent = new Intent(context, DetailsActivity.class);
                    intent.putExtra("position", String.valueOf(getName.getPositon()));
                    context.startActivity(intent);
                }
            });




            holder.cb_product.setChecked(false);


            SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
            final SharedPreferences.Editor editor = preferences.edit();

                holder.cb_product.setChecked(preferences.getBoolean(getName.getPositon()+"",false));


        holder.cb_product.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b)
                {
                    if(holder.cb_product.isChecked()) {
                        editor.putBoolean(getName.getPositon()+"", true);
                        editor.apply();
                    }
                    else
                     {
                        editor.putBoolean(getName.getPositon()+"", false);
                        editor.apply();
                    }
                }
            });






    }

    @Override
    public int getItemCount() {
        return titleList.size();
    }



    public class HomeClass extends RecyclerView.ViewHolder
    {

        private TextView tvTitle,tvPosiiton;
        CheckBox cb_product;
        private LinearLayout linearLayout;

        public HomeClass(@NonNull View itemView)
        {
            super(itemView);

            tvTitle = itemView.findViewById(R.id.titleHomeId);
            tvPosiiton = itemView.findViewById(R.id.positionHome);
            linearLayout = itemView.findViewById(R.id.layoutHomeId);

            cb_product = itemView.findViewById(R.id.checkBoxId);


            cb_product.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                    //save checked data in hash map on check change
                    isChecked.put(getAdapterPosition(), b);

                }
            });




        }
    }

}



