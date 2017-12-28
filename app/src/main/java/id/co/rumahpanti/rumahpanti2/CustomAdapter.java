package id.co.rumahpanti.rumahpanti2;

/**
 * Created by taufiknurhuda on 25/12/17.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class CustomAdapter extends BaseAdapter {
    Context context;
    int gambar[];
    String ket[];
    LayoutInflater inflater;

    public CustomAdapter(Context applicationContext, int[] gambar) {
        this.context = applicationContext;
        this.gambar = gambar;
        inflater = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return gambar.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.gridview,null);
        ImageView icon = (ImageView) view.findViewById(R.id.icon);
        icon.setImageResource(gambar[i]);
        return view;
    }
}
