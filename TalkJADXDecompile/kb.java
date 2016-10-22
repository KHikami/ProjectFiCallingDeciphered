public final class kb extends RuntimeException {
    public kb() {
        this(null);
    }

    private kb(String str) {
        super("The operation has been canceled.");
    }
}
