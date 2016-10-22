package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gwb;
import iby;
import java.util.Arrays;

public class Asset extends AbstractSafeParcelable {
    public static final Creator<Asset> CREATOR;
    final int a;
    public ParcelFileDescriptor b;
    public Uri c;
    private byte[] d;
    private String e;

    static {
        CREATOR = new iby();
    }

    public Asset(int i, byte[] bArr, String str, ParcelFileDescriptor parcelFileDescriptor, Uri uri) {
        this.a = i;
        this.d = bArr;
        this.e = str;
        this.b = parcelFileDescriptor;
        this.c = uri;
    }

    public static Asset a(ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor != null) {
            return new Asset(1, null, null, parcelFileDescriptor, null);
        }
        throw new IllegalArgumentException("Asset fd cannot be null");
    }

    public static Asset a(String str) {
        if (str != null) {
            return new Asset(1, null, str, null, null);
        }
        throw new IllegalArgumentException("Asset digest cannot be null");
    }

    public static Asset a(byte[] bArr) {
        if (bArr != null) {
            return new Asset(1, bArr, null, null, null);
        }
        throw new IllegalArgumentException("Asset data cannot be null");
    }

    public byte[] a() {
        return this.d;
    }

    public String b() {
        return this.e;
    }

    public ParcelFileDescriptor c() {
        return this.b;
    }

    public Uri d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Asset)) {
            return false;
        }
        Asset asset = (Asset) obj;
        return Arrays.equals(this.d, asset.d) && gwb.e(this.e, asset.e) && gwb.e(this.b, asset.b) && gwb.e(this.c, asset.c);
    }

    public int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.d, this.e, this.b, this.c});
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Asset[@");
        stringBuilder.append(Integer.toHexString(hashCode()));
        if (this.e == null) {
            stringBuilder.append(", nodigest");
        } else {
            stringBuilder.append(", ");
            stringBuilder.append(this.e);
        }
        if (this.d != null) {
            stringBuilder.append(", size=");
            stringBuilder.append(this.d.length);
        }
        if (this.b != null) {
            stringBuilder.append(", fd=");
            stringBuilder.append(this.b);
        }
        if (this.c != null) {
            stringBuilder.append(", uri=");
            stringBuilder.append(this.c);
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = i | 1;
        int c = gwb.c(parcel);
        gwb.d(parcel, 1, this.a);
        gwb.a(parcel, 2, a(), false);
        gwb.a(parcel, 3, b(), false);
        gwb.a(parcel, 4, this.b, i2, false);
        gwb.a(parcel, 5, this.c, i2, false);
        gwb.v(parcel, c);
    }
}
