import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class jzi<T extends jzh> {
    private final Context a;
    private final Class b;
    private HashMap<Class, List<T>> c;

    public jzi(Context context, Class cls) {
        this.a = context;
        this.b = cls;
    }

    public synchronized List<T> a(Class cls) {
        a();
        return (List) this.c.get(cls);
    }

    private synchronized void a() {
        if (this.c == null) {
            this.c = new HashMap();
            for (jzh jzh : jyn.c(this.a, this.b)) {
                Class a = jzh.a();
                List list = (List) this.c.get(a);
                if (list == null) {
                    list = new ArrayList();
                    this.c.put(a, list);
                }
                list.add(jzh);
            }
        }
    }
}
