package p000;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;

final class hvs implements hse {
    private final Status f17371a;
    private final ParcelFileDescriptor f17372b;
    private final boolean f17373c;
    private final int f17374d;
    private final int f17375e;

    public hvs(Status status, ParcelFileDescriptor parcelFileDescriptor, boolean z, int i, int i2) {
        this.f17371a = status;
        this.f17372b = parcelFileDescriptor;
        this.f17373c = z;
        this.f17374d = i;
        this.f17375e = i2;
    }

    public ParcelFileDescriptor mo2556a() {
        return this.f17372b;
    }

    public void mo2073b() {
        if (this.f17372b != null) {
            gwb.m1785a(this.f17372b);
        }
    }

    public int mo2557c() {
        return this.f17374d;
    }

    public int mo2558d() {
        return this.f17375e;
    }

    public Status mo1279k() {
        return this.f17371a;
    }
}
