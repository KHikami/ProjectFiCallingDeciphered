package p000;

import java.lang.reflect.Field;

public final class mng<T> {
    private final Field f27944a;

    public mng(Field field) {
        this.f27944a = field;
        field.setAccessible(true);
    }

    void m32567a(T t, Object obj) {
        try {
            this.f27944a.set(t, obj);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }

    void m32566a(T t, int i) {
        try {
            this.f27944a.set(t, Integer.valueOf(i));
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }
}
