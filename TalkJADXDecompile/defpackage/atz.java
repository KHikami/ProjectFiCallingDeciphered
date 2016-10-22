package defpackage;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: atz */
public final class atz {
    private static final String a;
    private static final Map<String, List<atx>> b;
    private boolean c;
    private Map<String, List<atx>> d;
    private boolean e;
    private boolean f;

    public atz() {
        this.c = true;
        this.d = b;
        this.e = true;
        this.f = true;
    }

    static {
        a = System.getProperty("http.agent");
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
