package defpackage;

import android.database.ContentObserver;
import android.os.Handler;

final class rx extends ContentObserver {
    final /* synthetic */ rw a;

    rx(rw rwVar) {
        this.a = rwVar;
        super(new Handler());
    }

    public boolean deliverSelfNotifications() {
        return true;
    }

    public void onChange(boolean z) {
        this.a.b();
    }
}
