import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class iqh<Resource extends nzf, AddRequest extends nzf, AddResponse extends nzf, ModifyRequest extends nzf, ModifyResponse extends nzf, RemoveRequest extends nzf, RemoveResponse extends nzf> implements iji<Resource, AddRequest, AddResponse, ModifyRequest, ModifyResponse, RemoveRequest, RemoveResponse> {
    final ipu a_;
    final ipp<AddResponse, ModifyResponse, RemoveRequest, RemoveResponse> b;
    public final Map<String, Resource> c;
    final List<ijj<Resource>> d;
    public volatile boolean e;
    private final ijm<Resource> f;
    private final ipq<AddRequest, AddResponse, ModifyRequest, ModifyResponse, RemoveRequest, RemoveResponse> g;

    public iqh(ipu ipu, ijm<Resource> ijm_Resource, ipq<AddRequest, AddResponse, ModifyRequest, ModifyResponse, RemoveRequest, RemoveResponse> ipq_AddRequest__AddResponse__ModifyRequest__ModifyResponse__RemoveRequest__RemoveResponse, ipp<AddResponse, ModifyResponse, RemoveRequest, RemoveResponse> ipp_AddResponse__ModifyResponse__RemoveRequest__RemoveResponse) {
        this.a_ = ipu;
        this.f = ijm_Resource;
        this.g = ipq_AddRequest__AddResponse__ModifyRequest__ModifyResponse__RemoveRequest__RemoveResponse;
        this.b = ipp_AddResponse__ModifyResponse__RemoveRequest__RemoveResponse;
        this.e = false;
        this.c = new ConcurrentHashMap();
        this.d = new CopyOnWriteArrayList();
    }

    public Map<String, Resource> b() {
        return this.c;
    }

    public void a(ijj<Resource> ijj_Resource) {
        iil.a();
        if (this.d.contains(ijj_Resource)) {
            itx.a(6, "vclib", "Registered the same listener twice!");
        }
        this.d.add(ijj_Resource);
        if (this.e) {
            gwb.a(new iqi(this, ijj_Resource));
        }
    }

    public void b(ijj<Resource> ijj_Resource) {
        iil.a();
        this.d.remove(ijj_Resource);
    }

    public void a(AddRequest addRequest, ijl<AddResponse> ijl_AddResponse) {
        this.g.a(addRequest, new iqj(this, ijl_AddResponse));
    }

    public void b(ModifyRequest modifyRequest, ijl<ModifyResponse> ijl_ModifyResponse) {
        this.g.b(modifyRequest, new iqk(this, ijl_ModifyResponse));
    }

    public void c(RemoveRequest removeRequest, ijl<RemoveResponse> ijl_RemoveResponse) {
        this.g.c(removeRequest, new iql(this, removeRequest, ijl_RemoveResponse));
    }

    public void a(int i, Resource resource) {
        iil.a();
        switch (i) {
            case wi.w /*0*/:
                iil.a("Expected null", this.c.put(this.f.a(resource), resource));
                for (ijj a : this.d) {
                    a.a(resource);
                }
            case wi.j /*1*/:
                iil.b("Expected non-null", (nzf) this.c.remove(this.f.a(resource)));
                for (ijj a2 : this.d) {
                    a2.b(resource);
                }
            case wi.l /*2*/:
                Object obj = (nzf) this.c.put(this.f.a(resource), resource);
                iil.b("Expected non-null", obj);
                for (ijj a3 : this.d) {
                    a3.a(obj, resource);
                }
            case wi.z /*3*/:
                this.e = true;
                for (ijj a22 : this.d) {
                    a22.a();
                }
            default:
                itx.a("vclib", "Operation " + i + " is not found.");
        }
    }
}
