package HW4;
@GetMetaData
public class UserMeta {
    @GetMetaData
    String name;
    @GetMetaData
    Integer count;

    public UserMeta(String name, Integer count) {
        this.name = name;
        this.count = count;
    }



    @GetMetaData
    public void GetSuperName (String prefix){

    }
}
