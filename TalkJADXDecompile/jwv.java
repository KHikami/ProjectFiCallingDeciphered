import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class jwv extends BaseAdapter implements jwl {
    private jwu a;
    private List<jwi> b;
    private ArrayList<jwx> c;
    private jwx d;
    private boolean e;
    private volatile boolean f;
    private Handler g;
    private Runnable h;

    public /* synthetic */ Object getItem(int i) {
        return a(i);
    }

    public jwv(jwu jwu) {
        this.d = new jwx();
        this.e = false;
        this.f = false;
        this.g = new Handler();
        this.h = new jww(this);
        this.a = jwu;
        this.a.b = this;
        this.b = new ArrayList();
        this.c = new ArrayList();
        c();
    }

    void c() {
        synchronized (this) {
            if (this.f) {
                return;
            }
            this.f = true;
            List arrayList = new ArrayList(this.b.size());
            a(arrayList, this.a);
            this.b = arrayList;
            notifyDataSetChanged();
            synchronized (this) {
                this.f = false;
                notifyAll();
            }
        }
    }

    private void a(List<jwi> list, jwu jwu) {
        jwu.f();
        int a = jwu.a();
        for (int i = 0; i < a; i++) {
            jwi a2 = jwu.a(i);
            list.add(a2);
            if (!this.e && a2.F()) {
                jwx a3 = a(a2, null);
                int binarySearch = Collections.binarySearch(this.c, a3);
                if (binarySearch < 0) {
                    this.c.add((-binarySearch) - 1, a3);
                }
            }
            if (a2 instanceof jwu) {
                jwu jwu2 = (jwu) a2;
                if (jwu2.d()) {
                    a((List) list, jwu2);
                }
            }
            a2.b = this;
        }
    }

    private static jwx a(jwi jwi, jwx jwx) {
        if (jwx == null) {
            jwx = new jwx();
        }
        jwx.c = jwi.getClass().getName();
        jwx.a = jwi.l();
        jwx.b = jwi.m();
        return jwx;
    }

    public int getCount() {
        return this.b.size();
    }

    private jwi a(int i) {
        if (i < 0 || i >= getCount()) {
            return null;
        }
        return (jwi) this.b.get(i);
    }

    public long getItemId(int i) {
        if (i < 0 || i >= getCount()) {
            return Long.MIN_VALUE;
        }
        return a(i).r();
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        jwi a = a(i);
        this.d = a(a, this.d);
        if (Collections.binarySearch(this.c, this.d) < 0) {
            view = null;
        }
        return a.a(view, viewGroup);
    }

    public boolean isEnabled(int i) {
        if (i < 0 || i >= getCount()) {
            return true;
        }
        return a(i).q();
    }

    public boolean areAllItemsEnabled() {
        return false;
    }

    public void a() {
        notifyDataSetChanged();
    }

    public void b() {
        this.g.removeCallbacks(this.h);
        this.g.post(this.h);
    }

    public boolean hasStableIds() {
        return true;
    }

    public int getItemViewType(int i) {
        if (!this.e) {
            this.e = true;
        }
        jwi a = a(i);
        if (!a.F()) {
            return -1;
        }
        this.d = a(a, this.d);
        int binarySearch = Collections.binarySearch(this.c, this.d);
        if (binarySearch >= 0) {
            return binarySearch;
        }
        return -1;
    }

    public int getViewTypeCount() {
        if (!this.e) {
            this.e = true;
        }
        return Math.max(1, this.c.size());
    }
}
