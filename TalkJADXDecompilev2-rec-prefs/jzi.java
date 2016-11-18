package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class jzi<T extends jzh> {
    private final Context f21311a;
    private final Class f21312b;
    private HashMap<Class, List<T>> f21313c;

    public jzi(Context context, Class cls) {
        this.f21311a = context;
        this.f21312b = cls;
    }

    public synchronized List<T> m25468a(Class cls) {
        m25467a();
        return (List) this.f21313c.get(cls);
    }

    private synchronized void m25467a() {
        if (this.f21313c == null) {
            this.f21313c = new HashMap();
            for (jzh jzh : jyn.m25438c(this.f21311a, this.f21312b)) {
                Class a = jzh.mo676a();
                List list = (List) this.f21313c.get(a);
                if (list == null) {
                    list = new ArrayList();
                    this.f21313c.put(a, list);
                }
                list.add(jzh);
            }
        }
    }
}
