package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* renamed from: bwm */
final class bwm extends ContentObserver {
    final /* synthetic */ bwe a;

    public bwm(bwe bwe) {
        this.a = bwe;
        super(new Handler());
    }

    public boolean deliverSelfNotifications() {
        return true;
    }

    public void onChange(boolean z, Uri uri) {
        new Object[1][0] = uri;
        this.a.d.add(uri);
    }
}
