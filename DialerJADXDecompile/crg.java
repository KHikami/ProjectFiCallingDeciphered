public class crg {
    public bri a(brc brc, String str, int i, String[] strArr, byte[] bArr) {
        return brc.a(new cno(this, brc, str, i, strArr, null));
    }

    public bri a(brc brc, String str, String str2) {
        return brc.a(new cns(this, brc, str, str2));
    }

    public bri a(brc brc, String str) {
        return brc.a(new cnu(this, brc, str));
    }

    public bri a(brc brc, String str, String str2, int i) {
        return brc.a(new cnq(this, brc, str, str2, i));
    }
}
