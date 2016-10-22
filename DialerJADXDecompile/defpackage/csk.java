package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.signin.internal.SignInRequest;

/* renamed from: csk */
public final class csk implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new SignInRequest[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = buf.b(parcel);
        int i = 0;
        ResolveAccountRequest resolveAccountRequest = null;
        while (parcel.dataPosition() < b) {
            int a = buf.a(parcel);
            switch (buf.z(a)) {
                case rq.b /*1*/:
                    i = buf.e(parcel, a);
                    break;
                case rq.c /*2*/:
                    resolveAccountRequest = (ResolveAccountRequest) buf.a(parcel, a, ResolveAccountRequest.CREATOR);
                    break;
                default:
                    buf.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new SignInRequest(i, resolveAccountRequest);
        }
        throw new dd("Overread allowed size end=" + b, parcel);
    }
}
