package p000;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class dyx extends BaseAdapter {
    private final List<dyy> f10882a = new ArrayList();
    private boolean f10883b;
    private final jca f10884c;
    private final jyn f10885d;
    private final Activity f10886e;

    public dyx(jzn jzn) {
        this.f10886e = jzn.getActivity();
        this.f10885d = jzn.getBinder();
        this.f10884c = (jca) this.f10885d.m25443a(jca.class);
    }

    public void m13093a() {
        this.f10882a.clear();
        List<dyy> c = this.f10885d.m25457c(dyy.class);
        Collections.sort(c);
        bko e = fde.m15018e(this.f10884c.mo2317a());
        if (e != null) {
            int i = -1;
            for (dyy dyy : c) {
                int i2;
                dyy.mo2178a(e);
                if (dyy.m12443g()) {
                    int d = dyy.mo1643d();
                    if (!(d == i || i == -1)) {
                        this.f10882a.add(new dzc());
                    }
                    this.f10882a.add(dyy);
                    i2 = d;
                } else {
                    i2 = i;
                }
                i = i2;
            }
        }
        notifyDataSetChanged();
    }

    public void m13094a(boolean z) {
        if (this.f10883b != z) {
            this.f10883b = z;
            for (dyy a : this.f10882a) {
                a.mo2179a(z);
            }
        }
    }

    public final boolean areAllItemsEnabled() {
        return false;
    }

    public final boolean isEnabled(int i) {
        return ((dyy) this.f10882a.get(i)).m12443g();
    }

    public final int getCount() {
        return this.f10882a.size();
    }

    public final Object getItem(int i) {
        return this.f10882a.get(i);
    }

    public final long getItemId(int i) {
        return (long) ((dyy) this.f10882a.get(i)).mo1642c();
    }

    public final boolean hasStableIds() {
        return false;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        dyy dyy = (dyy) this.f10882a.get(i);
        Activity activity = this.f10886e;
        if (dyy.mo1785h()) {
            if (view == null || view.findViewById(ba.fD) == null) {
                view = activity.getLayoutInflater().inflate(gwb.hi, viewGroup, false);
            }
            view.setBackgroundResource(dyy.m12445i());
            dyy.f10302b = (TextView) view.findViewById(ba.fD);
            dyy.f10302b.setText(dyy.mo1639a());
            dyy.f10303c = (TextView) view.findViewById(ba.aE);
            CharSequence f = dyy.mo2180f();
            if (TextUtils.isEmpty(f)) {
                dyy.f10303c.setVisibility(8);
            } else {
                dyy.f10303c.setText(f);
                dyy.f10303c.setVisibility(0);
            }
            dyy.f10304d = (ImageView) view.findViewById(ba.cr);
            dyy.f10304d.setImageResource(dyy.mo1641b());
            dyy.f10304d.clearColorFilter();
            dyy.f10305e = (ImageView) view.findViewById(ba.cs);
            dyy.f10305e.setVisibility(8);
            return view;
        } else if (view == null) {
            return activity.getLayoutInflater().inflate(gwb.gX, viewGroup, false);
        } else {
            return view;
        }
    }

    public final int getItemViewType(int i) {
        return ((dyy) this.f10882a.get(i)).m12443g() ? 1 : 0;
    }

    public final int getViewTypeCount() {
        return 2;
    }

    public final boolean isEmpty() {
        return this.f10882a.isEmpty();
    }
}
