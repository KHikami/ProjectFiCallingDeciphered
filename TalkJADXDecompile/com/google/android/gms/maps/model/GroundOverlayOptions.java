package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import gwb;
import gyk;
import hps;
import hra;

public final class GroundOverlayOptions implements SafeParcelable {
    public static final hra CREATOR;
    private final int a;
    private hps b;
    private LatLng c;
    private float d;
    private float e;
    private LatLngBounds f;
    private float g;
    private float h;
    private boolean i;
    private float j;
    private float k;
    private float l;
    private boolean m;

    static {
        CREATOR = new hra();
    }

    public GroundOverlayOptions() {
        this.i = true;
        this.j = 0.0f;
        this.k = 0.5f;
        this.l = 0.5f;
        this.m = false;
        this.a = 1;
    }

    public GroundOverlayOptions(int i, IBinder iBinder, LatLng latLng, float f, float f2, LatLngBounds latLngBounds, float f3, float f4, boolean z, float f5, float f6, float f7, boolean z2) {
        this.i = true;
        this.j = 0.0f;
        this.k = 0.5f;
        this.l = 0.5f;
        this.m = false;
        this.a = i;
        this.b = new hps(gyk.a(iBinder));
        this.c = latLng;
        this.d = f;
        this.e = f2;
        this.f = latLngBounds;
        this.g = f3;
        this.h = f4;
        this.i = z;
        this.j = f5;
        this.k = f6;
        this.l = f7;
        this.m = z2;
    }

    IBinder a() {
        return this.b.a().asBinder();
    }

    int b() {
        return this.a;
    }

    public LatLng c() {
        return this.c;
    }

    public float d() {
        return this.d;
    }

    public int describeContents() {
        return 0;
    }

    public float e() {
        return this.e;
    }

    public LatLngBounds f() {
        return this.f;
    }

    public float g() {
        return this.g;
    }

    public float h() {
        return this.h;
    }

    public float i() {
        return this.j;
    }

    public float j() {
        return this.k;
    }

    public float k() {
        return this.l;
    }

    public boolean l() {
        return this.i;
    }

    public boolean m() {
        return this.m;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, b());
        gwb.a(parcel, 2, a(), false);
        gwb.a(parcel, 3, c(), i, false);
        gwb.a(parcel, 4, d());
        gwb.a(parcel, 5, e());
        gwb.a(parcel, 6, f(), i, false);
        gwb.a(parcel, 7, g());
        gwb.a(parcel, 8, h());
        gwb.a(parcel, 9, l());
        gwb.a(parcel, 10, i());
        gwb.a(parcel, 11, j());
        gwb.a(parcel, 12, k());
        gwb.a(parcel, 13, m());
        gwb.v(parcel, c);
    }
}
