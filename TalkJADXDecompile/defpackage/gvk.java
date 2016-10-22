package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;

/* renamed from: gvk */
public final class gvk implements Creator<ResolveAccountResponse> {
    public /* synthetic */ Object[] newArray(int i) {
        return new ResolveAccountResponse[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        ConnectionResult connectionResult = null;
        boolean z = false;
        int b = gwb.b(parcel);
        boolean z2 = false;
        IBinder iBinder = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = gwb.a(parcel);
            switch (gwb.y(a)) {
                case wi.j /*1*/:
                    i = gwb.f(parcel, a);
                    break;
                case wi.l /*2*/:
                    iBinder = gwb.m(parcel, a);
                    break;
                case wi.z /*3*/:
                    connectionResult = (ConnectionResult) gwb.a(parcel, a, ConnectionResult.CREATOR);
                    break;
                case wi.h /*4*/:
                    z2 = gwb.c(parcel, a);
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
            return new ResolveAccountResponse(i, iBinder, connectionResult, z2, z);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
