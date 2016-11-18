package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.gcm.PendingCallback;

public final class gzo implements Creator<PendingCallback> {
    public /* synthetic */ Object[] newArray(int i) {
        return new PendingCallback[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new PendingCallback(parcel);
    }
}
