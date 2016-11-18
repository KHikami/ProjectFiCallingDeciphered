package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.Locale;

public final class bcc implements Parcelable {
    public static final Creator<bcc> CREATOR = new bcd();
    public final String f2975a;
    public final int f2976b;
    public final int f2977c;
    public boolean f2978d;
    public boolean f2979e;
    public bkm f2980f;
    public String f2981g;
    public long f2982h;
    public String f2983i;
    public String f2984j;
    public int f2985k = 0;
    public int f2986l = 0;
    public String f2987m;
    public ArrayList<Boolean> f2988n = new ArrayList();
    public boolean f2989o;
    public boolean f2990p;
    public boolean f2991q;
    public String f2992r;
    public String f2993s;
    public boolean f2994t;

    public bcc(String str, int i) {
        this.f2975a = str;
        this.f2976b = i;
        this.f2982h = -1;
        this.f2977c = 0;
    }

    public bcc(String str, int i, int i2) {
        this.f2975a = str;
        this.f2976b = i;
        this.f2977c = i2;
        this.f2982h = -1;
    }

    public String toString() {
        Locale locale = Locale.US;
        String str = "[%s;%s;%s;%d;%d;%s;%d;%s;%s;%s;%s]";
        Object[] objArr = new Object[11];
        objArr[0] = this.f2975a;
        objArr[1] = Boolean.valueOf(this.f2978d);
        objArr[2] = Boolean.valueOf(this.f2979e);
        objArr[3] = Integer.valueOf(this.f2976b);
        objArr[4] = Integer.valueOf(this.f2977c);
        objArr[5] = this.f2981g;
        objArr[6] = Integer.valueOf(this.f2986l);
        objArr[7] = this.f2987m;
        objArr[8] = this.f2980f != null ? this.f2980f.toString() : "no-drafts";
        objArr[9] = this.f2983i != null ? this.f2983i : "no-chatRingtoneUri";
        objArr[10] = this.f2984j != null ? this.f2984j : "no-hangoutRingtoneUri";
        return String.format(locale, str, objArr);
    }

    public int m4834a() {
        switch (this.f2985k) {
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
        parcel.writeString(this.f2975a);
        parcel.writeInt(this.f2976b);
        parcel.writeInt(this.f2977c);
        parcel.writeByte(this.f2978d ? (byte) 1 : (byte) 0);
        if (this.f2979e) {
            b = (byte) 1;
        } else {
            b = (byte) 0;
        }
        parcel.writeByte(b);
        parcel.writeParcelable(this.f2980f, i);
        parcel.writeString(this.f2981g);
        parcel.writeLong(this.f2982h);
        parcel.writeString(this.f2983i);
        parcel.writeString(this.f2984j);
        parcel.writeInt(this.f2986l);
        parcel.writeString(this.f2987m);
        parcel.writeInt(this.f2985k);
        parcel.writeList(this.f2988n);
        if (this.f2989o) {
            b = (byte) 1;
        } else {
            b = (byte) 0;
        }
        parcel.writeByte(b);
        if (this.f2990p) {
            b = (byte) 1;
        } else {
            b = (byte) 0;
        }
        parcel.writeByte(b);
        if (this.f2991q) {
            b = (byte) 1;
        } else {
            b = (byte) 0;
        }
        parcel.writeByte(b);
        if (!this.f2994t) {
            b2 = (byte) 0;
        }
        parcel.writeByte(b2);
        parcel.writeString(this.f2992r);
        parcel.writeString(this.f2993s);
    }

    protected bcc(Parcel parcel) {
        boolean z;
        boolean z2 = true;
        this.f2975a = parcel.readString();
        this.f2976b = parcel.readInt();
        this.f2977c = parcel.readInt();
        this.f2978d = parcel.readByte() != (byte) 0;
        if (parcel.readByte() != (byte) 0) {
            z = true;
        } else {
            z = false;
        }
        this.f2979e = z;
        this.f2980f = (bkm) parcel.readParcelable(bkm.class.getClassLoader());
        this.f2981g = parcel.readString();
        this.f2982h = parcel.readLong();
        this.f2983i = parcel.readString();
        this.f2984j = parcel.readString();
        this.f2986l = parcel.readInt();
        this.f2987m = parcel.readString();
        this.f2985k = parcel.readInt();
        this.f2988n = new ArrayList();
        parcel.readList(this.f2988n, Boolean.class.getClassLoader());
        this.f2989o = parcel.readByte() != (byte) 0;
        if (parcel.readByte() != (byte) 0) {
            z = true;
        } else {
            z = false;
        }
        this.f2990p = z;
        if (parcel.readByte() != (byte) 0) {
            z = true;
        } else {
            z = false;
        }
        this.f2991q = z;
        if (parcel.readByte() == (byte) 0) {
            z2 = false;
        }
        this.f2994t = z2;
        this.f2992r = parcel.readString();
        this.f2993s = parcel.readString();
    }
}
