package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.phenotype.ExperimentTokens;

/* renamed from: crw */
public final class crw implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        byte[][] bArr = null;
        int b = buf.b(parcel);
        int i = 0;
        int[] iArr = null;
        byte[][] bArr2 = null;
        byte[][] bArr3 = null;
        byte[][] bArr4 = null;
        byte[][] bArr5 = null;
        byte[] bArr6 = null;
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = buf.a(parcel);
            switch (buf.z(a)) {
                case rq.b /*1*/:
                    i = buf.e(parcel, a);
                    break;
                case rq.c /*2*/:
                    str = buf.k(parcel, a);
                    break;
                case rl.e /*3*/:
                    bArr6 = buf.n(parcel, a);
                    break;
                case rl.f /*4*/:
                    bArr5 = buf.o(parcel, a);
                    break;
                case rl.g /*5*/:
                    bArr4 = buf.o(parcel, a);
                    break;
                case rl.i /*6*/:
                    bArr3 = buf.o(parcel, a);
                    break;
                case rl.h /*7*/:
                    bArr2 = buf.o(parcel, a);
                    break;
                case rl.j /*8*/:
                    iArr = buf.p(parcel, a);
                    break;
                case rl.l /*9*/:
                    bArr = buf.o(parcel, a);
                    break;
                default:
                    buf.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ExperimentTokens(i, str, bArr6, bArr5, bArr4, bArr3, bArr2, iArr, bArr);
        }
        throw new dd("Overread allowed size end=" + b, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ExperimentTokens[i];
    }
}
