import java.io.Closeable;
import java.io.Flushable;

/* compiled from: PG */
public interface dmg extends Closeable, Flushable {
    void a_(dlu dlu, long j);

    void close();

    void flush();
}
