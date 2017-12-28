package id.co.rumahpanti.rumahpanti2;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Musikpad extends AppCompatActivity {


    private SoundPool soundPool;

    private AudioManager audioManager;

    // Max sound stream
    private static final int MAX_STREAMS = 5;

    // Stream type.
    private static final int streamType = AudioManager.STREAM_MUSIC;

    private boolean loaded;

    float volume;

    int a0,a1,a2,a3,a4,a5,a6,a7,a00,a11,a22,a33,a44,a55,a66,a77,ka,kb,tung,tang,snare,kick,hihat,simbal;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_musikpad);

        audioManager = (AudioManager) getSystemService(AUDIO_SERVICE);
        float currentVolumeIndex = (float) audioManager.getStreamVolume(streamType);
        float maxVolumeIndex  = (float) audioManager.getStreamMaxVolume(streamType);

        // Volumn (0 --> 1)
        this.volume = currentVolumeIndex / maxVolumeIndex;
        this.setVolumeControlStream(streamType);

        // Untuk Android SDK >= 21
        if (Build.VERSION.SDK_INT >= 21 ) {

            AudioAttributes audioAttrib = new AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_GAME)
                    .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                    .build();

            SoundPool.Builder builder= new SoundPool.Builder();
            builder.setAudioAttributes(audioAttrib).setMaxStreams(MAX_STREAMS);

            this.soundPool = builder.build();
        }
        // untuk Android SDK < 21
        else {
            this.soundPool = new SoundPool(MAX_STREAMS, AudioManager.STREAM_MUSIC, 0);
        }

        // Ketika Sound Pool Selesai di Load.
        this.soundPool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() {
            @Override
            public void onLoadComplete(SoundPool soundPool, int sampleId, int status) {
                loaded = true;
            }
        });

        this.a0 = this.soundPool.load(this, R.raw.ado,1);
        this.a1 = this.soundPool.load(this, R.raw.are,1);
        this.a2 = this.soundPool.load(this, R.raw.ami,1);
        this.a3 = this.soundPool.load(this, R.raw.afa,1);
        this.a4 = this.soundPool.load(this, R.raw.aso,1);
        this.a5 = this.soundPool.load(this, R.raw.ala,1);
        this.a6 = this.soundPool.load(this, R.raw.asi,1);
        this.a7 = this.soundPool.load(this, R.raw.adoo,1);

        this.a00 = this.soundPool.load(this, R.raw.adoa,1);
        this.a11 = this.soundPool.load(this, R.raw.area,1);
        this.a22 = this.soundPool.load(this, R.raw.amia,1);
        this.a33 = this.soundPool.load(this, R.raw.afaa,1);
        this.a44 = this.soundPool.load(this, R.raw.asoa,1);
        this.a55 = this.soundPool.load(this, R.raw.alaa,1);
        this.a66 = this.soundPool.load(this, R.raw.asia,1);
        this.a77 = this.soundPool.load(this, R.raw.adoaa,1);

        this.ka = this.soundPool.load(this, R.raw.kenonga,1);
        this.kb = this.soundPool.load(this, R.raw.kenongb,1);

        this.tung = this.soundPool.load(this, R.raw.tung,1);
        this.tang = this.soundPool.load(this, R.raw.tang,1);

        this.snare = this.soundPool.load(this, R.raw.snare,1);
        this.kick = this.soundPool.load(this, R.raw.kick,1);
        this.hihat = this.soundPool.load(this, R.raw.hihat,1);
        this.simbal = this.soundPool.load(this, R.raw.crash,1);


    }





    public void do1(View view) {
        if(loaded){
            float leftVolumn = volume;
            float rightVolumn = volume;
            int a0 = this.soundPool.play(this.a0,leftVolumn,rightVolumn,1,0,1f);
        }
    }


    public void Re1(View view) {
        if(loaded){
            float leftVolumn = volume;
            float rightVolumn = volume;
            int a1 = this.soundPool.play(this.a1,leftVolumn,rightVolumn,1,0,1f);
        }
    }

    public void Mi1(View view) {
        if(loaded){
            float leftVolumn = volume;
            float rightVolumn = volume;
            int a2 = this.soundPool.play(this.a2,leftVolumn,rightVolumn,1,0,1f);
        }
    }

    public void Fa1(View view) {
        if(loaded){
            float leftVolumn = volume;
            float rightVolumn = volume;
            int a3 = this.soundPool.play(this.a3,leftVolumn,rightVolumn,1,0,1f);
        }
    }

    public void So1(View view) {
        if(loaded){
            float leftVolumn = volume;
            float rightVolumn = volume;
            int a4 = this.soundPool.play(this.a4,leftVolumn,rightVolumn,1,0,1f);
        }
    }

    public void La1(View view) {
        if(loaded){
            float leftVolumn = volume;
            float rightVolumn = volume;
            int a5 = this.soundPool.play(this.a5,leftVolumn,rightVolumn,1,0,1f);
        }
    }

    public void Si1(View view) {
        if(loaded){
            float leftVolumn = volume;
            float rightVolumn = volume;
            int a6 = this.soundPool.play(this.a6,leftVolumn,rightVolumn,1,0,1f);
        }
    }

    public void Do11(View view) {
        if(loaded){
            float leftVolumn = volume;
            float rightVolumn = volume;
            int a7 = this.soundPool.play(this.a7,leftVolumn,rightVolumn,1,0,1f);
        }
    }


    public void Do2(View view) {
        if(loaded){
            float leftVolumn = volume;
            float rightVolumn = volume;
            int a00 = this.soundPool.play(this.a00,leftVolumn,rightVolumn,1,0,1f);
        }
    }

    public void Re2(View view) {
        if(loaded){
            float leftVolumn = volume;
            float rightVolumn = volume;
            int a11 = this.soundPool.play(this.a11,leftVolumn,rightVolumn,1,0,1f);
        }
    }

    public void Mi2(View view) {
        if(loaded){
            float leftVolumn = volume;
            float rightVolumn = volume;
            int a22 = this.soundPool.play(this.a22,leftVolumn,rightVolumn,1,0,1f);
        }
    }

    public void Fa2(View view) {
        if(loaded){
            float leftVolumn = volume;
            float rightVolumn = volume;
            int a33 = this.soundPool.play(this.a33,leftVolumn,rightVolumn,1,0,1f);
        }
    }

    public void So2(View view) {
        if(loaded){
            float leftVolumn = volume;
            float rightVolumn = volume;
            int a44 = this.soundPool.play(this.a44,leftVolumn,rightVolumn,1,0,1f);
        }
    }

    public void La2(View view) {
        if(loaded){
            float leftVolumn = volume;
            float rightVolumn = volume;
            int a55 = this.soundPool.play(this.a55,leftVolumn,rightVolumn,1,0,1f);
        }
    }

    public void Si2(View view) {
        if(loaded){
            float leftVolumn = volume;
            float rightVolumn = volume;
            int a66 = this.soundPool.play(this.a66,leftVolumn,rightVolumn,1,0,1f);
        }
    }

    public void Do22(View view) {
        if(loaded){
            float leftVolumn = volume;
            float rightVolumn = volume;
            int a77 = this.soundPool.play(this.a77,leftVolumn,rightVolumn,1,0,1f);
        }
    }







    public void button11(View view) {
    }

    public void kenonga(View view) {
        if(loaded){
            float leftVolumn = volume;
            float rightVolumn = volume;
            int ka = this.soundPool.play(this.ka,leftVolumn,rightVolumn,1,0,1f);
        }
    }


    public void kenongb(View view) {
        if(loaded){
            float leftVolumn = volume;
            float rightVolumn = volume;
            int kb = this.soundPool.play(this.kb,leftVolumn,rightVolumn,1,0,1f);
        }
    }

    public void tung(View view) {
        if(loaded){
            float leftVolumn = volume;
            float rightVolumn = volume;
            int tung = this.soundPool.play(this.tung,leftVolumn,rightVolumn,1,0,1f);
        }
    }

    public void tang(View view) {
        if(loaded){
            float leftVolumn = volume;
            float rightVolumn = volume;
            int tang = this.soundPool.play(this.tang,leftVolumn,rightVolumn,1,0,1f);
        }
    }

    public void snare(View view) {
        if(loaded){
            float leftVolumn = volume;
            float rightVolumn = volume;
            int snare = this.soundPool.play(this.snare,leftVolumn,rightVolumn,1,0,1f);
        }
    }

    public void kick(View view) {
        float leftVolumn = volume;
        float rightVolumn = volume;
        int kick = this.soundPool.play(this.kick,leftVolumn,rightVolumn,1,0,1f);
    }

    public void hihat(View view) {
        float leftVolumn = volume;
        float rightVolumn = volume;
        int hihat = this.soundPool.play(this.hihat,leftVolumn,rightVolumn,1,0,1f);
    }

    public void simbal(View view) {
        float leftVolumn = volume;
        float rightVolumn = volume;
        int crash = this.soundPool.play(this.simbal,leftVolumn,rightVolumn,1,0,1f);
    }
}
