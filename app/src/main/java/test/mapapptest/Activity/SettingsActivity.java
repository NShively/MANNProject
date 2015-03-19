
package test.mapapptest.Activity;


import android.app.Activity;
import android.os.Bundle;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import javax.microedition.khronos.egl.EGLDisplay;

import test.mapapptest.R;
//import test.mapapptest.Interface.IHttpCallbackListener;
import test.mapapptest.Model.MileageModel;
import test.mapapptest.Service.MileageDataManager;
import test.mapapptest.Service.MileageSearchRequestArgs;
import test.mapapptest.Utility.URLFormatUtility;




/**
 * Created by nathan on 3/16/15.
*/
public class SettingsActivity extends Activity {

    final Context context = this;

    private EditText year;
    private EditText make;
    private EditText model;
    private EditText engineSize;
    private EditText transmissionType;
    private Button inputButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        //stuff from main.xml in the layout folder

        inputButton = (Button) findViewById(R.id.buttonPrompt);
        year = (EditText) findViewById(R.id.editTextResult);
        make = (EditText) findViewById(R.id.editTextResult2);

        // button listener

        inputButton.setOnClickListener(new OnClickListener(){


            @Override
            public void onClick(View arg0) {
                // get prompt view

                LayoutInflater li = LayoutInflater.from(context);
                View promptsView = li.inflate(R.layout.prompts, null);

                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);

                // set up alertdialog builder
                alertDialogBuilder.setView(promptsView);

                final EditText userInput = (EditText) promptsView.findViewById(R.id.editTextDialogUserInput);
                final EditText userInput2 = (EditText) promptsView.findViewById(R.id.editTextDialogUserInput);

                // set dialog message up

                alertDialogBuilder.setCancelable(false).setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //get input from user
                        // edit input
                        year.setText(userInput.getText());
                        make.setText(userInput2.getText());
                    }
                });
            // create alert
            AlertDialog alertDialog = alertDialogBuilder.create();

            //send to screen

            alertDialog.show();
            }
        });
    }
  //      inputButton = (Button)findViewById(R.id.inputButton);
  //      year = (EditText)findViewById(R.id.input);
}
