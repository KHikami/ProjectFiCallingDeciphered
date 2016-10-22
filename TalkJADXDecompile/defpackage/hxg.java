package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.signin.internal.RecordConsentRequest;

/* renamed from: hxg */
public final class hxg implements Creator<RecordConsentRequest> {
    public /* synthetic */ Object[] newArray(int i) {
        return new RecordConsentRequest[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = gwb.b(parcel);
        Scope[] scopeArr = null;
        Account account = null;
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = gwb.a(parcel);
            switch (gwb.y(a)) {
                case wi.j /*1*/:
                    i = gwb.f(parcel, a);
                    break;
                case wi.l /*2*/:
                    account = (Account) gwb.a(parcel, a, Account.CREATOR);
                    break;
                case wi.z /*3*/:
                    scopeArr = (Scope[]) gwb.b(parcel, a, Scope.CREATOR);
                    break;
                case wi.h /*4*/:
                    str = gwb.l(parcel, a);
                    break;
                default:
                    gwb.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new RecordConsentRequest(i, account, scopeArr, str);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
