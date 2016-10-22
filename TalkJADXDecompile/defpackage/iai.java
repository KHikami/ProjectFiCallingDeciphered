package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wearable.internal.NodeParcelable;

/* renamed from: iai */
public final class iai implements Creator<NodeParcelable> {
    public /* synthetic */ Object[] newArray(int i) {
        return new NodeParcelable[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str = null;
        boolean z = false;
        int b = gwb.b(parcel);
        int i = 0;
        String str2 = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = gwb.a(parcel);
            switch (gwb.y(a)) {
                case wi.j /*1*/:
                    i2 = gwb.f(parcel, a);
                    break;
                case wi.l /*2*/:
                    str2 = gwb.l(parcel, a);
                    break;
                case wi.z /*3*/:
                    str = gwb.l(parcel, a);
                    break;
                case wi.h /*4*/:
                    i = gwb.f(parcel, a);
                    break;
                case wi.p /*5*/:
                    z = gwb.c(parcel, a);
                    break;
                default:
                    gwb.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new NodeParcelable(i2, str2, str, i, z);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
