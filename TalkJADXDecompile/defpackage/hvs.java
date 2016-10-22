package defpackage;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;

/* renamed from: hvs */
final class hvs implements hse {
    private final Status a;
    private final ParcelFileDescriptor b;
    private final boolean c;
    private final int d;
    private final int e;

    public hvs(Status status, ParcelFileDescriptor parcelFileDescriptor, boolean z, int i, int i2) {
        this.a = status;
        this.b = parcelFileDescriptor;
        this.c = z;
        this.d = i;
        this.e = i2;
    }

    public ParcelFileDescriptor a() {
        return this.b;
    }

    public void b() {
        if (this.b != null) {
            gwb.a(this.b);
        }
    }

    public int c() {
        return this.d;
    }

    public int d() {
        return this.e;
    }

    public Status k() {
        return this.a;
    }
}
