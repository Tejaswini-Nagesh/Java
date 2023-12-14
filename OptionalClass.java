
import java.util.Optional;
public class OptionalClass{
    public static void main(String s[]){
    Optional<String> name=getName(1);

    String nameTobeUsed=name.orElse("NA");
    System.out.println(nameTobeUsed);
  if(name.isPresent()){
      System.out.println(name.get());
  }
  name.ifPresent(x->System.out.println(x));
    }


    private static Optional<String> getName(int id){
        String name="Ram";
        return Optional.of(name);
      // return Optional.ofNullable(name);
      //return Optional.empty();

    }
}