package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import bpx;
import bpz;
import buf;
import bwa;
import bwb;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class GoogleSignInAccount implements SafeParcelable {
    public static final Creator CREATOR;
    private static bwa k;
    private static Comparator l;
    final int a;
    String b;
    String c;
    String d;
    String e;
    Uri f;
    String g;
    long h;
    String i;
    List j;

    static {
        CREATOR = new bpz();
        k = bwb.c();
        l = new bpx();
    }

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List list) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = uri;
        this.g = str5;
        this.h = j;
        this.i = str6;
        this.j = list;
    }

    public static GoogleSignInAccount a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        Object optString = jSONObject.optString("photoUrl", null);
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
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
        Long valueOf = Long.valueOf(parseLong);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(2, optString2, optString3, optString4, optString5, parse, null, (valueOf == null ? Long.valueOf(k.a() / 1000) : valueOf).longValue(), buf.n(jSONObject.getString("obfuscatedIdentifier")), new ArrayList((Collection) buf.A(hashSet)));
        googleSignInAccount.g = jSONObject.optString("serverAuthCode", null);
        return googleSignInAccount;
    }

    private final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.b != null) {
                jSONObject.put("id", this.b);
            }
            if (this.c != null) {
                jSONObject.put("tokenId", this.c);
            }
            if (this.d != null) {
                jSONObject.put("email", this.d);
            }
            if (this.e != null) {
                jSONObject.put("displayName", this.e);
            }
            if (this.f != null) {
                jSONObject.put("photoUrl", this.f.toString());
            }
            if (this.g != null) {
                jSONObject.put("serverAuthCode", this.g);
            }
            jSONObject.put("expirationTime", this.h);
            jSONObject.put("obfuscatedIdentifier", this.i);
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.j, l);
            for (Scope scope : this.j) {
                jSONArray.put(scope.b);
            }
            jSONObject.put("grantedScopes", jSONArray);
            return jSONObject;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return !(obj instanceof GoogleSignInAccount) ? false : ((GoogleSignInAccount) obj).a().toString().equals(a().toString());
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = buf.c(parcel);
        buf.d(parcel, 1, this.a);
        buf.a(parcel, 2, this.b, false);
        buf.a(parcel, 3, this.c, false);
        buf.a(parcel, 4, this.d, false);
        buf.a(parcel, 5, this.e, false);
        buf.a(parcel, 6, this.f, i, false);
        buf.a(parcel, 7, this.g, false);
        buf.a(parcel, 8, this.h);
        buf.a(parcel, 9, this.i, false);
        buf.c(parcel, 10, this.j, false);
        buf.v(parcel, c);
    }
}
