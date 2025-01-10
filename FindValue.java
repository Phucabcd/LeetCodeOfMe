import java.util.Arrays;

public class FindValue {
    public static void main(String[] args) {
        String before = null;
        String affter = null;
        String[] ids = {
                "akdhaskjdds",
                "aksjdhaskdasd",
                "exampleId123",
                "testId456",
                "testIdádklasd",
                "álkdjadlkj"
        };
        String id = "álkdjadlkj";

        for (int i = 0; i < ids.length; i++) {
            if (ids[i].equals(id)) {
                if (i > 0) {
                    before = ids[i - 1];
                }
                if (i < ids.length - 1) {
                    affter = ids[i + 1];
                }
                break;
            }
        }

        System.out.println(Arrays.toString(ids));

        System.out.println("before: " + before);
        System.out.println("affter: " + affter);

    }

}