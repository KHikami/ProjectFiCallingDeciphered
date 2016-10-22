import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* compiled from: PG */
public final class xv implements Parcelable {
    public static final Creator CREATOR;
    int a;
    int b;
    boolean c;

    xv(Parcel parcel) {
        boolean z = true;
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        if (parcel.readInt() != 1) {
            z = false;
        }
        this.c = z;
    }

    public xv(xv xvVar) {
        this.a = xvVar.a;
        this.b = xvVar.b;
        this.c = xvVar.c;
    }

    final boolean a() {
        return this.a >= 0;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c ? 1 : 0);
    }

    static {
        CREATOR = new xw();
    }
}
