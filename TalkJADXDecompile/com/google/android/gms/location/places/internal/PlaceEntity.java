package com.google.android.gms.location.places.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import gwb;
import hkh;
import hki;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

public final class PlaceEntity implements SafeParcelable, hkh {
    public static final hki CREATOR;
    final int a;
    private final String b;
    private final Bundle c;
    @Deprecated
    private final PlaceLocalization d;
    private final LatLng e;
    private final float f;
    private final LatLngBounds g;
    private final String h;
    private final Uri i;
    private final boolean j;
    private final float k;
    private final int l;
    private final long m;
    private final List<Integer> n;
    private final List<Integer> o;
    private final String p;
    private final String q;
    private final String r;
    private final String s;
    private final List<String> t;
    private final Map<Integer, String> u;
    private final TimeZone v;
    private Locale w;

    static {
        CREATOR = new hki();
    }

    public PlaceEntity(int i, String str, List<Integer> list, List<Integer> list2, Bundle bundle, String str2, String str3, String str4, String str5, List<String> list3, LatLng latLng, float f, LatLngBounds latLngBounds, String str6, Uri uri, boolean z, float f2, int i2, long j, PlaceLocalization placeLocalization) {
        List emptyList;
        this.a = i;
        this.b = str;
        this.o = Collections.unmodifiableList(list);
        this.n = list2;
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.c = bundle;
        this.p = str2;
        this.q = str3;
        this.r = str4;
        this.s = str5;
        if (list3 == null) {
            emptyList = Collections.emptyList();
        }
        this.t = emptyList;
        this.e = latLng;
        this.f = f;
        this.g = latLngBounds;
        if (str6 == null) {
            str6 = "UTC";
        }
        this.h = str6;
        this.i = uri;
        this.j = z;
        this.k = f2;
        this.l = i2;
        this.m = j;
        this.u = Collections.unmodifiableMap(new HashMap());
        this.v = null;
        this.w = null;
        this.d = placeLocalization;
    }

    private String v() {
        return this.p;
    }

    private String w() {
        return this.q;
    }

    private String x() {
        return this.r;
    }

    private hkh y() {
        return this;
    }

    public String a() {
        return this.b;
    }

    public /* synthetic */ CharSequence b() {
        return w();
    }

    public /* synthetic */ CharSequence c() {
        return v();
    }

    public LatLng d() {
        return this.e;
    }

    public int describeContents() {
        return 0;
    }

    public boolean e() {
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceEntity)) {
            return false;
        }
        PlaceEntity placeEntity = (PlaceEntity) obj;
        return this.b.equals(placeEntity.b) && gwb.e(this.w, placeEntity.w) && this.m == placeEntity.m;
    }

    public /* synthetic */ Object f() {
        return y();
    }

    public List<Integer> g() {
        return this.o;
    }

    public List<Integer> h() {
        return this.n;
    }

    public int hashCode() {
        return gwb.a(this.b, this.w, Long.valueOf(this.m));
    }

    public float i() {
        return this.f;
    }

    public LatLngBounds j() {
        return this.g;
    }

    public Uri k() {
        return this.i;
    }

    public String l() {
        return this.s;
    }

    public List<String> m() {
        return this.t;
    }

    public boolean n() {
        return this.j;
    }

    public float o() {
        return this.k;
    }

    public int p() {
        return this.l;
    }

    public long q() {
        return this.m;
    }

    public Bundle r() {
        return this.c;
    }

    public String s() {
        return this.h;
    }

    @Deprecated
    public PlaceLocalization t() {
        return this.d;
    }

    public String toString() {
        return gwb.K((Object) this).a("id", this.b).a("placeTypes", this.o).a("locale", this.w).a("name", this.p).a("address", this.q).a("phoneNumber", this.r).a("latlng", this.e).a("viewport", this.g).a("websiteUri", this.i).a("isPermanentlyClosed", Boolean.valueOf(this.j)).a("priceLevel", Integer.valueOf(this.l)).a("timestampSecs", Long.valueOf(this.m)).toString();
    }

    public /* synthetic */ CharSequence u() {
        return x();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.a(parcel, 1, a(), false);
        gwb.a(parcel, 2, r(), false);
        gwb.a(parcel, 3, t(), i, false);
        gwb.a(parcel, 4, d(), i, false);
        gwb.a(parcel, 5, i());
        gwb.a(parcel, 6, j(), i, false);
        gwb.a(parcel, 7, s(), false);
        gwb.d(parcel, 1000, this.a);
        gwb.a(parcel, 8, k(), i, false);
        gwb.a(parcel, 9, n());
        gwb.a(parcel, 10, o());
        gwb.d(parcel, 11, p());
        gwb.a(parcel, 12, q());
        gwb.a(parcel, 13, h(), false);
        gwb.a(parcel, 14, (String) b(), false);
        gwb.a(parcel, 15, (String) u(), false);
        gwb.a(parcel, 16, l(), false);
        gwb.b(parcel, 17, m(), false);
        gwb.a(parcel, 19, (String) c(), false);
        gwb.a(parcel, 20, g(), false);
        gwb.v(parcel, c);
    }
}
