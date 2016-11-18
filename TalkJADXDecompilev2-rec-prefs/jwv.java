package p000;

import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class jwv extends BaseAdapter implements jwl {
    private jwu f21168a;
    private List<jwi> f21169b;
    private ArrayList<jwx> f21170c;
    private jwx f21171d = new jwx();
    private boolean f21172e = false;
    private volatile boolean f21173f = false;
    private Handler f21174g = new Handler();
    private Runnable f21175h = new jww(this);

    public /* synthetic */ Object getItem(int i) {
        return m25348a(i);
    }

    public jwv(jwu jwu) {
        this.f21168a = jwu;
        this.f21168a.f3262b = this;
        this.f21169b = new ArrayList();
        this.f21170c = new ArrayList();
        m25353c();
    }

    void m25353c() {
        synchronized (this) {
            if (this.f21173f) {
                return;
            }
            this.f21173f = true;
            List arrayList = new ArrayList(this.f21169b.size());
            m25350a(arrayList, this.f21168a);
            this.f21169b = arrayList;
            notifyDataSetChanged();
            synchronized (this) {
                this.f21173f = false;
                notifyAll();
            }
        }
    }

    private void m25350a(List<jwi> list, jwu jwu) {
        jwu.m10487f();
        int a = jwu.mo531a();
        for (int i = 0; i < a; i++) {
            jwi a2 = jwu.m10477a(i);
            list.add(a2);
            if (!this.f21172e && a2.m5111F()) {
                jwx a3 = jwv.m25349a(a2, null);
                int binarySearch = Collections.binarySearch(this.f21170c, a3);
                if (binarySearch < 0) {
                    this.f21170c.add((-binarySearch) - 1, a3);
                }
            }
            if (a2 instanceof jwu) {
                jwu jwu2 = (jwu) a2;
                if (jwu2.mo1334d()) {
                    m25350a((List) list, jwu2);
                }
            }
            a2.f3262b = this;
        }
    }

    private static jwx m25349a(jwi jwi, jwx jwx) {
        if (jwx == null) {
            jwx = new jwx();
        }
        jwx.f21179c = jwi.getClass().getName();
        jwx.f21177a = jwi.m5154l();
        jwx.f21178b = jwi.m5155m();
        return jwx;
    }

    public int getCount() {
        return this.f21169b.size();
    }

    private jwi m25348a(int i) {
        if (i < 0 || i >= getCount()) {
            return null;
        }
        return (jwi) this.f21169b.get(i);
    }

    public long getItemId(int i) {
        if (i < 0 || i >= getCount()) {
            return Long.MIN_VALUE;
        }
        return m25348a(i).m5160r();
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        jwi a = m25348a(i);
        this.f21171d = jwv.m25349a(a, this.f21171d);
        if (Collections.binarySearch(this.f21170c, this.f21171d) < 0) {
            view = null;
        }
        return a.m5114a(view, viewGroup);
    }

    public boolean isEnabled(int i) {
        if (i < 0 || i >= getCount()) {
            return true;
        }
        return m25348a(i).m5159q();
    }

    public boolean areAllItemsEnabled() {
        return false;
    }

    public void mo3622a() {
        notifyDataSetChanged();
    }

    public void mo3623b() {
        this.f21174g.removeCallbacks(this.f21175h);
        this.f21174g.post(this.f21175h);
    }

    public boolean hasStableIds() {
        return true;
    }

    public int getItemViewType(int i) {
        if (!this.f21172e) {
            this.f21172e = true;
        }
        jwi a = m25348a(i);
        if (!a.m5111F()) {
            return -1;
        }
        this.f21171d = jwv.m25349a(a, this.f21171d);
        int binarySearch = Collections.binarySearch(this.f21170c, this.f21171d);
        if (binarySearch >= 0) {
            return binarySearch;
        }
        return -1;
    }

    public int getViewTypeCount() {
        if (!this.f21172e) {
            this.f21172e = true;
        }
        return Math.max(1, this.f21170c.size());
    }
}
