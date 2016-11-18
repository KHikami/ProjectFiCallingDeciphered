package p000;

public final class jap extends Exception {
    private jaq f19569a;
    private String f19570b;

    public jap(jaq jaq, String str) {
        super(str);
        this.f19570b = str;
        this.f19569a = jaq;
    }

    public jaq m23665a() {
        return this.f19569a;
    }

    public String toString() {
        String valueOf = String.valueOf(String.valueOf(this.f19569a));
        String valueOf2 = String.valueOf(String.valueOf(this.f19570b));
        return new StringBuilder((valueOf.length() + 14) + valueOf2.length()).append("Error type: ").append(valueOf).append(". ").append(valueOf2).toString();
    }
}
