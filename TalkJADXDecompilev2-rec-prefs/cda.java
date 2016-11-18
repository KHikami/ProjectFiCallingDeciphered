package p000;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

final class cda extends ContentObserver {
    final /* synthetic */ ccz f5051a;

    cda(ccz ccz, Handler handler) {
        this.f5051a = ccz;
        super(handler);
    }

    public void onChange(boolean z) {
        onChange(z, null);
    }

    public void onChange(boolean z, Uri uri) {
        this.f5051a.mo814c();
    }
}
