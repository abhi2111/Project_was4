package com.example.abhujeeth.project_was;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

int j;


    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public ImageView thumbnailone;
        public ImageView thumbnailtwo;

        public MyViewHolder(View view) {
            super(view);

            thumbnailone = (ImageView) view.findViewById(R.id.imageone);
            thumbnailone.setOnClickListener(this);
            thumbnailtwo = (ImageView) view.findViewById(R.id.imagetwo);
            thumbnailtwo.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {

            if (j == 1) {
                AppCompatActivity activity = (AppCompatActivity) v.getContext();
                Fragment myFragment = new FragmentFour();
                activity.getSupportFragmentManager().beginTransaction().replace(R.id.activity_main, myFragment).addToBackStack(null).commit();

            }
        }
    }


    private List<ModelClass> images;
    // Store the context for easy access
    private Context mContext;

    // Pass in the contact array into the constructor
    public MyAdapter(Context context, List<ModelClass> images,int j) {
       this.images = images;
        mContext = context;
        this.j=j;
    }


    // Easy access to the context object in the recyclerview
    private Context getContext() {
        return mContext;
    }



//creates no of viewholders=no of vh your page can show then just recycles

    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view;
        if(j==1) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardsec, viewGroup, false);//LI inflates and make real view objects and pass it to view
        }
        else
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardsec_one, viewGroup, false);

        return new MyViewHolder(view);//now MyViewHolder can just implement findviewbyid now since they are only implemented when the views are created.
    }

    public void onBindViewHolder(MyAdapter.MyViewHolder viewHolder, int i) {

        ModelClass obj=images.get(i);
        viewHolder.thumbnailone.setImageResource(obj.getPicIdone());

        viewHolder.thumbnailtwo.setImageResource(obj.getPicidtwo());
    }
    public int getItemCount() {
        return images.size();
    }


}
