package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

final class xw extends BaseAdapter {
    final /* synthetic */ xv a;
    private int b = -1;

    public /* synthetic */ Object getItem(int i) {
        return a(i);
    }

    public xw(xv xvVar) {
        this.a = xvVar;
        a();
    }

    public int getCount() {
        int size = this.a.c.n().size() - this.a.e;
        return this.b < 0 ? size : size - 1;
    }

    public yc a(int i) {
        ArrayList n = this.a.c.n();
        int i2 = this.a.e + i;
        if (this.b >= 0 && i2 >= this.b) {
            i2++;
        }
        return (yc) n.get(i2);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View inflate;
        if (view == null) {
            inflate = this.a.b.inflate(this.a.g, viewGroup, false);
        } else {
            inflate = view;
        }
        ((yq) inflate).a(a(i), 0);
        return inflate;
    }

    private void a() {
        yc t = this.a.c.t();
        if (t != null) {
            ArrayList n = this.a.c.n();
            int size = n.size();
            for (int i = 0; i < size; i++) {
                if (((yc) n.get(i)) == t) {
                    this.b = i;
                    return;
                }
            }
        }
        this.b = -1;
    }

    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
