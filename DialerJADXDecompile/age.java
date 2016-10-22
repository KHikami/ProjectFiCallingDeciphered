import android.os.Parcel;
import android.os.Parcelable.Creator;

/* compiled from: PG */
final class age implements Creator {
    age() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new agd[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new agd(parcel);
    }
}
