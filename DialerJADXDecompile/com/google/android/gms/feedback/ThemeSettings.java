package com.google.android.gms.feedback;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import buf;
import ckl;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ThemeSettings implements SafeParcelable {
    public static final Creator CREATOR;
    final int a;
    public int b;
    public int c;

    static {
        CREATOR = new ckl();
    }

    public ThemeSettings() {
        this(1, 0, 0);
    }

    public ThemeSettings(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = buf.c(parcel);
        buf.d(parcel, 1, this.a);
        buf.d(parcel, 2, this.b);
        buf.d(parcel, 3, this.c);
        buf.v(parcel, c);
    }
}
