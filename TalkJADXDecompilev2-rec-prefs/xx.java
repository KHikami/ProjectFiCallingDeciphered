package p000;

import android.support.v7.view.menu.ListMenuItemView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

public final class xx extends BaseAdapter {
    static final int f35753a = gwb.bY;
    xy f35754b;
    private int f35755c = -1;
    private boolean f35756d;
    private final boolean f35757e;
    private final LayoutInflater f35758f;

    public /* synthetic */ Object getItem(int i) {
        return m41398a(i);
    }

    public xx(xy xyVar, LayoutInflater layoutInflater, boolean z) {
        this.f35757e = z;
        this.f35758f = layoutInflater;
        this.f35754b = xyVar;
        m41396b();
    }

    public void m41399a(boolean z) {
        this.f35756d = z;
    }

    public int getCount() {
        ArrayList n = this.f35757e ? this.f35754b.m41443n() : this.f35754b.m41440k();
        if (this.f35755c < 0) {
            return n.size();
        }
        return n.size() - 1;
    }

    public xy m41397a() {
        return this.f35754b;
    }

    public yc m41398a(int i) {
        ArrayList n = this.f35757e ? this.f35754b.m41443n() : this.f35754b.m41440k();
        if (this.f35755c >= 0 && i >= this.f35755c) {
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
            inflate = this.f35758f.inflate(f35753a, viewGroup, false);
        } else {
            inflate = view;
        }
        yq yqVar = (yq) inflate;
        if (this.f35756d) {
            ((ListMenuItemView) inflate).a(true);
        }
        yqVar.m41523a(m41398a(i), 0);
        return inflate;
    }

    private void m41396b() {
        yc t = this.f35754b.m41449t();
        if (t != null) {
            ArrayList n = this.f35754b.m41443n();
            int size = n.size();
            for (int i = 0; i < size; i++) {
                if (((yc) n.get(i)) == t) {
                    this.f35755c = i;
                    return;
                }
            }
        }
        this.f35755c = -1;
    }

    public void notifyDataSetChanged() {
        m41396b();
        super.notifyDataSetChanged();
    }
}
