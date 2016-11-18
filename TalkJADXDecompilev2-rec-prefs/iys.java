package p000;

import java.io.File;
import java.io.FileInputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

public final class iys {
    static final Iterable<String> f19412a = Collections.unmodifiableList(Arrays.asList(new String[]{"boolean", "boolean[]", "boolean[][]", "byte", "byte[]", "byte[][]", "byte[][][]", "char", "char[]", "char[][]", "short", "short[]", "short[][]", "int", "int[]", "int[][]", "int[][][]", "long", "long[]", "long[][]", "float", "float[]", "float[][]", "double", "double[]", "double[][]", "java.lang.Class", "java.lang.Class[]", "java.lang.Class[][]", "java.lang.Byte", "java.lang.Byte[]", "java.lang.Character", "java.lang.Character[]", "java.lang.Boolean", "java.lang.Boolean[]", "java.lang.Short", "java.lang.Short[]", "java.lang.Integer", "java.lang.Integer[]", "java.lang.Long", "java.lang.Long[]", "java.lang.Float", "java.lang.Float[]", "java.lang.Double", "java.lang.Double[]", "java.lang.String", "java.lang.String[]", "java.lang.String[][]", "java.lang.String[][][]"}));
    static final Iterable<Integer> f19413b = Collections.unmodifiableList(Arrays.asList(new Integer[]{Integer.valueOf(139), Integer.valueOf(138), Integer.valueOf(137), Integer.valueOf(255), Integer.valueOf(144)}));
    private final File f19414c;

    public iys(File file) {
        this.f19414c = file;
    }

    public List<String> m23507a(String str) {
        iyz a = m23501a();
        iza a2 = new iyx(a, f19413b, f19412a, Collections.singleton(str)).m23535a();
        List<iyw> list = (List) a2.m23553c().get(str);
        Iterable arrayList = new ArrayList();
        if (list != null) {
            for (iyw a3 : list) {
                iyw a32 = (iyw) a2.m23551a().m23566a(a32.m23510a(a, "referent"));
                if (a32 != null) {
                    arrayList.add(a32);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return Collections.emptyList();
        }
        m23504a(a, a2);
        return m23503a(a, arrayList);
    }

    private iyz m23501a() {
        FileInputStream fileInputStream;
        Throwable th;
        FileChannel fileChannel = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(this.f19414c);
            try {
                FileChannel channel = fileInputStream2.getChannel();
                try {
                    iyz iyz = new iyz(channel.map(MapMode.READ_ONLY, 0, channel.size()));
                    if (channel != null) {
                        channel.close();
                    }
                    fileInputStream2.close();
                    return iyz;
                } catch (Throwable th2) {
                    fileInputStream = fileInputStream2;
                    FileChannel fileChannel2 = channel;
                    th = th2;
                    fileChannel = fileChannel2;
                    if (fileChannel != null) {
                        fileChannel.close();
                    }
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = fileInputStream2;
                if (fileChannel != null) {
                    fileChannel.close();
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = null;
            if (fileChannel != null) {
                fileChannel.close();
            }
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            throw th;
        }
    }

    private List<String> m23503a(iyz iyz, Iterable<iyw> iterable) {
        List<String> arrayList = new ArrayList();
        for (iyw iyw : iterable) {
            if (iyw.f19416c != null && (iyw instanceof iyv)) {
                arrayList.add(iys.m23502a(iyz, iyw));
            }
        }
        return arrayList;
    }

    private static String m23502a(iyz iyz, iyw iyw) {
        StringBuilder stringBuilder = new StringBuilder();
        while (true) {
            stringBuilder.append(iyw.mo3421b(iyz));
            int d = iyw.m23513d(iyz);
            iyw = iyw.f19416c;
            if (iyw == null) {
                return stringBuilder.toString();
            }
            stringBuilder.append('\n');
            d = iyw.m23514d(iyz, d);
            if (d >= 0) {
                stringBuilder.append(iyw.mo3422b(iyz, d)).append(' ');
            }
        }
    }

    private void m23504a(iyz iyz, iza iza) {
        Deque arrayDeque = new ArrayDeque();
        for (iyw iyw : iza.m23552b()) {
            if (!iys.m23506a(iyw)) {
                arrayDeque.addLast(iyw);
            }
        }
        m23505a(iyz, iza.m23551a(), arrayDeque);
    }

    private void m23505a(iyz iyz, izd<iyw> izd_iyw, Deque<iyw> deque) {
        while (!deque.isEmpty()) {
            iyw iyw = (iyw) deque.removeFirst();
            int a = iyw.mo3419a(iyz);
            for (int i = 0; i < a; i++) {
                iyw iyw2 = (iyw) izd_iyw.m23566a(iyw.mo3420a(iyz, i));
                if (iyw2 != null && iyw2.f19416c == null && (iyw2.f19417d & 1) == 0 && !iys.m23506a(iyw2)) {
                    iyw2.f19416c = iyw;
                    deque.addLast(iyw2);
                }
            }
        }
    }

    private static boolean m23506a(iyw iyw) {
        return (iyw instanceof iyv) && (((iyv) iyw).f19426a.d & 2) != 0;
    }
}
