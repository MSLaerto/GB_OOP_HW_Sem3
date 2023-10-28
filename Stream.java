package sem3;

import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudyGroup> {
    private List<StudyGroup> studyGroups;

    public Stream(List<StudyGroup> groupList1) {
        studyGroups = groupList1;
    }

    public void addStudyGroup(StudyGroup studyGroup) {
        studyGroups.add(studyGroup);
    }

    public int size(){
        return studyGroups.size();
    }

    public Iterator<StudyGroup> iterator() {
        return studyGroups.iterator();
    }
}

