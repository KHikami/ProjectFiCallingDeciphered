package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

/* renamed from: bkm */
public class bkm implements Parcelable, bhm {
    public static final Creator<bkm> CREATOR;
    public final String a;
    private final String b;
    private final int c;

    public bkm() {
        this("");
    }

    public bkm(String str) {
        this(str, "", -1);
    }

    public bkm(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public boolean a() {
        return TextUtils.isEmpty(this.a);
    }

    public String toString() {
        String str = "DraftInfo text: ";
        String valueOf = String.valueOf(this.a);
        return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
    }

    public int a(Context context, bhb bhb) {
        new blo(context, this.c).a(this.b, this.a);
        return bhn.a;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
    }

    protected bkm(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readInt();
    }

    static {
        CREATOR = new bkn();
    }
}
