package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class jtc implements Parcelable {
    public static final Creator<jtc> CREATOR = new jtd();
    public final int f21019a;
    public final String[] f21020b;
    public final int[] f21021c;

    public jtc(int i, String[] strArr, int[] iArr) {
        this.f21019a = i;
        this.f21020b = strArr;
        this.f21021c = iArr;
    }

    jtc(Parcel parcel) {
        this.f21019a = parcel.readInt();
        this.f21020b = parcel.createStringArray();
        this.f21021c = parcel.createIntArray();
    }

    jth m25186a() {
        return new jth(this.f21020b, this.f21021c);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f21019a);
        parcel.writeStringArray(this.f21020b);
        parcel.writeIntArray(this.f21021c);
    }

    public int describeContents() {
        return 0;
    }
}
