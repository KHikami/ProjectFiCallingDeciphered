package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gwb;
import hxw;
import hxx;
import hzd;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DataItemParcelable extends AbstractSafeParcelable implements hxw {
    public static final Creator<DataItemParcelable> CREATOR;
    final int a;
    private final Uri b;
    private final Map<String, hxx> c;
    private byte[] d;

    static {
        CREATOR = new hzd();
    }

    public DataItemParcelable(int i, Uri uri, Bundle bundle, byte[] bArr) {
        this.a = i;
        this.b = uri;
        Map hashMap = new HashMap();
        bundle.setClassLoader(DataItemAssetParcelable.class.getClassLoader());
        for (String str : bundle.keySet()) {
            hashMap.put(str, (DataItemAssetParcelable) bundle.getParcelable(str));
        }
        this.c = hashMap;
        this.d = bArr;
    }

    public Uri a() {
        return this.b;
    }

    public String a(boolean z) {
        StringBuilder stringBuilder = new StringBuilder("DataItemParcelable[");
        stringBuilder.append("@");
        stringBuilder.append(Integer.toHexString(hashCode()));
        String valueOf = String.valueOf(this.d == null ? "null" : Integer.valueOf(this.d.length));
        stringBuilder.append(new StringBuilder(String.valueOf(valueOf).length() + 8).append(",dataSz=").append(valueOf).toString());
        stringBuilder.append(", numAssets=" + this.c.size());
        valueOf = String.valueOf(this.b);
        stringBuilder.append(new StringBuilder(String.valueOf(valueOf).length() + 6).append(", uri=").append(valueOf).toString());
        if (z) {
            stringBuilder.append("]\n  assets: ");
            for (String valueOf2 : this.c.keySet()) {
                String valueOf3 = String.valueOf(this.c.get(valueOf2));
                stringBuilder.append(new StringBuilder((String.valueOf(valueOf2).length() + 7) + String.valueOf(valueOf3).length()).append("\n    ").append(valueOf2).append(": ").append(valueOf3).toString());
            }
            stringBuilder.append("\n  ]");
            return stringBuilder.toString();
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public byte[] b() {
        return this.d;
    }

    public Map<String, hxx> c() {
        return this.c;
    }

    public DataItemParcelable d() {
        return this;
    }

    public boolean e() {
        return true;
    }

    public /* synthetic */ Object f() {
        return d();
    }

    public Bundle g() {
        Bundle bundle = new Bundle();
        bundle.setClassLoader(DataItemAssetParcelable.class.getClassLoader());
        for (Entry entry : this.c.entrySet()) {
            bundle.putParcelable((String) entry.getKey(), new DataItemAssetParcelable((hxx) entry.getValue()));
        }
        return bundle;
    }

    public String toString() {
        return a(Log.isLoggable("DataItem", 3));
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, this.a);
        gwb.a(parcel, 2, a(), i, false);
        gwb.a(parcel, 4, g(), false);
        gwb.a(parcel, 5, b(), false);
        gwb.v(parcel, c);
    }
}
