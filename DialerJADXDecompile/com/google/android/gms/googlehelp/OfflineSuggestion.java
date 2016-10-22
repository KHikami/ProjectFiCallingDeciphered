package com.google.android.gms.googlehelp;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import buf;
import ckp;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class OfflineSuggestion implements SafeParcelable {
    public static final Creator CREATOR;
    final int a;
    final String b;
    final String c;
    final String d;
    final String e;

    static {
        CREATOR = new ckp();
    }

    public OfflineSuggestion(int i, String str, String str2, String str3, String str4) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int c = buf.c(parcel);
        buf.d(parcel, 1, this.a);
        buf.a(parcel, 2, this.b, false);
        buf.a(parcel, 3, this.c, false);
        buf.a(parcel, 4, this.d, false);
        buf.a(parcel, 5, this.e, false);
        buf.v(parcel, c);
    }
}
