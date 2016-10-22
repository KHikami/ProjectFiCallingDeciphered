package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.phenotype.DogfoodsToken;

/* renamed from: crv */
public final class crv implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new DogfoodsToken[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = buf.b(parcel);
        int i = 0;
        byte[] bArr = null;
        while (parcel.dataPosition() < b) {
            int a = buf.a(parcel);
            switch (buf.z(a)) {
                case rq.b /*1*/:
                    i = buf.e(parcel, a);
                    break;
                case rq.c /*2*/:
                    bArr = buf.n(parcel, a);
                    break;
                default:
                    buf.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new DogfoodsToken(i, bArr);
        }
        throw new dd("Overread allowed size end=" + b, parcel);
    }
}
