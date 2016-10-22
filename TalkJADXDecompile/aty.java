import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class aty implements atv {
    private final Map<String, List<atx>> c;
    private volatile Map<String, String> d;

    aty(Map<String, List<atx>> map) {
        this.c = Collections.unmodifiableMap(map);
    }

    public Map<String, String> a() {
        if (this.d == null) {
            synchronized (this) {
                if (this.d == null) {
                    Map hashMap = new HashMap();
                    for (Entry entry : this.c.entrySet()) {
                        StringBuilder stringBuilder = new StringBuilder();
                        List list = (List) entry.getValue();
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            Object a = ((atx) list.get(i)).a();
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
                    this.d = Collections.unmodifiableMap(hashMap);
                }
            }
        }
        return this.d;
    }

    public String toString() {
        String valueOf = String.valueOf(this.c);
        return new StringBuilder(String.valueOf(valueOf).length() + 21).append("LazyHeaders{headers=").append(valueOf).append("}").toString();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof aty)) {
            return false;
        }
        return this.c.equals(((aty) obj).c);
    }

    public int hashCode() {
        return this.c.hashCode();
    }
}
