package interop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaClass {

    String getClassName(){
        return getClass().getSimpleName();
    }

    String getOtherClassName(){
        return new KotlinClass().getClassName();
    }


}
