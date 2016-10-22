import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class jfb<T extends Parcelable> implements Parcelable {
    public static final Creator<jfb<?>> CREATOR;
    private final Class<?> a;
    private final Map<Integer, List<T>> b;

    static {
        CREATOR = new jfc();
    }

    public jfb(Class<?> cls) {
        this.b = new HashMap();
        this.a = cls;
    }

    public jfb(Parcel parcel) {
        this.b = new HashMap();
        this.a = a(parcel.readString());
        ClassLoader classLoader = this.a.getClassLoader();
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            List arrayList = new ArrayList(readInt3);
            for (int i2 = 0; i2 < readInt3; i2++) {
                arrayList.add(parcel.readParcelable(classLoader));
            }
            this.b.put(Integer.valueOf(readInt2), arrayList);
        }
    }

    private static Class<?> a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void a(Integer num, T t) {
        List list = (List) this.b.get(num);
        if (list == null) {
            list = new ArrayList();
            this.b.put(num, list);
        }
        list.add(t);
    }

    public List<T> a(Integer num) {
        return (List) this.b.remove(num);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.getName());
        parcel.writeInt(this.b.size());
        for (Integer num : this.b.keySet()) {
            parcel.writeInt(num.intValue());
            List<Parcelable> list = (List) this.b.get(num);
            parcel.writeInt(list.size());
            for (Parcelable writeParcelable : list) {
                parcel.writeParcelable(writeParcelable, i);
            }
        }
    }
}
