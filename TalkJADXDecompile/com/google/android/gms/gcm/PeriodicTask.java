package com.google.android.gms.gcm;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import gzp;

public class PeriodicTask extends Task {
    public static final Creator<PeriodicTask> CREATOR;
    public long a;
    public long b;

    static {
        CREATOR = new gzp();
    }

    @Deprecated
    public PeriodicTask(Parcel parcel) {
        super(parcel);
        this.a = -1;
        this.b = -1;
        this.a = parcel.readLong();
        this.b = Math.min(parcel.readLong(), this.a);
    }

    public long a() {
        return this.a;
    }

    public void a(Bundle bundle) {
        super.a(bundle);
        bundle.putLong("period", this.a);
        bundle.putLong("period_flex", this.b);
    }

    public long b() {
        return this.b;
    }

    public String toString() {
        String valueOf = String.valueOf(super.toString());
        long a = a();
        return new StringBuilder(String.valueOf(valueOf).length() + 54).append(valueOf).append(" period=").append(a).append(" flex=").append(b()).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
    }
}
