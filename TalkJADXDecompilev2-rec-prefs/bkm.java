package p000;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

public class bkm implements Parcelable, bhm {
    public static final Creator<bkm> CREATOR = new bkn();
    public final String f3628a;
    private final String f3629b;
    private final int f3630c;

    public bkm() {
        this("");
    }

    public bkm(String str) {
        this(str, "", -1);
    }

    public bkm(String str, String str2, int i) {
        this.f3628a = str;
        this.f3629b = str2;
        this.f3630c = i;
    }

    public boolean m5607a() {
        return TextUtils.isEmpty(this.f3628a);
    }

    public String toString() {
        String str = "DraftInfo text: ";
        String valueOf = String.valueOf(this.f3628a);
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }

    public int mo539a(Context context, bhb bhb) {
        new blo(context, this.f3630c).m5988a(this.f3629b, this.f3628a);
        return bhn.f3348a;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3628a);
        parcel.writeString(this.f3629b);
        parcel.writeInt(this.f3630c);
    }

    protected bkm(Parcel parcel) {
        this.f3628a = parcel.readString();
        this.f3629b = parcel.readString();
        this.f3630c = parcel.readInt();
    }
}
