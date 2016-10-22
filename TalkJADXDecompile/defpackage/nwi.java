package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import nvw;
import nwd;
import nwk;
import nwl;
import nwm;
import nwq;
import nws;
import nwt;
import nxc;
import nxj;
import nxm;

/* renamed from: nwi */
public abstract class nwi<MessageType extends nwi<MessageType, BuilderType>, BuilderType extends nwk<MessageType, BuilderType>> extends nvh<MessageType, BuilderType> {
    public nxy b;
    public int c;

    public abstract Object a(int i, Object obj, Object obj2);

    public nwi() {
        this.b = nxy.a;
        this.c = -1;
    }

    public final nxm<MessageType> c() {
        return (nxm) a(nws.h);
    }

    public String toString() {
        return gwb.a((nxi) this, super.toString());
    }

    public int hashCode() {
        if (this.a == 0) {
            nwt nwq = new nwq();
            a(nwq, this);
            this.a = nwq.a;
        }
        return this.a;
    }

    int a(nwq nwq) {
        if (this.a == 0) {
            int i = nwq.a;
            nwq.a = 0;
            a((nwt) nwq, this);
            this.a = nwq.a;
            nwq.a = i;
        }
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((nwi) a(nws.g)).getClass().isInstance(obj)) {
            return false;
        }
        try {
            a(nwl.a, (nwi) obj);
            return true;
        } catch (nwm e) {
            return false;
        }
    }

    boolean a(nwl nwl, nxi nxi) {
        if (this == nxi) {
            return true;
        }
        if (!((nwi) a(nws.g)).getClass().isInstance(nxi)) {
            return false;
        }
        a((nwt) nwl, (nwi) nxi);
        return true;
    }

    public void d() {
        a(nws.d);
        this.b.a();
    }

    public final boolean e() {
        return a(nws.a, Boolean.TRUE) != null;
    }

    public Object a(int i, Object obj) {
        return a(i, obj, null);
    }

    public Object a(int i) {
        return a(i, null, null);
    }

    void a(nwt nwt, MessageType messageType) {
        a(nws.b, (Object) nwt, (Object) messageType);
        this.b = nwt.a(this.b, messageType.b);
    }

    public static Object a(Method method, Object obj, Object... objArr) {
        Throwable e;
        try {
            return method.invoke(obj, objArr);
        } catch (Throwable e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            e2 = e3.getCause();
            if (e2 instanceof RuntimeException) {
                throw ((RuntimeException) e2);
            } else if (e2 instanceof Error) {
                throw ((Error) e2);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", e2);
            }
        }
    }

    static <T extends nwi<T, ?>> T a(T t, nvw nvw, nwd nwd) {
        nwi nwi = (nwi) t.a(nws.e);
        try {
            nwi.a(nws.c, (Object) nvw, (Object) nwd);
            nwi.d();
            return nwi;
        } catch (RuntimeException e) {
            if (e.getCause() instanceof nxc) {
                throw ((nxc) e.getCause());
            }
            throw e;
        }
    }

    public boolean a(int i, nvw nvw) {
        if ((i & 7) == 4) {
            return false;
        }
        if (this.b == nxy.a) {
            this.b = new nxy();
        }
        return this.b.a(i, nvw);
    }

    public void a(int i, int i2) {
        if (this.b == nxy.a) {
            this.b = new nxy();
        }
        this.b.a(i, i2);
    }

    public /* synthetic */ nxj f() {
        nwk nwk = (nwk) a(nws.f);
        nwk.b(this);
        return nwk;
    }

    public /* synthetic */ nxj g() {
        return (nwk) a(nws.f);
    }

    public /* synthetic */ nxi i_() {
        return (nwi) a(nws.g);
    }
}
