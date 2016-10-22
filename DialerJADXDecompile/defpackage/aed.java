package defpackage;

import android.database.ContentObserver;
import android.os.Handler;

/* compiled from: PG */
/* renamed from: aed */
final class aed extends ContentObserver {
    private /* synthetic */ aec a;

    aed(aec aec, Handler handler) {
        this.a = aec;
        super(handler);
    }

    public final void onChange(boolean z) {
        this.a.forceLoad();
    }
}
