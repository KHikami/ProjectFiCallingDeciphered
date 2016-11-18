package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.gcm.PeriodicTask;

public final class gzp implements Creator<PeriodicTask> {
    public /* synthetic */ Object[] newArray(int i) {
        return new PeriodicTask[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new PeriodicTask(parcel);
    }
}
