package p000;

public final class joq implements jmz {
    public void mo3579a(ed edVar, String str, boolean z) {
        if (!jop.m24859b(edVar)) {
            jop.m24858a(edVar, str, z);
        }
    }

    public void mo3578a(ed edVar) {
        jop.m24857a(edVar);
    }

    public void mo3580b(ed edVar) {
        mo3578a(edVar);
        new jor().mo2341a(edVar, "connection_error");
    }

    public void mo3581c(ed edVar) {
        mo3578a(edVar);
        new joo().mo2341a(edVar, "irrecoverable_error");
    }
}
