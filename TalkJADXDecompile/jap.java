public final class jap extends Exception {
    private jaq a;
    private String b;

    public jap(jaq jaq, String str) {
        super(str);
        this.b = str;
        this.a = jaq;
    }

    public jaq a() {
        return this.a;
    }

    public String toString() {
        String valueOf = String.valueOf(String.valueOf(this.a));
        String valueOf2 = String.valueOf(String.valueOf(this.b));
        return new StringBuilder((valueOf.length() + 14) + valueOf2.length()).append("Error type: ").append(valueOf).append(". ").append(valueOf2).toString();
    }
}
