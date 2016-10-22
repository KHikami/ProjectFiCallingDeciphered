import java.util.Map;

public interface atv {
    @Deprecated
    public static final atv a;
    public static final atv b;

    Map<String, String> a();

    static {
        a = new atw();
        b = new atz().a();
    }
}
