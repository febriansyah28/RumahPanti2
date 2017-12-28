package id.co.rumahpanti.rumahpanti2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

public class ShowPanti extends AppCompatActivity {

    ImageView selectedImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_panti);

        TextView judul = (TextView) findViewById(R.id.judulpanti);
        TextView desk = (TextView) findViewById(R.id.isipanti);
        TextView kon = (TextView) findViewById(R.id.inkontak);
        TextView namb = (TextView) findViewById(R.id.nabank);
        TextView rekb = (TextView) findViewById(R.id.rekbank);

        selectedImage = (ImageView) findViewById(R.id.gambar); // init a ImageView
        Intent intent = getIntent(); // get Intent which we set from Previous Activity
        selectedImage.setImageResource(intent.getIntExtra("image", 0)); // get image from Intent and set it in ImageView

        Bundle bdl = getIntent().getExtras();

        String jdl = bdl.getString("judul");
        String des = bdl.getString("deskripsi");
        String kont = bdl.getString("kontak");
        String nam = bdl.getString("nambank");
        String rek = bdl.getString("rekbank");

        judul.setText(jdl);
        desk.setText(des);
        kon.setText(kont);
        namb.setText(nam);
        rekb.setText(rek);
    }




    public void bsumbang(View view) {
        Intent bksumbang = new Intent(this, InfakActivity.class);

        startActivity(bksumbang);

    }
}
