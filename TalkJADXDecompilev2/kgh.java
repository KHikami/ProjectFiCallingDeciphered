package defpackage;

import java.io.InputStream;
import java.lang.reflect.Type;
import java.nio.charset.Charset;

public interface kgh {
    <T> T parseAndClose(InputStream inputStream, Charset charset, Class<T> cls);

    Object parseAndClose(InputStream inputStream, Charset charset, Type type);
}
