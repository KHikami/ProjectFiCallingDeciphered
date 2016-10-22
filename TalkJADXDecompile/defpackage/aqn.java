package defpackage;

/* renamed from: aqn */
final class aqn implements Appendable {
    private final Appendable a;
    private boolean b;

    aqn(Appendable appendable) {
        this.b = true;
        this.a = appendable;
    }

    public Appendable append(char c) {
        boolean z = false;
        if (this.b) {
            this.b = false;
            this.a.append("  ");
        }
        if (c == '\n') {
            z = true;
        }
        this.b = z;
        this.a.append(c);
        return this;
    }

    public Appendable append(CharSequence charSequence) {
        CharSequence a = aqn.a(charSequence);
        return append(a, 0, a.length());
    }

    public Appendable append(CharSequence charSequence, int i, int i2) {
        boolean z = false;
        CharSequence a = aqn.a(charSequence);
        if (this.b) {
            this.b = false;
            this.a.append("  ");
        }
        if (a.length() > 0 && a.charAt(i2 - 1) == '\n') {
            z = true;
        }
        this.b = z;
        this.a.append(a, i, i2);
        return this;
    }

    private static CharSequence a(CharSequence charSequence) {
        if (charSequence == null) {
            return "";
        }
        return charSequence;
    }
}
