package com.example.task3_note;

import android.content.Context;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;



public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>{
    private  int numberItem;

    private ArrayList<NoteItem> note = new ArrayList<NoteItem>();
    private Context patent;
    private ViewInterface.MainActivity mainActivity;

    public Adapter(int numbeOfItem, Context parent){
        numberItem = numbeOfItem;
        this.patent = parent;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layotIdForListItem = R.layout.item;
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(layotIdForListItem, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        viewHolder.body.setText("body text text text");
        return  viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
    holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return numberItem;
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        TextView title;
        TextView body;

        public ViewHolder(View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.title);
            body = itemView.findViewById(R.id.body);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                   mainActivity.info_note();
                }

            });
        }
        void bind(int listIndex){
            title.setText("title text");
        }

    }
}
