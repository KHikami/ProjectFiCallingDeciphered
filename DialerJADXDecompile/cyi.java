import java.io.IOException;
import java.util.Iterator;

/* compiled from: PG */
public class cyi {
    final String a;

    public static cyi a(char c) {
        return new cyi(",");
    }

    public cyi(String str) {
        this.a = (String) cob.i((Object) str);
    }

    cyi(cyi cyi) {
        this.a = cyi.a;
    }

    public cyi a(String str) {
        cob.i((Object) str);
        return new cyj(this, this, str);
    }

    CharSequence a(Object obj) {
        cob.i(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public final StringBuilder a(StringBuilder stringBuilder, Iterator it) {
        try {
            cob.i((Object) stringBuilder);
            if (it.hasNext()) {
                stringBuilder.append(a(it.next()));
                while (it.hasNext()) {
                    stringBuilder.append(this.a);
                    stringBuilder.append(a(it.next()));
                }
            }
            return stringBuilder;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
