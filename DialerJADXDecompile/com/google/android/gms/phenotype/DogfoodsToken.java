package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import buf;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import crv;

public class DogfoodsToken implements SafeParcelable {
    public static final Creator CREATOR;
    final int a;
    public final byte[] b;

    static {
        CREATOR = new crv();
    }

    public DogfoodsToken(int i, byte[] bArr) {
        this.a = i;
        this.b = bArr;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = buf.c(parcel);
        buf.d(parcel, 1, this.a);
        buf.a(parcel, 2, this.b, false);
        buf.v(parcel, c);
    }
}
