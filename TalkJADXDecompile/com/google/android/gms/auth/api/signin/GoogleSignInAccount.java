package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gsz;
import gtb;
import gwb;
import gxs;
import gxu;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class GoogleSignInAccount extends AbstractSafeParcelable {
    public static final Creator<GoogleSignInAccount> CREATOR;
    public static gxs a;
    private static Comparator<Scope> n;
    final int b;
    List<Scope> c;
    private String d;
    private String e;
    private String f;
    private String g;
    private Uri h;
    private String i;
    private long j;
    private String k;
    private String l;
    private String m;

    static {
        CREATOR = new gtb();
        a = gxu.c();
        n = new gsz();
    }

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List<Scope> list, String str7, String str8) {
        this.b = i;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = uri;
        this.i = str5;
        this.j = j;
        this.k = str6;
        this.c = list;
        this.l = str7;
        this.m = str8;
    }

    public static GoogleSignInAccount a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        Uri uri = null;
        Object optString = jSONObject.optString("photoUrl", null);
        if (!TextUtils.isEmpty(optString)) {
            uri = Uri.parse(optString);
        }
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        Object hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        String optString2 = jSONObject.optString("id");
        String optString3 = jSONObject.optString("tokenId", null);
        String optString4 = jSONObject.optString("email", null);
        String optString5 = jSONObject.optString("displayName", null);
        String optString6 = jSONObject.optString("givenName", null);
        String optString7 = jSONObject.optString("familyName", null);
        Long valueOf = Long.valueOf(parseLong);
        return new GoogleSignInAccount(3, optString2, optString3, optString4, optString5, uri, null, (valueOf == null ? Long.valueOf(a.a() / 1000) : valueOf).longValue(), gwb.M(jSONObject.getString("obfuscatedIdentifier")), new ArrayList((Collection) gwb.L(hashSet)), optString6, optString7).b(jSONObject.optString("serverAuthCode", null));
    }

    private JSONObject l() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (a() != null) {
                jSONObject.put("id", a());
            }
            if (b() != null) {
                jSONObject.put("tokenId", b());
            }
            if (c() != null) {
                jSONObject.put("email", c());
            }
            if (d() != null) {
                jSONObject.put("displayName", d());
            }
            if (e() != null) {
                jSONObject.put("givenName", e());
            }
            if (f() != null) {
                jSONObject.put("familyName", f());
            }
            if (g() != null) {
                jSONObject.put("photoUrl", g().toString());
            }
            if (h() != null) {
                jSONObject.put("serverAuthCode", h());
            }
            jSONObject.put("expirationTime", this.j);
            jSONObject.put("obfuscatedIdentifier", j());
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.c, n);
            for (Scope a : this.c) {
                jSONArray.put(a.a());
            }
            jSONObject.put("grantedScopes", jSONArray);
            return jSONObject;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public String a() {
        return this.d;
    }

    public GoogleSignInAccount b(String str) {
        this.i = str;
        return this;
    }

    public String b() {
        return this.e;
    }

    public String c() {
        return this.f;
    }

    public String d() {
        return this.g;
    }

    public String e() {
        return this.l;
    }

    public boolean equals(Object obj) {
        return !(obj instanceof GoogleSignInAccount) ? false : ((GoogleSignInAccount) obj).k().equals(k());
    }

    public String f() {
        return this.m;
    }

    public Uri g() {
        return this.h;
    }

    public String h() {
        return this.i;
    }

    public long i() {
        return this.j;
    }

    public String j() {
        return this.k;
    }

    public String k() {
        return l().toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, this.b);
        gwb.a(parcel, 2, a(), false);
        gwb.a(parcel, 3, b(), false);
        gwb.a(parcel, 4, c(), false);
        gwb.a(parcel, 5, d(), false);
        gwb.a(parcel, 6, g(), i, false);
        gwb.a(parcel, 7, h(), false);
        gwb.a(parcel, 8, i());
        gwb.a(parcel, 9, j(), false);
        gwb.c(parcel, 10, this.c, false);
        gwb.a(parcel, 11, e(), false);
        gwb.a(parcel, 12, f(), false);
        gwb.v(parcel, c);
    }
}
