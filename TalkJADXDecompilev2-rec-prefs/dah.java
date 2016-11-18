package p000;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class dah extends BaseAdapter {
    public final Context f9418a;
    private daj[] f9419b;
    private int f9420c;
    private int f9421d;
    private boolean f9422e;
    private dai f9423f;

    public dah(Context context) {
        this.f9420c = 0;
        this.f9421d = 0;
        this.f9422e = true;
        this.f9418a = context;
        this.f9423f = new dai(this);
        this.f9419b = new daj[2];
    }

    public Context m11373a() {
        return this.f9418a;
    }

    public void m11374a(daj daj) {
        if (this.f9420c >= this.f9419b.length) {
            Object obj = new daj[(this.f9420c + 2)];
            System.arraycopy(this.f9419b, 0, obj, 0, this.f9420c);
            this.f9419b = obj;
        }
        daj[] dajArr = this.f9419b;
        int i = this.f9420c;
        this.f9420c = i + 1;
        dajArr[i] = daj;
        daj.m7151e().registerDataSetObserver(this.f9423f);
        m11376c();
        notifyDataSetChanged();
    }

    public void m11375b() {
        for (int i = 0; i < this.f9420c; i++) {
            daj daj = this.f9419b[i];
            daj.mo802a();
            daj.m7151e().unregisterDataSetObserver(this.f9423f);
        }
        m11376c();
        notifyDataSetChanged();
    }

    public void m11376c() {
        this.f9422e = false;
    }

    private void m11372d() {
        int i = 0;
        if (!this.f9422e) {
            this.f9421d = 0;
            while (i < this.f9420c) {
                this.f9421d += this.f9419b[i].m7150d();
                i++;
            }
        }
    }

    public int getCount() {
        m11372d();
        return this.f9421d;
    }

    public Object getItem(int i) {
        int i2 = 0;
        m11372d();
        int i3 = 0;
        while (i2 < this.f9420c) {
            int d = this.f9419b[i2].m7150d() + i3;
            if (i < i3 || i >= d) {
                i2++;
                i3 = d;
            } else {
                i3 = i - i3;
                daj daj = this.f9419b[i2];
                if (daj.m7149c() && i3 == 0 && (daj.m7150d() > 0 || daj.m7148b())) {
                    return null;
                }
                return this.f9419b[i2].m7151e().getItem(i3);
            }
        }
        return null;
    }

    public long getItemId(int i) {
        int i2 = 0;
        m11372d();
        int i3 = 0;
        while (i2 < this.f9420c) {
            int d = this.f9419b[i2].m7150d() + i3;
            if (i < i3 || i >= d) {
                i2++;
                i3 = d;
            } else {
                i3 = i - i3;
                daj daj = this.f9419b[i2];
                if (daj.m7149c() && i3 == 0 && (daj.m7150d() > 0 || daj.m7148b())) {
                    return 0;
                }
                return this.f9419b[i2].m7151e().getItemId(i3);
            }
        }
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        int i2 = 0;
        m11372d();
        int i3 = 0;
        while (i2 < this.f9420c) {
            daj daj = this.f9419b[i2];
            int d = daj.m7150d() + i3;
            if (i < i3 || i >= d) {
                i2++;
                i3 = d;
            } else {
                View a;
                i3 = i - i3;
                if (!daj.m7149c() || (daj.m7150d() <= 0 && !daj.m7148b())) {
                    d = i3;
                } else {
                    d = i3 - 1;
                }
                if (d == -1) {
                    a = daj.mo801a(view, viewGroup);
                } else {
                    a = daj.m7151e().getView(d, view, viewGroup);
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
        m11372d();
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.f9420c) {
            daj daj = this.f9419b[i2];
            int d = daj.m7150d() + i3;
            if (i >= i3 && i < d) {
                i3 = i - i3;
                if (daj.m7149c() && i3 == 0 && (daj.m7150d() > 0 || daj.m7148b())) {
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
        m11374a(new daj(false, false, byo));
        m11374a(new cbl(this, cbm));
    }
}
