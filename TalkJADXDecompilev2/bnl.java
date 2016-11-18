package defpackage;

public final class bnl implements bnm {
    public String a;
    int b;

    public bnl(int i) {
        this.b = i;
    }

    public boolean a(int i, StringBuilder stringBuilder) {
        if (i != this.b) {
            return true;
        }
        this.a = stringBuilder.toString();
        return false;
    }
}
