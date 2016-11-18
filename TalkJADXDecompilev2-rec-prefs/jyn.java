package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.Log;
import com.google.api.client.http.HttpStatusCodes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public final class jyn {
    static final kad f21289a = new kad("debug.binder.verification");
    private static final Object f21290b = new Object();
    private static final jys f21291c = new jys(false, new jyt());
    private Context f21292d;
    private jyn f21293e;
    private String f21294f;
    private final Map<Object, Object> f21295g;
    private final Map<Object, List<?>> f21296h;
    private final HashSet<Class<?>> f21297i;
    private final ArrayList<jyw> f21298j;
    private boolean f21299k;

    public jyn(Context context) {
        this(context, null);
    }

    public jyn(Context context, jyn jyn) {
        this.f21295g = new HashMap();
        this.f21296h = new HashMap();
        this.f21297i = new HashSet();
        this.f21298j = new ArrayList();
        this.f21292d = context;
        this.f21293e = jyn;
        this.f21294f = context.getClass().getName();
    }

    public jyn() {
        this.f21295g = new HashMap();
        this.f21296h = new HashMap();
        this.f21297i = new HashSet();
        this.f21298j = new ArrayList();
    }

    public void m25451a(Context context) {
        this.f21292d = context;
        if (this.f21294f == null) {
            this.f21294f = context.getClass().getName();
        }
    }

    public void m25453a(jyn jyn) {
        this.f21293e = jyn;
    }

    public <T> jyn m25444a(Class<T> cls, T t) {
        m25431a((Object) cls, (Object) t);
        return this;
    }

    public <T> jyn m25455b(Class<T> cls, T t) {
        m25437b((Object) cls, (Object) t);
        return this;
    }

    public <T> jyn m25445a(Class<T> cls, T... tArr) {
        for (Object b : tArr) {
            m25455b((Class) cls, b);
        }
        return this;
    }

    public jyn m25447a(String str, String str2) {
        m25431a((Object) str, (Object) str2);
        return this;
    }

    public jyn m25446a(String str, int i) {
        m25431a((Object) str, Integer.valueOf(3));
        return this;
    }

    public jyn m25448a(String str, boolean z) {
        m25431a((Object) str, Boolean.valueOf(true));
        return this;
    }

    public synchronized jyn m25449a(jyw jyw) {
        m25436b();
        this.f21298j.add(jyw);
        return this;
    }

    public <T> T m25443a(Class<T> cls) {
        String str = "Get";
        cls.getSimpleName();
        ba.m4536a((Object) cls);
        T d = m25440d(cls);
        if (d != null) {
            return d;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unbound type: ").append(cls.getName()).append("\n").append("Searched binders:\n");
        while (true) {
            stringBuilder.append(this.f21294f);
            this = this.f21293e;
            if (this != null) {
                stringBuilder.append(" ->\n");
            } else {
                str = stringBuilder.toString();
                Throwable illegalStateException = new IllegalStateException(str);
                Log.e("Binder", str, illegalStateException);
                throw illegalStateException;
            }
        }
    }

    public <T> T m25454b(Class<T> cls) {
        String str = "GetOptional";
        cls.getSimpleName();
        return m25440d(cls);
    }

    private <T> T m25440d(Class<T> cls) {
        ba.m4536a((Object) cls);
        do {
            T e = m25441e(cls);
            if (e != null) {
                return e;
            }
            this = this.f21293e;
        } while (this != null);
        return null;
    }

    public <T> List<T> m25457c(Class<T> cls) {
        String str = "GetAll";
        cls.getSimpleName();
        ba.m4536a((Object) cls);
        List<T> arrayList = new ArrayList();
        do {
            arrayList.addAll(m25442f(cls));
            this = this.f21293e;
        } while (this != null);
        return arrayList;
    }

    public boolean m25456b(String str, boolean z) {
        return ((Boolean) m25427a(str, Boolean.valueOf(true))).booleanValue();
    }

    private Object m25427a(String str, Object obj) {
        return m25434b(str, obj);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private Object m25434b(String str, Object obj) {
        if (this.f21292d == null) {
            throw new IllegalStateException("Binder not initialized yet.");
        }
        do {
            synchronized (this) {
                Object obj2 = this.f21295g.get(str);
                if (obj2 != null && obj2 != f21290b) {
                    return obj2;
                } else if (obj2 == null) {
                    this.f21295g.put(str, f21290b);
                }
            }
        } while (this != null);
        return obj;
    }

    public synchronized void m25450a() {
        this.f21299k = true;
    }

    private void m25436b() {
        if (this.f21299k) {
            throw new jyp("This binder is sealed for modification");
        }
    }

    private synchronized void m25431a(Object obj, Object obj2) {
        m25436b();
        Object obj3 = this.f21295g.get(obj);
        if (obj3 == null) {
            this.f21295g.put(obj, obj2);
        } else if (obj3 == f21290b) {
            String valueOf = String.valueOf(obj);
            throw new jyp(new StringBuilder(String.valueOf(valueOf).length() + 51).append("Bind call too late - someone already tried to get: ").append(valueOf).toString());
        } else {
            String valueOf2 = String.valueOf(obj);
            String valueOf3 = String.valueOf(obj3);
            throw new jyo(new StringBuilder((String.valueOf(valueOf2).length() + 21) + String.valueOf(valueOf3).length()).append("Duplicate binding: ").append(valueOf2).append(", ").append(valueOf3).toString());
        }
    }

    private synchronized void m25437b(Object obj, Object obj2) {
        m25436b();
        List list = (List) this.f21296h.get(obj);
        if (list == null) {
            list = new ArrayList();
            this.f21296h.put(obj, list);
        }
        list.add(obj2);
    }

    private synchronized <T> T m25441e(Class<T> cls) {
        T t;
        synchronized (this) {
            ba.m4536a((Object) cls);
            if (this.f21292d == null) {
                throw new IllegalStateException("Binder not initialized yet.");
            }
            t = this.f21295g.get(cls);
            if (t == null) {
                boolean z = this.f21299k;
                this.f21299k = false;
                try {
                    int size = this.f21298j.size();
                    for (int i = 0; i < size; i++) {
                        ((jyw) this.f21298j.get(i)).mo2230a(this.f21292d, cls, this);
                        t = this.f21295g.get(cls);
                        if (t != null) {
                            break;
                        }
                    }
                    this.f21299k = z;
                    t = this.f21295g.get(cls);
                    if (t == null) {
                        this.f21295g.put(cls, f21290b);
                    }
                } finally {
                    this.f21299k = z;
                }
            } else if (t == f21290b) {
                t = null;
            }
        }
        return t;
    }

    private synchronized <T> List<T> m25442f(Class<T> cls) {
        List<T> list;
        synchronized (this) {
            ba.m4536a((Object) cls);
            if (this.f21292d == null) {
                throw new IllegalStateException("Binder not initialized yet.");
            }
            List<T> list2 = (List) this.f21296h.get(cls);
            if (list2 == null) {
                ArrayList arrayList = new ArrayList();
                this.f21296h.put(cls, arrayList);
                list = arrayList;
            } else {
                list = list2;
            }
            if (!this.f21297i.contains(cls)) {
                this.f21297i.add(cls);
                boolean z = this.f21299k;
                this.f21299k = false;
                try {
                    int size = this.f21298j.size();
                    for (int i = 0; i < size; i++) {
                        ((jyw) this.f21298j.get(i)).mo2230a(this.f21292d, cls, this);
                    }
                } finally {
                    this.f21299k = z;
                }
            }
        }
        return list;
    }

    public static <T> T m25426a(Context context, Class<T> cls) {
        return jyn.m25435b(context).m25443a((Class) cls);
    }

    public static <T> T m25433b(Context context, Class<T> cls) {
        return jyn.m25435b(context).m25454b((Class) cls);
    }

    public static <T> List<T> m25438c(Context context, Class<T> cls) {
        return jyn.m25435b(context).m25457c((Class) cls);
    }

    public static String m25428a(Context context, String str, String str2) {
        return (String) jyn.m25435b(context).m25427a(str, null);
    }

    public static int m25425a(Context context, String str, int i) {
        return ((Integer) jyn.m25435b(context).m25427a(str, Integer.valueOf(HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES))).intValue();
    }

    public static boolean m25432a(Context context, String str, boolean z) {
        return ((Boolean) jyn.m25435b(context).m25427a(str, Boolean.valueOf(z))).booleanValue();
    }

    public static jyn m25429a(Context context, dr drVar) {
        Object parentFragment;
        while (parentFragment != null) {
            jyn a = jyn.m25430a(parentFragment);
            if (a != null) {
                return a;
            }
            parentFragment = parentFragment.getParentFragment();
        }
        return jyn.m25435b(context);
    }

    public static jyn m25435b(Context context) {
        Context applicationContext = context.getApplicationContext();
        int i = 0;
        Context context2 = context;
        do {
            jyn a = jyn.m25430a((Object) context2);
            if (a != null) {
                return a;
            }
            i |= context2 == applicationContext ? 1 : 0;
            if (context2 instanceof ContextWrapper) {
                context2 = ((ContextWrapper) context2).getBaseContext();
                if (context2 == null) {
                    throw new IllegalStateException("Invalid ContextWrapper -- If this is a Robolectric test, have you called ActivityController.create()?");
                }
            } else if (i == 0) {
                context2 = applicationContext;
                continue;
            } else {
                context2 = null;
                continue;
            }
        } while (context2 != null);
        return jyn.m25439c(applicationContext);
    }

    public static jyn m25439c(Context context) {
        return f21291c.m25460a(context.getApplicationContext());
    }

    public void m25452a(String str) {
        this.f21294f = str;
    }

    private static jyn m25430a(Object obj) {
        if (!(obj instanceof jyq)) {
            return null;
        }
        jyn binder = ((jyq) obj).getBinder();
        if (binder != null) {
            return binder;
        }
        String valueOf = String.valueOf(obj);
        throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 43).append("BinderContext must not return null Binder: ").append(valueOf).toString());
    }
}
