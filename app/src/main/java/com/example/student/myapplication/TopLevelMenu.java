package com.example.student.myapplication;
import android.content.Intent;
import android.net.Uri;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ShareActionProvider;

import com.facebook.CallbackManager;
import com.facebook.FacebookSdk;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.widget.ShareDialog;


public class TopLevelMenu extends AppCompatActivity {

    private String[] topmenu = {"Information", "Causes", "Prevention", "For More Information", "Help"};
    Integer[] imageId = {R.drawable.image1, R.drawable.image2, R.drawable.image3, R.drawable.image3_5, R.drawable.image4};
    private TextToSpeech txttospeechtopmenu;
    CallbackManager callbackManager;
    ShareDialog shareDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_level_menu);
        initTextToSpeech();
        CustomList adapter = new CustomList(TopLevelMenu.this, topmenu, imageId);
        ListView menuList = (ListView) findViewById(R.id.toplevelListView);
        menuList.setAdapter(adapter);
        menuList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent toInformation = new Intent(TopLevelMenu.this, Information.class);
                    startActivity(toInformation);
                } else if (position == 1) {
                    Intent toCauses = new Intent(TopLevelMenu.this, Causes.class);
                    startActivity(toCauses);
                } else if (position == 2) {
                    Intent toPrevention = new Intent(TopLevelMenu.this, Prevention.class);
                    startActivity(toPrevention);
                } else if (position == 3) {
                    Intent toMoreInfo = new Intent(TopLevelMenu.this, ForMoreInfo.class);
                    startActivity(toMoreInfo);
                } else if (position == 4) {
                    Intent toHelp = new Intent(TopLevelMenu.this, Help.class);
                    startActivity(toHelp);
                }
                onClick(position);
            }
        });
    }

    private void initTextToSpeech(){
        txttospeechtopmenu = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {

            }
        });
    }

    private void onClick(int index){
        txttospeechtopmenu.setSpeechRate(0.9f);
        txttospeechtopmenu.speak(topmenu[index], TextToSpeech.QUEUE_FLUSH, null);
    }


    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_top_level_menu, menu);
        MenuItem shareItem = menu.findItem(R.id.action_share);
        //mShareActionProvider = (ShareActionProvider) shareItem.getActionProvider();

        return true;
    }

    //FB SHARING

    @Override
    protected void onActivityResult(final int requestCode, final int resultCode, final Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        callbackManager.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        FacebookSdk.sdkInitialize(getApplicationContext());
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_share) {
            callbackManager = CallbackManager.Factory.create();
            shareDialog = new ShareDialog(this);


            if (ShareDialog.canShow(ShareLinkContent.class)) {
                ShareLinkContent linkContent = new ShareLinkContent.Builder()
                        .setContentTitle("BC APP")
                        .setImageUrl(Uri.parse("http://www.shescribes.com/wp-content/uploads/2014/10/Pink-Ribbon.jpg"))
                        .setContentDescription(
                                "This app is used to raise awareness of breast cancer")
                        .setContentUrl(Uri.parse("https://github.com/DeLaSalleUniversity-Manila/breastcancerawarenessapp-rohit0000"))
                        .build();

                shareDialog.show(linkContent);
            }
        }

        return super.onOptionsItemSelected(item);



    }
}
