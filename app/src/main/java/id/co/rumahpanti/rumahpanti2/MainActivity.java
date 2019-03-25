package id.co.rumahpanti.rumahpanti2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void pantiasuhan(View view){
        Intent bukapanti = new Intent(this, PantiActivity.class);
        startActivity(bukapanti);
    }
    public void infak(View view){
        Intent bukainfak = new Intent(this, InfakActivity.class);
        startActivity(bukainfak);
    }
    public void kontak(View view){
        Intent bukakontak = new Intent(this, KontakActivity.class);
        startActivity(bukakontak);
    }
    public void gallery(View view){
        Intent bukagallery = new Intent(this, GalleryActivity.class);
        startActivity(bukagallery);
    }



    public void bantuan(View view) {
        Intent bukabantuan = new Intent(this, Bantuan.class);
        startActivity(bukabantuan);
    }


    public void Musikpad(View view) {
        Intent bukagallery = new Intent(this, Musikpad.class);
        startActivity(bukagallery);
    }

    public void GoUser(View view) {
        Intent bukagallery = new Intent(this, UserActivity.class);
        startActivity(bukagallery);
    }

    public void tentang(View view) {
        Intent bukatentang = new Intent(this, TentangActivity.class);
        startActivity(bukatentang);
    }
}
