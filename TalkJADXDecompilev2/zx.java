package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.support.v7.widget.ActivityChooserView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public final class zx extends BaseAdapter {
    final /* synthetic */ ActivityChooserView a;
    private zt b;
    private int c;
    private boolean d;
    private boolean e;
    private boolean f;

    public int getItemViewType(int i) {
        if (this.f && i == getCount() - 1) {
            return 1;
        }
        return 0;
    }

    public int getViewTypeCount() {
        return 3;
    }

    public int getCount() {
        int a = this.b.a();
        if (!(this.d || this.b.b() == null)) {
            a--;
        }
        a = Math.min(a, this.c);
        if (this.f) {
            return a + 1;
        }
        return a;
    }

    public Object getItem(int i) {
        switch (getItemViewType(i)) {
            case 0:
                if (!(this.d || this.b.b() == null)) {
                    i++;
                }
                return this.b.a(i);
            case 1:
                return null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        switch (getItemViewType(i)) {
            case 0:
                if (view == null || view.getId() != gwb.bz) {
                    view = LayoutInflater.from(this.a.getContext()).inflate(gwb.bQ, viewGroup, false);
                }
                PackageManager packageManager = this.a.getContext().getPackageManager();
                ResolveInfo resolveInfo = (ResolveInfo) getItem(i);
                ((ImageView) view.findViewById(gwb.by)).setImageDrawable(resolveInfo.loadIcon(packageManager));
                ((TextView) view.findViewById(gwb.bJ)).setText(resolveInfo.loadLabel(packageManager));
                if (this.d && i == 0 && this.e) {
                    oa.c(view, true);
                    return view;
                }
                oa.c(view, false);
                return view;
            case 1:
                if (view != null && view.getId() == 1) {
                    return view;
                }
                view = LayoutInflater.from(this.a.getContext()).inflate(gwb.bQ, viewGroup, false);
                view.setId(1);
                ((TextView) view.findViewById(gwb.bJ)).setText(this.a.getContext().getString(gwb.ce));
                return view;
            default:
                throw new IllegalArgumentException();
        }
    }

    public int a() {
        int i = 0;
        int i2 = this.c;
        this.c = Integer.MAX_VALUE;
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(0, 0);
        int count = getCount();
        View view = null;
        int i3 = 0;
        while (i < count) {
            view = getView(i, view, null);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i3 = Math.max(i3, view.getMeasuredWidth());
            i++;
        }
        this.c = i2;
        return i3;
    }

    public void a(int i) {
        if (this.c != i) {
            this.c = i;
            notifyDataSetChanged();
        }
    }

    public ResolveInfo b() {
        return this.b.b();
    }

    public void a(boolean z) {
        if (this.f != z) {
            this.f = z;
            notifyDataSetChanged();
        }
    }

    public int c() {
        return this.b.a();
    }

    public zt d() {
        return this.b;
    }

    public void a(boolean z, boolean z2) {
        if (this.d != z || this.e != z2) {
            this.d = z;
            this.e = z2;
            notifyDataSetChanged();
        }
    }

    public boolean e() {
        return this.d;
    }
}
