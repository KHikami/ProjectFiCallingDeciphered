package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import gwb;
import gyk;
import hps;
import hrd;

public final class MarkerOptions implements SafeParcelable {
    public static final hrd CREATOR;
    private final int a;
    private LatLng b;
    private String c;
    private String d;
    private hps e;
    private float f;
    private float g;
    private boolean h;
    private boolean i;
    private boolean j;
    private float k;
    private float l;
    private float m;
    private float n;

    static {
        CREATOR = new hrd();
    }

    public MarkerOptions() {
        this.f = 0.5f;
        this.g = 1.0f;
        this.i = true;
        this.j = false;
        this.k = 0.0f;
        this.l = 0.5f;
        this.m = 0.0f;
        this.n = 1.0f;
        this.a = 1;
    }

    public MarkerOptions(int i, LatLng latLng, String str, String str2, IBinder iBinder, float f, float f2, boolean z, boolean z2, boolean z3, float f3, float f4, float f5, float f6) {
        this.f = 0.5f;
        this.g = 1.0f;
        this.i = true;
        this.j = false;
        this.k = 0.0f;
        this.l = 0.5f;
        this.m = 0.0f;
        this.n = 1.0f;
        this.a = i;
        this.b = latLng;
        this.c = str;
        this.d = str2;
        this.e = iBinder == null ? null : new hps(gyk.a(iBinder));
        this.f = f;
        this.g = f2;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.k = f3;
        this.l = f4;
        this.m = f5;
        this.n = f6;
    }

    int a() {
        return this.a;
    }

    public MarkerOptions a(LatLng latLng) {
        this.b = latLng;
        return this;
    }

    public MarkerOptions a(String str) {
        this.c = str;
        return this;
    }

    IBinder b() {
        return this.e == null ? null : this.e.a().asBinder();
    }

    public MarkerOptions b(String str) {
        this.d = str;
        return this;
    }

    public LatLng c() {
        return this.b;
    }

    public String d() {
        return this.c;
    }

    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.d;
    }

    public float f() {
        return this.f;
    }

    public float g() {
        return this.g;
    }

    public boolean h() {
        return this.h;
    }

    public boolean i() {
        return this.i;
    }

    public boolean j() {
        return this.j;
    }

    public float k() {
        return this.k;
    }

    public float l() {
        return this.l;
    }

    public float m() {
        return this.m;
    }

    public float n() {
        return this.n;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, a());
        gwb.a(parcel, 2, c(), i, false);
        gwb.a(parcel, 3, d(), false);
        gwb.a(parcel, 4, e(), false);
        gwb.a(parcel, 5, b(), false);
        gwb.a(parcel, 6, f());
        gwb.a(parcel, 7, g());
        gwb.a(parcel, 8, h());
        gwb.a(parcel, 9, i());
        gwb.a(parcel, 10, j());
        gwb.a(parcel, 11, k());
        gwb.a(parcel, 12, l());
        gwb.a(parcel, 13, m());
        gwb.a(parcel, 14, n());
        gwb.v(parcel, c);
    }
}
