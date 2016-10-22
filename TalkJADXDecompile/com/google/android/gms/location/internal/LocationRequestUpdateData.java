package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gwb;
import hjn;
import hjo;
import hke;
import hkq;
import hks;
import hkt;
import hku;

public class LocationRequestUpdateData extends AbstractSafeParcelable {
    public static final hke CREATOR;
    int a;
    LocationRequestInternal b;
    hkt c;
    PendingIntent d;
    hkq e;
    hjn f;
    private final int g;

    static {
        CREATOR = new hke();
    }

    public LocationRequestUpdateData(int i, int i2, LocationRequestInternal locationRequestInternal, IBinder iBinder, PendingIntent pendingIntent, IBinder iBinder2, IBinder iBinder3) {
        hkq hkq;
        hjn hjn = null;
        this.g = i;
        this.a = i2;
        this.b = locationRequestInternal;
        this.c = iBinder == null ? null : hku.a(iBinder);
        this.d = pendingIntent;
        if (iBinder2 == null) {
            hkq = null;
        } else if (iBinder2 == null) {
            hkq = null;
        } else {
            IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            hkq = (queryLocalInterface == null || !(queryLocalInterface instanceof hkq)) ? new hks(iBinder2) : (hkq) queryLocalInterface;
        }
        this.e = hkq;
        if (iBinder3 != null) {
            hjn = hjo.a(iBinder3);
        }
        this.f = hjn;
    }

    int a() {
        return this.g;
    }

    IBinder b() {
        return this.c == null ? null : this.c.asBinder();
    }

    IBinder c() {
        return this.e == null ? null : this.e.asBinder();
    }

    IBinder d() {
        return this.f == null ? null : this.f.asBinder();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, this.a);
        gwb.a(parcel, 2, this.b, i, false);
        gwb.a(parcel, 3, b(), false);
        gwb.a(parcel, 4, this.d, i, false);
        gwb.a(parcel, 5, c(), false);
        gwb.a(parcel, 6, d(), false);
        gwb.d(parcel, 1000, a());
        gwb.v(parcel, c);
    }
}
