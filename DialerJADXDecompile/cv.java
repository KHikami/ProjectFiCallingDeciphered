import android.os.Parcel;
import android.os.Parcelable.Creator;

/* compiled from: PG */
final class cv implements Creator {
    cv() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new cu[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new cu(parcel);
    }
}
