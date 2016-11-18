package p000;

final class cqe implements cqc {
    cqe() {
    }

    public boolean mo1379a(cpw cpw) {
        return cpw.mo724d() != 1;
    }

    public String mo1380b(cpw cpw) {
        return mo1379a(cpw) ? "This message was not first received via fanout" : null;
    }
}
