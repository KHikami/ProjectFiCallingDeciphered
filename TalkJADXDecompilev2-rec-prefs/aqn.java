package p000;

final class aqn implements Appendable {
    private final Appendable f2148a;
    private boolean f2149b = true;

    aqn(Appendable appendable) {
        this.f2148a = appendable;
    }

    public Appendable append(char c) {
        boolean z = false;
        if (this.f2149b) {
            this.f2149b = false;
            this.f2148a.append("  ");
        }
        if (c == '\n') {
            z = true;
        }
        this.f2149b = z;
        this.f2148a.append(c);
        return this;
    }

    public Appendable append(CharSequence charSequence) {
        CharSequence a = aqn.m3750a(charSequence);
        return append(a, 0, a.length());
    }

    public Appendable append(CharSequence charSequence, int i, int i2) {
        boolean z = false;
        CharSequence a = aqn.m3750a(charSequence);
        if (this.f2149b) {
            this.f2149b = false;
            this.f2148a.append("  ");
        }
        if (a.length() > 0 && a.charAt(i2 - 1) == '\n') {
            z = true;
        }
        this.f2149b = z;
        this.f2148a.append(a, i, i2);
        return this;
    }

    private static CharSequence m3750a(CharSequence charSequence) {
        if (charSequence == null) {
            return "";
        }
        return charSequence;
    }
}
