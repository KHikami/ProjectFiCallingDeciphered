package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ValidateAccountRequest;

/* renamed from: gvm */
public final class gvm implements Creator<ValidateAccountRequest> {
    public /* synthetic */ Object[] newArray(int i) {
        return new ValidateAccountRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        String str = null;
        int b = gwb.b(parcel);
        Bundle bundle = null;
        Scope[] scopeArr = null;
        IBinder iBinder = null;
        int i2 = 0;
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
                    iBinder = gwb.m(parcel, a);
                    break;
                case wi.h /*4*/:
                    scopeArr = (Scope[]) gwb.b(parcel, a, Scope.CREATOR);
                    break;
                case wi.p /*5*/:
                    bundle = gwb.n(parcel, a);
                    break;
                case wi.s /*6*/:
                    str = gwb.l(parcel, a);
                    break;
                default:
                    gwb.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new ValidateAccountRequest(i2, i, iBinder, scopeArr, bundle, str);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
