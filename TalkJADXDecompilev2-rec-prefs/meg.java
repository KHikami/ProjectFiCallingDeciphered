package p000;

final class meg extends mee {
    private final char f27575o;

    meg(char c) {
        this.f27575o = c;
    }

    public boolean mo3738b(char c) {
        return c == this.f27575o;
    }

    public String toString() {
        int i = this.f27575o;
        String str = "0123456789ABCDEF";
        char[] cArr = new char[]{'\\', 'u', '\u0000', '\u0000', '\u0000', '\u0000'};
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = str.charAt(i & 15);
            i = (char) (i >> 4);
        }
        String valueOf = String.valueOf(String.copyValueOf(cArr));
        return new StringBuilder(String.valueOf(valueOf).length() + 18).append("CharMatcher.is('").append(valueOf).append("')").toString();
    }
}
