package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

final class xw extends BaseAdapter {
    final /* synthetic */ xv f35751a;
    private int f35752b = -1;

    public /* synthetic */ Object getItem(int i) {
        return m41395a(i);
    }

    public xw(xv xvVar) {
        this.f35751a = xvVar;
        m41394a();
    }

    public int getCount() {
        int size = this.f35751a.f35744c.m41443n().size() - this.f35751a.f35746e;
        return this.f35752b < 0 ? size : size - 1;
    }

    public yc m41395a(int i) {
        ArrayList n = this.f35751a.f35744c.m41443n();
        int i2 = this.f35751a.f35746e + i;
        if (this.f35752b >= 0 && i2 >= this.f35752b) {
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
            inflate = this.f35751a.f35743b.inflate(this.f35751a.f35748g, viewGroup, false);
        } else {
            inflate = view;
        }
        ((yq) inflate).m41523a(m41395a(i), 0);
        return inflate;
    }

    private void m41394a() {
        yc t = this.f35751a.f35744c.m41449t();
        if (t != null) {
            ArrayList n = this.f35751a.f35744c.m41443n();
            int size = n.size();
            for (int i = 0; i < size; i++) {
                if (((yc) n.get(i)) == t) {
                    this.f35752b = i;
                    return;
                }
            }
        }
        this.f35752b = -1;
    }

    public void notifyDataSetChanged() {
        m41394a();
        super.notifyDataSetChanged();
    }
}
