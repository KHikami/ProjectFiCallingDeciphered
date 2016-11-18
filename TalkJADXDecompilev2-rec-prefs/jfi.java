package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class jfi implements Parcelable {
    public static final Creator<jfi> CREATOR = new jfj();
    private final Map<Integer, Integer> f19959a = new HashMap();

    public jfi(Parcel parcel) {
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            this.f19959a.put(Integer.valueOf(parcel.readInt()), Integer.valueOf(parcel.readInt()));
        }
    }

    public void m24088a(Integer num, Integer num2) {
        this.f19959a.put(num, num2);
    }

    public Integer m24086a(Integer num) {
        return (Integer) this.f19959a.get(num);
    }

    public Set<Integer> m24087a() {
        return this.f19959a.keySet();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f19959a.size());
        for (Entry entry : this.f19959a.entrySet()) {
            parcel.writeInt(((Integer) entry.getKey()).intValue());
            parcel.writeInt(((Integer) entry.getValue()).intValue());
        }
    }
}
