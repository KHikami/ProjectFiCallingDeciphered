package defpackage;

import android.database.ContentObserver;
import android.os.AsyncTask;

/* renamed from: ckc */
final class ckc extends ContentObserver {
    final /* synthetic */ cjv a;

    public ckc(cjv cjv) {
        this.a = cjv;
        super(gwb.aL());
    }

    public void onChange(boolean z) {
        if (this.a.i != null) {
            this.a.i.cancel(false);
        }
        this.a.i = new ckb(this.a);
        this.a.i.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }
}
