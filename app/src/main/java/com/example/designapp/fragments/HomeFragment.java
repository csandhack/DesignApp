package com.example.designapp.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.designapp.R;
import com.example.designapp.adapters.BoxRecyclerAdapter;
import com.example.designapp.model.BoxModel;

import java.util.ArrayList;


public class HomeFragment extends Fragment {

    RecyclerView recyclerView;
    BoxRecyclerAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        recyclerView = view.findViewById(R.id.rv_box_home_frg);
        recyclerView.setHasFixedSize(true);
        ArrayList<BoxModel> data = new ArrayList<>();

        data.add(new BoxModel("ABC", "XYZ", R.drawable.ic_round_home));
        data.add(new BoxModel("ABC", "XYZ", R.drawable.ic_round_home));
        data.add(new BoxModel("ABC", "XYZ", R.drawable.ic_round_home));
        data.add(new BoxModel("ABC", "XYZ", R.drawable.ic_round_home));
        data.add(new BoxModel("ABC", "XYZ", R.drawable.ic_round_home));

        data.add(new BoxModel("ABC", "XYZ", R.drawable.ic_round_home));
        data.add(new BoxModel("ABC", "XYZ", R.drawable.ic_round_home));
        data.add(new BoxModel("ABC", "XYZ", R.drawable.ic_round_home));
        data.add(new BoxModel("ABC", "XYZ", R.drawable.ic_round_home));
        data.add(new BoxModel("ABC", "XYZ", R.drawable.ic_round_home));

        data.add(new BoxModel("ABC", "XYZ", R.drawable.ic_round_home));
        data.add(new BoxModel("ABC", "XYZ", R.drawable.ic_round_home));
        data.add(new BoxModel("ABC", "XYZ", R.drawable.ic_round_home));

//        data.add(new BoxModel( "", "", R.drawable.ic_round_home));
//        data.add(new BoxModel( "", "", R.drawable.ic_round_home));
//        data.add(new BoxModel( "", "", R.drawable.ic_round_home));
//        data.add(new BoxModel( "", "", R.drawable.ic_round_home));
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 2);
//        gridLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL); // set Horizontal Orientation
        recyclerView.setLayoutManager(gridLayoutManager);

        adapter = new BoxRecyclerAdapter(getContext(), data);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        return view;

    }
}