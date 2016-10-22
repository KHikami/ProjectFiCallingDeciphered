package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/* compiled from: PG */
/* renamed from: bch */
final class bch extends ArrayAdapter {
    private int a;
    private /* synthetic */ bcf b;

    public bch(bcf bcf, Context context, int i) {
        this.b = bcf;
        super(context, i);
        this.a = i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        View inflate = this.b.d.inflate(this.a, null);
        bcg bcg = (bcg) getItem(i);
        if (bcg == null) {
            return inflate;
        }
        bcg.a(inflate);
        return inflate;
    }
}
