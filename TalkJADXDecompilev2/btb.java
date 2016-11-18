package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class btb implements Creator<bta> {
    btb() {
    }

    public /* synthetic */ Object[] newArray(int i) {
        return new bta[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        bta bta = new bta();
        bta.a = parcel.readString();
        bta.b = parcel.readString();
        bta.c = parcel.readInt();
        bta.d = parcel.readInt();
        bta.e = parcel.readString();
        bta.f = parcel.readDouble();
        bta.g = parcel.readDouble();
        bta.h = parcel.readString();
        bta.i = parcel.readString();
        bta.j = parcel.readString();
        bta.k = parcel.readString();
        bta.l = parcel.readString();
        bta.m = parcel.readInt();
        bta.n = parcel.readInt();
        bta.o = parcel.createByteArray();
        bta.p = parcel.readInt() != 0;
        bta.q = parcel.readLong();
        bta.r = parcel.readInt();
        return bta;
    }
}
