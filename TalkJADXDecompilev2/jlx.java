package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class jlx implements Parcelable, Comparable<jlx> {
    public static final Creator<jlx> CREATOR = new jly();
    private final String a;
    private final long b;
    private final int c;
    private final String d;

    public /* synthetic */ int compareTo(Object obj) {
        return a((jlx) obj);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeLong(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
    }

    private int a(jlx jlx) {
        return this.a.compareToIgnoreCase(jlx.a());
    }

    public String toString() {
        return a();
    }

    public jlx(String str, long j, int i, String str2) {
        this.a = str;
        this.b = j;
        this.c = i;
        this.d = str2;
    }

    jlx(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readLong();
        this.c = parcel.readInt();
        this.d = parcel.readString();
    }

    public String a() {
        return this.a;
    }

    public long b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public String d() {
        return this.d;
    }
}
