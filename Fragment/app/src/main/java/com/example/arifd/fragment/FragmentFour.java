package com.example.arifd.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentFour extends Fragment {


    public FragmentFour() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_four, container, false);


        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Fragment Keempat");
        ((MainActivity) getActivity()).getSupportActionBar().setSubtitle("(fragment_four.xml)");
        ((MainActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        setHasOptionsMenu(true);
        //agar button back work
        return view;
    }

    @Override
    //membuat button back
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            getFragmentManager().popBackStack();
        }
        return super.onOptionsItemSelected(item);
    }


}
