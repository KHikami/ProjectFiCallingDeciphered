import android.content.Context;
import android.content.ContextWrapper;
import android.util.Log;
import com.google.api.client.http.HttpStatusCodes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public final class jyn { //being treated as a specific kind of binder...
    static final kad a;
    private static final Object b;
    private static final jys c;
    private Context d;
    private jyn e;
    private String f;
    private final Map<Object, Object> g;
    private final Map<Object, List<?>> h;
    private final HashSet<Class<?>> i;
    private final ArrayList<jyw> j;
    private boolean k;

    static {
        a = new kad("debug.binder.verification");
        b = new Object();
        c = new jys(false, new jyt());
    }

    public jyn(Context context) {
        this(context, null);
    }

    public jyn(Context context, jyn jyn) {
        this.g = new HashMap();
        this.h = new HashMap();
        this.i = new HashSet();
        this.j = new ArrayList();
        this.d = context;
        this.e = jyn;
        this.f = context.getClass().getName();
    }

    public jyn() {
        this.g = new HashMap();
        this.h = new HashMap();
        this.i = new HashSet();
        this.j = new ArrayList();
    }

    public void a(Context context) {
        this.d = context;
        if (this.f == null) {
            this.f = context.getClass().getName();
        }
    }

    public void a(jyn jyn) {
        this.e = jyn;
    }

    public <T> jyn a(Class<T> cls, T t) {
        a((Object) cls, (Object) t);
        return this;
    }

    public <T> jyn b(Class<T> cls, T t) {
        b((Object) cls, (Object) t);
        return this;
    }

    public <T> jyn a(Class<T> cls, T... tArr) {
        for (Object b : tArr) {
            b((Class) cls, b);
        }
        return this;
    }

    public jyn a(String str, String str2) {
        a((Object) str, (Object) str2);
        return this;
    }

    public jyn a(String str, int i) {
        a((Object) str, Integer.valueOf(3));
        return this;
    }

    public jyn a(String str, boolean z) {
        a((Object) str, Boolean.valueOf(true));
        return this;
    }

    public synchronized jyn a(jyw jyw) {
        b();
        this.j.add(jyw);
        return this;
    }

    public <T> T a(Class<T> cls) {
        String str = "Get";
        cls.getSimpleName();
        ba.a((Object) cls);
        T d = d(cls);
        if (d != null) {
            return d;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unbound type: ").append(cls.getName()).append("\n").append("Searched binders:\n");
        while (true) {
            stringBuilder.append(this.f);
            this = this.e;
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

    public <T> T b(Class<T> cls) {
        String str = "GetOptional";
        cls.getSimpleName();//retrieves the simple name of the passed class (biw in our case)
        return d(cls);
    }

    private <T> T d(Class<T> cls) {
        ba.a((Object) cls); //calls a static method in class ba
        do { //keeps trying to make an instance of biw from a jyn
            T e = e(cls); //instance of biw = e(biw)
            if (e != null) { //creation of biw successful from this jyn
                return e;
            }
            this = this.e; //grab jyn's related jyn and try to create a biw again
        } while (this != null);
        return null; //if I'm out of jyns => can't create the biw => return null
    }

    public <T> List<T> c(Class<T> cls) {
        String str = "GetAll";
        cls.getSimpleName();
        ba.a((Object) cls);
        List<T> arrayList = new ArrayList();
        do {
            arrayList.addAll(f(cls));
            this = this.e;
        } while (this != null);
        return arrayList;
    }

    public boolean b(String str, boolean z) {
        return ((Boolean) a(str, Boolean.valueOf(true))).booleanValue();
    }

    private Object a(String str, Object obj) {
        return b(str, obj);
    }

    private Object b(String str, Object obj) {
        if (this.d == null) {
            throw new IllegalStateException("Binder not initialized yet.");
        }
        do {
            synchronized (this) {
                Object obj2 = this.g.get(str);
                if (obj2 == null || obj2 == b) {
                    if (obj2 == null) {
                        this.g.put(str, b);
                    }
                    this = this.e;
                } else {
                    return obj2;
                }
            }
        } while (this != null);
        return obj;
    }

    public synchronized void a() {
        this.k = true;
    }

    private void b() {
        if (this.k) {
            throw new jyp("This binder is sealed for modification");
        }
    }

    private synchronized void a(Object obj, Object obj2) {
        b();
        Object obj3 = this.g.get(obj);
        if (obj3 == null) {
            this.g.put(obj, obj2);
        } else if (obj3 == b) {
            String valueOf = String.valueOf(obj);
            throw new jyp(new StringBuilder(String.valueOf(valueOf).length() + 51).append("Bind call too late - someone already tried to get: ").append(valueOf).toString());
        } else {
            String valueOf2 = String.valueOf(obj);
            String valueOf3 = String.valueOf(obj3);
            throw new jyo(new StringBuilder((String.valueOf(valueOf2).length() + 21) + String.valueOf(valueOf3).length()).append("Duplicate binding: ").append(valueOf2).append(", ").append(valueOf3).toString());
        }
    }

    private synchronized void b(Object obj, Object obj2) {
        b();
        List list = (List) this.h.get(obj);
        if (list == null) {
            list = new ArrayList();
            this.h.put(obj, list);
        }
        list.add(obj2);
    }

    private synchronized <T> T e(Class<T> cls) { //creates a new biw
        T t;
        synchronized (this) {
            ba.a((Object) cls);
            if (this.d == null) {
                throw new IllegalStateException("Binder not initialized yet.");
            }
            t = this.g.get(cls); //Map.get(Biw)'s related object?
            if (t == null) { //if no related object to Biw in Map
                boolean z = this.k; //grab boolean related to this jyn
                this.k = false; //temp set k to be false
                try {
                    int size = this.j.size(); //in related list of jyw-s (contexts)
                    for (int i = 0; i < size; i++) {
                        ((jyw) this.j.get(i)).a(this.d, cls, this); //call jyw's method a(jyn's related context, biw, this jyn)
                        t = this.g.get(cls);//try to grab Map's BIW related object
                        if (t != null) { //if I finally get an object exit!
                            break;
                        }
                    }
                    this.k = z;//reset k to orig value
                    t = this.g.get(cls); //get Map's BIW related object
                    if (t == null) { //if still null
                        this.g.put(cls, b);//use put operation to have BIW's related object be jyn's related Object
                    }
                } finally {
                    this.k = z; //set k back to orig value
                }
            } else if (t == b) { //if the Map's related Biw Object is jyn's related Object => null
                t = null;
            }
        }
        return t; // return Map's Biw related object
    }

    private synchronized <T> List<T> f(Class<T> cls) {
        List<T> list;
        synchronized (this) {
            ba.a((Object) cls);
            if (this.d == null) {
                throw new IllegalStateException("Binder not initialized yet.");
            }
            List<T> list2 = (List) this.h.get(cls);
            if (list2 == null) {
                ArrayList arrayList = new ArrayList();
                this.h.put(cls, arrayList);
                list = arrayList;
            } else {
                list = list2;
            }
            if (!this.i.contains(cls)) {
                this.i.add(cls);
                boolean z = this.k;
                this.k = false;
                try {
                    int size = this.j.size();
                    for (int i = 0; i < size; i++) {
                        ((jyw) this.j.get(i)).a(this.d, cls, this);
                    }
                } finally {
                    this.k = z;
                }
            }
        }
        return list;
    }

    //called by glq, and also gdi
    public static <T> T a(Context context, Class<T> cls) {
        return b(context).a((Class) cls);
    }

    public static <T> T b(Context context, Class<T> cls) {
        //calls b(context) and then calls b(Class) from the resulting jyn
        return b(context).b((Class) cls);
    }

    public static <T> List<T> c(Context context, Class<T> cls) {
        return b(context).c((Class) cls);
    }

    public static String a(Context context, String str, String str2) {
        return (String) b(context).a(str, null);
    }

    public static int a(Context context, String str, int i) {
        return ((Integer) b(context).a(str, Integer.valueOf(HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES))).intValue();
    }

    public static boolean a(Context context, String str, boolean z) {
        return ((Boolean) b(context).a(str, Boolean.valueOf(z))).booleanValue();
    }

    public static jyn a(Context context, dr drVar) {
        Object parentFragment;
        while (parentFragment != null) {
            jyn a = a(parentFragment);
            if (a != null) {
                return a;
            }
            parentFragment = parentFragment.getParentFragment();
        }
        return b(context);
    }

    //basically returns the jyn instance retrieved from context if context is a jyq
    //otherwise this is a very specifice context => change value of the jyn based on the context
    public static jyn b(Context context) {
        Context applicationContext = context.getApplicationContext();
        int i = 0;
        Context context2 = context;
        do {
            jyn a = a((Object) context2); //returns null if context is not a jyq
            if (a != null) {
                return a;//happy that I got a jyq.binder() (return)
            }
            i |= context2 == applicationContext ? 1 : 0;//set i to be 1 if context2 is the same as application context
            //otherwise i = 0
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
        return c(applicationContext);
    }

    public static jyn c(Context context) {
        return c.a(context.getApplicationContext());
    }

    public void a(String str) {
        this.f = str;
    }

    private static jyn a(Object obj) {
        if (!(obj instanceof jyq)) {
            //if obj is not a jyq => return nothing
            return null;
        }
        //get jyn by typecasing obj to be a jyq and grab Binder
        jyn binder = ((jyq) obj).getBinder();
        if (binder != null) {
            //return the binder retrieved
            return binder;
        }

        //otherwise, die (with bad state exception)
        String valueOf = String.valueOf(obj);
        throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 43).append("BinderContext must not return null Binder: ").append(valueOf).toString());
    }
}
