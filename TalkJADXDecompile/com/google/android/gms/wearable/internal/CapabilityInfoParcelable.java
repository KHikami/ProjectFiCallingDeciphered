package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import ayo;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gwb;
import ibm;
import java.util.List;
import java.util.Set;

public class CapabilityInfoParcelable extends AbstractSafeParcelable implements ayo {
    public static final Creator<CapabilityInfoParcelable> CREATOR;
    final int a;
    private final Object b;
    private final String c;
    private final List<NodeParcelable> d;
    private Set<ayo> e;

    static {
        CREATOR = new ibm();
    }

    public CapabilityInfoParcelable(int i, String str, List<NodeParcelable> list) {
        this.b = new Object();
        this.a = i;
        this.c = str;
        this.d = list;
        this.e = null;
        gwb.L(this.c);
        gwb.L(this.d);
    }

    public String a() {
        return this.c;
    }

    public List<NodeParcelable> b() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CapabilityInfoParcelable capabilityInfoParcelable = (CapabilityInfoParcelable) obj;
        if (this.a != capabilityInfoParcelable.a) {
            return false;
        }
        if (this.c == null ? capabilityInfoParcelable.c != null : !this.c.equals(capabilityInfoParcelable.c)) {
            return false;
        }
        if (this.d != null) {
            if (this.d.equals(capabilityInfoParcelable.d)) {
                return true;
            }
        } else if (capabilityInfoParcelable.d == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((this.c != null ? this.c.hashCode() : 0) + (this.a * 31)) * 31;
        if (this.d != null) {
            i = this.d.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.c;
        String valueOf = String.valueOf(this.d);
        return new StringBuilder((String.valueOf(str).length() + 18) + String.valueOf(valueOf).length()).append("CapabilityInfo{").append(str).append(", ").append(valueOf).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, this.a);
        gwb.a(parcel, 2, a(), false);
        gwb.c(parcel, 3, b(), false);
        gwb.v(parcel, c);
    }
}
