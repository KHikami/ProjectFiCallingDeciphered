package p000;

import android.content.res.Resources;
import android.net.Uri;
import java.io.InputStream;

public final class auv implements auj<Integer, InputStream> {
    private final Resources f2383a;

    public auv(Resources resources) {
        this.f2383a = resources;
    }

    public auh<Integer, InputStream> mo380a(aup aup) {
        return new aut(this.f2383a, aup.m4063a(Uri.class, InputStream.class));
    }
}
