import java.io.IOException;
import java.util.Iterator;
import java.util.Map.Entry;

/* compiled from: PG */
public final class cyk {
    private final cyi a;
    private final String b;

    public cyk(cyi cyi, String str) {
        this.a = cyi;
        this.b = (String) cob.i((Object) str);
    }

    public final StringBuilder a(StringBuilder stringBuilder, Iterator it) {
        try {
            cob.i((Object) stringBuilder);
            if (it.hasNext()) {
                Entry entry = (Entry) it.next();
                stringBuilder.append(this.a.a(entry.getKey()));
                stringBuilder.append(this.b);
                stringBuilder.append(this.a.a(entry.getValue()));
                while (it.hasNext()) {
                    stringBuilder.append(this.a.a);
                    entry = (Entry) it.next();
                    stringBuilder.append(this.a.a(entry.getKey()));
                    stringBuilder.append(this.b);
                    stringBuilder.append(this.a.a(entry.getValue()));
                }
            }
            return stringBuilder;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
