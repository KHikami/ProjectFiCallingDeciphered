package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.iid.MessengerCompat;

public final class hbq implements Creator<MessengerCompat> {
    public /* synthetic */ Object[] newArray(int i) {
        return new MessengerCompat[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        IBinder readStrongBinder = parcel.readStrongBinder();
        return readStrongBinder != null ? new MessengerCompat(readStrongBinder) : null;
    }
}
