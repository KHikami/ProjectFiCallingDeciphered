package defpackage;

import android.database.DataSetObserver;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

/* renamed from: gjd */
public final class gjd implements ListAdapter {
    private gjb a;
    private LayoutInflater b;

    public gjd(LayoutInflater layoutInflater) {
        giz b = gkd.a().b();
        if (b instanceof gjb) {
            this.a = (gjb) b;
            this.b = layoutInflater;
            return;
        }
        throw new IllegalStateException("Can't make an ICS adapter when lower than ICS");
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
        int i = 0;
        for (int i2 = 0; i2 < this.a.b().size(); i2++) {
            i += ((gjc) this.a.b().get(this.a.b().keyAt(i2))).a;
        }
        return i;
    }

    public Object getItem(int i) {
        SparseArray b = this.a.b();
        int i2 = 0;
        for (int i3 = 0; i3 < b.size(); i3++) {
            gjc gjc = (gjc) b.get(b.keyAt(i3));
            if (gjc.a + i2 > i) {
                return gjc.b[i - i2];
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
            view = this.b.inflate(gwb.gh, viewGroup, false);
        }
        Bitmap bitmap = (Bitmap) getItem(i);
        if (bitmap != null) {
            TextView textView = (TextView) view.findViewById(ba.fE);
            TextView textView2 = (TextView) view.findViewById(ba.fF);
            TextView textView3 = (TextView) view.findViewById(ba.fG);
            ImageView imageView = (ImageView) view.findViewById(ba.M);
            ((TextView) view.findViewById(ba.fD)).setText("");
            textView.setText("");
            int width = bitmap.getWidth();
            textView2.setText(width + "x" + bitmap.getHeight());
            textView3.setText(bitmap.toString());
            imageView.setImageDrawable(new BitmapDrawable(bitmap));
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
