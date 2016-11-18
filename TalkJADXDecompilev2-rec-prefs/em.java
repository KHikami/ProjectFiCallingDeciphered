package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

final class em implements Parcelable {
    public static final Creator<em> CREATOR = new en();
    ep[] f11833a;
    int[] f11834b;
    dl[] f11835c;

    public em(Parcel parcel) {
        this.f11833a = (ep[]) parcel.createTypedArray(ep.CREATOR);
        this.f11834b = parcel.createIntArray();
        this.f11835c = (dl[]) parcel.createTypedArray(dl.CREATOR);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.f11833a, i);
        parcel.writeIntArray(this.f11834b);
        parcel.writeTypedArray(this.f11835c, i);
    }
}
