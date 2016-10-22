import android.os.Parcel;
import android.os.Parcelable.Creator;

final class jwk implements Creator<jwj> {
    jwk() {
    }

    public /* synthetic */ Object[] newArray(int i) {
        return new jwj[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new jwj(parcel);
    }
}
