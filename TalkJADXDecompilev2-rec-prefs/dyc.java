package p000;

import android.database.ContentObserver;

final class dyc extends ContentObserver {
    final /* synthetic */ dyb f10820a;

    public dyc(dyb dyb) {
        this.f10820a = dyb;
        super(gwb.aL());
    }

    public void onChange(boolean z) {
        super.onChange(z);
        this.f10820a.m13077a(true);
    }
}
