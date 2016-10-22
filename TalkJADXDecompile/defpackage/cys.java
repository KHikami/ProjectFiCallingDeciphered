package defpackage;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

/* renamed from: cys */
final class cys implements OnItemClickListener {
    final /* synthetic */ cyt a;
    final /* synthetic */ cyp b;

    cys(cyp cyp, cyt cyt) {
        this.b = cyp;
        this.a = cyt;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        if (this.a != null) {
            this.a.a((gnj) view);
        }
    }
}
