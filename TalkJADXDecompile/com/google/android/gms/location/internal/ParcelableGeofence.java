package com.google.android.gms.location.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gwb;
import hkf;
import java.util.Locale;
import wi;

public class ParcelableGeofence extends AbstractSafeParcelable {
    public static final hkf CREATOR;
    private final int a;
    private final String b;
    private final long c;
    private final short d;
    private final double e;
    private final double f;
    private final float g;
    private final int h;
    private final int i;
    private final int j;

    static {
        CREATOR = new hkf();
    }

    public ParcelableGeofence(int i, String str, int i2, short s, double d, double d2, float f, long j, int i3, int i4) {
        if (str == null || str.length() > 100) {
            String str2 = "requestId is null or too long: ";
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        } else if (f <= 0.0f) {
            throw new IllegalArgumentException("invalid radius: " + f);
        } else if (d > 90.0d || d < -90.0d) {
            throw new IllegalArgumentException("invalid latitude: " + d);
        } else if (d2 > 180.0d || d2 < -180.0d) {
            throw new IllegalArgumentException("invalid longitude: " + d2);
        } else {
            int i5 = i2 & 7;
            if (i5 == 0) {
                throw new IllegalArgumentException("No supported transition specified: " + i2);
            }
            this.a = i;
            this.d = s;
            this.b = str;
            this.e = d;
            this.f = d2;
            this.g = f;
            this.c = j;
            this.h = i5;
            this.i = i3;
            this.j = i4;
        }
    }

    public int a() {
        return this.a;
    }

    public short b() {
        return this.d;
    }

    public double c() {
        return this.e;
    }

    public double d() {
        return this.f;
    }

    public float e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof ParcelableGeofence)) {
            return false;
        }
        ParcelableGeofence parcelableGeofence = (ParcelableGeofence) obj;
        return this.g != parcelableGeofence.g ? false : this.e != parcelableGeofence.e ? false : this.f != parcelableGeofence.f ? false : this.d == parcelableGeofence.d;
    }

    public String f() {
        return this.b;
    }

    public long g() {
        return this.c;
    }

    public int h() {
        return this.h;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.e);
        int i = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31;
        long doubleToLongBits2 = Double.doubleToLongBits(this.f);
        return (((((((i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + Float.floatToIntBits(this.g)) * 31) + this.d) * 31) + this.h;
    }

    public int i() {
        return this.i;
    }

    public int j() {
        return this.j;
    }

    public String toString() {
        String str;
        Locale locale = Locale.US;
        String str2 = "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]";
        Object[] objArr = new Object[9];
        switch (this.d) {
            case wi.j /*1*/:
                str = "CIRCLE";
                break;
            default:
                str = null;
                break;
        }
        objArr[0] = str;
        objArr[1] = this.b;
        objArr[2] = Integer.valueOf(this.h);
        objArr[3] = Double.valueOf(this.e);
        objArr[4] = Double.valueOf(this.f);
        objArr[5] = Float.valueOf(this.g);
        objArr[6] = Integer.valueOf(this.i / 1000);
        objArr[7] = Integer.valueOf(this.j);
        objArr[8] = Long.valueOf(this.c);
        return String.format(locale, str2, objArr);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.a(parcel, 1, f(), false);
        gwb.a(parcel, 2, g());
        gwb.a(parcel, 3, b());
        gwb.a(parcel, 4, c());
        gwb.a(parcel, 5, d());
        gwb.a(parcel, 6, e());
        gwb.d(parcel, 7, h());
        gwb.d(parcel, 1000, a());
        gwb.d(parcel, 8, i());
        gwb.d(parcel, 9, j());
        gwb.v(parcel, c);
    }
}
