package p000;

import android.database.ContentObserver;
import android.os.Handler;

final class rx extends ContentObserver {
    final /* synthetic */ rw f35092a;

    rx(rw rwVar) {
        this.f35092a = rwVar;
        super(new Handler());
    }

    public boolean deliverSelfNotifications() {
        return true;
    }

    public void onChange(boolean z) {
        this.f35092a.m40584b();
    }
}
