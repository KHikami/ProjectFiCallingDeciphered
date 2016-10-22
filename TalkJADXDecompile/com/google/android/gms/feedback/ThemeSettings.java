package com.google.android.gms.feedback;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gwb;
import gzb;

public class ThemeSettings extends AbstractSafeParcelable {
    public static final Creator<ThemeSettings> CREATOR;
    final int a;
    int b;
    int c;

    static {
        CREATOR = new gzb();
    }

    public ThemeSettings() {
        this(1, 0, 0);
    }

    public ThemeSettings(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public ThemeSettings a(int i) {
        this.b = i;
        return this;
    }

    public ThemeSettings b(int i) {
        this.c = i;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, this.a);
        gwb.d(parcel, 2, this.b);
        gwb.d(parcel, 3, this.c);
        gwb.v(parcel, c);
    }
}
