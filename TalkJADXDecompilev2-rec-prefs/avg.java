package p000;

import android.content.ContentResolver;
import android.net.Uri;
import java.io.InputStream;

public final class avg implements auj<Uri, InputStream>, avf<InputStream> {
    private final ContentResolver f2393a;

    public avg(ContentResolver contentResolver) {
        this.f2393a = contentResolver;
    }

    public aoe<InputStream> mo392a(Uri uri) {
        return new aou(this.f2393a, uri);
    }

    public auh<Uri, InputStream> mo380a(aup aup) {
        return new avd(this);
    }
}
