package defpackage;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class atz {
    private static final String a = System.getProperty("http.agent");
    private static final Map<String, List<atx>> b;
    private boolean c = true;
    private Map<String, List<atx>> d = b;
    private boolean e = true;
    private boolean f = true;

    static {
        Map hashMap = new HashMap(2);
        if (!TextUtils.isEmpty(a)) {
            hashMap.put("User-Agent", Collections.singletonList(new aua(a)));
        }
        hashMap.put("Accept-Encoding", Collections.singletonList(new aua("identity")));
        b = Collections.unmodifiableMap(hashMap);
    }

    public aty a() {
        this.c = true;
        return new aty(this.d);
    }
}
