package com.google.android.gms.wearable;

import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import gwb;
import ica;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class PutDataRequest extends AbstractSafeParcelable {
    public static final Creator<PutDataRequest> CREATOR;
    private static final long b;
    private static final Random c;
    final int a;
    private final Uri d;
    private final Bundle e;
    private byte[] f;
    private long g;

    static {
        CREATOR = new ica();
        b = TimeUnit.MINUTES.toMillis(30);
        c = new SecureRandom();
    }

    private PutDataRequest(int i, Uri uri) {
        this(2, uri, new Bundle(), null, b);
    }

    public PutDataRequest(int i, Uri uri, Bundle bundle, byte[] bArr, long j) {
        this.a = i;
        this.d = uri;
        this.e = bundle;
        this.e.setClassLoader(DataItemAssetParcelable.class.getClassLoader());
        this.f = bArr;
        this.g = j;
    }

    public static PutDataRequest a(Uri uri) {
        return new PutDataRequest(2, uri);
    }

    public Uri a() {
        return this.d;
    }

    public PutDataRequest a(String str, Asset asset) {
        gwb.L((Object) str);
        gwb.L((Object) asset);
        this.e.putParcelable(str, asset);
        return this;
    }

    public PutDataRequest a(byte[] bArr) {
        this.f = bArr;
        return this;
    }

    public String a(boolean z) {
        StringBuilder stringBuilder = new StringBuilder("PutDataRequest[");
        String valueOf = String.valueOf(this.f == null ? "null" : Integer.valueOf(this.f.length));
        stringBuilder.append(new StringBuilder(String.valueOf(valueOf).length() + 7).append("dataSz=").append(valueOf).toString());
        stringBuilder.append(", numAssets=" + this.e.size());
        valueOf = String.valueOf(this.d);
        stringBuilder.append(new StringBuilder(String.valueOf(valueOf).length() + 6).append(", uri=").append(valueOf).toString());
        stringBuilder.append(", syncDeadline=" + this.g);
        if (z) {
            stringBuilder.append("]\n  assets: ");
            for (String valueOf2 : this.e.keySet()) {
                String valueOf3 = String.valueOf(this.e.getParcelable(valueOf2));
                stringBuilder.append(new StringBuilder((String.valueOf(valueOf2).length() + 7) + String.valueOf(valueOf3).length()).append("\n    ").append(valueOf2).append(": ").append(valueOf3).toString());
            }
            stringBuilder.append("\n  ]");
            return stringBuilder.toString();
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public byte[] b() {
        return this.f;
    }

    public Map<String, Asset> c() {
        Map hashMap = new HashMap();
        for (String str : this.e.keySet()) {
            hashMap.put(str, (Asset) this.e.getParcelable(str));
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public Bundle d() {
        return this.e;
    }

    public long e() {
        return this.g;
    }

    public boolean f() {
        return this.g == 0;
    }

    public PutDataRequest g() {
        this.g = 0;
        return this;
    }

    public String toString() {
        return a(Log.isLoggable("DataMap", 3));
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, this.a);
        gwb.a(parcel, 2, a(), i, false);
        gwb.a(parcel, 4, d(), false);
        gwb.a(parcel, 5, b(), false);
        gwb.a(parcel, 6, e());
        gwb.v(parcel, c);
    }

    public static PutDataRequest a(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("An empty path was supplied.");
        } else if (!str.startsWith("/")) {
            throw new IllegalArgumentException("A path must start with a single / .");
        } else if (!str.startsWith("//")) {
            return a(new Builder().scheme("wear").path(str).build());
        } else {
            throw new IllegalArgumentException("A path must start with a single / .");
        }
    }
}
