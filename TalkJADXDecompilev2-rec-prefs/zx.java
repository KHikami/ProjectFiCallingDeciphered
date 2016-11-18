package p000;

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
    final /* synthetic */ ActivityChooserView f35946a;
    private zt f35947b;
    private int f35948c;
    private boolean f35949d;
    private boolean f35950e;
    private boolean f35951f;

    public int getItemViewType(int i) {
        if (this.f35951f && i == getCount() - 1) {
            return 1;
        }
        return 0;
    }

    public int getViewTypeCount() {
        return 3;
    }

    public int getCount() {
        int a = this.f35947b.m41607a();
        if (!(this.f35949d || this.f35947b.m41611b() == null)) {
            a--;
        }
        a = Math.min(a, this.f35948c);
        if (this.f35951f) {
            return a + 1;
        }
        return a;
    }

    public Object getItem(int i) {
        switch (getItemViewType(i)) {
            case 0:
                if (!(this.f35949d || this.f35947b.m41611b() == null)) {
                    i++;
                }
                return this.f35947b.m41609a(i);
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
                    view = LayoutInflater.from(this.f35946a.getContext()).inflate(gwb.bQ, viewGroup, false);
                }
                PackageManager packageManager = this.f35946a.getContext().getPackageManager();
                ResolveInfo resolveInfo = (ResolveInfo) getItem(i);
                ((ImageView) view.findViewById(gwb.by)).setImageDrawable(resolveInfo.loadIcon(packageManager));
                ((TextView) view.findViewById(gwb.bJ)).setText(resolveInfo.loadLabel(packageManager));
                if (this.f35949d && i == 0 && this.f35950e) {
                    oa.m37350c(view, true);
                    return view;
                }
                oa.m37350c(view, false);
                return view;
            case 1:
                if (view != null && view.getId() == 1) {
                    return view;
                }
                view = LayoutInflater.from(this.f35946a.getContext()).inflate(gwb.bQ, viewGroup, false);
                view.setId(1);
                ((TextView) view.findViewById(gwb.bJ)).setText(this.f35946a.getContext().getString(gwb.ce));
                return view;
            default:
                throw new IllegalArgumentException();
        }
    }

    public int m41615a() {
        int i = 0;
        int i2 = this.f35948c;
        this.f35948c = Integer.MAX_VALUE;
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
        this.f35948c = i2;
        return i3;
    }

    public void m41616a(int i) {
        if (this.f35948c != i) {
            this.f35948c = i;
            notifyDataSetChanged();
        }
    }

    public ResolveInfo m41619b() {
        return this.f35947b.m41611b();
    }

    public void m41617a(boolean z) {
        if (this.f35951f != z) {
            this.f35951f = z;
            notifyDataSetChanged();
        }
    }

    public int m41620c() {
        return this.f35947b.m41607a();
    }

    public zt m41621d() {
        return this.f35947b;
    }

    public void m41618a(boolean z, boolean z2) {
        if (this.f35949d != z || this.f35950e != z2) {
            this.f35949d = z;
            this.f35950e = z2;
            notifyDataSetChanged();
        }
    }

    public boolean m41622e() {
        return this.f35949d;
    }
}
