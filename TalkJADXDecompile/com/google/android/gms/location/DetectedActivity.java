package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gwb;
import hjd;
import hje;
import java.util.Comparator;
import wi;

public class DetectedActivity extends AbstractSafeParcelable {
    public static final hje CREATOR;
    public static final Comparator<DetectedActivity> a;
    public static final int[] b;
    public static final int[] c;
    int d;
    int e;
    private final int f;

    static {
        a = new hjd();
        b = new int[]{9, 10};
        c = new int[]{0, 1, 2, 4, 5, 6, 7, 8, 10, 11, 12, 13, 14};
        CREATOR = new hje();
    }

    public DetectedActivity(int i, int i2, int i3) {
        this.f = i;
        this.d = i2;
        this.e = i3;
    }

    public int a() {
        int i = this.d;
        return i > 15 ? 4 : i;
    }

    public int b() {
        return this.e;
    }

    public int c() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DetectedActivity detectedActivity = (DetectedActivity) obj;
        return this.d == detectedActivity.d && this.e == detectedActivity.e;
    }

    public int hashCode() {
        return gwb.a(Integer.valueOf(this.d), Integer.valueOf(this.e));
    }

    public String toString() {
        Object obj;
        int a = a();
        switch (a) {
            case wi.w /*0*/:
                obj = "IN_VEHICLE";
                break;
            case wi.j /*1*/:
                obj = "ON_BICYCLE";
                break;
            case wi.l /*2*/:
                obj = "ON_FOOT";
                break;
            case wi.z /*3*/:
                obj = "STILL";
                break;
            case wi.h /*4*/:
                obj = "UNKNOWN";
                break;
            case wi.p /*5*/:
                obj = "TILTING";
                break;
            case wi.q /*7*/:
                obj = "WALKING";
                break;
            case wi.m /*8*/:
                obj = "RUNNING";
                break;
            default:
                obj = Integer.toString(a);
                break;
        }
        String valueOf = String.valueOf(obj);
        return new StringBuilder(String.valueOf(valueOf).length() + 48).append("DetectedActivity [type=").append(valueOf).append(", confidence=").append(this.e).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, this.d);
        gwb.d(parcel, 2, this.e);
        gwb.d(parcel, 1000, c());
        gwb.v(parcel, c);
    }
}
