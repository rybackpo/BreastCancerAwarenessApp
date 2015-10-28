package com.example.student.myapplication;

import android.app.Service;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.os.IBinder;

import java.io.IOException;

/**
 * Created by Rohit on 10/11/2015.
 */
public class Sound extends Service{

        final MediaPlayer mp = new MediaPlayer();

        @Override
        public IBinder onBind(Intent intent) {
            return null;
        }

        @Override
        public void onCreate() {

            if (mp.isPlaying()) {
                mp.stop();
                mp.reset();
            }
            try {

                AssetFileDescriptor afd;
                afd = getAssets().openFd("Eq.mp3");
                mp.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
                mp.prepare();
                mp.start();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            mp.setLooping(false); // Set looping
        }


        @Override
        public void onDestroy() {
            mp.stop();
        }

        @Override
        public void onStart(Intent intent, int startid) {
            mp.start();
        }
    }
