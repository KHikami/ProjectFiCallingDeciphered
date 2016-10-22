package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: jtc */
public final class jtc implements Parcelable {
    public static final Creator<jtc> CREATOR;
    public final int a;
    public final String[] b;
    public final int[] c;

    public jtc(int i, String[] strArr, int[] iArr) {
        this.a = i;
        this.b = strArr;
        this.c = iArr;
    }

    jtc(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.createStringArray();
        this.c = parcel.createIntArray();
    }

    jth a() {
        return new jth(this.b, this.c);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeStringArray(this.b);
        parcel.writeIntArray(this.c);
    }

    public int describeContents() {
        return 0;
    }

    static {
        CREATOR = new jtd();
    }
}
