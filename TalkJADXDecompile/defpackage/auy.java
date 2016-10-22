package defpackage;

import android.net.Uri;
import android.os.ParcelFileDescriptor;

/* renamed from: auy */
public final class auy implements auj<String, ParcelFileDescriptor> {
    public auh<String, ParcelFileDescriptor> a(aup aup) {
        return new aux(aup.a(Uri.class, ParcelFileDescriptor.class));
    }
}
