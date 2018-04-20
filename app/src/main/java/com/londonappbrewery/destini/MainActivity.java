package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

Button topButton ;
Button bottomButton;
TextView storyText ;
final int storyarray []={0,R.string.T1_Story,R.string.T2_Story,R.string.T3_Story,R.string.T4_End,R.string.T5_End,R.string.T6_End};
int index=1;


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
topButton =findViewById(R.id.buttonTop);
bottomButton=findViewById(R.id.buttonBottom);
storyText=findViewById(R.id.storyTextView);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button
        topButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                switch (index){
                    case 1:showSt(3);
                    break;

                    case 2:showSt(3);
                    break;

                    case 3:showSt(6);
                    break;
                }


            }

        });




        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        bottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (index){
                    case 1 : showSt(2);
                    break;

                    case 2 :showSt(4);
                    break;

                    case 3 : showSt(5);
                    break;
                }

            }
        });
    }
    void showSt (int st){
        index=st;
        switch (st){
            case 1:storyText.setText(storyarray[1]);
                topButton.setText(R.string.T1_Ans1);
                bottomButton.setText(R.string.T1_Ans2);
                break;
            case 2:storyText.setText(storyarray[2]);
                topButton.setText(R.string.T2_Ans1);
                bottomButton.setText(R.string.T2_Ans2);
                break;
            case 3:storyText.setText(storyarray[3]);
                topButton.setText(R.string.T3_Ans1);
                bottomButton.setText(R.string.T3_Ans2);
                break;
            case 4:storyText.setText(storyarray[4]);
                topButton.setVisibility(View.GONE);
                bottomButton.setVisibility(View.GONE);
                break;
            case 5:storyText.setText(storyarray[5]);
                topButton.setVisibility(View.GONE);
                bottomButton.setVisibility(View.GONE);
                break;
            case 6:storyText.setText(storyarray[6]);
                topButton.setVisibility(View.GONE);
                bottomButton.setVisibility(View.GONE);
                break;

        }
    }

}
