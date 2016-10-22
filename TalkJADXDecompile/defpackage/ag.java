package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.SparseArray;

/* renamed from: ag */
public final class ag extends lr {
    public static final Creator<ag> CREATOR;
    public SparseArray<Parcelable> a;

    public ag(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        this.a = new SparseArray(readInt);
        for (int i = 0; i < readInt; i++) {
            this.a.append(iArr[i], readParcelableArray[i]);
        }
    }

    public ag(Parcelable parcelable) {
        super(parcelable);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = 0;
        super.writeToParcel(parcel, i);
        int size = this.a != null ? this.a.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        while (i2 < size) {
            iArr[i2] = this.a.keyAt(i2);
            parcelableArr[i2] = (Parcelable) this.a.valueAt(i2);
            i2++;
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }

    static {
        CREATOR = gwb.a(new hbe());
    }
}
