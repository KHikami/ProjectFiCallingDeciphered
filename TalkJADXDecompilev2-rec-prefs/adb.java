package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class adb implements Parcelable {
    public static final Creator<adb> CREATOR = new adc();
    int f331a;
    int f332b;
    boolean f333c;

    adb(Parcel parcel) {
        boolean z = true;
        this.f331a = parcel.readInt();
        this.f332b = parcel.readInt();
        if (parcel.readInt() != 1) {
            z = false;
        }
        this.f333c = z;
    }

    public adb(adb adb) {
        this.f331a = adb.f331a;
        this.f332b = adb.f332b;
        this.f333c = adb.f333c;
    }

    boolean m648a() {
        return this.f331a >= 0;
    }

    void m649b() {
        this.f331a = -1;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f331a);
        parcel.writeInt(this.f332b);
        parcel.writeInt(this.f333c ? 1 : 0);
    }
}
