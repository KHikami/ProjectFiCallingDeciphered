package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class edl implements Creator<edk> {
    edl() {
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m13602a(parcel);
    }

    private edk m13602a(Parcel parcel) {
        ClassLoader classLoader = getClass().getClassLoader();
        edk edk = new edk();
        edk.f11212a = edq.values()[parcel.readInt()];
        edk.f11213b = (edo) parcel.readParcelable(classLoader);
        edk.f11214c = parcel.readString();
        edk.f11215d = parcel.readString();
        edk.f11216e = parcel.readString();
        edk.f11217f = parcel.readString();
        edk.m13593c(parcel.readString());
        edk.f11219h = parcel.readString();
        edk.f11229r = parcel.readString();
        edk.f11230s = parcel.readString();
        edk.f11231t = parcel.readInt() == 1;
        edk.f11234w = parcel.readInt();
        edk.f11209G = parcel.readString();
        edk.f11210H = new byte[parcel.readInt()];
        parcel.readByteArray(edk.f11210H);
        return edk;
    }

    public /* synthetic */ Object[] newArray(int i) {
        return new edk[i];
    }
}
