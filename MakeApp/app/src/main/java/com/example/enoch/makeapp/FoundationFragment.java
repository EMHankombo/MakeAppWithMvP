package com.example.enoch.makeapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.enoch.makeapp.ui.base.BaseFragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class FoundationFragment extends BaseFragment {


    public FoundationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_foundation, container, false);
    }

}
