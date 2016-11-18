package p000;

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
        bta.f4358a = parcel.readString();
        bta.f4359b = parcel.readString();
        bta.f4360c = parcel.readInt();
        bta.f4361d = parcel.readInt();
        bta.f4362e = parcel.readString();
        bta.f4363f = parcel.readDouble();
        bta.f4364g = parcel.readDouble();
        bta.f4365h = parcel.readString();
        bta.f4366i = parcel.readString();
        bta.f4367j = parcel.readString();
        bta.f4368k = parcel.readString();
        bta.f4369l = parcel.readString();
        bta.f4370m = parcel.readInt();
        bta.f4371n = parcel.readInt();
        bta.f4372o = parcel.createByteArray();
        bta.f4373p = parcel.readInt() != 0;
        bta.f4374q = parcel.readLong();
        bta.f4375r = parcel.readInt();
        return bta;
    }
}
