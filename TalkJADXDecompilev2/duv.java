package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;

public class duv implements Parcelable, Serializable {
    public static final Creator<duv> CREATOR = new duw();
    public final String a;
    public final double b;
    public final double c;
    public final CharSequence d;
    public final CharSequence e;

    public static duv a(hkh hkh) {
        return new duv(hkh.a(), hkh.d().a, hkh.d().b, hkh.b(), hkh.c());
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeDouble(this.b);
        parcel.writeDouble(this.c);
        parcel.writeString(this.d.toString());
        parcel.writeString(this.e.toString());
    }

    public hkh a() {
        return new dux(this);
    }

    duv(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readDouble();
        this.c = parcel.readDouble();
        this.d = parcel.readString();
        this.e = parcel.readString();
    }

    private duv(String str, double d, double d2, CharSequence charSequence, CharSequence charSequence2) {
        this.a = str;
        this.b = d;
        this.c = d2;
        this.d = charSequence;
        this.e = charSequence2;
    }
}
