package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

final class olw implements olc<String> {
    olw() {
    }

    public /* synthetic */ Object a(String str) {
        return olw.b(str);
    }

    public /* synthetic */ String a(Object obj) {
        String str = (String) obj;
        StringBuilder stringBuilder = new StringBuilder(str.length());
        for (byte b : str.getBytes(Charset.forName("UTF-8"))) {
            if ((b < (byte) 32 || b >= (byte) 37) && (b <= (byte) 37 || b >= (byte) 126)) {
                stringBuilder.append(String.format("%%%02X", new Object[]{Byte.valueOf(b)}));
            } else {
                stringBuilder.append((char) b);
            }
        }
        return stringBuilder.toString();
    }

    private static String b(String str) {
        Charset forName = Charset.forName("US-ASCII");
        byte[] bytes = str.getBytes(forName);
        ByteBuffer allocate = ByteBuffer.allocate(bytes.length);
        int i = 0;
        while (i < bytes.length) {
            if (bytes[i] == (byte) 37 && i + 2 < bytes.length) {
                try {
                    allocate.put((byte) Integer.parseInt(new String(bytes, i + 1, 2, forName), 16));
                    i += 3;
                } catch (NumberFormatException e) {
                }
            }
            allocate.put(bytes[i]);
            i++;
        }
        return new String(allocate.array(), 0, allocate.position(), Charset.forName("UTF-8"));
    }
}