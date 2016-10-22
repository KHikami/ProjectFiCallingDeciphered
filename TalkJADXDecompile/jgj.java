import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

final class jgj implements Parcelable {
    public static final Creator<jgj> CREATOR;
    private static final String[] a;
    private int b;
    private Map<String, Integer> c;

    static {
        a = new String[0];
        CREATOR = new jgk();
    }

    public jgj(jgu jgu) {
        this.b = jgu.a();
        this.c = new HashMap();
    }

    int a() {
        return this.b;
    }

    String[] b() {
        if (this.c.isEmpty()) {
            return a;
        }
        return (String[]) this.c.keySet().toArray(new String[this.c.size()]);
    }

    int a(String str) {
        return gwb.a((Integer) this.c.get(str));
    }

    void a(jgc jgc) {
        Object valueOf;
        String j = jgc.j();
        Integer num = (Integer) this.c.get(j);
        if (num == null) {
            valueOf = Integer.valueOf(1);
        } else {
            valueOf = Integer.valueOf(num.intValue() + 1);
        }
        this.c.put(j, valueOf);
    }

    void b(String str) {
        Integer num = (Integer) this.c.get(str);
        if (num == null) {
            return;
        }
        if (num.intValue() == 1) {
            this.c.remove(str);
        } else {
            this.c.put(str, Integer.valueOf(num.intValue() - 1));
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.c.size());
        for (Entry entry : this.c.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeInt(((Integer) entry.getValue()).intValue());
        }
    }

    jgj(Parcel parcel) {
        this.b = parcel.readInt();
        int readInt = parcel.readInt();
        this.c = new HashMap(readInt);
        for (int i = 0; i < readInt; i++) {
            this.c.put(parcel.readString(), Integer.valueOf(parcel.readInt()));
        }
    }
}
