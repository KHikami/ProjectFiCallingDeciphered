package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;

public class duv implements Parcelable, Serializable {
    public static final Creator<duv> CREATOR = new duw();
    public final String f10585a;
    public final double f10586b;
    public final double f10587c;
    public final CharSequence f10588d;
    public final CharSequence f10589e;

    public static duv m12745a(hkh hkh) {
        return new duv(hkh.mo1283a(), hkh.mo1286d().f7681a, hkh.mo1286d().f7682b, hkh.mo1284b(), hkh.mo1285c());
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f10585a);
        parcel.writeDouble(this.f10586b);
        parcel.writeDouble(this.f10587c);
        parcel.writeString(this.f10588d.toString());
        parcel.writeString(this.f10589e.toString());
    }

    public hkh m12746a() {
        return new dux(this);
    }

    duv(Parcel parcel) {
        this.f10585a = parcel.readString();
        this.f10586b = parcel.readDouble();
        this.f10587c = parcel.readDouble();
        this.f10588d = parcel.readString();
        this.f10589e = parcel.readString();
    }

    private duv(String str, double d, double d2, CharSequence charSequence, CharSequence charSequence2) {
        this.f10585a = str;
        this.f10586b = d;
        this.f10587c = d2;
        this.f10588d = charSequence;
        this.f10589e = charSequence2;
    }
}
