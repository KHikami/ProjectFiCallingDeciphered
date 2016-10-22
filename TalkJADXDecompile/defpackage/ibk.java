package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wearable.internal.AmsEntityUpdateParcelable;

/* renamed from: ibk */
public final class ibk implements Creator<AmsEntityUpdateParcelable> {
    public /* synthetic */ Object[] newArray(int i) {
        return new AmsEntityUpdateParcelable[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        byte b = (byte) 0;
        int b2 = gwb.b(parcel);
        String str = null;
        byte b3 = (byte) 0;
        int i = 0;
        while (parcel.dataPosition() < b2) {
            int a = gwb.a(parcel);
            switch (gwb.y(a)) {
                case wi.j /*1*/:
                    i = gwb.f(parcel, a);
                    break;
                case wi.l /*2*/:
                    b3 = gwb.d(parcel, a);
                    break;
                case wi.z /*3*/:
                    b = gwb.d(parcel, a);
                    break;
                case wi.h /*4*/:
                    str = gwb.l(parcel, a);
                    break;
                default:
                    gwb.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b2) {
            return new AmsEntityUpdateParcelable(i, b3, b, str);
        }
        throw new dt("Overread allowed size end=" + b2, parcel);
    }
}
