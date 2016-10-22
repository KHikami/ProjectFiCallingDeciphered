package com.google.android.gms.people.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gwb;
import hvk;

public class ParcelableLoadImageOptions extends AbstractSafeParcelable {
    public static final Creator<ParcelableLoadImageOptions> CREATOR;
    private final int a;
    private final int b;
    private final int c;
    private final boolean d;

    static {
        CREATOR = new hvk();
    }

    public ParcelableLoadImageOptions(int i, int i2, int i3, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = z;
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public boolean d() {
        return this.d;
    }

    public String toString() {
        return gwb.K((Object) this).a("imageSize", Integer.valueOf(this.b)).a("avatarOptions", Integer.valueOf(this.c)).a("useLargePictureForCp2Images", Boolean.valueOf(this.d)).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, b());
        gwb.d(parcel, 2, c());
        gwb.a(parcel, 3, d());
        gwb.d(parcel, 1000, a());
        gwb.v(parcel, c);
    }
}
