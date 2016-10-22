package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.ParcelFileDescriptor;

/* renamed from: ave */
public final class ave implements auj<Uri, ParcelFileDescriptor>, avf<ParcelFileDescriptor> {
    private final ContentResolver a;

    public ave(ContentResolver contentResolver) {
        this.a = contentResolver;
    }

    public aoe<ParcelFileDescriptor> a(Uri uri) {
        return new aon(this.a, uri);
    }

    public auh<Uri, ParcelFileDescriptor> a(aup aup) {
        return new avd(this);
    }
}
