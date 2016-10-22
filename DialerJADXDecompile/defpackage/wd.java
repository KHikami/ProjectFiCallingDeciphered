package defpackage;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

/* compiled from: PG */
/* renamed from: wd */
final class wd implements OnItemClickListener {
    private /* synthetic */ wc a;

    wd(wc wcVar, vz vzVar) {
        this.a = wcVar;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.a.d.setSelection(i);
        if (this.a.d.getOnItemClickListener() != null) {
            this.a.d.performItemClick(view, i, this.a.b.getItemId(i));
        }
        this.a.c();
    }
}
