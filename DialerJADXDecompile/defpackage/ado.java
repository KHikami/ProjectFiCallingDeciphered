package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* compiled from: PG */
/* renamed from: ado */
final class ado implements Creator {
    ado() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new adn[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new adn(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), null);
    }
}
