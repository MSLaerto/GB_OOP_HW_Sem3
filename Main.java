package sem3;

import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
    
        List<StudyGroup> groupList1 = new ArrayList<>();
        groupList1.add(new StudyGroup());
        groupList1.add(new StudyGroup());
        groupList1.add(new StudyGroup());

        List<StudyGroup> groupList2 = new ArrayList<>();
        groupList2.add(new StudyGroup());
        groupList2.add(new StudyGroup());

        Stream stream1 = new Stream(groupList1);
        Stream stream2 = new Stream(groupList2);

        List<Stream> streams = new ArrayList<>();
        streams.add(stream1);
        streams.add(stream2);

        Controller controller = new Controller();

        controller.sortStreams(streams);
    }
}