package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.analytics.internal.Command;

/* renamed from: bok */
public final class bok implements Creator {
    @Deprecated
    public final /* synthetic */ Object[] newArray(int i) {
        return new Command[i];
    }

    @Deprecated
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new Command(parcel);
    }
}
