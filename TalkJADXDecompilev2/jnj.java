package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

final class jnj extends BaseAdapter {
    private final Context a;
    private final int[] b;
    private final boolean c;

    jnj(Context context, int[] iArr, boolean z) {
        this.a = context;
        this.b = iArr;
        this.c = z;
    }

    public int getCount() {
        return (this.c ? 1 : 0) + this.b.length;
    }

    public int getViewTypeCount() {
        return this.c ? 2 : 1;
    }

    public int getItemViewType(int i) {
        return (this.c && i == this.b.length) ? 1 : 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        switch (getItemViewType(i)) {
            case 0:
                view = (joz) view;
                if (view == null) {
                    view = new joz(this.a);
                }
                view.a(this.b[i]);
                return view;
            case 1:
                if (view == null) {
                    return LayoutInflater.from(this.a).inflate(gwb.zm, null);
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
