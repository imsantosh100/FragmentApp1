package com.example.admin.fragmentapp1;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment
{

    EditText et1,et2;
    Button button;

    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_blank, container, false);

         et1 = (EditText) v.findViewById(R.id.editText1);
    //     et2 = (EditText) v.findViewById(R.id.editText2);
         button = (Button) v.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String uname = et1.getText().toString();

                // get parent Activity object
                MainActivity m = (MainActivity) getActivity();
                m.passData(uname);
            }
        });

        return v;
    }

}
