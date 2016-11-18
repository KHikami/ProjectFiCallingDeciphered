package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

final class jnj extends BaseAdapter {
    private final Context f20535a;
    private final int[] f20536b;
    private final boolean f20537c;

    jnj(Context context, int[] iArr, boolean z) {
        this.f20535a = context;
        this.f20536b = iArr;
        this.f20537c = z;
    }

    public int getCount() {
        return (this.f20537c ? 1 : 0) + this.f20536b.length;
    }

    public int getViewTypeCount() {
        return this.f20537c ? 2 : 1;
    }

    public int getItemViewType(int i) {
        return (this.f20537c && i == this.f20536b.length) ? 1 : 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        switch (getItemViewType(i)) {
            case 0:
                view = (joz) view;
                if (view == null) {
                    view = new joz(this.f20535a);
                }
                view.m24883a(this.f20536b[i]);
                return view;
            case 1:
                if (view == null) {
                    return LayoutInflater.from(this.f20535a).inflate(gwb.zm, null);
                }
                return view;
            default:
                return null;
        }
    }

    public Object getItem(int i) {
        return null;
    }

    public long getItemId(int i) {
        return (long) i;
    }
}
