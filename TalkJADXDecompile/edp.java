import android.os.Parcel;
import android.os.Parcelable.Creator;

final class edp implements Creator<edo> {
    edp() {
    }

    public /* synthetic */ Object[] newArray(int i) {
        return new edo[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        String readString;
        String str = null;
        if (parcel.readInt() == 1) {
            readString = parcel.readString();
        } else {
            readString = null;
        }
        if (parcel.readInt() == 1) {
            str = parcel.readString();
        }
        return new edo(readString, str);
    }
}
