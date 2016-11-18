package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class daj {
    boolean b = false;
    boolean c;
    BaseAdapter d;

    public daj(boolean z, boolean z2, BaseAdapter baseAdapter) {
        this.c = z2;
        this.d = baseAdapter;
    }

    public boolean b() {
        return this.b;
    }

    public boolean c() {
        return this.c;
    }

    public int d() {
        int count = this.d.getCount();
        if (!this.c) {
            return count;
        }
        if (count != 0 || this.b) {
            return count + 1;
        }
        return count;
    }

    public BaseAdapter e() {
        return this.d;
    }

    public View a(View view, ViewGroup viewGroup) {
        return null;
    }

    public void a() {
    }
}
