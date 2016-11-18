package p000;

public class nvk<MessageType extends nxi> implements nxm<MessageType> {
    private static final nwd f31130b = nwd.m36919a();
    T f31131a;

    public /* synthetic */ Object mo3979c(nvn nvn, nwd nwd) {
        return m36729b(nvn, nwd);
    }

    public MessageType m36727a(nvn nvn, nwd nwd) {
        nxi nxi;
        try {
            nvw c = nvn.c();
            nxi = (nxi) mo3978b(c, nwd);
            c.mo3990a(0);
            return nxi;
        } catch (nxc e) {
            throw e.m37022a(nxi);
        } catch (nxc e2) {
            throw e2;
        }
    }

    public MessageType m36729b(nvn nvn, nwd nwd) {
        MessageType a = m36727a(nvn, nwd);
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
        throw b.m37051a().m37022a(a);
    }

    public nvk(T t) {
        this();
        this.f31131a = t;
    }

    public T m36726a(nvw nvw, nwd nwd) {
        return nwi.a(this.f31131a, nvw, nwd);
    }

    public /* synthetic */ Object mo3978b(nvw nvw, nwd nwd) {
        return m36726a(nvw, nwd);
    }
}
