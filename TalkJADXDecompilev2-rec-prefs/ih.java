package p000;

import android.database.ContentObserver;
import android.os.Handler;

public final class ih extends ContentObserver {
    final /* synthetic */ ig f17677a;

    public ih(ig igVar) {
        this.f17677a = igVar;
        super(new Handler());
    }

    public boolean deliverSelfNotifications() {
        return true;
    }

    public void onChange(boolean z) {
        this.f17677a.m1272C();
    }
}
