package p000;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.ParcelFileDescriptor;

public final class ave implements auj<Uri, ParcelFileDescriptor>, avf<ParcelFileDescriptor> {
    private final ContentResolver f2392a;

    public ave(ContentResolver contentResolver) {
        this.f2392a = contentResolver;
    }

    public aoe<ParcelFileDescriptor> mo392a(Uri uri) {
        return new aon(this.f2392a, uri);
    }

    public auh<Uri, ParcelFileDescriptor> mo380a(aup aup) {
        return new avd(this);
    }
}
