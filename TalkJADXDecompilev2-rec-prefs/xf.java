package p000;

import android.view.InflateException;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import java.lang.reflect.Method;

final class xf implements OnMenuItemClickListener {
    private static final Class<?>[] f35643a = new Class[]{MenuItem.class};
    private Object f35644b;
    private Method f35645c;

    public xf(Object obj, String str) {
        this.f35644b = obj;
        Class cls = obj.getClass();
        try {
            this.f35645c = cls.getMethod(str, f35643a);
        } catch (Throwable e) {
            InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
            inflateException.initCause(e);
            throw inflateException;
        }
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        try {
            if (this.f35645c.getReturnType() == Boolean.TYPE) {
                return ((Boolean) this.f35645c.invoke(this.f35644b, new Object[]{menuItem})).booleanValue();
            }
            this.f35645c.invoke(this.f35644b, new Object[]{menuItem});
            return true;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
