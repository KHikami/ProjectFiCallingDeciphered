package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class edl implements Creator<edk> {
    edl() {
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    private edk a(Parcel parcel) {
        ClassLoader classLoader = getClass().getClassLoader();
        edk edk = new edk();
        edk.a = edq.values()[parcel.readInt()];
        edk.b = (edo) parcel.readParcelable(classLoader);
        edk.c = parcel.readString();
        edk.d = parcel.readString();
        edk.e = parcel.readString();
        edk.f = parcel.readString();
        edk.c(parcel.readString());
        edk.h = parcel.readString();
        edk.r = parcel.readString();
        edk.s = parcel.readString();
        edk.t = parcel.readInt() == 1;
        edk.w = parcel.readInt();
        edk.G = parcel.readString();
        edk.H = new byte[parcel.readInt()];
        parcel.readByteArray(edk.H);
        return edk;
    }

    public /* synthetic */ Object[] newArray(int i) {
        return new edk[i];
    }
}
