import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* compiled from: PG */
final class du implements Parcelable {
    public static final Creator CREATOR;
    dw[] a;
    int[] b;
    cu[] c;

    public du(Parcel parcel) {
        this.a = (dw[]) parcel.createTypedArray(dw.CREATOR);
        this.b = parcel.createIntArray();
        this.c = (cu[]) parcel.createTypedArray(cu.CREATOR);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.a, i);
        parcel.writeIntArray(this.b);
        parcel.writeTypedArray(this.c, i);
    }

    static {
        CREATOR = new dv();
    }
}
