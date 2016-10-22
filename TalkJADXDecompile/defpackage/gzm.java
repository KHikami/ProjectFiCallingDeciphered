package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.gcm.OneoffTask;

/* renamed from: gzm */
public final class gzm implements Creator<OneoffTask> {
    public /* synthetic */ Object[] newArray(int i) {
        return new OneoffTask[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new OneoffTask(parcel);
    }
}
