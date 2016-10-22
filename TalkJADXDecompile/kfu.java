import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.WeakHashMap;

public final class kfu {
    private static final Map<Field, kfu> a;
    private final boolean b;
    private final Field c;
    private final String d;

    static {
        a = new WeakHashMap();
    }

    public static kfu a(Enum<?> enumR) {
        boolean z = true;
        try {
            kfu a = a(enumR.getClass().getField(enumR.name()));
            if (a == null) {
                z = false;
            }
            bc.a(z, "enum constant missing @Value or @NullValue annotation: %s", enumR);
            return a;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public static kfu a(Field field) {
        if (field == null) {
            return null;
        }
        synchronized (a) {
            kfu kfu = (kfu) a.get(field);
            boolean isEnumConstant = field.isEnumConstant();
            if (kfu == null && (isEnumConstant || !Modifier.isStatic(field.getModifiers()))) {
                String a;
                String name;
                if (isEnumConstant) {
                    kgq kgq = (kgq) field.getAnnotation(kgq.class);
                    if (kgq != null) {
                        a = kgq.a();
                    } else if (((kgg) field.getAnnotation(kgg.class)) != null) {
                        a = null;
                    } else {
                        return null;
                    }
                }
                kfz kfz = (kfz) field.getAnnotation(kfz.class);
                if (kfz == null) {
                    return null;
                }
                a = kfz.a();
                field.setAccessible(true);
                if ("##default".equals(a)) {
                    name = field.getName();
                } else {
                    name = a;
                }
                kfu = new kfu(field, name);
                a.put(field, kfu);
            }
            return kfu;
        }
    }

    private kfu(Field field, String str) {
        this.c = field;
        this.d = str == null ? null : str.intern();
        this.b = kfm.a(g());
    }

    public Field a() {
        return this.c;
    }

    public String b() {
        return this.d;
    }

    private Class<?> g() {
        return this.c.getType();
    }

    public Type c() {
        return this.c.getGenericType();
    }

    public boolean d() {
        return Modifier.isFinal(this.c.getModifiers());
    }

    public boolean e() {
        return this.b;
    }

    public Object a(Object obj) {
        return a(this.c, obj);
    }

    public void a(Object obj, Object obj2) {
        a(this.c, obj, obj2);
    }

    public <T extends Enum<T>> T f() {
        return Enum.valueOf(this.c.getDeclaringClass(), this.c.getName());
    }

    private static Object a(Field field, Object obj) {
        try {
            return field.get(obj);
        } catch (Throwable e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static void a(Field field, Object obj, Object obj2) {
        if (Modifier.isFinal(field.getModifiers())) {
            Object a = a(field, obj);
            if (obj2 == null) {
                if (a == null) {
                    return;
                }
            } else if (obj2.equals(a)) {
                return;
            }
            String valueOf = String.valueOf(a);
            String valueOf2 = String.valueOf(obj2);
            String valueOf3 = String.valueOf(field.getName());
            String valueOf4 = String.valueOf(obj.getClass().getName());
            throw new IllegalArgumentException(new StringBuilder((((String.valueOf(valueOf).length() + 48) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()).append("expected final value <").append(valueOf).append("> but was <").append(valueOf2).append("> on ").append(valueOf3).append(" field in ").append(valueOf4).toString());
        }
        try {
            field.set(obj, obj2);
        } catch (Throwable e) {
            throw new IllegalArgumentException(e);
        } catch (Throwable e2) {
            throw new IllegalArgumentException(e2);
        }
    }
}
