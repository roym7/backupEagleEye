package edu.erau.eagleeye;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.os.Process;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * This class, NoMatch, is an activity that displays when no match has been found for the user
 * image.  It displays a short message along with the Eagle Eye logo.  In following versions, the
 * logo will be replaced with the user image.
 * @author Rebecca Ivans
 * @version 1.0
 */
public class NoMatch extends AppCompatActivity {

    public static Integer testQueryImage;
    public static boolean testImage;
    public static Bitmap queryImageSmall;

    /**
     * This method overrides the onCreate method from AppCompatActivity.  It sets the content view
     * to the correct layout, activity_no_match.xml, and provides listeners for the "Take Another
     * Picture" and "Quit" buttons in that layout
     *
     * @param savedInstanceState A Bundle containing the activity's previously frozen state
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Set GUI to correct xml file
        setContentView(R.layout.activity_no_match);

        //Set ImageView to display the queryImage Uri
        ImageView noMatchPic = (ImageView)findViewById(R.id.noMatchPic);

        if (testImage){
            noMatchPic.setImageResource(testQueryImage);
        }else{
            noMatchPic.setImageBitmap(queryImageSmall);
        }

        // Adds listener to Take Another Picture button.
        Button goBackButton = (Button)findViewById(R.id.goBackButton);
        goBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}

