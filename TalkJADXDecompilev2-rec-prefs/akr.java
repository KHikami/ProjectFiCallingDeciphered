package p000;

import java.util.Set;

class akr extends akp {
    private String f1146g;
    private boolean f1147h = false;

    public akr(int i) {
        super((byte) 0);
    }

    protected int mo253f() {
        return 1;
    }

    protected String mo254g() {
        return "3.0";
    }

    protected String mo242a() {
        if (this.f1146g == null) {
            return this.d.readLine();
        }
        String str = this.f1146g;
        this.f1146g = null;
        return str;
    }

    protected String mo248c() {
        String readLine;
        String str = null;
        StringBuilder stringBuilder = null;
        while (true) {
            readLine = this.d.readLine();
            if (readLine != null) {
                if (readLine.length() != 0) {
                    if (readLine.charAt(0) != ' ' && readLine.charAt(0) != '\t') {
                        if (stringBuilder != null || this.f1146g != null) {
                            break;
                        }
                        this.f1146g = readLine;
                    } else {
                        if (stringBuilder == null) {
                            stringBuilder = new StringBuilder();
                        }
                        if (this.f1146g != null) {
                            stringBuilder.append(this.f1146g);
                            this.f1146g = null;
                        }
                        stringBuilder.append(readLine.substring(1));
                    }
                }
            } else {
                break;
            }
        }
        if (stringBuilder != null) {
            str = stringBuilder.toString();
        } else if (this.f1146g != null) {
            str = this.f1146g;
        }
        this.f1146g = readLine;
        if (str != null) {
            return str;
        }
        throw new akz("Reached end of buffer.");
    }

    protected boolean mo245a(boolean z) {
        return super.mo245a(z);
    }

    protected void mo243a(aku aku, String str) {
        try {
            super.mo243a(aku, str);
        } catch (akz e) {
            String[] split = str.split("=", 2);
            if (split.length == 2) {
                mo244a(aku, split[0], split[1]);
                return;
            }
            String str2 = "Unknown params value: ";
            String valueOf = String.valueOf(str);
            throw new akz(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
    }

    protected void mo244a(aku aku, String str, String str2) {
        m2776b(aku, str, str2);
    }

    protected void mo247b(aku aku, String str) {
        mo250c(aku, str);
    }

    protected void mo250c(aku aku, String str) {
        m2776b(aku, "TYPE", str);
    }

    private void m2776b(aku aku, String str, String str2) {
        int length = str2.length();
        int i = 0;
        Object obj = null;
        StringBuilder stringBuilder = null;
        while (i < length) {
            Object obj2;
            StringBuilder stringBuilder2;
            Object obj3;
            char charAt = str2.charAt(i);
            if (charAt == '\"') {
                if (obj != null) {
                    aku.m2797a(str, mo252e(stringBuilder.toString()));
                    obj2 = null;
                    stringBuilder2 = null;
                } else {
                    if (stringBuilder != null && stringBuilder.length() <= 0) {
                        aku.m2797a(str, mo252e(stringBuilder.toString()));
                    }
                    stringBuilder2 = stringBuilder;
                    int i2 = 1;
                }
            } else if (charAt != ',' || obj != null) {
                if (stringBuilder == null) {
                    stringBuilder = new StringBuilder();
                }
                stringBuilder.append(charAt);
                obj3 = obj;
                stringBuilder2 = stringBuilder;
                obj2 = obj3;
            } else if (stringBuilder == null) {
                new StringBuilder(String.valueOf(str2).length() + 44).append("Comma is used before actual string comes. (").append(str2).append(")");
                obj3 = obj;
                stringBuilder2 = stringBuilder;
                obj2 = obj3;
            } else {
                aku.m2797a(str, mo252e(stringBuilder.toString()));
                obj2 = obj;
                stringBuilder2 = null;
            }
            i++;
            obj3 = obj2;
            stringBuilder = stringBuilder2;
            obj = obj3;
        }
        if (stringBuilder != null && stringBuilder.length() != 0) {
            aku.m2797a(str, mo252e(stringBuilder.toString()));
        }
    }

    protected String mo252e(String str) {
        return akw.m2818a(str, "ISO-8859-1", "UTF-8");
    }

    protected void mo246b(aku aku) {
        if (!this.f1147h) {
            this.f1147h = true;
        }
    }

    protected String mo249c(String str) {
        return str;
    }

    protected Set<String> mo255h() {
        return akt.f1153a;
    }

    protected String mo251d(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        int length = str.length();
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt != '\\' || i >= length - 1) {
                stringBuilder.append(charAt);
            } else {
                i++;
                charAt = str.charAt(i);
                if (charAt == 'n' || charAt == 'N') {
                    stringBuilder.append("\n");
                } else {
                    stringBuilder.append(charAt);
                }
            }
            i++;
        }
        return stringBuilder.toString();
    }
}
