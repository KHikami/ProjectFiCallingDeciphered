package com.google.android.gms.maps;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.CameraPosition;
import gwb;
import hro;

public final class GoogleMapOptions implements SafeParcelable {
    public static final hro CREATOR;
    private final int a;
    private Boolean b;
    private Boolean c;
    private int d;
    private CameraPosition e;
    private Boolean f;
    private Boolean g;
    private Boolean h;
    private Boolean i;
    private Boolean j;
    private Boolean k;
    private Boolean l;
    private Boolean m;
    private Boolean n;

    static {
        CREATOR = new hro();
    }

    public GoogleMapOptions() {
        this.d = -1;
        this.a = 1;
    }

    public GoogleMapOptions(int i, byte b, byte b2, int i2, CameraPosition cameraPosition, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8, byte b9, byte b10, byte b11) {
        this.d = -1;
        this.a = i;
        this.b = gwb.a(b);
        this.c = gwb.a(b2);
        this.d = i2;
        this.e = cameraPosition;
        this.f = gwb.a(b3);
        this.g = gwb.a(b4);
        this.h = gwb.a(b5);
        this.i = gwb.a(b6);
        this.j = gwb.a(b7);
        this.k = gwb.a(b8);
        this.l = gwb.a(b9);
        this.m = gwb.a(b10);
        this.n = gwb.a(b11);
    }

    int a() {
        return this.a;
    }

    public GoogleMapOptions a(boolean z) {
        this.l = Boolean.valueOf(true);
        return this;
    }

    byte b() {
        return gwb.a(this.b);
    }

    byte c() {
        return gwb.a(this.c);
    }

    byte d() {
        return gwb.a(this.f);
    }

    public int describeContents() {
        return 0;
    }

    byte e() {
        return gwb.a(this.g);
    }

    byte f() {
        return gwb.a(this.h);
    }

    byte g() {
        return gwb.a(this.i);
    }

    byte h() {
        return gwb.a(this.j);
    }

    byte i() {
        return gwb.a(this.k);
    }

    byte j() {
        return gwb.a(this.l);
    }

    byte k() {
        return gwb.a(this.m);
    }

    byte l() {
        return gwb.a(this.n);
    }

    public int m() {
        return this.d;
    }

    public CameraPosition n() {
        return this.e;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, a());
        gwb.a(parcel, 2, b());
        gwb.a(parcel, 3, c());
        gwb.d(parcel, 4, m());
        gwb.a(parcel, 5, n(), i, false);
        gwb.a(parcel, 6, d());
        gwb.a(parcel, 7, e());
        gwb.a(parcel, 8, f());
        gwb.a(parcel, 9, g());
        gwb.a(parcel, 10, h());
        gwb.a(parcel, 11, i());
        gwb.a(parcel, 12, j());
        gwb.a(parcel, 14, k());
        gwb.a(parcel, 15, l());
        gwb.v(parcel, c);
    }
}
