import android.os.Parcel;
import android.os.Parcelable.Creator;

final class ged implements Creator<gec> {
    ged() {
    }

    public /* synthetic */ Object[] newArray(int i) {
        return new gec[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new gec(parcel.readInt(), parcel.readString(), parcel.readString());
    }
}
