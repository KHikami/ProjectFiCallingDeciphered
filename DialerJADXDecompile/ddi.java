/* compiled from: PG */
public final class ddi extends Exception {
    ddj a;
    private String b;

    public ddi(ddj ddj, String str) {
        super(str);
        this.b = str;
        this.a = ddj;
    }

    public final String toString() {
        String valueOf = String.valueOf(String.valueOf(this.a));
        String valueOf2 = String.valueOf(String.valueOf(this.b));
        return new StringBuilder((valueOf.length() + 14) + valueOf2.length()).append("Error type: ").append(valueOf).append(". ").append(valueOf2).toString();
    }
}
