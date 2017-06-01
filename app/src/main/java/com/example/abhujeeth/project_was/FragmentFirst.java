package com.example.abhujeeth.project_was;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class FragmentFirst extends Fragment implements View.OnClickListener {
    List<ModelClass> cards;
    RecyclerView recyclerView;
    SetWork setWork;
    View view;

    public FragmentFirst() {
        // Required empty public constructor
    }
    public  interface SetWork
    {
         void doWork();

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try
        {
            setWork=(SetWork)context;
        }
        catch (ClassCastException e)
        {
            throw new ClassCastException(context.toString()
                    + "must implement ToolbarListener");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        view= inflater.inflate(R.layout.fragment_fragment_first, container, false);
        recyclerView = (RecyclerView)view.findViewById(R.id.recycler_view);
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
        ModelClass obj=new ModelClass(R.drawable.shirt2,R.drawable.shirtone);
        cards.add(obj);
        ModelClass obj1=new ModelClass(R.drawable.shirt3,R.drawable.shirt2);
        cards.add(obj1);
        ModelClass obj2=new ModelClass(R.drawable.shirt4,R.drawable.shirt3);
        cards.add(obj2);
        ModelClass obj3=new ModelClass(R.drawable.hello,R.drawable.shirt4);
        cards.add(obj3);
        ModelClass obj4=new ModelClass(R.drawable.shirt3,R.drawable.shirt4);
        cards.add(obj4);

        RecyclerView.Adapter adapter = new MyAdapter(getContext(),cards,1);
        recyclerView.setAdapter(adapter);

        //TextView img=(TextView) (view.findViewById(R.id.textone));


    }


    @Override
    public void onClick(View v) {
        setWork.doWork();
    }
}






