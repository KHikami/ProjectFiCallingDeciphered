public interface kfd {
    public static final kfd a;
    public static final kfd b;

    long a();

    static {
        a = new kfe();
        b = new kff();
    }
}
