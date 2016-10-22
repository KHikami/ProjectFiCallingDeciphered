package defpackage;

import android.database.ContentObserver;

/* renamed from: dyc */
final class dyc extends ContentObserver {
    final /* synthetic */ dyb a;

    public dyc(dyb dyb) {
        this.a = dyb;
        super(gwb.aL());
    }

    public void onChange(boolean z) {
        super.onChange(z);
        this.a.a(true);
    }
}
