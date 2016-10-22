import android.os.Parcel;
import android.os.Parcelable.Creator;

final class fbu implements Creator<fbt> {
    fbu() {
    }

    public /* synthetic */ Object[] newArray(int i) {
        return new fbt[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z;
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return new fbt(readString, readString2, readString3, readString4, z);
    }
}
