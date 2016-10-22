package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* compiled from: PG */
/* renamed from: hs */
public final class hs implements Creator {
    private ht a;

    public hs(ht htVar) {
        this.a = htVar;
    }

    public final Object createFromParcel(Parcel parcel) {
        return this.a.a(parcel, null);
    }

    public final Object[] newArray(int i) {
        return this.a.a(i);
    }
}
