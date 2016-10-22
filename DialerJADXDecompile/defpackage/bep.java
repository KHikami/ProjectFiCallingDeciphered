package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import java.util.Objects;

/* compiled from: PG */
/* renamed from: bep */
public final class bep extends ContentObserver implements bet {
    public final Context a;
    public final Handler b;
    public final Runnable c;
    private final String d;
    private final long e;
    private final avm f;

    public bep(Context context, Handler handler, String str, long j) {
        super(handler);
        this.c = new beq(this);
        this.f = avn.b();
        this.a = ((Context) Objects.requireNonNull(context, "context")).getApplicationContext();
        this.b = (Handler) Objects.requireNonNull(handler);
        this.d = str;
        this.e = j;
    }

    public final void onChange(boolean z) {
        buf.a("BlockedNumberContentObserver.onChange, attempting to remove call log entry from blocked number", new Object[0]);
        this.f.a(new ber(this.a, this, this.d, this.e), new Void[0]);
    }

    public final void a(boolean z) {
        if (z) {
            a();
        }
    }

    final void a() {
        buf.a("BlockedNumberContentObserver.unregister", new Object[0]);
        this.b.removeCallbacks(this.c);
        this.a.getContentResolver().unregisterContentObserver(this);
    }
}
