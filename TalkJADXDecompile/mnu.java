import java.util.Comparator;
import java.util.List;

enum mnu extends mnq {
    mnu(String str, int i) {
        super(3, (byte) 0);
    }

    public <E> int a(Comparator<? super E> comparator, E e, List<? extends E> list, int i) {
        return b.a(comparator, e, list, i) + 1;
    }
}
