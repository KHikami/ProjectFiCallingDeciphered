package com.google.android.gms.location;

import android.os.Parcel;
import buf;
import coh;
import coi;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import rl;
import rq;

public class DetectedActivity implements SafeParcelable {
    public static final coi CREATOR;
    final int a;
    int b;
    public int c;

    static {
        coh coh = new coh();
        CREATOR = new coi();
    }

    public DetectedActivity(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final int a() {
        int i = this.b;
        return i > 15 ? 4 : i;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DetectedActivity detectedActivity = (DetectedActivity) obj;
        return this.b == detectedActivity.b && this.c == detectedActivity.c;
    }

    public int hashCode() {
        return buf.a(Integer.valueOf(this.b), Integer.valueOf(this.c));
    }

    public String toString() {
        String str;
        StringBuilder stringBuilder = new StringBuilder("DetectedActivity [type=");
        int a = a();
        switch (a) {
            case rl.c /*0*/:
                str = "IN_VEHICLE";
                break;
            case rq.b /*1*/:
                str = "ON_BICYCLE";
                break;
            case rq.c /*2*/:
                str = "ON_FOOT";
                break;
            case rl.e /*3*/:
                str = "STILL";
                break;
            case rl.f /*4*/:
                str = "UNKNOWN";
                break;
            case rl.g /*5*/:
                str = "TILTING";
                break;
            case rl.h /*7*/:
                str = "WALKING";
                break;
            case rl.j /*8*/:
                str = "RUNNING";
                break;
            default:
                str = Integer.toString(a);
                break;
        }
        return stringBuilder.append(str).append(", confidence=").append(this.c).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = buf.c(parcel);
        buf.d(parcel, 1, this.b);
        buf.d(parcel, 1000, this.a);
        buf.d(parcel, 2, this.c);
        buf.v(parcel, c);
    }
}
