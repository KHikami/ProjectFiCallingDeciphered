package defpackage;

import android.database.ContentObserver;
import android.os.Handler;

public final class ih extends ContentObserver {
    final /* synthetic */ ig a;

    public ih(ig igVar) {
        this.a = igVar;
        super(new Handler());
    }

    public boolean deliverSelfNotifications() {
        return true;
    }

    public void onChange(boolean z) {
        this.a.C();
    }
}
