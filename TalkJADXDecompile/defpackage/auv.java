package defpackage;

import android.content.res.Resources;
import android.net.Uri;
import java.io.InputStream;

/* renamed from: auv */
public final class auv implements auj<Integer, InputStream> {
    private final Resources a;

    public auv(Resources resources) {
        this.a = resources;
    }

    public auh<Integer, InputStream> a(aup aup) {
        return new aut(this.a, aup.a(Uri.class, InputStream.class));
    }
}
