package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.googlehelp.OfflineSuggestion;

/* renamed from: ckp */
public final class ckp implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str = null;
        int b = buf.b(parcel);
        int i = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (parcel.dataPosition() < b) {
            int a = buf.a(parcel);
            switch (buf.z(a)) {
                case rq.b /*1*/:
                    i = buf.e(parcel, a);
                    break;
                case rq.c /*2*/:
                    str4 = buf.k(parcel, a);
                    break;
                case rl.e /*3*/:
                    str3 = buf.k(parcel, a);
                    break;
                case rl.f /*4*/:
                    str2 = buf.k(parcel, a);
                    break;
                case rl.g /*5*/:
                    str = buf.k(parcel, a);
                    break;
                default:
                    buf.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new OfflineSuggestion(i, str4, str3, str2, str);
        }
        throw new dd("Overread allowed size end=" + b, parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new OfflineSuggestion[i];
    }
}
