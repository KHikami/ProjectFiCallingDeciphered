package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Locale;

public final class bcc implements Parcelable {
    public static final Creator<bcc> CREATOR = new bcd();
    public final String a;
    public final int b;
    public final int c;
    public boolean d;
    public boolean e;
    public bkm f;
    public String g;
    public long h;
    public String i;
    public String j;
    public int k = 0;
    public int l = 0;
    public String m;
    public ArrayList<Boolean> n = new ArrayList();
    public boolean o;
    public boolean p;
    public boolean q;
    public String r;
    public String s;
    public boolean t;

    public bcc(String str, int i) {
        this.a = str;
        this.b = i;
        this.h = -1;
        this.c = 0;
    }

    public bcc(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.h = -1;
    }

    public String toString() {
        Locale locale = Locale.US;
        String str = "[%s;%s;%s;%d;%d;%s;%d;%s;%s;%s;%s]";
        Object[] objArr = new Object[11];
        objArr[0] = this.a;
        objArr[1] = Boolean.valueOf(this.d);
        objArr[2] = Boolean.valueOf(this.e);
        objArr[3] = Integer.valueOf(this.b);
        objArr[4] = Integer.valueOf(this.c);
        objArr[5] = this.g;
        objArr[6] = Integer.valueOf(this.l);
        objArr[7] = this.m;
        objArr[8] = this.f != null ? this.f.toString() : "no-drafts";
        objArr[9] = this.i != null ? this.i : "no-chatRingtoneUri";
        objArr[10] = this.j != null ? this.j : "no-hangoutRingtoneUri";
        return String.format(locale, str, objArr);
    }

    public int a() {
        switch (this.k) {
            case 2148:
                return 1;
            default:
                return 0;
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        byte b;
        byte b2 = (byte) 1;
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        if (this.e) {
            b = (byte) 1;
        } else {
            b = (byte) 0;
        }
        parcel.writeByte(b);
        parcel.writeParcelable(this.f, i);
        parcel.writeString(this.g);
        parcel.writeLong(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        parcel.writeInt(this.l);
        parcel.writeString(this.m);
        parcel.writeInt(this.k);
        parcel.writeList(this.n);
        if (this.o) {
            b = (byte) 1;
        } else {
            b = (byte) 0;
        }
        parcel.writeByte(b);
        if (this.p) {
            b = (byte) 1;
        } else {
            b = (byte) 0;
        }
        parcel.writeByte(b);
        if (this.q) {
            b = (byte) 1;
        } else {
            b = (byte) 0;
        }
        parcel.writeByte(b);
        if (!this.t) {
            b2 = (byte) 0;
        }
        parcel.writeByte(b2);
        parcel.writeString(this.r);
        parcel.writeString(this.s);
    }

    protected bcc(Parcel parcel) {
        boolean z;
        boolean z2 = true;
        this.a = parcel.readString();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readByte() != (byte) 0;
        if (parcel.readByte() != (byte) 0) {
            z = true;
        } else {
            z = false;
        }
        this.e = z;
        this.f = (bkm) parcel.readParcelable(bkm.class.getClassLoader());
        this.g = parcel.readString();
        this.h = parcel.readLong();
        this.i = parcel.readString();
        this.j = parcel.readString();
        this.l = parcel.readInt();
        this.m = parcel.readString();
        this.k = parcel.readInt();
        this.n = new ArrayList();
        parcel.readList(this.n, Boolean.class.getClassLoader());
        this.o = parcel.readByte() != (byte) 0;
        if (parcel.readByte() != (byte) 0) {
            z = true;
        } else {
            z = false;
        }
        this.p = z;
        if (parcel.readByte() != (byte) 0) {
            z = true;
        } else {
            z = false;
        }
        this.q = z;
        if (parcel.readByte() == (byte) 0) {
            z2 = false;
        }
        this.t = z2;
        this.r = parcel.readString();
        this.s = parcel.readString();
    }
}
