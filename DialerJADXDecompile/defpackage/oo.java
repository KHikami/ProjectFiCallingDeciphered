package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

/* compiled from: PG */
/* renamed from: oo */
public final class oo extends BaseSavedState {
    public static final Creator CREATOR;
    public int a;

    public oo(Parcelable parcelable) {
        super(parcelable);
    }

    public oo(Parcel parcel) {
        super(parcel);
        this.a = parcel.readInt();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
    }

    public final String toString() {
        return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.a + "}";
    }

    static {
        CREATOR = new op();
    }
}
