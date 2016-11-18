package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

public final class sx extends BaseSavedState {
    public static final Creator<sx> CREATOR = new sy();
    public int a;

    public sx(Parcelable parcelable) {
        super(parcelable);
    }

    sx(Parcel parcel) {
        super(parcel);
        this.a = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
    }

    public String toString() {
        return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.a + "}";
    }
}
