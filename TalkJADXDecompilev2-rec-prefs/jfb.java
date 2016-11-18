package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class jfb<T extends Parcelable> implements Parcelable {
    public static final Creator<jfb<?>> CREATOR = new jfc();
    private final Class<?> f19954a;
    private final Map<Integer, List<T>> f19955b = new HashMap();

    public jfb(Class<?> cls) {
        this.f19954a = cls;
    }

    public jfb(Parcel parcel) {
        this.f19954a = jfb.m24072a(parcel.readString());
        ClassLoader classLoader = this.f19954a.getClassLoader();
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            List arrayList = new ArrayList(readInt3);
            for (int i2 = 0; i2 < readInt3; i2++) {
                arrayList.add(parcel.readParcelable(classLoader));
            }
            this.f19955b.put(Integer.valueOf(readInt2), arrayList);
        }
    }

    private static Class<?> m24072a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void m24074a(Integer num, T t) {
        List list = (List) this.f19955b.get(num);
        if (list == null) {
            list = new ArrayList();
            this.f19955b.put(num, list);
        }
        list.add(t);
    }

    public List<T> m24073a(Integer num) {
        return (List) this.f19955b.remove(num);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f19954a.getName());
        parcel.writeInt(this.f19955b.size());
        for (Integer num : this.f19955b.keySet()) {
            parcel.writeInt(num.intValue());
            List<Parcelable> list = (List) this.f19955b.get(num);
            parcel.writeInt(list.size());
            for (Parcelable writeParcelable : list) {
                parcel.writeParcelable(writeParcelable, i);
            }
        }
    }
}
