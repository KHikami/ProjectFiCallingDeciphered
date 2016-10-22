import java.util.Collection;
import java.util.Map;

/* compiled from: PG */
public abstract class czm extends czy implements Map {
    public abstract czm a();

    public static czm a(Object obj, Object obj2) {
        return new dbj(obj, obj2);
    }

    czm() {
    }

    Object writeReplace() {
        return new czo(this);
    }

    public final /* synthetic */ czp b() {
        return a().e();
    }

    public /* synthetic */ Collection values() {
        return a().e();
    }
}
