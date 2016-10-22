package defpackage;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: gvf */
public final class gvf implements Creator<DataHolder> {
    public /* synthetic */ Object[] newArray(int i) {
        return new DataHolder[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        Bundle bundle = null;
        int b = gwb.b(parcel);
        CursorWindow[] cursorWindowArr = null;
        String[] strArr = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = gwb.a(parcel);
            switch (gwb.y(a)) {
                case wi.j /*1*/:
                    strArr = gwb.q(parcel, a);
                    break;
                case wi.l /*2*/:
                    cursorWindowArr = (CursorWindow[]) gwb.b(parcel, a, CursorWindow.CREATOR);
                    break;
                case wi.z /*3*/:
                    i = gwb.f(parcel, a);
                    break;
                case wi.h /*4*/:
                    bundle = gwb.n(parcel, a);
                    break;
                case 1000:
                    i2 = gwb.f(parcel, a);
                    break;
                default:
                    gwb.b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() != b) {
            throw new dt("Overread allowed size end=" + b, parcel);
        }
        DataHolder dataHolder = new DataHolder(i2, strArr, cursorWindowArr, i, bundle);
        dataHolder.a();
        return dataHolder;
    }
}
