package p000;

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

public final class htc extends BaseAdapter implements hsq {
    private static final int f17235a = ba.mZ;
    private hst f17236b;
    private String f17237c;
    private htg f17238d;
    private hte f17239e;
    private int f17240f;
    private LayoutInflater f17241g;
    private int f17242h;
    private Context f17243i;
    private List<hwn> f17244j = new ArrayList();
    private boolean f17245k = true;
    private boolean f17246l = true;
    private boolean f17247m;
    private hsp f17248n;
    private boolean f17249o = false;

    public /* synthetic */ Object getItem(int i) {
        return m20821a(i);
    }

    public htc(Context context, int i, htg htg, hte hte) {
        this.f17243i = context;
        if (i == -1) {
            i = f17235a;
        }
        this.f17240f = i;
        this.f17241g = LayoutInflater.from(context);
        if (htg == null) {
            htg = new htd(this);
        }
        this.f17238d = htg;
        this.f17239e = hte;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new TypedValue().data, new int[]{gwb.xf});
        this.f17242h = obtainStyledAttributes.getColor(0, context.getResources().getColor(gwb.xg));
        obtainStyledAttributes.recycle();
        this.f17248n = new hsp(context, this);
    }

    public void m20822a(hst hst) {
        this.f17236b = hst;
    }

    public void m20824a(boolean z) {
        if (!this.f17245k) {
            this.f17245k = true;
            notifyDataSetChanged();
        }
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View inflate;
        if (getItemViewType(i) == 3) {
            if (view != null) {
                return view;
            }
            inflate = this.f17241g.inflate(ba.nc, null);
            ((ContentLoadingProgressBar) inflate).m3203a();
            return inflate;
        } else if (getItemViewType(i) == 2) {
            if (view == null) {
                return this.f17241g.inflate(ba.nb, null);
            }
            return view;
        } else if (getItemViewType(i) != 1) {
            if (view == null) {
                inflate = this.f17241g.inflate(this.f17240f, null);
            } else {
                inflate = view;
            }
            hwn a = m20821a(i);
            boolean z = false;
            if (this.f17237c != null && gwb.m1927a(a)) {
                z = this.f17237c.equals(a.mo1778a());
            }
            return m20816a(inflate, a, this.f17236b, this.f17238d, this.f17239e, z, this.f17242h);
        } else if (view == null) {
            return this.f17241g.inflate(ba.na, null);
        } else {
            return view;
        }
    }

    public boolean isEnabled(int i) {
        if (this.f17249o) {
            return false;
        }
        return true;
    }

    public int getViewTypeCount() {
        return 4;
    }

    public int getItemViewType(int i) {
        if (this.f17249o) {
            return 3;
        }
        if (m20820c(i)) {
            return 2;
        }
        if (m20818b(i)) {
            return 1;
        }
        return 0;
    }

    private View m20816a(View view, hwn hwn, hst hst, htg htg, hte hte, boolean z, int i) {
        htf a;
        if (view.getTag() == null) {
            a = htg.mo1777a(view);
            view.setTag(a);
        } else {
            a = (htf) view.getTag();
        }
        if (!(a.f10841e == null || hst == null || !gwb.m1927a(hwn))) {
            a.f10841e.setImageDrawable(null);
            if (TextUtils.isEmpty(hwn.mo1783h())) {
                hst.m20792a(a.f10841e);
                a.f10841e.setImageBitmap(hst.m20797a(view.getContext()));
            } else {
                hst.m20792a(a.f10841e);
                hst.m20799a(a.f10841e, hwn, 1);
            }
        }
        if (a.f10840d != null && gwb.m1927a(hwn)) {
            a.f10840d.setTextColor(i);
            a.f10840d.setVisibility(0);
            a.f10840d.setText(hwn.mo1778a());
            a.f10840d.setContentDescription(this.f17243i.getResources().getString(bm.al, new Object[]{hwn.mo1778a()}));
        }
        if (hte != null) {
            hte.m20828a(a, hwn);
        }
        return view;
    }

    public void m20825b(List<hwn> list) {
        m20819c((List) list);
    }

    private void m20819c(List<hwn> list) {
        if (this.f17247m || (list != null && list.size() <= 1)) {
            if (this.f17244j == null) {
                this.f17244j = new ArrayList();
            }
            this.f17244j.clear();
            if (list != null) {
                for (hwn add : list) {
                    this.f17244j.add(add);
                }
            }
            notifyDataSetChanged();
            return;
        }
        this.f17249o = true;
        this.f17248n.m20775a(list);
        notifyDataSetChanged();
    }

    public void mo2947a(List<hwn> list) {
        this.f17249o = false;
        this.f17244j = list != null ? new ArrayList(list) : null;
        notifyDataSetChanged();
    }

    public int getCount() {
        int i = 1;
        int i2 = 0;
        if (this.f17249o) {
            return 1;
        }
        int i3 = this.f17245k ? 1 : 0;
        if (!this.f17246l) {
            i = 0;
        }
        i3 += i;
        if (this.f17244j != null) {
            i2 = this.f17244j.size();
        }
        return i3 + i2;
    }

    public hwn m20821a(int i) {
        if (m20818b(i) || m20820c(i) || this.f17244j == null || this.f17244j.size() <= 0) {
            return null;
        }
        return (hwn) this.f17244j.get(i);
    }

    private boolean m20820c(int i) {
        return this.f17245k && i == getCount() - 1;
    }

    public long getItemId(int i) {
        if (m20820c(i)) {
            return -2;
        }
        if (m20818b(i)) {
            return -1;
        }
        if (this.f17244j == null || this.f17244j.size() <= 0) {
            return -1;
        }
        hwn hwn = (hwn) this.f17244j.get(i);
        return gwb.m1927a(hwn) ? (long) hwn.mo1778a().hashCode() : -1;
    }

    public void m20826b(boolean z) {
        this.f17247m = true;
    }

    public static List<hwn> m20817a(List<hwn> list, hwn hwn, hwn hwn2) {
        String str = null;
        Object a;
        if (gwb.m1927a(hwn2)) {
            a = hwn2.mo1778a();
        } else {
            a = null;
        }
        if (gwb.m1927a(hwn)) {
            str = hwn.mo1778a();
        }
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < list.size(); i3++) {
            hwn hwn3 = (hwn) list.get(i3);
            if (gwb.m1927a(hwn3)) {
                if (i2 < 0 && hwn3.mo1778a().equals(r1)) {
                    i2 = i3;
                }
                if (i < 0 && hwn3.mo1778a().equals(r2)) {
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

    private boolean m20818b(int i) {
        int i2;
        if (this.f17245k) {
            i2 = -2;
        } else {
            i2 = -1;
        }
        if (this.f17246l && i == r0 + getCount()) {
            return true;
        }
        return false;
    }
}
