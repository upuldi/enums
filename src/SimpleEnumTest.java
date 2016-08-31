/**
 * Created by udoluweera on 2/11/15.
 */
public class SimpleEnumTest {

    public static void main(String[] args) {

        SomeEnum someEnumOfTypeOne = SomeEnum.VALUE1;
        SomeEnum someEnumOfTypeTwo = SomeEnum.valueOf("VALUE2");

        System.out.println("VALUE ONE : " + someEnumOfTypeOne);
        System.out.println("VALUE TWO : " + someEnumOfTypeTwo);

        /* See the someInterfaceMethod() is overridden explicitly in Value1 */
        someEnumOfTypeOne.someInterfaceMethod();
        SomeEnum someEnumOfTypeFour = SomeEnum.VALUE4;
        someEnumOfTypeFour.someInterfaceMethod();

        someEnumOfTypeOne.setSomeOtherEnumField("XXXX");
        System.out.println(someEnumOfTypeOne.getSomeOtherEnumField());

    }
}
