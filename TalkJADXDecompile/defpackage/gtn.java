package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.playlog.internal.PlayLoggerContext;

/* renamed from: gtn */
public final class gtn implements Creator<LogEventParcelable> {
    public /* synthetic */ Object[] newArray(int i) {
        return new LogEventParcelable[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = gwb.b(parcel);
        byte[] bArr = null;
        PlayLoggerContext playLoggerContext = null;
        int i = 0;
        int[] iArr = null;
        while (parcel.dataPosition() < b) {
            int a = gwb.a(parcel);
            switch (gwb.y(a)) {
                case wi.j /*1*/:
                    i = gwb.f(parcel, a);
                    break;
                case wi.l /*2*/:
                    playLoggerContext = (PlayLoggerContext) gwb.a(parcel, a, PlayLoggerContext.CREATOR);
                    break;
                case wi.z /*3*/:
                    bArr = gwb.o(parcel, a);
                    break;
                case wi.h /*4*/:
                    iArr = gwb.p(parcel, a);
                    break;
                default:
                    gwb.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new LogEventParcelable(i, playLoggerContext, bArr, iArr);
        }
        throw new dt("Overread allowed size end=" + b, parcel);
    }
}
