package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import gwb;
import hqz;

public final class CircleOptions implements SafeParcelable {
    public static final hqz CREATOR;
    private final int a;
    private LatLng b;
    private double c;
    private float d;
    private int e;
    private int f;
    private float g;
    private boolean h;

    static {
        CREATOR = new hqz();
    }

    public CircleOptions() {
        this.b = null;
        this.c = 0.0d;
        this.d = 10.0f;
        this.e = -16777216;
        this.f = 0;
        this.g = 0.0f;
        this.h = true;
        this.a = 1;
    }

    public CircleOptions(int i, LatLng latLng, double d, float f, int i2, int i3, float f2, boolean z) {
        this.b = null;
        this.c = 0.0d;
        this.d = 10.0f;
        this.e = -16777216;
        this.f = 0;
        this.g = 0.0f;
        this.h = true;
        this.a = i;
        this.b = latLng;
        this.c = d;
        this.d = f;
        this.e = i2;
        this.f = i3;
        this.g = f2;
        this.h = z;
    }

    int a() {
        return this.a;
    }

    public LatLng b() {
        return this.b;
    }

    public double c() {
        return this.c;
    }

    public float d() {
        return this.d;
    }

    public int describeContents() {
        return 0;
    }

    public int e() {
        return this.e;
    }

    public int f() {
        return this.f;
    }

    public float g() {
        return this.g;
    }

    public boolean h() {
        return this.h;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, a());
        gwb.a(parcel, 2, b(), i, false);
        gwb.a(parcel, 3, c());
        gwb.a(parcel, 4, d());
        gwb.d(parcel, 5, e());
        gwb.d(parcel, 6, f());
        gwb.a(parcel, 7, g());
        gwb.a(parcel, 8, h());
        gwb.v(parcel, c);
    }
}
