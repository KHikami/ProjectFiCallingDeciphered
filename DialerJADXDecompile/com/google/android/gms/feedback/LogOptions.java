package com.google.android.gms.feedback;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import buf;
import ckk;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class LogOptions implements SafeParcelable {
    public static final Creator CREATOR;
    public final int a;
    public String b;
    public boolean c;

    static {
        CREATOR = new ckk();
    }

    public LogOptions(int i, String str, boolean z) {
        this.a = i;
        this.b = str;
        this.c = z;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = buf.c(parcel);
        buf.d(parcel, 1, this.a);
        buf.a(parcel, 2, this.b, false);
        buf.a(parcel, 3, this.c);
        buf.v(parcel, c);
    }
}
