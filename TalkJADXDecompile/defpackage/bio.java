package defpackage;

import android.os.Binder;
import com.google.android.apps.hangouts.concurrent.impl.ConcurrentService;

/* renamed from: bio */
public final class bio extends Binder {
    final /* synthetic */ ConcurrentService a;

    public bio(ConcurrentService concurrentService) {
        this.a = concurrentService;
    }

    ConcurrentService a() {
        return this.a;
    }
}
