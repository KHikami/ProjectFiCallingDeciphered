package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.widget.ContentLoadingProgressBar;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import java.util.List;

/* renamed from: htc */
public final class htc extends BaseAdapter implements hsq {
    private static final int a;
    private hst b;
    private String c;
    private htg d;
    private hte e;
    private int f;
    private LayoutInflater g;
    private int h;
    private Context i;
    private List<hwn> j;
    private boolean k;
    private boolean l;
    private boolean m;
    private hsp n;
    private boolean o;

    public /* synthetic */ Object getItem(int i) {
        return a(i);
    }

    static {
        a = ba.mZ;
    }

    public htc(Context context, int i, htg htg, hte hte) {
        this.o = false;
        this.j = new ArrayList();
        this.k = true;
        this.l = true;
        this.i = context;
        if (i == -1) {
            i = a;
        }
        this.f = i;
        this.g = LayoutInflater.from(context);
        if (htg == null) {
            htg = new htd(this);
        }
        this.d = htg;
        this.e = hte;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new TypedValue().data, new int[]{gwb.xf});
        this.h = obtainStyledAttributes.getColor(0, context.getResources().getColor(gwb.xg));
        obtainStyledAttributes.recycle();
        this.n = new hsp(context, this);
    }

    public void a(hst hst) {
        this.b = hst;
    }

    public void a(boolean z) {
        if (!this.k) {
            this.k = true;
            notifyDataSetChanged();
        }
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View inflate;
        if (getItemViewType(i) == 3) {
            if (view != null) {
                return view;
            }
            inflate = this.g.inflate(ba.nc, null);
            ((ContentLoadingProgressBar) inflate).a();
            return inflate;
        } else if (getItemViewType(i) == 2) {
            if (view == null) {
                return this.g.inflate(ba.nb, null);
            }
            return view;
        } else if (getItemViewType(i) != 1) {
            if (view == null) {
                inflate = this.g.inflate(this.f, null);
            } else {
                inflate = view;
            }
            hwn a = a(i);
            boolean z = false;
            if (this.c != null && gwb.a(a)) {
                z = this.c.equals(a.a());
            }
            return a(inflate, a, this.b, this.d, this.e, z, this.h);
        } else if (view == null) {
            return this.g.inflate(ba.na, null);
        } else {
            return view;
        }
    }

    public boolean isEnabled(int i) {
        if (this.o) {
            return false;
        }
        return true;
    }

    public int getViewTypeCount() {
        return 4;
    }

    public int getItemViewType(int i) {
        if (this.o) {
            return 3;
        }
        if (c(i)) {
            return 2;
        }
        if (b(i)) {
            return 1;
        }
        return 0;
    }

    private View a(View view, hwn hwn, hst hst, htg htg, hte hte, boolean z, int i) {
        htf a;
        if (view.getTag() == null) {
            a = htg.a(view);
            view.setTag(a);
        } else {
            a = (htf) view.getTag();
        }
        if (!(a.e == null || hst == null || !gwb.a(hwn))) {
            a.e.setImageDrawable(null);
            if (TextUtils.isEmpty(hwn.h())) {
                hst.a(a.e);
                a.e.setImageBitmap(hst.a(view.getContext()));
            } else {
                hst.a(a.e);
                hst.a(a.e, hwn, 1);
            }
        }
        if (a.d != null && gwb.a(hwn)) {
            a.d.setTextColor(i);
            a.d.setVisibility(0);
            a.d.setText(hwn.a());
            a.d.setContentDescription(this.i.getResources().getString(bm.al, new Object[]{hwn.a()}));
        }
        if (hte != null) {
            hte.a(a, hwn);
        }
        return view;
    }

    public void b(List<hwn> list) {
        c((List) list);
    }

    private void c(List<hwn> list) {
        if (this.m || (list != null && list.size() <= 1)) {
            if (this.j == null) {
                this.j = new ArrayList();
            }
            this.j.clear();
            if (list != null) {
                for (hwn add : list) {
                    this.j.add(add);
                }
            }
            notifyDataSetChanged();
            return;
        }
        this.o = true;
        this.n.a(list);
        notifyDataSetChanged();
    }

    public void a(List<hwn> list) {
        this.o = false;
        this.j = list != null ? new ArrayList(list) : null;
        notifyDataSetChanged();
    }

    public int getCount() {
        int i = 1;
        int i2 = 0;
        if (this.o) {
            return 1;
        }
        int i3 = this.k ? 1 : 0;
        if (!this.l) {
            i = 0;
        }
        i3 += i;
        if (this.j != null) {
            i2 = this.j.size();
        }
        return i3 + i2;
    }

    public hwn a(int i) {
        if (b(i) || c(i) || this.j == null || this.j.size() <= 0) {
            return null;
        }
        return (hwn) this.j.get(i);
    }

    private boolean c(int i) {
        return this.k && i == getCount() - 1;
    }

    public long getItemId(int i) {
        if (c(i)) {
            return -2;
        }
        if (b(i)) {
            return -1;
        }
        if (this.j == null || this.j.size() <= 0) {
            return -1;
        }
        hwn hwn = (hwn) this.j.get(i);
        return gwb.a(hwn) ? (long) hwn.a().hashCode() : -1;
    }

    public void b(boolean z) {
        this.m = true;
    }

    public static List<hwn> a(List<hwn> list, hwn hwn, hwn hwn2) {
        String str = null;
        Object a;
        if (gwb.a(hwn2)) {
            a = hwn2.a();
        } else {
            a = null;
        }
        if (gwb.a(hwn)) {
            str = hwn.a();
        }
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < list.size(); i3++) {
            hwn hwn3 = (hwn) list.get(i3);
            if (gwb.a(hwn3)) {
                if (i2 < 0 && hwn3.a().equals(r1)) {
                    i2 = i3;
                }
                if (i < 0 && hwn3.a().equals(r2)) {
                    i = i3;
                }
            }
        }
        if (i2 >= 0) {
            list.remove(i2);
        }
        if (!(i >= 0 || r2 == null || r2.equals(r1))) {
            list.add(hwn);
        }
        return list;
    }

    private boolean b(int i) {
        int i2;
        if (this.k) {
            i2 = -2;
        } else {
            i2 = -1;
        }
        if (this.l && i == r0 + getCount()) {
            return true;
        }
        return false;
    }
}
