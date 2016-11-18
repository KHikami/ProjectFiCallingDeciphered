package p000;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;

public class enk extends rw {
    public enk(Context context, Cursor cursor) {
        super(context, cursor, 0);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (i < getCount()) {
            return super.getView(i, view, viewGroup);
        }
        if (view == null) {
            return mo803a(this.d, a(), viewGroup);
        }
        return view;
    }

    public void mo618c() {
    }

    public void mo1489d() {
    }

    public boolean isEmpty() {
        if (a() == null) {
            return true;
        }
        return super.isEmpty();
    }

    public void mo804a(View view, Cursor cursor) {
    }

    public View mo803a(Context context, Cursor cursor, ViewGroup viewGroup) {
        return null;
    }
}
