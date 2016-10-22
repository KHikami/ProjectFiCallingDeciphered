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
    private final List<dyy> a;
    private boolean b;
    private final jca c;
    private final jyn d;
    private final Activity e;

    public dyx(jzn jzn) {
        this.a = new ArrayList();
        this.e = jzn.getActivity();
        this.d = jzn.getBinder();
        this.c = (jca) this.d.a(jca.class);
    }

    public void a() {
        this.a.clear();
        List<dyy> c = this.d.c(dyy.class);
        Collections.sort(c);
        bko e = fde.e(this.c.a());
        if (e != null) {
            int i = -1;
            for (dyy dyy : c) {
                int i2;
                dyy.a(e);
                if (dyy.g()) {
                    int d = dyy.d();
                    if (!(d == i || i == -1)) {
                        this.a.add(new dzc());
                    }
                    this.a.add(dyy);
                    i2 = d;
                } else {
                    i2 = i;
                }
                i = i2;
            }
        }
        notifyDataSetChanged();
    }

    public void a(boolean z) {
        if (this.b != z) {
            this.b = z;
            for (dyy a : this.a) {
                a.a(z);
            }
        }
    }

    public final boolean areAllItemsEnabled() {
        return false;
    }

    public final boolean isEnabled(int i) {
        return ((dyy) this.a.get(i)).g();
    }

    public final int getCount() {
        return this.a.size();
    }

    public final Object getItem(int i) {
        return this.a.get(i);
    }

    public final long getItemId(int i) {
        return (long) ((dyy) this.a.get(i)).c();
    }

    public final boolean hasStableIds() {
        return false;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        dyy dyy = (dyy) this.a.get(i);
        Activity activity = this.e;
        if (dyy.h()) {
            if (view == null || view.findViewById(ba.fD) == null) {
                view = activity.getLayoutInflater().inflate(gwb.hi, viewGroup, false);
            }
            view.setBackgroundResource(dyy.i());
            dyy.b = (TextView) view.findViewById(ba.fD);
            dyy.b.setText(dyy.a());
            dyy.c = (TextView) view.findViewById(ba.aE);
            CharSequence f = dyy.f();
            if (TextUtils.isEmpty(f)) {
                dyy.c.setVisibility(8);
            } else {
                dyy.c.setText(f);
                dyy.c.setVisibility(0);
            }
            dyy.d = (ImageView) view.findViewById(ba.cr);
            dyy.d.setImageResource(dyy.b());
            dyy.d.clearColorFilter();
            dyy.e = (ImageView) view.findViewById(ba.cs);
            dyy.e.setVisibility(8);
            return view;
        } else if (view == null) {
            return activity.getLayoutInflater().inflate(gwb.gX, viewGroup, false);
        } else {
            return view;
        }
    }

    public final int getItemViewType(int i) {
        return ((dyy) this.a.get(i)).g() ? 1 : 0;
    }

    public final int getViewTypeCount() {
        return 2;
    }

    public final boolean isEmpty() {
        return this.a.isEmpty();
    }
}
