final class jjo {
    public static final byte[] a;
    public static final byte[] b;

    static {
        a = "Exif\u0000\u0000".getBytes();
        b = "http://ns.adobe.com/xap/1.0/\u0000".getBytes();
    }

    public static final boolean a(short s) {
        return (s < (short) -64 || s > (short) -49 || s == (short) -60 || s == (short) -56 || s == (short) -52) ? false : true;
    }
}
