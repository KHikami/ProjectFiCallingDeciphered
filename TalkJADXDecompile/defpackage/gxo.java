package defpackage;

/* renamed from: gxo */
public final class gxo {
    public static hgt<Integer> a;
    public static hgt<Integer> b;

    static {
        a = hgt.a("gms:common:stats:max_num_of_events", Integer.valueOf(100));
        b = hgt.a("gms:common:stats:max_chunk_size", Integer.valueOf(100));
    }
}
