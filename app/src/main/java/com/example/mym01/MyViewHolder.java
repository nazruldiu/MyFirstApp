package com.example.mym01;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    TextView textView;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        textView = (TextView)itemView.findViewById(R.id.cardTextView);
    }

}
