package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: asu */
final class asu extends ContentObserver implements Runnable {
    final Uri a;
    final int b;
    AtomicBoolean c;
    final /* synthetic */ asp d;
    private final Handler e;

    public asu(asp asp, Handler handler, Uri uri, int i) {
        this.d = asp;
        super(handler);
        this.c = new AtomicBoolean(true);
        this.e = handler;
        this.b = i;
        this.a = uri;
        if (asp.e != null) {
            asp.e.getContentResolver().registerContentObserver(this.a, false, this);
            this.e.postDelayed(this, 20000);
        }
    }

    public final void run() {
        if (this.c.getAndSet(false) && this.d.e != null) {
            this.d.e.getContentResolver().unregisterContentObserver(this);
            if (this.d.i != null) {
                this.d.i.g();
            }
        }
    }

    public final void a() {
        if (this.c.getAndSet(false) && this.d.e != null) {
            this.d.e.getContentResolver().unregisterContentObserver(this);
            this.e.removeCallbacks(this);
        }
    }

    public final void onChange(boolean z) {
        avm avm = this.d.h;
        asz asz = asz.CHECK_CONTENT_AFTER_CHANGE;
        avm.a(new asv(this), new Void[0]);
    }
}
