package p000;

final class jif extends ThreadLocal<String[]> {
    jif() {
    }

    protected /* synthetic */ Object initialValue() {
        return new String[3];
    }
}
