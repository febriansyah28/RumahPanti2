package id.co.rumahpanti.rumahpanti2;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class GalleryActivity extends Activity {

    GridView simpleGrid;

    String[] keterangan = new String[]{"Panti Asuhan A", "Panti Asuhan B", "Panti Asuhan C", "Panti Asuhan D",
            "Panti Asuhan E",};

    int gambar[] = {R.drawable.p1,R.drawable.p2,R.drawable.p3,R.drawable.p4,R.drawable.p5,};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);


        simpleGrid = (GridView) findViewById(R.id.grid_view);

        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), gambar);
        simpleGrid.setAdapter(customAdapter);


        simpleGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // set an Intent to Another Activity
                Intent intent = new Intent(GalleryActivity.this, ShowGallery.class);
                intent.putExtra("image", gambar[position]); // put image data in Intent
                intent.putExtra("ket", keterangan[position]);
                startActivity(intent); // start Intent
            }
        });


    }




}
