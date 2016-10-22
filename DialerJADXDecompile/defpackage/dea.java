package defpackage;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/* compiled from: PG */
/* renamed from: dea */
public final class dea implements Externalizable {
    static final Map c;
    int[] a;
    List b;
    private int d;

    static {
        Map hashMap = new HashMap();
        hashMap.put("zh_TW", "zh_Hant");
        hashMap.put("zh_HK", "zh_Hant");
        hashMap.put("zh_MO", "zh_Hant");
        c = Collections.unmodifiableMap(hashMap);
    }

    public dea() {
        this.d = 0;
    }

    public final void readExternal(ObjectInput objectInput) {
        this.d = objectInput.readInt();
        if (this.a == null || this.a.length < this.d) {
            this.a = new int[this.d];
        }
        if (this.b == null) {
            this.b = new ArrayList();
        }
        for (int i = 0; i < this.d; i++) {
            this.a[i] = objectInput.readInt();
            int readInt = objectInput.readInt();
            Set hashSet = new HashSet();
            for (int i2 = 0; i2 < readInt; i2++) {
                hashSet.add(objectInput.readUTF());
            }
            this.b.add(hashSet);
        }
    }

    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeInt(this.d);
        for (int i = 0; i < this.d; i++) {
            objectOutput.writeInt(this.a[i]);
            Set<String> set = (Set) this.b.get(i);
            objectOutput.writeInt(set.size());
            for (String writeUTF : set) {
                objectOutput.writeUTF(writeUTF);
            }
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < this.d; i++) {
            stringBuilder.append(this.a[i]);
            stringBuilder.append('|');
            for (String append : new TreeSet((Collection) this.b.get(i))) {
                stringBuilder.append(append);
                stringBuilder.append(',');
            }
            stringBuilder.append('\n');
        }
        return stringBuilder.toString();
    }

    static void a(String str, StringBuilder stringBuilder) {
        if (str.length() > 0) {
            stringBuilder.append('_').append(str);
        }
    }
}
