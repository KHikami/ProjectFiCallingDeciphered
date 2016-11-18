package p000;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class atz {
    private static final String f2338a = System.getProperty("http.agent");
    private static final Map<String, List<atx>> f2339b;
    private boolean f2340c = true;
    private Map<String, List<atx>> f2341d = f2339b;
    private boolean f2342e = true;
    private boolean f2343f = true;

    static {
        Map hashMap = new HashMap(2);
        if (!TextUtils.isEmpty(f2338a)) {
            hashMap.put("User-Agent", Collections.singletonList(new aua(f2338a)));
        }
        hashMap.put("Accept-Encoding", Collections.singletonList(new aua("identity")));
        f2339b = Collections.unmodifiableMap(hashMap);
    }

    public aty m4026a() {
        this.f2340c = true;
        return new aty(this.f2341d);
    }
}
