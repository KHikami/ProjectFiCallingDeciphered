package com.google.android.apps.hangouts.phone;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;
import bc;
import bko;
import edo;
import fde;
import glk;
import gwb;
import iih;
import java.util.List;
import jcb;
import jcc;
import jmb;
import jmd;
import jmj;
import jmu;
import jna;
import jnb;
import jzp;

public class ConversationUrlHandlerActivity extends jzp implements jcc {
    private String n;
    private String o;
    private String r;
    private boolean s;
    private boolean t;
    private String u;
    private String v;
    private int w;
    private jmj x;

    public ConversationUrlHandlerActivity() {
        this.x = new jmj(this, this.q).a("active-hangouts-account").a(this.p).b((jcc) this);
    }

    protected void onCreate(Bundle bundle) {
        String valueOf;
        boolean z;
        int[] c;
        jmb b;
        bko bko = null;
        super.onCreate(bundle);
        this.t = false;
        Uri data = getIntent().getData();
        if (data == null) {
            glk.d("Babel", "Invalid uri for conversation Url", new Object[0]);
        } else {
            int i;
            String valueOf2;
            List pathSegments;
            String host;
            String queryParameter = data.getQueryParameter("path");
            if (data != null) {
                List pathSegments2 = data.getPathSegments();
                if (data.getHost().equalsIgnoreCase("plus.google.com") && pathSegments2.size() == 3 && ((String) pathSegments2.get(0)).equalsIgnoreCase("hangouts") && ((String) pathSegments2.get(1)).equalsIgnoreCase("app") && ((String) pathSegments2.get(2)).equalsIgnoreCase("emlink")) {
                    i = 1;
                    if (!(i == 0 || queryParameter.isEmpty())) {
                        valueOf2 = String.valueOf("https://plus.google.com");
                        valueOf = String.valueOf(queryParameter);
                        if (valueOf.length() == 0) {
                            valueOf = valueOf2.concat(valueOf);
                        } else {
                            valueOf = new String(valueOf2);
                        }
                        data = Uri.parse(valueOf);
                    }
                    if (data != null) {
                        pathSegments = data.getPathSegments();
                        host = data.getHost();
                        if (!host.equalsIgnoreCase("plus.google.com") && pathSegments.size() == 3 && ((String) pathSegments.get(0)).equalsIgnoreCase("hangouts") && ((String) pathSegments.get(1)).equalsIgnoreCase("app") && ((String) pathSegments.get(2)).equalsIgnoreCase("conversation")) {
                            i = 1;
                            if (i != 0) {
                                a(data);
                                pathSegments = data.getPathSegments();
                                this.o = (String) pathSegments.get(1);
                                this.r = (String) pathSegments.get(2);
                                this.u = data.toString();
                                z = true;
                                if (z) {
                                    if (TextUtils.isEmpty(this.n)) {
                                        c = fde.c(false);
                                        if (c.length == 0) {
                                            startActivity(gwb.g(null));
                                            finish();
                                            valueOf = null;
                                        } else if (c.length == 1) {
                                            valueOf = fde.e(c[0]).a();
                                        } else {
                                            valueOf = null;
                                        }
                                    } else {
                                        if ("_sms_only_account".equals(this.n)) {
                                            z = fde.i();
                                            glk.a("Babel", "URL for SMS only account. Validity: " + z, new Object[0]);
                                        } else {
                                            z = true;
                                        }
                                        if (z) {
                                            bko = fde.a(edo.a(this.n));
                                        }
                                        if (bko == null) {
                                            a(bc.ap, 2849);
                                            return;
                                        }
                                        valueOf = bko.a();
                                    }
                                    if (this.t) {
                                        b = new jmd().b("sms_only");
                                    } else {
                                        b = new jmd();
                                    }
                                    this.x.a(new jmu().b().a(valueOf).a(jna.class, new jnb().a(b).a()));
                                }
                                a(bc.aq, 2848);
                                return;
                            }
                        } else if (!host.equalsIgnoreCase("hangouts.google.com") && pathSegments.size() == 1 && ((String) pathSegments.get(0)).equalsIgnoreCase("chat")) {
                            i = 1;
                            if (i != 0) {
                                a(data);
                                pathSegments = data.getPathSegments();
                                this.o = (String) pathSegments.get(1);
                                this.r = (String) pathSegments.get(2);
                                this.u = data.toString();
                                z = true;
                                if (z) {
                                    if (TextUtils.isEmpty(this.n)) {
                                        c = fde.c(false);
                                        if (c.length == 0) {
                                            startActivity(gwb.g(null));
                                            finish();
                                            valueOf = null;
                                        } else if (c.length == 1) {
                                            valueOf = null;
                                        } else {
                                            valueOf = fde.e(c[0]).a();
                                        }
                                    } else {
                                        if ("_sms_only_account".equals(this.n)) {
                                            z = true;
                                        } else {
                                            z = fde.i();
                                            glk.a("Babel", "URL for SMS only account. Validity: " + z, new Object[0]);
                                        }
                                        if (z) {
                                            bko = fde.a(edo.a(this.n));
                                        }
                                        if (bko == null) {
                                            valueOf = bko.a();
                                        } else {
                                            a(bc.ap, 2849);
                                            return;
                                        }
                                    }
                                    if (this.t) {
                                        b = new jmd();
                                    } else {
                                        b = new jmd().b("sms_only");
                                    }
                                    this.x.a(new jmu().b().a(valueOf).a(jna.class, new jnb().a(b).a()));
                                }
                                a(bc.aq, 2848);
                                return;
                            }
                        } else if (!host.equalsIgnoreCase("hangouts.google.com") && pathSegments.size() == 2 && ((String) pathSegments.get(0)).equalsIgnoreCase("chat")) {
                            i = 1;
                            if (i != 0) {
                                a(data);
                                pathSegments = data.getPathSegments();
                                this.o = (String) pathSegments.get(1);
                                this.r = (String) pathSegments.get(2);
                                this.u = data.toString();
                                z = true;
                                if (z) {
                                    a(bc.aq, 2848);
                                    return;
                                }
                                if (TextUtils.isEmpty(this.n)) {
                                    if ("_sms_only_account".equals(this.n)) {
                                        z = fde.i();
                                        glk.a("Babel", "URL for SMS only account. Validity: " + z, new Object[0]);
                                    } else {
                                        z = true;
                                    }
                                    if (z) {
                                        bko = fde.a(edo.a(this.n));
                                    }
                                    if (bko == null) {
                                        a(bc.ap, 2849);
                                        return;
                                    }
                                    valueOf = bko.a();
                                } else {
                                    c = fde.c(false);
                                    if (c.length == 0) {
                                        startActivity(gwb.g(null));
                                        finish();
                                        valueOf = null;
                                    } else if (c.length == 1) {
                                        valueOf = fde.e(c[0]).a();
                                    } else {
                                        valueOf = null;
                                    }
                                }
                                if (this.t) {
                                    b = new jmd().b("sms_only");
                                } else {
                                    b = new jmd();
                                }
                                this.x.a(new jmu().b().a(valueOf).a(jna.class, new jnb().a(b).a()));
                            }
                        } else if (!host.equalsIgnoreCase("hangouts.google.com") && pathSegments.size() == 3 && ((String) pathSegments.get(0)).equalsIgnoreCase("chat") && ((String) pathSegments.get(1)).equalsIgnoreCase("person")) {
                            i = 1;
                            if (i != 0) {
                                a(data);
                                pathSegments = data.getPathSegments();
                                this.o = (String) pathSegments.get(1);
                                this.r = (String) pathSegments.get(2);
                                this.u = data.toString();
                                z = true;
                                if (z) {
                                    if (TextUtils.isEmpty(this.n)) {
                                        c = fde.c(false);
                                        if (c.length == 0) {
                                            startActivity(gwb.g(null));
                                            finish();
                                            valueOf = null;
                                        } else if (c.length == 1) {
                                            valueOf = null;
                                        } else {
                                            valueOf = fde.e(c[0]).a();
                                        }
                                    } else {
                                        if ("_sms_only_account".equals(this.n)) {
                                            z = true;
                                        } else {
                                            z = fde.i();
                                            glk.a("Babel", "URL for SMS only account. Validity: " + z, new Object[0]);
                                        }
                                        if (z) {
                                            bko = fde.a(edo.a(this.n));
                                        }
                                        if (bko == null) {
                                            valueOf = bko.a();
                                        } else {
                                            a(bc.ap, 2849);
                                            return;
                                        }
                                    }
                                    if (this.t) {
                                        b = new jmd();
                                    } else {
                                        b = new jmd().b("sms_only");
                                    }
                                    this.x.a(new jmu().b().a(valueOf).a(jna.class, new jnb().a(b).a()));
                                }
                                a(bc.aq, 2848);
                                return;
                            }
                        } else if (b(data)) {
                            i = 1;
                            if (i != 0) {
                                a(data);
                                pathSegments = data.getPathSegments();
                                if (data.getHost().equalsIgnoreCase("hangouts.google.com") && pathSegments.size() == 2 && ((String) pathSegments.get(0)).equalsIgnoreCase("chat")) {
                                    this.o = (String) pathSegments.get(1);
                                }
                                if (data.getHost().equalsIgnoreCase("hangouts.google.com") && pathSegments.size() == 3 && ((String) pathSegments.get(0)).equalsIgnoreCase("chat") && ((String) pathSegments.get(1)).equalsIgnoreCase("person")) {
                                    this.r = (String) pathSegments.get(2);
                                }
                                this.u = data.toString();
                                z = true;
                                if (z) {
                                    a(bc.aq, 2848);
                                    return;
                                }
                                if (TextUtils.isEmpty(this.n)) {
                                    if ("_sms_only_account".equals(this.n)) {
                                        z = fde.i();
                                        glk.a("Babel", "URL for SMS only account. Validity: " + z, new Object[0]);
                                    } else {
                                        z = true;
                                    }
                                    if (z) {
                                        bko = fde.a(edo.a(this.n));
                                    }
                                    if (bko == null) {
                                        a(bc.ap, 2849);
                                        return;
                                    }
                                    valueOf = bko.a();
                                } else {
                                    c = fde.c(false);
                                    if (c.length == 0) {
                                        startActivity(gwb.g(null));
                                        finish();
                                        valueOf = null;
                                    } else if (c.length == 1) {
                                        valueOf = fde.e(c[0]).a();
                                    } else {
                                        valueOf = null;
                                    }
                                }
                                if (this.t) {
                                    b = new jmd().b("sms_only");
                                } else {
                                    b = new jmd();
                                }
                                this.x.a(new jmu().b().a(valueOf).a(jna.class, new jnb().a(b).a()));
                            }
                        }
                    }
                    z = false;
                    if (i != 0) {
                        a(data);
                        pathSegments = data.getPathSegments();
                        this.o = (String) pathSegments.get(1);
                        this.r = (String) pathSegments.get(2);
                        this.u = data.toString();
                        z = true;
                        if (z) {
                            if (TextUtils.isEmpty(this.n)) {
                                c = fde.c(false);
                                if (c.length == 0) {
                                    startActivity(gwb.g(null));
                                    finish();
                                    valueOf = null;
                                } else if (c.length == 1) {
                                    valueOf = null;
                                } else {
                                    valueOf = fde.e(c[0]).a();
                                }
                            } else {
                                if ("_sms_only_account".equals(this.n)) {
                                    z = true;
                                } else {
                                    z = fde.i();
                                    glk.a("Babel", "URL for SMS only account. Validity: " + z, new Object[0]);
                                }
                                if (z) {
                                    bko = fde.a(edo.a(this.n));
                                }
                                if (bko == null) {
                                    valueOf = bko.a();
                                } else {
                                    a(bc.ap, 2849);
                                    return;
                                }
                            }
                            if (this.t) {
                                b = new jmd();
                            } else {
                                b = new jmd().b("sms_only");
                            }
                            this.x.a(new jmu().b().a(valueOf).a(jna.class, new jnb().a(b).a()));
                        }
                        a(bc.aq, 2848);
                        return;
                    }
                }
            }
            z = false;
            valueOf2 = String.valueOf("https://plus.google.com");
            valueOf = String.valueOf(queryParameter);
            if (valueOf.length() == 0) {
                valueOf = new String(valueOf2);
            } else {
                valueOf = valueOf2.concat(valueOf);
            }
            data = Uri.parse(valueOf);
            if (data != null) {
                pathSegments = data.getPathSegments();
                host = data.getHost();
                if (!host.equalsIgnoreCase("plus.google.com")) {
                }
                if (!host.equalsIgnoreCase("hangouts.google.com")) {
                }
                if (!host.equalsIgnoreCase("hangouts.google.com")) {
                }
                if (!host.equalsIgnoreCase("hangouts.google.com")) {
                }
                if (b(data)) {
                    i = 1;
                    if (i != 0) {
                        a(data);
                        pathSegments = data.getPathSegments();
                        this.o = (String) pathSegments.get(1);
                        this.r = (String) pathSegments.get(2);
                        this.u = data.toString();
                        z = true;
                        if (z) {
                            a(bc.aq, 2848);
                            return;
                        }
                        if (TextUtils.isEmpty(this.n)) {
                            if ("_sms_only_account".equals(this.n)) {
                                z = fde.i();
                                glk.a("Babel", "URL for SMS only account. Validity: " + z, new Object[0]);
                            } else {
                                z = true;
                            }
                            if (z) {
                                bko = fde.a(edo.a(this.n));
                            }
                            if (bko == null) {
                                a(bc.ap, 2849);
                                return;
                            }
                            valueOf = bko.a();
                        } else {
                            c = fde.c(false);
                            if (c.length == 0) {
                                startActivity(gwb.g(null));
                                finish();
                                valueOf = null;
                            } else if (c.length == 1) {
                                valueOf = fde.e(c[0]).a();
                            } else {
                                valueOf = null;
                            }
                        }
                        if (this.t) {
                            b = new jmd().b("sms_only");
                        } else {
                            b = new jmd();
                        }
                        this.x.a(new jmu().b().a(valueOf).a(jna.class, new jnb().a(b).a()));
                    }
                }
            }
            z = false;
            if (i != 0) {
                a(data);
                pathSegments = data.getPathSegments();
                this.o = (String) pathSegments.get(1);
                this.r = (String) pathSegments.get(2);
                this.u = data.toString();
                z = true;
                if (z) {
                    if (TextUtils.isEmpty(this.n)) {
                        c = fde.c(false);
                        if (c.length == 0) {
                            startActivity(gwb.g(null));
                            finish();
                            valueOf = null;
                        } else if (c.length == 1) {
                            valueOf = null;
                        } else {
                            valueOf = fde.e(c[0]).a();
                        }
                    } else {
                        if ("_sms_only_account".equals(this.n)) {
                            z = true;
                        } else {
                            z = fde.i();
                            glk.a("Babel", "URL for SMS only account. Validity: " + z, new Object[0]);
                        }
                        if (z) {
                            bko = fde.a(edo.a(this.n));
                        }
                        if (bko == null) {
                            valueOf = bko.a();
                        } else {
                            a(bc.ap, 2849);
                            return;
                        }
                    }
                    if (this.t) {
                        b = new jmd();
                    } else {
                        b = new jmd().b("sms_only");
                    }
                    this.x.a(new jmu().b().a(valueOf).a(jna.class, new jnb().a(b).a()));
                }
                a(bc.aq, 2848);
                return;
            }
        }
        z = false;
        if (z) {
            a(bc.aq, 2848);
            return;
        }
        if (TextUtils.isEmpty(this.n)) {
            if ("_sms_only_account".equals(this.n)) {
                z = fde.i();
                glk.a("Babel", "URL for SMS only account. Validity: " + z, new Object[0]);
            } else {
                z = true;
            }
            if (z) {
                bko = fde.a(edo.a(this.n));
            }
            if (bko == null) {
                a(bc.ap, 2849);
                return;
            }
            valueOf = bko.a();
        } else {
            c = fde.c(false);
            if (c.length == 0) {
                startActivity(gwb.g(null));
                finish();
                valueOf = null;
            } else if (c.length == 1) {
                valueOf = fde.e(c[0]).a();
            } else {
                valueOf = null;
            }
        }
        if (this.t) {
            b = new jmd().b("sms_only");
        } else {
            b = new jmd();
        }
        this.x.a(new jmu().b().a(valueOf).a(jna.class, new jnb().a(b).a()));
    }

    public void a(boolean z, jcb jcb, jcb jcb2, int i, int i2) {
        if (jcb2 == jcb.VALID) {
            Intent a;
            if (!TextUtils.isEmpty(this.o)) {
                a = BabelGatewayActivity.a(this, i2, this.o, null);
                a.putExtra("opened_from_impression", this.w);
            } else if (this.u == null || !b(Uri.parse(this.u))) {
                if (this.u != null && this.u.contains("key")) {
                    ((iih) this.p.a(iih.class)).a(i2).b().c(1868);
                }
                a = BabelGatewayActivity.a(i2, this.r, null, this.v, this.s, this.u);
            } else {
                a = BabelGatewayActivity.b(this, i2, this.u);
            }
            startActivity(a);
            finish();
            return;
        }
        finish();
    }

    private void a(int i, int i2) {
        Toast.makeText(this, i, 0).show();
        ((iih) this.p.a(iih.class)).a(this.x.a()).b().c(i2);
        finish();
    }

    private void a(Uri uri) {
        boolean z;
        boolean z2 = false;
        String queryParameter = uri.getQueryParameter("id");
        if (queryParameter != null) {
            this.o = queryParameter;
        }
        queryParameter = uri.getQueryParameter("a");
        if (queryParameter != null) {
            this.n = queryParameter;
        }
        queryParameter = uri.getQueryParameter("draft");
        if (queryParameter != null) {
            this.v = queryParameter;
        }
        queryParameter = uri.getQueryParameter("css");
        if (queryParameter != null) {
            this.w = Integer.parseInt(queryParameter);
        }
        List<String> queryParameters = uri.getQueryParameters("pi");
        if (queryParameters.isEmpty()) {
            z = false;
        } else {
            z = false;
            for (String queryParameter2 : queryParameters) {
                if (this.r != null) {
                    String str = this.r;
                    this.r = new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(queryParameter2).length()).append(str).append("|").append(queryParameter2).toString();
                    z = true;
                } else {
                    this.r = queryParameter2;
                }
            }
        }
        if (z || TextUtils.equals(uri.getQueryParameter("group"), "1") || b(uri)) {
            z2 = true;
        }
        this.s = z2;
    }

    private boolean b(Uri uri) {
        if (uri == null) {
            return false;
        }
        boolean z;
        List pathSegments = uri.getPathSegments();
        if (uri.getHost().equalsIgnoreCase("hangouts.google.com") && pathSegments.size() == 2 && ((String) pathSegments.get(0)).equalsIgnoreCase("group")) {
            z = true;
        } else {
            z = false;
        }
        this.t = z;
        return this.t;
    }
}
