package defpackage;

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
            return a(this.d, a(), viewGroup);
        }
        return view;
    }

    public void c() {
    }

    public void d() {
    }

    public boolean isEmpty() {
        if (a() == null) {
            return true;
        }
        return super.isEmpty();
    }

    public void a(View view, Cursor cursor) {
    }

    public View a(Context context, Cursor cursor, ViewGroup viewGroup) {
        return null;
    }
}
