package com.google.android.gms.location.internal;

import android.os.Parcel;
import buf;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import cpt;
import java.util.Locale;
import rq;

public class ParcelableGeofence implements SafeParcelable {
    public static final cpt CREATOR;
    final int a;
    final String b;
    final long c;
    final short d;
    final double e;
    final double f;
    final float g;
    final int h;
    final int i;
    final int j;

    static {
        CREATOR = new cpt();
    }

    public ParcelableGeofence(int i, String str, int i2, short s, double d, double d2, float f, long j, int i3, int i4) {
        if (str == null || str.length() > 100) {
            throw new IllegalArgumentException("requestId is null or too long: " + str);
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

    public int describeContents() {
        return 0;
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

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.e);
        int i = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31;
        long doubleToLongBits2 = Double.doubleToLongBits(this.f);
        return (((((((i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + Float.floatToIntBits(this.g)) * 31) + this.d) * 31) + this.h;
    }

    public String toString() {
        String str;
        Locale locale = Locale.US;
        String str2 = "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]";
        Object[] objArr = new Object[9];
        switch (this.d) {
            case rq.b /*1*/:
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
        int c = buf.c(parcel);
        buf.a(parcel, 1, this.b, false);
        buf.d(parcel, 1000, this.a);
        buf.a(parcel, 2, this.c);
        buf.a(parcel, 3, this.d);
        buf.a(parcel, 4, this.e);
        buf.a(parcel, 5, this.f);
        buf.a(parcel, 6, this.g);
        buf.d(parcel, 7, this.h);
        buf.d(parcel, 8, this.i);
        buf.d(parcel, 9, this.j);
        buf.v(parcel, c);
    }
}
