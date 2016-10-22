package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.playlog.internal.PlayLoggerContext;

/* renamed from: bqm */
public final class bqm implements Creator {
    public static LogEventParcelable a(Parcel parcel) {
        int b = buf.b(parcel);
        byte[] bArr = null;
        PlayLoggerContext playLoggerContext = null;
        int i = 0;
        int[] iArr = null;
        while (parcel.dataPosition() < b) {
            int a = buf.a(parcel);
            switch (buf.z(a)) {
                case rq.b /*1*/:
                    i = buf.e(parcel, a);
                    break;
                case rq.c /*2*/:
                    playLoggerContext = (PlayLoggerContext) buf.a(parcel, a, PlayLoggerContext.CREATOR);
                    break;
                case rl.e /*3*/:
                    bArr = buf.n(parcel, a);
                    break;
                case rl.f /*4*/:
                    iArr = buf.p(parcel, a);
                    break;
                default:
                    buf.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new LogEventParcelable(i, playLoggerContext, bArr, iArr);
        }
        throw new dd("Overread allowed size end=" + b, parcel);
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return bqm.a(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LogEventParcelable[i];
    }
}
