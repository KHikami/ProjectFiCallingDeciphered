import java.util.Map;

public interface iji<Resource extends nzf, AddRequest extends nzf, AddResponse extends nzf, ModifyRequest extends nzf, ModifyResponse extends nzf, RemoveRequest extends nzf, RemoveResponse extends nzf> {
    void a(ijj<Resource> ijj_Resource);

    void a(AddRequest addRequest, ijl<AddResponse> ijl_AddResponse);

    Map<String, Resource> b();

    void b(ijj<Resource> ijj_Resource);

    void b(ModifyRequest modifyRequest, ijl<ModifyResponse> ijl_ModifyResponse);

    void c(RemoveRequest removeRequest, ijl<RemoveResponse> ijl_RemoveResponse);
}
