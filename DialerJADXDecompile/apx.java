/* compiled from: PG */
final class apx implements aux {
    private /* synthetic */ adr a;
    private /* synthetic */ apw b;

    apx(apw apw, adr adr) {
        this.b = apw;
        this.a = adr;
    }

    public final void a(Integer num) {
        if (num != null && num.intValue() != -1) {
            apw apw = this.b;
            adr adr = this.a;
            adr.setTag(aq.g, num);
            int color = apw.C.getColor(cob.X);
            adr.d().setTextColor(color);
            adr.c().setTextColor(color);
        }
    }
}
