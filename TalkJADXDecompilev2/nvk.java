package defpackage;

public class nvk<MessageType extends nxi> implements nxm<MessageType> {
    private static final nwd b = nwd.a();
    T a;

    public /* synthetic */ Object c(nvn nvn, nwd nwd) {
        return b(nvn, nwd);
    }

    public MessageType a(nvn nvn, nwd nwd) {
        nxi nxi;
        try {
            nvw c = nvn.c();
            nxi = (nxi) b(c, nwd);
            c.a(0);
            return nxi;
        } catch (nxc e) {
            throw e.a(nxi);
        } catch (nxc e2) {
            throw e2;
        }
    }

    public MessageType b(nvn nvn, nwd nwd) {
        MessageType a = a(nvn, nwd);
        if (a == null || a.e()) {
            return a;
        }
        nxx b;
        if (a instanceof nvh) {
            b = ((nvh) a).b();
        } else if (a instanceof nvj) {
            b = ((nvj) a).X_();
        } else {
            b = new nxx();
        }
        throw b.a().a(a);
    }

    public nvk(T t) {
        this();
        this.a = t;
    }

    public T a(nvw nvw, nwd nwd) {
        return nwi.a(this.a, nvw, nwd);
    }

    public /* synthetic */ Object b(nvw nvw, nwd nwd) {
        return a(nvw, nwd);
    }
}
