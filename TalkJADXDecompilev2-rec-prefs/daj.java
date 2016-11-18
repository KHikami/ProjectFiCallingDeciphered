package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class daj {
    boolean f4948b = false;
    boolean f4949c;
    BaseAdapter f4950d;

    public daj(boolean z, boolean z2, BaseAdapter baseAdapter) {
        this.f4949c = z2;
        this.f4950d = baseAdapter;
    }

    public boolean m7148b() {
        return this.f4948b;
    }

    public boolean m7149c() {
        return this.f4949c;
    }

    public int m7150d() {
        int count = this.f4950d.getCount();
        if (!this.f4949c) {
            return count;
        }
        if (count != 0 || this.f4948b) {
            return count + 1;
        }
        return count;
    }

    public BaseAdapter m7151e() {
        return this.f4950d;
    }

    public View mo801a(View view, ViewGroup viewGroup) {
        return null;
    }

    public void mo802a() {
    }
}
