package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

/* compiled from: PG */
/* renamed from: app */
final class app extends ArrayAdapter {
    private final int a;

    public app(Context context, List list, int i) {
        super(context, buf.hJ, 16908309, list);
        this.a = i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        apn apn = (apn) getItem(i);
        ((TextView) view2.findViewById(16908308)).setText(aim.a(Integer.valueOf((int) apn.e), apn.f, this.a, getContext()));
        return view2;
    }
}
