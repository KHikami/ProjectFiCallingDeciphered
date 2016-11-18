package defpackage;

import android.support.v7.view.menu.ListMenuItemView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

public final class xx extends BaseAdapter {
    static final int a = gwb.bY;
    xy b;
    private int c = -1;
    private boolean d;
    private final boolean e;
    private final LayoutInflater f;

    public /* synthetic */ Object getItem(int i) {
        return a(i);
    }

    public xx(xy xyVar, LayoutInflater layoutInflater, boolean z) {
        this.e = z;
        this.f = layoutInflater;
        this.b = xyVar;
        b();
    }

    public void a(boolean z) {
        this.d = z;
    }

    public int getCount() {
        ArrayList n = this.e ? this.b.n() : this.b.k();
        if (this.c < 0) {
            return n.size();
        }
        return n.size() - 1;
    }

    public xy a() {
        return this.b;
    }

    public yc a(int i) {
        ArrayList n = this.e ? this.b.n() : this.b.k();
        if (this.c >= 0 && i >= this.c) {
            i++;
        }
        return (yc) n.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View inflate;
        if (view == null) {
            inflate = this.f.inflate(a, viewGroup, false);
        } else {
            inflate = view;
        }
        yq yqVar = (yq) inflate;
        if (this.d) {
            ((ListMenuItemView) inflate).a(true);
        }
        yqVar.a(a(i), 0);
        return inflate;
    }

    private void b() {
        yc t = this.b.t();
        if (t != null) {
            ArrayList n = this.b.n();
            int size = n.size();
            for (int i = 0; i < size; i++) {
                if (((yc) n.get(i)) == t) {
                    this.c = i;
                    return;
                }
            }
        }
        this.c = -1;
    }

    public void notifyDataSetChanged() {
        b();
        super.notifyDataSetChanged();
    }
}
