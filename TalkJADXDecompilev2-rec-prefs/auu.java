package p000;

import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;

public final class auu implements auj<Integer, ParcelFileDescriptor> {
    private final Resources f2382a;

    public auu(Resources resources) {
        this.f2382a = resources;
    }

    public auh<Integer, ParcelFileDescriptor> mo380a(aup aup) {
        return new aut(this.f2382a, aup.m4063a(Uri.class, ParcelFileDescriptor.class));
    }
}
