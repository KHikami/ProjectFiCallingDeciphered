package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/* renamed from: dah */
public class dah extends BaseAdapter {
    public final Context a;
    private daj[] b;
    private int c;
    private int d;
    private boolean e;
    private dai f;

    public dah(Context context) {
        this.c = 0;
        this.d = 0;
        this.e = true;
        this.a = context;
        this.f = new dai(this);
        this.b = new daj[2];
    }

    public Context a() {
        return this.a;
    }

    public void a(daj daj) {
        if (this.c >= this.b.length) {
            Object obj = new daj[(this.c + 2)];
            System.arraycopy(this.b, 0, obj, 0, this.c);
            this.b = obj;
        }
        daj[] dajArr = this.b;
        int i = this.c;
        this.c = i + 1;
        dajArr[i] = daj;
        daj.e().registerDataSetObserver(this.f);
        c();
        notifyDataSetChanged();
    }

    public void b() {
        for (int i = 0; i < this.c; i++) {
            daj daj = this.b[i];
            daj.a();
            daj.e().unregisterDataSetObserver(this.f);
        }
        c();
        notifyDataSetChanged();
    }

    public void c() {
        this.e = false;
    }

    private void d() {
        int i = 0;
        if (!this.e) {
            this.d = 0;
            while (i < this.c) {
                this.d += this.b[i].d();
                i++;
            }
        }
    }

    public int getCount() {
        d();
        return this.d;
    }

    public Object getItem(int i) {
        int i2 = 0;
        d();
        int i3 = 0;
        while (i2 < this.c) {
            int d = this.b[i2].d() + i3;
            if (i < i3 || i >= d) {
                i2++;
                i3 = d;
            } else {
                i3 = i - i3;
                daj daj = this.b[i2];
                if (daj.c() && i3 == 0 && (daj.d() > 0 || daj.b())) {
                    return null;
                }
                return this.b[i2].e().getItem(i3);
            }
        }
        return null;
    }

    public long getItemId(int i) {
        int i2 = 0;
        d();
        int i3 = 0;
        while (i2 < this.c) {
            int d = this.b[i2].d() + i3;
            if (i < i3 || i >= d) {
                i2++;
                i3 = d;
            } else {
                i3 = i - i3;
                daj daj = this.b[i2];
                if (daj.c() && i3 == 0 && (daj.d() > 0 || daj.b())) {
                    return 0;
                }
                return this.b[i2].e().getItemId(i3);
            }
        }
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        int i2 = 0;
        d();
        int i3 = 0;
        while (i2 < this.c) {
            daj daj = this.b[i2];
            int d = daj.d() + i3;
            if (i < i3 || i >= d) {
                i2++;
                i3 = d;
            } else {
                View a;
                i3 = i - i3;
                if (!daj.c() || (daj.d() <= 0 && !daj.b())) {
                    d = i3;
                } else {
                    d = i3 - 1;
                }
                if (d == -1) {
                    a = daj.a(view, viewGroup);
                } else {
                    a = daj.e().getView(d, view, viewGroup);
                }
                if (a != null) {
                    return a;
                }
                throw new NullPointerException("View should not be null, partition: " + i2 + " position: " + d);
            }
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public boolean isEnabled(int i) {
        d();
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.c) {
            daj daj = this.b[i2];
            int d = daj.d() + i3;
            if (i >= i3 && i < d) {
                i3 = i - i3;
                if (daj.c() && i3 == 0 && (daj.d() > 0 || daj.b())) {
                    return false;
                }
            }
            i2++;
            i3 = d;
        }
        return true;
    }

    public dah(Context context, byo byo, cbm cbm) {
        this(context);
        a(new daj(false, false, byo));
        a(new cbl(this, cbm));
    }
}
