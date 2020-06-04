package com.example.youtubesubscribers;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import de.hdodenhof.circleimageview.CircleImageView;


public class Subscribe extends Fragment {

    Button subscribe,next;
    CircleImageView chnldp;
    TextView chnlname,link;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view=inflater.inflate(R.layout.fragment_subscribe, container, false);

        subscribe=view.findViewById(R.id.subscribebtnid);
        next=view.findViewById(R.id.nextbtnid);
        chnldp=view.findViewById(R.id.chnldpid);
        chnlname=view.findViewById(R.id.channelnameid);
        link=view.findViewById(R.id.linkid);

        subscribe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });

        return view;
    }
}
