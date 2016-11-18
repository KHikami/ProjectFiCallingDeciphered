package p000;

import android.database.DataSetObserver;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import java.util.Map.Entry;

public final class giy implements ListAdapter {
    private gix f15332a = gkd.m17873a();
    private LayoutInflater f15333b;

    public giy(LayoutInflater layoutInflater) {
        this.f15333b = layoutInflater;
    }

    public boolean areAllItemsEnabled() {
        return true;
    }

    public boolean isEnabled(int i) {
        return true;
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
    }

    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
    }

    public int getCount() {
        return this.f15332a.m17770a().size();
    }

    public Object getItem(int i) {
        int i2 = 0;
        for (Entry entry : this.f15332a.m17770a().entrySet()) {
            if (i == i2) {
                return entry;
            }
            i2++;
        }
        return null;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public boolean hasStableIds() {
        return false;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f15333b.inflate(gwb.gh, viewGroup, false);
        }
        Entry entry = (Entry) getItem(i);
        if (entry != null) {
            TextView textView = (TextView) view.findViewById(ba.fE);
            TextView textView2 = (TextView) view.findViewById(ba.fF);
            TextView textView3 = (TextView) view.findViewById(ba.fG);
            ImageView imageView = (ImageView) view.findViewById(ba.f2674M);
            ((TextView) view.findViewById(ba.fD)).setText((CharSequence) entry.getKey());
            textView.setText("refcount: " + ((gkt) entry.getValue()).m17902i());
            Bitmap f = ((gkt) entry.getValue()).m17899f();
            int width = f.getWidth();
            textView2.setText(width + "x" + f.getHeight());
            textView3.setText(f.toString());
            imageView.setImageDrawable(new BitmapDrawable(f));
        }
        return view;
    }

    public int getItemViewType(int i) {
        return 0;
    }

    public int getViewTypeCount() {
        return 1;
    }

    public boolean isEmpty() {
        return getCount() != 0;
    }
}
