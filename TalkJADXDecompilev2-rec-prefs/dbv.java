package p000;

import android.widget.TabHost.OnTabChangeListener;

final class dbv implements OnTabChangeListener {
    final /* synthetic */ dbp f9480a;

    dbv(dbp dbp) {
        this.f9480a = dbp;
    }

    public void onTabChanged(String str) {
        this.f9480a.m7781a(gwb.m1507a((Integer) this.f9480a.f5429b.get(str)), false);
        this.f9480a.m7791t();
    }
}
