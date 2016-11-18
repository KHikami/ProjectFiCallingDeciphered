package p000;

public final class bnl implements bnm {
    public String f4042a;
    int f4043b;

    public bnl(int i) {
        this.f4043b = i;
    }

    public boolean mo617a(int i, StringBuilder stringBuilder) {
        if (i != this.f4043b) {
            return true;
        }
        this.f4042a = stringBuilder.toString();
        return false;
    }
}
