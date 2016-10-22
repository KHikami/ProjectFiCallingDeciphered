package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: jfi */
public final class jfi implements Parcelable {
    public static final Creator<jfi> CREATOR;
    private final Map<Integer, Integer> a;

    static {
        CREATOR = new jfj();
    }

    public jfi() {
        this.a = new HashMap();
    }

    public jfi(Parcel parcel) {
        this.a = new HashMap();
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            this.a.put(Integer.valueOf(parcel.readInt()), Integer.valueOf(parcel.readInt()));
        }
    }

    public void a(Integer num, Integer num2) {
        this.a.put(num, num2);
    }

    public Integer a(Integer num) {
        return (Integer) this.a.get(num);
    }

    public Set<Integer> a() {
        return this.a.keySet();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a.size());
        for (Entry entry : this.a.entrySet()) {
            parcel.writeInt(((Integer) entry.getKey()).intValue());
            parcel.writeInt(((Integer) entry.getValue()).intValue());
        }
    }
}
