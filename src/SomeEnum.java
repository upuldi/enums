
public enum SomeEnum implements SomeInterface {

    VALUE1 ("Value One",1) {
        @Override
        public void someInterfaceMethod() {
            System.out.println("Specific implementation of an interface method for value one");
        }
    },
    VALUE2 ("Value Two",2) {
        @Override
        public void someInterfaceMethod() {
            System.out.println("Specific implementation of an interface method for value two");
        }
    },
    VALUE3 ("Value Three",3)  ,
    VALUE4 ("Value Four",4) ;

    /* Enum Constructor */
    SomeEnum(String someEnumVariable,int someOtherEnumVariable) {
        this.someEnumVariable = someEnumVariable;
        this.someOtherEnumVariable = someOtherEnumVariable;
    }

    public String someEnumMethos() {
        return "Some Enum Metod";
    }

    @Override
    public void someInterfaceMethod() {
        System.out.println("Some Interface method.");
    }

    private String someEnumVariable;
    private int someOtherEnumVariable;
    private String someOtherEnumField;

    public String getSomeOtherEnumField() {
        return someOtherEnumField;
    }

    public void setSomeOtherEnumField(String someOtherEnumField) {
        this.someOtherEnumField = someOtherEnumField;
    }

    public String getSomeEnumVariable() {
        return someEnumVariable;
    }

    public void setSomeEnumVariable(String someEnumVariable) {
        this.someEnumVariable = someEnumVariable;
    }

    public int getSomeOtherEnumVariable() {
        return someOtherEnumVariable;
    }

    public void setSomeOtherEnumVariable(int someOtherEnumVariable) {
        this.someOtherEnumVariable = someOtherEnumVariable;
    }
}
