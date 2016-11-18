package p000;

import android.content.Context;
import android.os.Parcel;
import java.io.Serializable;

public abstract class eaf implements Serializable {
    private final String f10986a;
    public long f10987b;
    private final int f10988c;
    private int f10989d;
    private int f10990e;

    public abstract void mo1801a(Context context, int i, evz evz);

    public eaf(String str, int i) {
        this(str, i, 0, 0);
    }

    public eaf(String str, int i, int i2, int i3) {
        this.f10986a = str;
        this.f10988c = i;
        this.f10989d = i2;
        this.f10990e = i3;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f10986a);
        parcel.writeInt(this.f10988c);
        parcel.writeInt(this.f10989d);
        parcel.writeInt(this.f10990e);
        parcel.writeLong(this.f10987b);
    }

    public eaf(Parcel parcel) {
        this.f10986a = parcel.readString();
        this.f10988c = parcel.readInt();
        this.f10989d = parcel.readInt();
        this.f10990e = parcel.readInt();
        this.f10987b = parcel.readLong();
    }

    public String m13266a() {
        return this.f10986a;
    }

    public int m13268b() {
        return this.f10988c;
    }

    public int m13269c() {
        return this.f10989d;
    }

    public int m13270d() {
        return this.f10990e;
    }

    public void m13271e() {
        this.f10989d++;
    }

    public void m13272f() {
        this.f10990e++;
    }
}
