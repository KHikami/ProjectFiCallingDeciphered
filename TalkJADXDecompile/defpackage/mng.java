package defpackage;

import java.lang.reflect.Field;

/* renamed from: mng */
public final class mng<T> {
    private final Field a;

    public mng(Field field) {
        this.a = field;
        field.setAccessible(true);
    }

    void a(T t, Object obj) {
        try {
            this.a.set(t, obj);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }

    void a(T t, int i) {
        try {
            this.a.set(t, Integer.valueOf(i));
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }
}
