package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* compiled from: PG */
/* renamed from: k */
public final class k extends il {
    public static final Creator CREATOR;
    final int a;

    public k(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readInt();
    }

    public k(Parcelable parcelable, int i) {
        super(parcelable);
        this.a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
    }

    static {
        CREATOR = buf.a(new btj());
    }
}
