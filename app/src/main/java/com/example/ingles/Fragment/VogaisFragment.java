package com.example.ingles.Fragment;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.ingles.R;


public class VogaisFragment extends Fragment implements View.OnClickListener {


    MediaPlayer mediaPlayer;
    ImageButton buttonA,buttonE,buttonI,buttonO,buttonU;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_vogais, container, false);
        buttonA = view.findViewById(R.id.buttonA);
        buttonE = view.findViewById(R.id.buttonE);
        buttonI = view.findViewById(R.id.buttonI);
        buttonO = view.findViewById(R.id.buttonO);
        buttonU = view.findViewById(R.id.buttonU);

        buttonA.setOnClickListener(this);
        buttonE.setOnClickListener(this);
        buttonI.setOnClickListener(this);
        buttonO.setOnClickListener(this);
        buttonU.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
     switch (v.getId()){
         case R.id.buttonA:
             mediaPlayer =MediaPlayer.create(getActivity(),R.raw.a);
             tocarSom();
             break;
         case R.id.buttonE:
             mediaPlayer =MediaPlayer.create(getActivity(),R.raw.e);
             tocarSom();
             break;
         case R.id.buttonI:
             mediaPlayer =MediaPlayer.create(getActivity(),R.raw.i);
             tocarSom();
             break;
         case R.id.buttonO:
             mediaPlayer =MediaPlayer.create(getActivity(),R.raw.o);
             tocarSom();
             break;
         case R.id.buttonU:
             mediaPlayer =MediaPlayer.create(getActivity(),R.raw.u);
             tocarSom();
             break;
     }
    }

    public void tocarSom(){
        if (mediaPlayer!= null){
            mediaPlayer.start();
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    mp.release();
                }
            });
        }
    }
}