package defpackage;

import android.widget.TabHost.OnTabChangeListener;

/* renamed from: dbv */
final class dbv implements OnTabChangeListener {
    final /* synthetic */ dbp a;

    dbv(dbp dbp) {
        this.a = dbp;
    }

    public void onTabChanged(String str) {
        this.a.a(gwb.a((Integer) this.a.b.get(str)), false);
        this.a.t();
    }
}
