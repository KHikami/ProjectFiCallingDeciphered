final class bni extends bnf {
    private bbm a;

    public bni(bbm bbm) {
        super(bnc.GROUP_CONVERSATIONS);
        this.a = bbm;
    }

    public boolean a(int i) {
        return this.a.g(i);
    }
}
