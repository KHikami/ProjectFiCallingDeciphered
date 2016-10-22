package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import buf;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import coz;
import cpa;
import cps;
import cpy;
import cqa;
import cqb;
import cqc;

public class LocationRequestUpdateData implements SafeParcelable {
    public static final cps CREATOR;
    final int a;
    int b;
    LocationRequestInternal c;
    cqb d;
    PendingIntent e;
    cpy f;
    coz g;

    static {
        CREATOR = new cps();
    }

    public LocationRequestUpdateData(int i, int i2, LocationRequestInternal locationRequestInternal, IBinder iBinder, PendingIntent pendingIntent, IBinder iBinder2, IBinder iBinder3) {
        cpy cpy;
        coz coz = null;
        this.a = i;
        this.b = i2;
        this.c = locationRequestInternal;
        this.d = iBinder == null ? null : cqc.a(iBinder);
        this.e = pendingIntent;
        if (iBinder2 == null) {
            cpy = null;
        } else if (iBinder2 == null) {
            cpy = null;
        } else {
            IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            cpy = (queryLocalInterface == null || !(queryLocalInterface instanceof cpy)) ? new cqa(iBinder2) : (cpy) queryLocalInterface;
        }
        this.f = cpy;
        if (iBinder3 != null) {
            coz = cpa.a(iBinder3);
        }
        this.g = coz;
    }

    public static LocationRequestUpdateData a(cqb cqb, coz coz) {
        return new LocationRequestUpdateData(1, 2, null, cqb.asBinder(), null, null, coz != null ? coz.asBinder() : null);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        IBinder iBinder2 = null;
        int c = buf.c(parcel);
        buf.d(parcel, 1, this.b);
        buf.d(parcel, 1000, this.a);
        buf.a(parcel, 2, this.c, i, false);
        if (this.d == null) {
            iBinder = null;
        } else {
            iBinder = this.d.asBinder();
        }
        buf.a(parcel, 3, iBinder, false);
        buf.a(parcel, 4, this.e, i, false);
        if (this.f == null) {
            iBinder = null;
        } else {
            iBinder = this.f.asBinder();
        }
        buf.a(parcel, 5, iBinder, false);
        if (this.g != null) {
            iBinder2 = this.g.asBinder();
        }
        buf.a(parcel, 6, iBinder2, false);
        buf.v(parcel, c);
    }
}
