import java.util.Map.Entry;

enum mlx extends mlv {
    mlx(String str, int i) {
        super(1, (byte) 0);
    }

    public /* synthetic */ Object a(Object obj) {
        return ((Entry) obj).getValue();
    }
}
