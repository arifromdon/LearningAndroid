package com.example.arifd.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentThree extends Fragment {
    private Button buttonSatu;

    public FragmentThree() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_three, container, false);

                ((MainActivity) getActivity()).getSupportActionBar().setTitle("Fragment Ketiga");
                ((MainActivity) getActivity()).getSupportActionBar().setSubtitle("(fragment_three.xml)");
                ((MainActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);

                buttonSatu = (Button) view.findViewById(R.id.button1);

                setHasOptionsMenu(true);
                //agar button back work
                return view;
            }

            @Override
            public void onActivityCreated(Bundle savedInstanceState) {
                super.onActivityCreated(savedInstanceState);


                buttonSatu.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        FragmentFour fragmentKeempat = new FragmentFour();
                        //buat object fragmentkedua

                        getFragmentManager().beginTransaction().replace(R.id.frame_content, fragmentKeempat)
                                //mengganti fragment
                                .addToBackStack(null)
                                //menyimpan fragment
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                                //transisi fragment
                                .commit();
                        //mengeksekusi fragment transaction
                    }
                });
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
