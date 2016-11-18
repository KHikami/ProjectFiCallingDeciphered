package p000;

import android.database.ContentObserver;
import android.os.AsyncTask;

final class ckc extends ContentObserver {
    final /* synthetic */ cjv f5492a;

    public ckc(cjv cjv) {
        this.f5492a = cjv;
        super(gwb.aL());
    }

    public void onChange(boolean z) {
        if (this.f5492a.f5477i != null) {
            this.f5492a.f5477i.cancel(false);
        }
        this.f5492a.f5477i = new ckb(this.f5492a);
        this.f5492a.f5477i.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }
}
