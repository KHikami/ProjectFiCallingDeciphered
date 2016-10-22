import android.os.Parcel;
import android.os.Parcelable.Creator;

/* compiled from: PG */
final class xw implements Creator {
    xw() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new xv[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new xv(parcel);
    }
}
