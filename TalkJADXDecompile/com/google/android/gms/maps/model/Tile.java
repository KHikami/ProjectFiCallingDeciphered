package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import gwb;
import hrl;

public final class Tile implements SafeParcelable {
    public static final hrl CREATOR;
    public final int a;
    public final int b;
    public final byte[] c;
    private final int d;

    static {
        CREATOR = new hrl();
    }

    public Tile(int i, int i2, int i3, byte[] bArr) {
        this.d = i;
        this.a = i2;
        this.b = i3;
        this.c = bArr;
    }

    public Tile(int i, int i2, byte[] bArr) {
        this(1, -1, -1, null);
    }

    int a() {
        return this.d;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, a());
        gwb.d(parcel, 2, this.a);
        gwb.d(parcel, 3, this.b);
        gwb.a(parcel, 4, this.c, false);
        gwb.v(parcel, c);
    }
}
