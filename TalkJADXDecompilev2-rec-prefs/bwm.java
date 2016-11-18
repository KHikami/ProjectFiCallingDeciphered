package p000;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

final class bwm extends ContentObserver {
    final /* synthetic */ bwe f4657a;

    public bwm(bwe bwe) {
        this.f4657a = bwe;
        super(new Handler());
    }

    public boolean deliverSelfNotifications() {
        return true;
    }

    public void onChange(boolean z, Uri uri) {
        new Object[1][0] = uri;
        this.f4657a.f4628d.add(uri);
    }
}
