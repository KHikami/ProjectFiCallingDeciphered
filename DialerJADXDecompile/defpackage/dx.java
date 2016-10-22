package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* compiled from: PG */
/* renamed from: dx */
final class dx implements Creator {
    dx() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new dw[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new dw(parcel);
    }
}
