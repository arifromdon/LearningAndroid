package com.example.arifd.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentOne extends Fragment {
    private Button buttonSatu;

    public FragmentOne() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_one, container, false);

        ((MainActivity)getActivity()).getSupportActionBar().setTitle("Fragment Pertama");
        ((MainActivity)getActivity()).getSupportActionBar().setSubtitle("(fragment_one.xml)");
        ((MainActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(false);


        buttonSatu = (Button) view.findViewById(R.id.button1);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);

        buttonSatu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTwo fragmentTwo = new FragmentTwo();

                getFragmentManager().beginTransaction().replace(R.id.frame_content, fragmentTwo).addToBackStack(null)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).commit();
            }
        });

    }

}
