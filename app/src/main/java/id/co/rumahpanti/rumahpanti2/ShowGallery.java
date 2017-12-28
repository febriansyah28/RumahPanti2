package id.co.rumahpanti.rumahpanti2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ShowGallery extends AppCompatActivity {
    ImageView selectedImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_gallery);


        TextView kete = (TextView) findViewById(R.id.kpanti);

        selectedImage = (ImageView) findViewById(R.id.selectedImage);
        Intent intent = getIntent(); // get Intent which we set from Previous Activity
        selectedImage.setImageResource(intent.getIntExtra("image", 0));

        Bundle bdl = getIntent().getExtras();

        String ket = bdl.getString("ket");

        kete.setText(ket);

    }
}
