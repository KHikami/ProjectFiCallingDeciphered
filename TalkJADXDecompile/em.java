import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

final class em implements Parcelable {
    public static final Creator<em> CREATOR;
    ep[] a;
    int[] b;
    dl[] c;

    public em(Parcel parcel) {
        this.a = (ep[]) parcel.createTypedArray(ep.CREATOR);
        this.b = parcel.createIntArray();
        this.c = (dl[]) parcel.createTypedArray(dl.CREATOR);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.a, i);
        parcel.writeIntArray(this.b);
        parcel.writeTypedArray(this.c, i);
    }

    static {
        CREATOR = new en();
    }
}
