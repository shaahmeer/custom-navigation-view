package com.example.navigationview;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BlankFragment1 extends Fragment {

    ArrayList<model> model;

    RecyclerView recyclerView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
// Inflate the layout for this fragment
       View view = inflater.inflate(R.layout.fragment_blank1, container, false);
       recyclerView =view.findViewById(R.id.recycle);
       recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
       model= new ArrayList<>();


       model ob1 = new model("angular", R.drawable.ic_launcher_background);
      model.add(ob1);


      recyclerView.setAdapter(new myadapter(model));
       return  view;



    }
}

