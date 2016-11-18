package p000;

public final class oih {
    private static final double[] f32973e = new double[128];
    public int f32974a = 0;
    private char f32975b;
    private CharSequence f32976c;
    private int f32977d;

    public oih(CharSequence charSequence, int i) {
        this.f32976c = charSequence;
        this.f32977d = charSequence.length();
        this.f32975b = charSequence.charAt(0);
    }

    private char m38473d() {
        if (this.f32974a < this.f32977d) {
            this.f32974a++;
        }
        if (this.f32974a == this.f32977d) {
            return '\u0000';
        }
        return this.f32976c.charAt(this.f32974a);
    }

    public void m38476a() {
        while (this.f32974a < this.f32977d && Character.isWhitespace(this.f32976c.charAt(this.f32974a))) {
            m38477b();
        }
    }

    private void m38474e() {
        while (this.f32974a < this.f32977d) {
            switch (this.f32976c.charAt(this.f32974a)) {
                case '\t':
                case '\n':
                case ' ':
                case ',':
                    m38477b();
                default:
                    return;
            }
        }
    }

    public void m38477b() {
        this.f32975b = m38473d();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private float m38475f() {
        int i = 1;
        int i2 = 0;
        int i3;
        switch (this.f32975b) {
            case '+':
                i3 = 1;
                break;
            case '-':
                i3 = 0;
                break;
            default:
                i3 = 1;
                break;
        }
        this.f32975b = m38473d();
        switch (this.f32975b) {
            case '.':
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                break;
            case '0':
                break;
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                break;
            default:
                return Float.NaN;
        }
    }

    private static void m38472a(char c) {
        throw new RuntimeException("Unexpected char '" + c + "'.");
    }

    static {
        for (int i = 0; i < f32973e.length; i++) {
            f32973e[i] = Math.pow(10.0d, (double) i);
        }
    }

    public float m38478c() {
        m38476a();
        float f = m38475f();
        m38474e();
        return f;
    }
}
