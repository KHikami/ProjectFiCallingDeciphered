/* compiled from: PG */
final class dch extends Throwable {
    dch(String str) {
        super(str);
    }

    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}
