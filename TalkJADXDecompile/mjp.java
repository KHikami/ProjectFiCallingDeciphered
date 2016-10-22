import java.io.Serializable;
import java.util.EnumMap;

final class mjp<K extends Enum<K>, V> implements Serializable {
    private static final long serialVersionUID = 0;
    final EnumMap<K, V> a;

    mjp(EnumMap<K, V> enumMap) {
        this.a = enumMap;
    }

    Object readResolve() {
        return new mjo(this.a);
    }
}
