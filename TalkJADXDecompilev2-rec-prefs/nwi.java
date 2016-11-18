package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class nwi<MessageType extends nwi<MessageType, BuilderType>, BuilderType extends nwk<MessageType, BuilderType>> extends nvh<MessageType, BuilderType> {
    public nxy f28717b = nxy.f28721a;
    public int f28718c = -1;

    public abstract Object m33433a(int i, Object obj, Object obj2);

    public final nxm<MessageType> mo3948c() {
        return (nxm) m33431a(nws.h);
    }

    public String toString() {
        return gwb.m1673a((nxi) this, super.toString());
    }

    public int hashCode() {
        if (this.a == 0) {
            nwt nwq = new nwq();
            mo3953a(nwq, this);
            this.a = nwq.a;
        }
        return this.a;
    }

    int m33430a(nwq nwq) {
        if (this.a == 0) {
            int i = nwq.a;
            nwq.a = 0;
            mo3953a((nwt) nwq, this);
            this.a = nwq.a;
            nwq.a = i;
        }
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((nwi) m33431a(nws.g)).getClass().isInstance(obj)) {
            return false;
        }
        try {
            mo3953a(nwl.a, (nwi) obj);
            return true;
        } catch (nwm e) {
            return false;
        }
    }

    boolean m33437a(nwl nwl, nxi nxi) {
        if (this == nxi) {
            return true;
        }
        if (!((nwi) m33431a(nws.g)).getClass().isInstance(nxi)) {
            return false;
        }
        mo3953a((nwt) nwl, (nwi) nxi);
        return true;
    }

    public void mo3954d() {
        m33431a(nws.d);
        this.f28717b.m33457a();
    }

    public final boolean mo3949e() {
        return m33432a(nws.a, Boolean.TRUE) != null;
    }

    public Object m33432a(int i, Object obj) {
        return m33433a(i, obj, null);
    }

    public Object m33431a(int i) {
        return m33433a(i, null, null);
    }

    void mo3953a(nwt nwt, MessageType messageType) {
        m33433a(nws.b, (Object) nwt, (Object) messageType);
        this.f28717b = nwt.a(this.f28717b, messageType.f28717b);
    }

    public static Object m33428a(Method method, Object obj, Object... objArr) {
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

    static <T extends nwi<T, ?>> T m33429a(T t, nvw nvw, nwd nwd) {
        nwi nwi = (nwi) t.m33431a(nws.e);
        try {
            nwi.m33433a(nws.c, (Object) nvw, (Object) nwd);
            nwi.mo3954d();
            return nwi;
        } catch (RuntimeException e) {
            if (e.getCause() instanceof nxc) {
                throw ((nxc) e.getCause());
            }
            throw e;
        }
    }

    public boolean m33436a(int i, nvw nvw) {
        if ((i & 7) == 4) {
            return false;
        }
        if (this.f28717b == nxy.f28721a) {
            this.f28717b = new nxy();
        }
        return this.f28717b.m33460a(i, nvw);
    }

    public void m33434a(int i, int i2) {
        if (this.f28717b == nxy.f28721a) {
            this.f28717b = new nxy();
        }
        this.f28717b.m33456a(i, i2);
    }

    public /* synthetic */ nxj mo3950f() {
        nwk nwk = (nwk) m33431a(nws.f);
        nwk.b(this);
        return nwk;
    }

    public /* synthetic */ nxj mo3951g() {
        return (nwk) m33431a(nws.f);
    }

    public /* synthetic */ nxi i_() {
        return (nwi) m33431a(nws.g);
    }
}
