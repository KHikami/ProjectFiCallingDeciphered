package defpackage;

import android.location.Location;
import com.google.android.apps.dialer.provider.DialerProvider;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* renamed from: bjp */
public final class bjp implements Callable {
    private /* synthetic */ String[] a;
    private /* synthetic */ String b;
    private /* synthetic */ int c;
    private /* synthetic */ Location d;
    private /* synthetic */ DialerProvider e;

    public bjp(DialerProvider dialerProvider, String[] strArr, String str, int i, Location location) {
        this.e = dialerProvider;
        this.a = strArr;
        this.b = str;
        this.c = i;
        this.d = location;
    }

    public final /* synthetic */ Object call() {
        return this.e.a(this.a, this.b, this.c, this.d);
    }
}
