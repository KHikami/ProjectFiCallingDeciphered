import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.logging.Logger;

/* compiled from: PG */
class ddf {
    static {
        Logger.getLogger(ddf.class.getName());
        Collections.synchronizedMap(new HashMap());
        Collections.synchronizedMap(new HashMap());
        buf.J();
        buf.L();
    }

    private ddf() {
    }

    static dee a(ObjectInputStream objectInputStream, int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        while (true) {
            int read = objectInputStream.read(bArr, 0, 16384);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byteArrayOutputStream.flush();
                return dee.a(byteArrayOutputStream.toByteArray());
            }
        }
    }
}
