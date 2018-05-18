package com.example.arifd.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentTwo extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_two, container, false);

        TextView name_obj = getView().findViewById(R.id.tvNameVal);
        TextView email_obj = getView().findViewById(R.id.tvEmailVal);
        Bundle bundle = getArguments();

        if (bundle != null){
            if(bundle.containsKey("name")){
                name_obj.setText("Name : " +bundle.getString("name"));
            }

            if(bundle.containsKey("email")){
                email_obj.setText("Email : " +bundle.getString("email"));
            }
        }
        return view;
    }

}
