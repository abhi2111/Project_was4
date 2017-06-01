package com.example.abhujeeth.project_was;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class FragmentSecond extends Fragment {

    List<ModelClass> cards;
    RecyclerView recyclerView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view= inflater.inflate(R.layout.fragment_fragment_second, container, false);
        recyclerView = (RecyclerView)view.findViewById(R.id.recycler_view_one);
        recyclerView.setHasFixedSize(true);
        recyclerView.setNestedScrollingEnabled(false);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);



        return view;


    }

    @Override
    public void onStart() {
        super.onStart();
        cards=new ArrayList<>();
        ModelClass obj=new ModelClass(R.drawable.dukan_one,R.drawable.dukan_two);
        cards.add(obj);
        ModelClass obj1=new ModelClass(R.drawable.dukan_one,R.drawable.dukan_two);
        cards.add(obj1);
        ModelClass obj2=new ModelClass(R.drawable.dukan_one,R.drawable.dukan_two);
        cards.add(obj2);
        ModelClass obj3=new ModelClass(R.drawable.dukan_one,R.drawable.dukan_two);
        cards.add(obj3);
        ModelClass obj4=new ModelClass(R.drawable.dukan_one,R.drawable.dukan_two);
        cards.add(obj4);

        RecyclerView.Adapter adapter = new MyAdapter(getContext(), cards,2);
        recyclerView.setAdapter(adapter);

    }

}
