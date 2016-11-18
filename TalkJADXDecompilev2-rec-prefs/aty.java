package p000;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class aty implements atv {
    private final Map<String, List<atx>> f2336c;
    private volatile Map<String, String> f2337d;

    aty(Map<String, List<atx>> map) {
        this.f2336c = Collections.unmodifiableMap(map);
    }

    public Map<String, String> mo390a() {
        if (this.f2337d == null) {
            synchronized (this) {
                if (this.f2337d == null) {
                    Map hashMap = new HashMap();
                    for (Entry entry : this.f2336c.entrySet()) {
                        StringBuilder stringBuilder = new StringBuilder();
                        List list = (List) entry.getValue();
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            Object a = ((atx) list.get(i)).mo391a();
                            if (!TextUtils.isEmpty(a)) {
                                stringBuilder.append(a);
                                if (i != list.size() - 1) {
                                    stringBuilder.append(',');
                                }
                            }
                        }
                        if (!TextUtils.isEmpty(stringBuilder.toString())) {
                            hashMap.put((String) entry.getKey(), stringBuilder.toString());
                        }
                    }
                    this.f2337d = Collections.unmodifiableMap(hashMap);
                }
            }
        }
        return this.f2337d;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f2336c);
        return new StringBuilder(String.valueOf(valueOf).length() + 21).append("LazyHeaders{headers=").append(valueOf).append("}").toString();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof aty)) {
            return false;
        }
        return this.f2336c.equals(((aty) obj).f2336c);
    }

    public int hashCode() {
        return this.f2336c.hashCode();
    }
}
