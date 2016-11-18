package p000;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.WeakHashMap;

public final class kfu {
    private static final Map<Field, kfu> f21615a = new WeakHashMap();
    private final boolean f21616b;
    private final Field f21617c;
    private final String f21618d;

    public static kfu m25747a(Enum<?> enumR) {
        boolean z = true;
        try {
            kfu a = kfu.m25748a(enumR.getClass().getField(enumR.name()));
            if (a == null) {
                z = false;
            }
            bc.m4816a(z, "enum constant missing @Value or @NullValue annotation: %s", enumR);
            return a;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static kfu m25748a(Field field) {
        if (field == null) {
            return null;
        }
        synchronized (f21615a) {
            kfu kfu = (kfu) f21615a.get(field);
            boolean isEnumConstant = field.isEnumConstant();
            if (kfu == null && (isEnumConstant || !Modifier.isStatic(field.getModifiers()))) {
                String a;
                String name;
                if (isEnumConstant) {
                    kgq kgq = (kgq) field.getAnnotation(kgq.class);
                    if (kgq != null) {
                        a = kgq.m25773a();
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
                a = kfz.m25760a();
                field.setAccessible(true);
                if ("##default".equals(a)) {
                    name = field.getName();
                } else {
                    name = a;
                }
                kfu = new kfu(field, name);
                f21615a.put(field, kfu);
            }
        }
    }

    private kfu(Field field, String str) {
        this.f21617c = field;
        this.f21618d = str == null ? null : str.intern();
        this.f21616b = kfm.m25723a(m25750g());
    }

    public Field m25752a() {
        return this.f21617c;
    }

    public String m25754b() {
        return this.f21618d;
    }

    private Class<?> m25750g() {
        return this.f21617c.getType();
    }

    public Type m25755c() {
        return this.f21617c.getGenericType();
    }

    public boolean m25756d() {
        return Modifier.isFinal(this.f21617c.getModifiers());
    }

    public boolean m25757e() {
        return this.f21616b;
    }

    public Object m25751a(Object obj) {
        return kfu.m25746a(this.f21617c, obj);
    }

    public void m25753a(Object obj, Object obj2) {
        kfu.m25749a(this.f21617c, obj, obj2);
    }

    public <T extends Enum<T>> T m25758f() {
        return Enum.valueOf(this.f21617c.getDeclaringClass(), this.f21617c.getName());
    }

    private static Object m25746a(Field field, Object obj) {
        try {
            return field.get(obj);
        } catch (Throwable e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static void m25749a(Field field, Object obj, Object obj2) {
        if (Modifier.isFinal(field.getModifiers())) {
            Object a = kfu.m25746a(field, obj);
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
