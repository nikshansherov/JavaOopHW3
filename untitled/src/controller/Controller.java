package controller;

import data.StudentGroup;
import data.GroupStream;
import service.DataService;
import service.GroupStreamService;

import java.util.List;

public class Controller {
    private final DataService groupService;
    private GroupStreamService groupStreamService;

    public Controller(DataService groupService, GroupStreamService groupStreamService) {
        this.groupService = groupService;
        this.groupStreamService = groupStreamService;
    }

    public StudentGroup createGroup(int groupNumber) {
        return groupService.getGroup(groupNumber);
    }

    public void streamListSort(List<GroupStream> groupStream) {
        groupStreamService.streamSort(groupStream);
    }
}
