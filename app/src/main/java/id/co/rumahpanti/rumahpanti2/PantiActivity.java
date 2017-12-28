package id.co.rumahpanti.rumahpanti2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PantiActivity extends AppCompatActivity {

    int[] listviewImage = new int[]{
            R.drawable.p1, R.drawable.p2, R.drawable.p3, R.drawable.p4,
            R.drawable.p5,
    };

    // Array of strings for ListView Title
    String[] listviewTitle = new String[]{
            "Panti Asuhan AL HIDAYAH",
            "Panti Asuhan AFIFAH AFWA",
            "Panti Asuhan Yatim Piatu Budi Mulya",
            "Panti Asuhan Khoirul Amanah",
            "Panti Asuhan Peduli Harapan Bangsa",
    };

// Deskripsi Panti
    String[] listviewShortDescription = new String[]{
                  // 1. "Nama Panti Asuhan : AL-HIDAYAH\n" +
                            "Alamat : Jl. P. Antasari Gg. Mulya Jaya No 74\n" +
                            "Rt/Rw : 09/-\n" +
                            "Desa/Kelurahan : Kedamaian\n" +
                            "No. Telp. : 0856 6997 3763 / 0821 7860 8150\n" +
                            "Tanggal Berdiri : 25 april 1985\n" +
                            "Nama dan Alamat Pengurus : Dra. Hj. Sri Sulistiani\n" +
                            "       ,Jl. P. Antasari\n" +
                            "Jumlah Anak Asuh : 45 anak",

          // 2. "Nama Panti Asuhan/Yayasan : AFIFAH AFWA\n" +
                    "Alamat : Jl. Pulau Kelagia No. 40\n" +
                    "Rt/Rw : 11/-\n" +
                    "Desa/Kelurahan : Kedamaian\n" +
                    "No. Telp. : 0812 7814 4422 /\n" +
                    "Tanggal Berdiri : 22 oktober 2015\n" +
                    "Nama dan Alamat Pengurus : Rosita\n" +
                    ": Jl. Durian 1 no 38\n" +
                    "Jumlah Anak Asuh : 21\n" +
                    "Laki-laki : 1\n" +
                    "Perempuan : 20",

            //3. "Nama Panti Asuhan/Yayasan : Panti Asuhan Yatim Piatu Budi Mulya\n" +
                    "Alamat : Jl. Pulau Sangiang\n" +
                    "Rt/Rw :\n" +
                    "Desa/Kelurahan : Sukarame\n" +
                    "No. Telp. : 0721 7830 22 / 0812 7221 3264\n" +
                    "Tanggal Berdiri :\n" +
                    "Nama dan Alamat Pengurus : H. Maksud\n" +
                    ": Jl. Pulau damar no. 12 kel. Way dadi\n" +
                    "Jumlah Anak Asuh : 115\n" +
                    "Laki-laki : 54\n" +
                    "Perempuan : 61",

            //4. "Nama Panti Asuhan/Yayasan : Khoirul Amanah\n" +
                    "Alamat : Jl. P. Antasari Gg. Waru 11 no. 22\n" +
                    "Rt/Rw : 01/-\n" +
                    "Desa/Kelurahan : Kali balau kencana, Kec Kedamaian\n" +
                    "No. Telp. : 0821 8423 0007\n" +
                    "Tanggal Berdiri : 16 mei 2012\n" +
                    "Nama dan Alamat Pengurus : Agung Salim SW.\n" +
                    ": Jl. P. Antasari Gg Waru 11 no. 22\n" +
                    "Jumlah Anak Asuh :\n" +
                    "Laki-laki :\n" +
                    "Perempuan :",

           // "Nama Panti Asuhan/Yayasan : Panti Asuhan Peduli Harapan Bangsa\n" +
                    "Alamat : Jl. H. Agus Salim\n" +
                    "Rt/Rw : 003 / -\n" +
                    "Desa/Kelurahan : Kelapa 3 permai\n" +
                    "No. Telp. : 081279171720 / 0812 71420199\n" +
                    "Tanggal Berdiri : 2010\n" +
                    "Nama dan Alamat Pengurus : Bpk. Amir Hamzah\n" +
                    ":\n" +
                    "Jumlah Anak Asuh : 65 Orang\n" +
                    "Laki-laki : -\n" +
                    "Perempuan : -",
    };


    String [] kontak = new String[]{
       "0856 6997 3763", "0812 7814 4422","0721 7830 22","0821 8423 0007","081279171720"
    };

    String [] namabank = new String[]{
            "(BNI) A.n LKSA AL-HIDAYAH BANDARLAMPUNG",
            "(Mandiri) A.n Yayasan Afifah Afwa ",
            "(Mandiri Syariah) A.n Maksud dan Reni",
            "(BRI) A.n",
            "(Mandiri) A.n Amir Hamzah",
    };

    String [] rekbank = new String[]{
            "022-712-9416","114-00-1211-462-8","700-704-753-8","3372-000-930-353-6","900-00-09928574",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panti);

        List<HashMap<String, String>> aList = new ArrayList<HashMap<String, String>>();

        for (int i = 0; i < 5; i++) {
            HashMap<String, String> hm = new HashMap<String, String>();
            hm.put("listview_title", listviewTitle[i]);
            hm.put("listview_discription", listviewShortDescription[i]);
            hm.put("listview_image", Integer.toString(listviewImage[i]));
            hm.put("list_kontak",kontak[i]);
            hm.put("list_nambank",namabank[i]);
            hm.put("list_rekbank",rekbank[i]);
            aList.add(hm);
        }

        String[] from = {"listview_image", "listview_title", "listview_discription","list_kontak","list_nambank","list_rekbank"};
        int[] to = {R.id.listview_image, R.id.listview_item_title,
                R.id.listview_item_short_description, R.id.listview_kontak,
                R.id.listview_nambank,R.id.listview_rekbank};

        SimpleAdapter simpleAdapter = new SimpleAdapter(getBaseContext(), aList, R.layout.listview, from, to);
        ListView androidListView = (ListView) findViewById(R.id.list_view);
        androidListView.setAdapter(simpleAdapter);
        androidListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(PantiActivity.this, ShowPanti.class);
                intent.putExtra("image", listviewImage[position]); // put image data in Intent
                intent.putExtra("judul",listviewTitle[position]);
                intent.putExtra("deskripsi",listviewShortDescription[position]);
                intent.putExtra("kontak",kontak[position]);
                intent.putExtra("nambank",namabank[position]);
                intent.putExtra("rekbank",rekbank[position]);
                startActivity(intent); // start Intent
            }
        });
    }


}
