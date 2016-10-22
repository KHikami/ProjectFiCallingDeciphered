package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.people.internal.ParcelableLoadImageOptions;

/* renamed from: hvk */
public final class hvk implements Creator<ParcelableLoadImageOptions> {
    public /* synthetic */ Object[] newArray(int i) {
        return new ParcelableLoadImageOptions[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z = false;
        int b = gwb.b(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = gwb.a(parcel);
            switch (gwb.y(a)) {
                case wi.j /*1*/:
                    i2 = gwb.f(parcel, a);
                    break;
                case wi.l /*2*/:
                    i = gwb.f(parcel, a);
                    break;
                case wi.z /*3*/:
                    z = gwb.c(parcel, a);
                    break;
                case 1000:
                    i3 = gwb.f(parcel, a);
                    break;
                default:
                    gwb.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ParcelableLoadImageOptions(i3, i2, i, z);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
