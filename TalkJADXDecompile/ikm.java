import java.util.Comparator;

final class ikm implements Comparator<ikn> {
    final /* synthetic */ ikl a;

    ikm(ikl ikl) {
        this.a = ikl;
    }

    public /* synthetic */ int compare(Object obj, Object obj2) {
        return Long.valueOf(((ikn) obj).a).compareTo(Long.valueOf(((ikn) obj2).a));
    }
}
