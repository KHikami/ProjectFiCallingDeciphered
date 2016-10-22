package com.google.android.gms.maps;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import gwb;
import hrp;

public final class StreetViewPanoramaOptions implements SafeParcelable {
    public static final hrp CREATOR;
    private final int a;
    private StreetViewPanoramaCamera b;
    private String c;
    private LatLng d;
    private Integer e;
    private Boolean f;
    private Boolean g;
    private Boolean h;
    private Boolean i;
    private Boolean j;

    static {
        CREATOR = new hrp();
    }

    public StreetViewPanoramaOptions() {
        this.f = Boolean.valueOf(true);
        this.g = Boolean.valueOf(true);
        this.h = Boolean.valueOf(true);
        this.i = Boolean.valueOf(true);
        this.a = 1;
    }

    public StreetViewPanoramaOptions(int i, StreetViewPanoramaCamera streetViewPanoramaCamera, String str, LatLng latLng, Integer num, byte b, byte b2, byte b3, byte b4, byte b5) {
        this.f = Boolean.valueOf(true);
        this.g = Boolean.valueOf(true);
        this.h = Boolean.valueOf(true);
        this.i = Boolean.valueOf(true);
        this.a = i;
        this.b = streetViewPanoramaCamera;
        this.d = latLng;
        this.e = num;
        this.c = str;
        this.f = gwb.a(b);
        this.g = gwb.a(b2);
        this.h = gwb.a(b3);
        this.i = gwb.a(b4);
        this.j = gwb.a(b5);
    }

    int a() {
        return this.a;
    }

    byte b() {
        return gwb.a(this.f);
    }

    byte c() {
        return gwb.a(this.g);
    }

    byte d() {
        return gwb.a(this.h);
    }

    public int describeContents() {
        return 0;
    }

    byte e() {
        return gwb.a(this.i);
    }

    byte f() {
        return gwb.a(this.j);
    }

    public StreetViewPanoramaCamera g() {
        return this.b;
    }

    public LatLng h() {
        return this.d;
    }

    public Integer i() {
        return this.e;
    }

    public String j() {
        return this.c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, a());
        gwb.a(parcel, 2, g(), i, false);
        gwb.a(parcel, 3, j(), false);
        gwb.a(parcel, 4, h(), i, false);
        gwb.a(parcel, 5, i(), false);
        gwb.a(parcel, 6, b());
        gwb.a(parcel, 7, c());
        gwb.a(parcel, 8, d());
        gwb.a(parcel, 9, e());
        gwb.a(parcel, 10, f());
        gwb.v(parcel, c);
    }
}
