package defpackage;

final class dcf extends iiq<Void, Void, Void> {
    final /* synthetic */ dcd a;

    dcf(dcd dcd) {
        this.a = dcd;
    }

    protected /* bridge */ /* synthetic */ Object a(Object[] objArr) {
        return a();
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        b();
    }

    private Void a() {
        int i = 0;
        String string = this.a.a.getSharedPreferences("recentEmoji", 0).getString("recentEmojiKey", null);
        this.a.b.clear();
        if (string != null) {
            String[] split = string.split(",");
            int length = split.length;
            while (i < length) {
                String str = split[i];
                if (!"16".equals(str)) {
                    this.a.b.add(Integer.valueOf(Integer.parseInt(str, dcd.c)));
                }
                i++;
            }
        }
        return null;
    }

    private void b() {
        if (this.a.e != null) {
            this.a.e.x_();
        }
    }
}
