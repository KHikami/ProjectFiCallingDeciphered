package com.google.android.gms.location.places.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gwb;
import hkj;
import java.util.List;

@Deprecated
public final class PlaceLocalization extends AbstractSafeParcelable {
    public static final hkj CREATOR;
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final List<String> f;

    static {
        CREATOR = new hkj();
    }

    public PlaceLocalization(int i, String str, String str2, String str3, String str4, List<String> list) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceLocalization)) {
            return false;
        }
        PlaceLocalization placeLocalization = (PlaceLocalization) obj;
        return gwb.e(this.b, placeLocalization.b) && gwb.e(this.c, placeLocalization.c) && gwb.e(this.d, placeLocalization.d) && gwb.e(this.e, placeLocalization.e) && gwb.e(this.f, placeLocalization.f);
    }

    public int hashCode() {
        return gwb.a(this.b, this.c, this.d, this.e);
    }

    public String toString() {
        return gwb.K((Object) this).a("name", this.b).a("address", this.c).a("internationalPhoneNumber", this.d).a("regularOpenHours", this.e).a("attributions", this.f).toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.a(parcel, 1, this.b, false);
        gwb.a(parcel, 2, this.c, false);
        gwb.a(parcel, 3, this.d, false);
        gwb.a(parcel, 4, this.e, false);
        gwb.b(parcel, 5, this.f, false);
        gwb.d(parcel, 1000, this.a);
        gwb.v(parcel, c);
    }
}
