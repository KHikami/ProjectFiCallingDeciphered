package p000;

final class hvy extends ThreadLocal<StringBuilder> {
    hvy() {
    }

    protected /* synthetic */ Object initialValue() {
        return new StringBuilder();
    }
}
