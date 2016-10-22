package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: ss */
public final class ss extends BaseAdapter {
    private int a;
    private /* synthetic */ sr b;

    public final /* synthetic */ Object getItem(int i) {
        return a(i);
    }

    public ss(sr srVar) {
        this.b = srVar;
        this.a = -1;
        a();
    }

    public final int getCount() {
        int size = this.b.b.j().size();
        sr srVar = this.b;
        return this.a < 0 ? size : size - 1;
    }

    public final sy a(int i) {
        ArrayList j = this.b.b.j();
        sr srVar = this.b;
        if (this.a >= 0 && i >= this.a) {
            i++;
        }
        return (sy) j.get(i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        View inflate;
        if (view == null) {
            inflate = this.b.a.inflate(this.b.d, viewGroup, false);
        } else {
            inflate = view;
        }
        ((tm) inflate).a(a(i), 0);
        return inflate;
    }

    private void a() {
        sy syVar = this.b.b.i;
        if (syVar != null) {
            ArrayList j = this.b.b.j();
            int size = j.size();
            for (int i = 0; i < size; i++) {
                if (((sy) j.get(i)) == syVar) {
                    this.a = i;
                    return;
                }
            }
        }
        this.a = -1;
    }

    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
