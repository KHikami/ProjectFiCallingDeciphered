import android.os.Parcel;
import android.os.Parcelable.Creator;

final class jei implements Creator<jeh> {
    jei() {
    }

    public /* synthetic */ Object[] newArray(int i) {
        return new jeh[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new jeh(parcel);
    }
}
