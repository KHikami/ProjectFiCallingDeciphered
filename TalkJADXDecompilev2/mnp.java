package defpackage;

enum mnp extends mnm {
    mnp(String str, int i) {
        super(str, 2);
    }

    public int a(int i) {
        return i ^ -1;
    }
}
