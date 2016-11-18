package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class jlx implements Parcelable, Comparable<jlx> {
    public static final Creator<jlx> CREATOR = new jly();
    private final String f20456a;
    private final long f20457b;
    private final int f20458c;
    private final String f20459d;

    public /* synthetic */ int compareTo(Object obj) {
        return m24679a((jlx) obj);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f20456a);
        parcel.writeLong(this.f20457b);
        parcel.writeInt(this.f20458c);
        parcel.writeString(this.f20459d);
    }

    private int m24679a(jlx jlx) {
        return this.f20456a.compareToIgnoreCase(jlx.m24680a());
    }

    public String toString() {
        return m24680a();
    }

    public jlx(String str, long j, int i, String str2) {
        this.f20456a = str;
        this.f20457b = j;
        this.f20458c = i;
        this.f20459d = str2;
    }

    jlx(Parcel parcel) {
        this.f20456a = parcel.readString();
        this.f20457b = parcel.readLong();
        this.f20458c = parcel.readInt();
        this.f20459d = parcel.readString();
    }

    public String m24680a() {
        return this.f20456a;
    }

    public long m24681b() {
        return this.f20457b;
    }

    public int m24682c() {
        return this.f20458c;
    }

    public String m24683d() {
        return this.f20459d;
    }
}
