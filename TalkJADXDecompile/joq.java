public final class joq implements jmz {
    public void a(ed edVar, String str, boolean z) {
        if (!jop.b(edVar)) {
            jop.a(edVar, str, z);
        }
    }

    public void a(ed edVar) {
        jop.a(edVar);
    }

    public void b(ed edVar) {
        a(edVar);
        new jor().a(edVar, "connection_error");
    }

    public void c(ed edVar) {
        a(edVar);
        new joo().a(edVar, "irrecoverable_error");
    }
}
