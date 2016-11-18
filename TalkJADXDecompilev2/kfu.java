package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.WeakHashMap;

public final class kfu {
    private static final Map<Field, kfu> a = new WeakHashMap();
    private final boolean b;
    private final Field c;
    private final String d;

    public static kfu a(Enum<?> enumR) {
        boolean z = true;
        try {
            kfu a = kfu.a(enumR.getClass().getField(enumR.name()));
            if (a == null) {
                z = false;
            }
            bc.a(z, "enum constant missing @Value or @NullValue annotation: %s", enumR);
            return a;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.kfu a(java.lang.reflect.Field r5) {
        /*
        r1 = 0;
        if (r5 != 0) goto L_0x0005;
    L_0x0003:
        r0 = r1;
    L_0x0004:
        return r0;
    L_0x0005:
        r2 = a;
        monitor-enter(r2);
        r0 = a;	 Catch:{ all -> 0x004b }
        r0 = r0.get(r5);	 Catch:{ all -> 0x004b }
        r0 = (defpackage.kfu) r0;	 Catch:{ all -> 0x004b }
        r3 = r5.isEnumConstant();	 Catch:{ all -> 0x004b }
        if (r0 != 0) goto L_0x0049;
    L_0x0016:
        if (r3 != 0) goto L_0x0022;
    L_0x0018:
        r4 = r5.getModifiers();	 Catch:{ all -> 0x004b }
        r4 = java.lang.reflect.Modifier.isStatic(r4);	 Catch:{ all -> 0x004b }
        if (r4 != 0) goto L_0x0049;
    L_0x0022:
        if (r3 == 0) goto L_0x005d;
    L_0x0024:
        r0 = defpackage.kgq.class;
        r0 = r5.getAnnotation(r0);	 Catch:{ all -> 0x004b }
        r0 = (defpackage.kgq) r0;	 Catch:{ all -> 0x004b }
        if (r0 == 0) goto L_0x004e;
    L_0x002e:
        r0 = r0.a();	 Catch:{ all -> 0x004b }
    L_0x0032:
        r1 = "##default";
        r1 = r1.equals(r0);	 Catch:{ all -> 0x004b }
        if (r1 == 0) goto L_0x0073;
    L_0x003a:
        r0 = r5.getName();	 Catch:{ all -> 0x004b }
        r1 = r0;
    L_0x003f:
        r0 = new kfu;	 Catch:{ all -> 0x004b }
        r0.<init>(r5, r1);	 Catch:{ all -> 0x004b }
        r1 = a;	 Catch:{ all -> 0x004b }
        r1.put(r5, r0);	 Catch:{ all -> 0x004b }
    L_0x0049:
        monitor-exit(r2);	 Catch:{ all -> 0x004b }
        goto L_0x0004;
    L_0x004b:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x004b }
        throw r0;
    L_0x004e:
        r0 = defpackage.kgg.class;
        r0 = r5.getAnnotation(r0);	 Catch:{ all -> 0x004b }
        r0 = (defpackage.kgg) r0;	 Catch:{ all -> 0x004b }
        if (r0 == 0) goto L_0x005a;
    L_0x0058:
        r0 = r1;
        goto L_0x0032;
    L_0x005a:
        monitor-exit(r2);	 Catch:{ all -> 0x004b }
        r0 = r1;
        goto L_0x0004;
    L_0x005d:
        r0 = defpackage.kfz.class;
        r0 = r5.getAnnotation(r0);	 Catch:{ all -> 0x004b }
        r0 = (defpackage.kfz) r0;	 Catch:{ all -> 0x004b }
        if (r0 != 0) goto L_0x006a;
    L_0x0067:
        monitor-exit(r2);	 Catch:{ all -> 0x004b }
        r0 = r1;
        goto L_0x0004;
    L_0x006a:
        r0 = r0.a();	 Catch:{ all -> 0x004b }
        r1 = 1;
        r5.setAccessible(r1);	 Catch:{ all -> 0x004b }
        goto L_0x0032;
    L_0x0073:
        r1 = r0;
        goto L_0x003f;
        */
        throw new UnsupportedOperationException("Method not decompiled: kfu.a(java.lang.reflect.Field):kfu");
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
        return kfu.a(this.c, obj);
    }

    public void a(Object obj, Object obj2) {
        kfu.a(this.c, obj, obj2);
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
            Object a = kfu.a(field, obj);
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
