package defpackage;

import android.view.View;
import android.widget.TextView;

/* renamed from: egq */
final class egq extends eex {
    final TextView p;

    public egq(View view) {
        super(view);
        this.p = (TextView) view.findViewById(bm.Q);
    }

    public void c(int i) {
        this.p.setText(i);
    }
}
