package com.example.application;

import static android.media.CamcorderProfile.get;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclercontactAdapter extends RecyclerView.Adapter<RecyclercontactAdapter.ViewHolder> {
    Context context;
    ArrayList<contactmodel> arrcontacts;
    RecyclercontactAdapter(Context context, ArrayList<contactmodel> arrcontacts)
    {
        this.context=context;
        this.arrcontacts=arrcontacts;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v=LayoutInflater.from(context).inflate(R.layout.contact_row,viewGroup,false);
        ViewHolder viewholder=new ViewHolder(v);
        return viewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
       viewHolder.imgv.setImageResource(arrcontacts.get(i).img);
       viewHolder.txtname.setText(arrcontacts.get(i).name);
        viewHolder.txtnumber.setText(arrcontacts.get(i).number);
    }

    @Override
    public int getItemCount() {
        return arrcontacts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView txtname,txtnumber;
        ImageView imgv;
        public ViewHolder(View itemview)
        {
            super(itemview);
            txtname=itemview.findViewById(R.id.textview1);
            txtnumber=itemview.findViewById(R.id.textview2);
            imgv=itemview.findViewById(R.id.imageView);


        }

    }
}
