package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.playlog.internal.PlayLoggerContext;

/* renamed from: hwt */
public final class hwt implements Creator<PlayLoggerContext> {
    public /* synthetic */ Object[] newArray(int i) {
        return new PlayLoggerContext[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str = null;
        int i = 0;
        int b = gwb.b(parcel);
        boolean z = true;
        boolean z2 = false;
        String str2 = null;
        String str3 = null;
        int i2 = 0;
        int i3 = 0;
        String str4 = null;
        int i4 = 0;
        while (parcel.dataPosition() < b) {
            int a = gwb.a(parcel);
            switch (gwb.y(a)) {
                case wi.j /*1*/:
                    i4 = gwb.f(parcel, a);
                    break;
                case wi.l /*2*/:
                    str4 = gwb.l(parcel, a);
                    break;
                case wi.z /*3*/:
                    i3 = gwb.f(parcel, a);
                    break;
                case wi.h /*4*/:
                    i2 = gwb.f(parcel, a);
                    break;
                case wi.p /*5*/:
                    str3 = gwb.l(parcel, a);
                    break;
                case wi.s /*6*/:
                    str2 = gwb.l(parcel, a);
                    break;
                case wi.q /*7*/:
                    z = gwb.c(parcel, a);
                    break;
                case wi.m /*8*/:
                    str = gwb.l(parcel, a);
                    break;
                case wi.n /*9*/:
                    z2 = gwb.c(parcel, a);
                    break;
                case wi.dr /*10*/:
                    i = gwb.f(parcel, a);
                    break;
                default:
                    gwb.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new PlayLoggerContext(i4, str4, i3, i2, str3, str2, z, str, z2, i);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
