package p000;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

final class jam {
    private static final Logger f19559a = Logger.getLogger(jam.class.getName());
    private static final Map<Integer, jbg> f19560b = Collections.synchronizedMap(new HashMap());
    private static final Map<String, jbg> f19561c = Collections.synchronizedMap(new HashMap());
    private static final Set<Integer> f19562d = gwb.aA();
    private static final Set<String> f19563e = gwb.aC();

    private jam() {
    }

    private static nyt m23659a(ObjectInputStream objectInputStream, int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[i];
        while (true) {
            int read = objectInputStream.read(bArr, 0, i);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byteArrayOutputStream.flush();
                return nyt.a(byteArrayOutputStream.toByteArray());
            }
        }
    }

    static jbh m23658a(InputStream inputStream, int i) {
        Throwable e;
        ObjectInputStream objectInputStream;
        try {
            objectInputStream = new ObjectInputStream(inputStream);
            try {
                jbh jbh = new jbh();
                jbh.m23783b(jam.m23659a(objectInputStream, 16384));
                try {
                    objectInputStream.close();
                } catch (Throwable e2) {
                    f19559a.log(Level.WARNING, "error closing input stream (ignored)", e2);
                }
                return jbh;
            } catch (Throwable e3) {
                throw new RuntimeException("cannot load/parse metadata", e3);
            } catch (Throwable th) {
                e3 = th;
                if (objectInputStream == null) {
                    inputStream.close();
                } else {
                    try {
                        objectInputStream.close();
                    } catch (Throwable e22) {
                        f19559a.log(Level.WARNING, "error closing input stream (ignored)", e22);
                    }
                }
                throw e3;
            }
        } catch (Throwable e32) {
            throw new RuntimeException("cannot load/parse metadata", e32);
        } catch (Throwable th2) {
            e32 = th2;
            objectInputStream = null;
            if (objectInputStream == null) {
                objectInputStream.close();
            } else {
                inputStream.close();
            }
            throw e32;
        }
    }

    static jbg m23657a(String str) {
        if (!f19563e.contains(str)) {
            return null;
        }
        synchronized (f19561c) {
            if (!f19561c.containsKey(str)) {
                String valueOf = String.valueOf("/com/google/android/libraries/phonenumbers/data/ShortNumberMetadataProto_");
                String valueOf2 = String.valueOf(str);
                valueOf2 = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                InputStream resourceAsStream = jam.class.getResourceAsStream(valueOf2);
                if (resourceAsStream == null) {
                    String str2 = "missing metadata: ";
                    valueOf2 = String.valueOf(valueOf2);
                    if (valueOf2.length() != 0) {
                        valueOf2 = str2.concat(valueOf2);
                    } else {
                        valueOf2 = new String(str2);
                    }
                    throw new IllegalStateException(valueOf2);
                }
                for (Object put : jam.m23658a(resourceAsStream, 16384).f19716a) {
                    f19561c.put(str, put);
                }
            }
        }
        return (jbg) f19561c.get(str);
    }
}
