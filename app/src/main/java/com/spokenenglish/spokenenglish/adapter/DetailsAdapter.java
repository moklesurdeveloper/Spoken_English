package com.spokenenglish.spokenenglish.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.spokenenglish.spokenenglish.Class.DetailsInfo;
import com.spokenenglish.spokenenglish.DetailsActivity;
import com.spokenenglish.spokenenglish.R;

import java.util.ArrayList;

public class DetailsAdapter extends RecyclerView.Adapter<DetailsAdapter.DetailsClass>
{

    ArrayList<DetailsInfo> titleList;
    Context context;

    public DetailsAdapter(Context context, ArrayList<DetailsInfo> titleList)
    {
            this.context = context;
            this.titleList = titleList;
    }

    @NonNull
    @Override
    public DetailsClass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recycler_item_details,parent,false);

        DetailsClass hClass = new DetailsClass(view);
        return hClass;
    }

    @Override
    public void onBindViewHolder(@NonNull DetailsClass holder, int position)
    {

        DetailsInfo getPosition = titleList.get(position);
        holder.english.setText(getPosition.getEnglishText());
        holder.banlga.setText(getPosition.getBanglaText());


    }

    @Override
    public int getItemCount() {
        return titleList.size();
    }

    public class DetailsClass extends RecyclerView.ViewHolder
    {

        private TextView english, banlga;

        public DetailsClass(@NonNull View itemView)
        {
            super(itemView);

            english = itemView.findViewById(R.id.tvEnglish);
            banlga = itemView.findViewById(R.id.tvBangla);
        }
    }
}
