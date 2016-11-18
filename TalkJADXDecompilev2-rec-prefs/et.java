package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

final class et extends BaseSavedState {
    public static final Creator<et> CREATOR = new eu();
    String f12220a;

    et(Parcelable parcelable) {
        super(parcelable);
    }

    et(Parcel parcel) {
        super(parcel);
        this.f12220a = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f12220a);
    }

    public String toString() {
        return "FragmentTabHost.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " curTab=" + this.f12220a + "}";
    }
}
