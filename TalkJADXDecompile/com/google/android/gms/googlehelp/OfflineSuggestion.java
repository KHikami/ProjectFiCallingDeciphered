package com.google.android.gms.googlehelp;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gwb;
import has;

public final class OfflineSuggestion extends AbstractSafeParcelable {
    public static final Creator<OfflineSuggestion> CREATOR;
    final int a;
    final String b;
    final String c;
    final String d;
    final String e;

    static {
        CREATOR = new has();
    }

    public OfflineSuggestion(int i, String str, String str2, String str3, String str4) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, this.a);
        gwb.a(parcel, 2, this.b, false);
        gwb.a(parcel, 3, this.c, false);
        gwb.a(parcel, 4, this.d, false);
        gwb.a(parcel, 5, this.e, false);
        gwb.v(parcel, c);
    }
}
