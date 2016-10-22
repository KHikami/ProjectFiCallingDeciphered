package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.apps.hangouts.phone.AccountSelectionActivity;

/* renamed from: eis */
final class eis implements Creator<AccountSelectionActivity> {
    eis() {
    }

    public /* synthetic */ Object[] newArray(int i) {
        return new AccountSelectionActivity[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new AccountSelectionActivity();
    }
}
