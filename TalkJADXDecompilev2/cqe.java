package defpackage;

final class cqe implements cqc {
    cqe() {
    }

    public boolean a(cpw cpw) {
        return cpw.d() != 1;
    }

    public String b(cpw cpw) {
        return a(cpw) ? "This message was not first received via fanout" : null;
    }
}
