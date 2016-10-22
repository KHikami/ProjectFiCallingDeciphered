import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

public final class gsz implements Comparator<Scope> {
    public /* synthetic */ int compare(Object obj, Object obj2) {
        return ((Scope) obj).a().compareTo(((Scope) obj2).a());
    }
}
