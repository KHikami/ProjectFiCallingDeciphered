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

/* compiled from: PG */
public final class uy extends BaseAdapter {
    public up a;
    boolean b;
    public final /* synthetic */ ActivityChooserView c;
    private int d;
    private boolean e;
    private boolean f;

    public uy(ActivityChooserView activityChooserView) {
        this.c = activityChooserView;
        this.d = 4;
    }

    public final int getItemViewType(int i) {
        if (this.f && i == getCount() - 1) {
            return 1;
        }
        return 0;
    }

    public final int getViewTypeCount() {
        return 3;
    }

    public final int getCount() {
        int a = this.a.a();
        if (!(this.b || this.a.b() == null)) {
            a--;
        }
        a = Math.min(a, this.d);
        if (this.f) {
            return a + 1;
        }
        return a;
    }

    public final Object getItem(int i) {
        switch (getItemViewType(i)) {
            case rl.c /*0*/:
                if (!(this.b || this.a.b() == null)) {
                    i++;
                }
                return this.a.a(i);
            case rq.b /*1*/:
                return null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        switch (getItemViewType(i)) {
            case rl.c /*0*/:
                if (view == null || view.getId() != buf.bv) {
                    view = LayoutInflater.from(this.c.getContext()).inflate(buf.bN, viewGroup, false);
                }
                PackageManager packageManager = this.c.getContext().getPackageManager();
                ResolveInfo resolveInfo = (ResolveInfo) getItem(i);
                ((ImageView) view.findViewById(buf.bt)).setImageDrawable(resolveInfo.loadIcon(packageManager));
                ((TextView) view.findViewById(buf.bF)).setText(resolveInfo.loadLabel(packageManager));
                if (this.b && i == 0 && this.e) {
                    kn.c(view, true);
                    return view;
                }
                kn.c(view, false);
                return view;
            case rq.b /*1*/:
                if (view != null && view.getId() == 1) {
                    return view;
                }
                view = LayoutInflater.from(this.c.getContext()).inflate(buf.bN, viewGroup, false);
                view.setId(1);
                ((TextView) view.findViewById(buf.bF)).setText(this.c.getContext().getString(buf.cb));
                return view;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final int a() {
        int i = 0;
        int i2 = this.d;
        this.d = Integer.MAX_VALUE;
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
        this.d = i2;
        return i3;
    }

    public final void a(int i) {
        if (this.d != i) {
            this.d = i;
            notifyDataSetChanged();
        }
    }

    public final void a(boolean z) {
        if (this.f != z) {
            this.f = z;
            notifyDataSetChanged();
        }
    }

    public final void a(boolean z, boolean z2) {
        if (this.b != z || this.e != z2) {
            this.b = z;
            this.e = z2;
            notifyDataSetChanged();
        }
    }
}
