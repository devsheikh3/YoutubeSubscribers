package com.example.youtubesubscribers;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import de.hdodenhof.circleimageview.CircleImageView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class More extends Fragment {

    TextView name,email,invite,feedback,logout,policy,rate;
    CircleImageView dp;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_more, container, false);

        name=view.findViewById(R.id.channelnameid);
        email=view.findViewById(R.id.emailid);
        invite=view.findViewById(R.id.inviteFriendsid);
        feedback=view.findViewById(R.id.feedbackid);
        logout=view.findViewById(R.id.logoutid);
        policy=view.findViewById(R.id.privatePolicyid);
        rate=view.findViewById(R.id.rateAppid);
        dp=view.findViewById(R.id.channeldpid);

        invite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(getContext(), NextActivity.class);
                startActivity(intent);

            }
        });

        feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(getContext(), NextActivity.class);
                startActivity(intent);

            }
        });

        rate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(getContext(), NextActivity.class);
                startActivity(intent);

            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(getContext(), NextActivity.class);
                startActivity(intent);

            }
        });

        policy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(getContext(), NextActivity.class);
                startActivity(intent);

            }
        });





        return view;
    }
}
