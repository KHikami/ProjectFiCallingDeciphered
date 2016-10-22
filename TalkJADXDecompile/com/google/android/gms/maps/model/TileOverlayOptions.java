package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import gwb;
import hpv;
import hpw;
import hqv;
import hqx;
import hrm;

public final class TileOverlayOptions implements SafeParcelable {
    public static final hrm CREATOR;
    private final int a;
    private hqv b;
    private hpw c;
    private boolean d;
    private float e;
    private boolean f;

    static {
        CREATOR = new hrm();
    }

    public TileOverlayOptions() {
        this.d = true;
        this.f = true;
        this.a = 1;
    }

    public TileOverlayOptions(int i, IBinder iBinder, boolean z, float f, boolean z2) {
        hqv hqv;
        hpw hpw = null;
        this.d = true;
        this.f = true;
        this.a = i;
        if (iBinder == null) {
            hqv = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
            hqv = (queryLocalInterface == null || !(queryLocalInterface instanceof hqv)) ? new hqx(iBinder) : (hqv) queryLocalInterface;
        }
        this.b = hqv;
        if (this.b != null) {
            hpw = new hpv(this);
        }
        this.c = hpw;
        this.d = z;
        this.e = f;
        this.f = z2;
    }

    int a() {
        return this.a;
    }

    IBinder b() {
        return this.b.asBinder();
    }

    public float c() {
        return this.e;
    }

    public boolean d() {
        return this.d;
    }

    public int describeContents() {
        return 0;
    }

    public boolean e() {
        return this.f;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, a());
        gwb.a(parcel, 2, b(), false);
        gwb.a(parcel, 3, d());
        gwb.a(parcel, 4, c());
        gwb.a(parcel, 5, e());
        gwb.v(parcel, c);
    }
}
