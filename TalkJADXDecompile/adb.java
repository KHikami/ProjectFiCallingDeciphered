import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class adb implements Parcelable {
    public static final Creator<adb> CREATOR;
    int a;
    int b;
    boolean c;

    adb(Parcel parcel) {
        boolean z = true;
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        if (parcel.readInt() != 1) {
            z = false;
        }
        this.c = z;
    }

    public adb(adb adb) {
        this.a = adb.a;
        this.b = adb.b;
        this.c = adb.c;
    }

    boolean a() {
        return this.a >= 0;
    }

    void b() {
        this.a = -1;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c ? 1 : 0);
    }

    static {
        CREATOR = new adc();
    }
}
