package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

final class jgj implements Parcelable {
    public static final Creator<jgj> CREATOR = new jgk();
    private static final String[] f20007a = new String[0];
    private int f20008b;
    private Map<String, Integer> f20009c;

    public jgj(jgu jgu) {
        this.f20008b = jgu.m24169a();
        this.f20009c = new HashMap();
    }

    int m24150a() {
        return this.f20008b;
    }

    String[] m24154b() {
        if (this.f20009c.isEmpty()) {
            return f20007a;
        }
        return (String[]) this.f20009c.keySet().toArray(new String[this.f20009c.size()]);
    }

    int m24151a(String str) {
        return gwb.m1507a((Integer) this.f20009c.get(str));
    }

    void m24152a(jgc jgc) {
        Object valueOf;
        String j = jgc.m6411j();
        Integer num = (Integer) this.f20009c.get(j);
        if (num == null) {
            valueOf = Integer.valueOf(1);
        } else {
            valueOf = Integer.valueOf(num.intValue() + 1);
        }
        this.f20009c.put(j, valueOf);
    }

    void m24153b(String str) {
        Integer num = (Integer) this.f20009c.get(str);
        if (num == null) {
            return;
        }
        if (num.intValue() == 1) {
            this.f20009c.remove(str);
        } else {
            this.f20009c.put(str, Integer.valueOf(num.intValue() - 1));
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f20008b);
        parcel.writeInt(this.f20009c.size());
        for (Entry entry : this.f20009c.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeInt(((Integer) entry.getValue()).intValue());
        }
    }

    jgj(Parcel parcel) {
        this.f20008b = parcel.readInt();
        int readInt = parcel.readInt();
        this.f20009c = new HashMap(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f20009c.put(parcel.readString(), Integer.valueOf(parcel.readInt()));
        }
    }
}
